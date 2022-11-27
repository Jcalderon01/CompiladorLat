# Traductor y compilador Jasmin

### Introduccion
Basado en el pasado compilador el cual tenía como entrada código C el cual era traducido y ejecutado en mi propio lenguaje. Se le agrego que al código C de entrada fuera traducido a Jasmín para después ser ejecutado y mostrado en la interfaz. Esto se logró con el uso de nmonicos, los usados fueros desde los básico como la declaración y asignación, hasta las estructuras de control como el if y el for.


### Desarrollo

Paso 1: Lo primero fue modificar la visita a la cabeza para que cuando esta fuera encontrada mandara el inicio de la estructura de un archivo .J al archivo.

```Java
 @Override public String visitCabeza(GramaticaParser.CabezaContext ctx)
    {
        HelloController.texto(".class public Hola \n.super java/lang/Object");
        HelloController.texto(".method public static main([Ljava/lang/String;)V ");
        HelloController.texto(".limit stack 10\n" + ".limit locals 10\n");

        return null;
    }
```

Para que no fuera tan complicado está limitado por defecto a usar el stack 10 y locals 10.


Paso 2: A la visita de asignación se le agrego el nmonico "istore" ya que este cumple una función similar. 

```Java
    @Override public Double visitAssignmentt(GramaticaParser.AssignmenttContext ctx)
    {
        String id = ctx.ID().getText();
        Double valor = (Double) visit(ctx.expr());
        if(memoria.buscar(id))
        {
            memoria.asignar(id,valor);
            HelloController.texto("istore " + contador.indexOf(ctx.ID().getText()));
        }
        else
        {
            HelloController.texto("La variable ya esta declarada");
        }
        return null;
    }
```
Este incluye un contador para que se vayan guardado los números ya usados.


Paso 3: Esta no usa ningún nmonico, simple mente el contador y un ID.

```Java
    @Override public Double visitDeclararee(GramaticaParser.DeclarareeContext ctx)
    {
        contador.add(ctx.ID().getText());
        memoria.declarar(ctx.ID().getText());
        return null;
    }
```

Paso 4: También se agregó la posibilidad de usar declaracion-asignacion. Funciona juntado los dos métodos en uno.

```Java
 @Override public Object visitDeclarassignare(GramaticaParser.DeclarassignareContext ctx)
    {
        String id = ctx.ID().getText();
        double valor = (double) visit(ctx.expr());
        if(!memoria.buscar(id))
        {
            memoria.declarar(ctx.ID().getText());
            memoria.asignar(id,valor);
            contador.add(id);
            HelloController.texto("istore " + contador.indexOf(ctx.ID().getText()));
        }
        else
        {
            HelloController.texto("La variable ya esta declarada");
        }
        return null;
    }

```

Paso 5: También existe la posibilidad de imprimir, tanto texto como números. Son métodos similares pero existen algunas variaciones. 

A continuación, la forma de imprimir números:
```Java
 @Override public Object visitImprimerexpr(GramaticaParser.ImprimerexprContext ctx)
    {
        HelloController controller = new HelloController();
        controller.texto("getstatic java/lang/System/out Ljava/io/PrintStream;");
        visit(ctx.expr());
        controller.texto("invokevirtual java/io/PrintStream/println(I)V\n");
        return "";
        //return visit(ctx.expr());
    }
```


Se crea una variable para guardarlos.

```Java
String texto;
```
Se visita para obtenerlo.
```Java
texto=ctx.FILUM().getText();
```
Y se imprime junto con el nmonico.
```Java
controller.texto("ldc "+texto);
```

Y se une de la siguiente forma.

```Java
  @Override public Object visitImprimeree(GramaticaParser.ImprimereeContext ctx)
    {
        HelloController controller = new HelloController();
        controller.texto("getstatic java/lang/System/out Ljava/io/PrintStream;");
        String texto;
        texto=ctx.FILUM().getText();
        controller.texto("ldc "+texto);
        controller.texto("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V\n");
        return  "";
    }


```


Paso 6: Varias cosas pequeñas fueron modificados. Por ejemplo:

La visita al ID a la cual se le agrego un nmonico.
```Java
    @Override public Double visitNomen(GramaticaParser.NomenContext ctx)
    {
        HelloController.texto("iload "+contador.indexOf(ctx.ID().getText())+"\n");
        return memoria.regresar(ctx.ID().getText());
    }
```
La visita a los números que igual se le agrego un nmonico.
```Java
  @Override public Double visitNumerus(GramaticaParser.NumerusContext ctx)
    {
        HelloController.texto("bipush " + ctx.NUM().getText());
        return Double.valueOf(ctx.NUM().getText());
    }
```
Y la visita al incremento para que este pueda usar el ++.
```Java
    @Override public Object visitIncremento(GramaticaParser.IncrementoContext ctx)
    {
        HelloController.texto("iinc "+contador.indexOf(ctx.ID().getText())+" 1");
        return null;
    }

```

Paso 7: Dentro del if, las modificaciones más importantes podrían ser la inclusión de nmonicos, pero también fue necesario usar 2 variables más, número y now, las cuales sirven para estar contando las veces que este es usado ya que es necesario para saber que numero poner en el nmonico “Label”.

```Java
 @Override public Object visitConditiosi(GramaticaParser.ConditiosiContext ctx)
    {
        int now = numeroif;
        HelloController controller = new HelloController();
        Boolean cond = (boolean) visit(ctx.cond());

        if (ctx.conelse() != null) {
            visit(ctx.conelse());
        } else {
            controller.texto("goto sino"+now);
        }
        controller.texto("label"+now+":");
        numeroif++;
        visit(ctx.corpus());
        controller.texto("sino"+now+":");

        return null;
    }
```

Paso 8: De la misma forma que el if, el else usa las mismas variables para mantener un control de los números y se le añade el nmonico correspondiente. 

```Java
    @Override public Object visitCondicionels(GramaticaParser.CondicionelsContext ctx)
    {
        int now = numeroif;
        HelloController controller = new HelloController();
        numeroif++;
        visit(ctx.corpus());
        controller.texto("goto sino"+now);
        return null;
    }
```

Paso 9: El for el algo diferente de las 2 anteriores, ya que este usa una mayo cantidad de labels. Además de incluir la suya “ciclo”.  Y al igual que los otros 2, usa las mismas variables por la misma razón. 
```Java
    @Override public Boolean visitCondiconfor(GramaticaParser.CondiconforContext ctx)
    {
        int now = numeroif;
        HelloController controller = new HelloController();

        if(ctx.assignment()!=null){
            visit(ctx.assignment());
        }
        else{
            visit(ctx.delarareasignare());
        }
        controller.texto("ciclo"+now+":");
        Boolean cond = (boolean) visit(ctx.cond());
        controller.texto("goto sino"+now);

        controller.texto("label"+now+":");
        numeroif++;
        visit(ctx.corpus());
        visit(ctx.incremento());
        controller.texto("goto ciclo"+now);
        controller.texto("sino"+now+":");
        
        return null;
    }

```

Paso 10: Las condicionales también fueron modificadas. A continuación, un ejemplo de cómo:
```Java
case GramaticaParser.MAYORQ:controller.texto("if_icmpgt label"+numeroif);
                return izq>der;
```
Esta es para el caso de mayor que, pero en si, todas funcionan de la misma manera solo cambiando el nmonico usado.

Paso 11: También fue agregado el poder sumar, restar, dividir y multiplicar. La modificación no fue tan grande, ya que solo fue necesario agregar el nmonico correspondiente.


Para suma y resta.
```Java
 @Override public Double visitPlusminus(GramaticaParser.PlusminusContext ctx)
    {
        Double izq = (Double) visit(ctx.expr(0));
        Double der = (Double) visit(ctx.expr(1));
        if(ctx.op.getText().equals("+")){
            HelloController.texto("iadd \n");
            return izq + der;
        }
        else {
            HelloController.texto("isub \n");
            return izq - der;
        }
    }
```
Para divicion y multiplicacion.
```Java
 @Override public Double visitBydivisio(GramaticaParser.BydivisioContext ctx)
    {
        Double izq = (Double) visit(ctx.expr(0));
        Double der = (Double) visit(ctx.expr(1));
        if(ctx.op.getText().equals("*")){
            HelloController.texto("imul \n");
            return izq * der;
        }
        else {
            HelloController.texto("idiv \n");
            return izq / der;
        }
    }
```

### Conclusion

El cambio del compilador para poder usar jasmin en su mayoría no fue complicado, considero que las partes más difíciles fueron las estructuras de control por la forma en
que estas son leídas y los requisitos que necesiten.












