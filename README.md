# Traductor y compilador Jasmin


[1)Introduccion](https://github.com/Jcalderon01/CompiladorLat/edit/main/README.md#introduccion)

[2)Desarrollo](https://github.com/Jcalderon01/CompiladorLat/edit/main/README.md#desarrollo)

[3)Introduccion Jasmin](https://github.com/Jcalderon01/CompiladorLat/edit/main/README.md#introduccion-jasmin)

[4)Desarrollo Jasmin](https://github.com/Jcalderon01/CompiladorLat/edit/main/README.md#desarrollo-1)

[5)Conclusion](https://github.com/Jcalderon01/CompiladorLat/edit/main/README.md#conclusion)



---

### Introduccion 

Un  compilador  es  un  programa  que  traduce  codigo  escrito  en  un  lenguaje  a  otro  lenguaje.  En  este  tipo  de traductor el lenguaje fuente es generalmente un lenguaje de alto nivel y el objeto un lenguaje de bajo nivel, como el codigo maaquina. Este proceso de traduccion se conoce como compilacion.
En  este  documento  se  presentan  los  pasos  seguidos  para  crear  un  compilador  basico  el  cual  traduce  de  el lenguaje c a mi lenguaje creado y compila las instrucciones.

---
### Desarrollo
1.-La  base  de  todo  el  compilador  es  el  diseño,  y  es  con  este  con  el  que  comence.  Este  cuenta  con  3  campos  de texto, uno para el codigo en C, otro para el c´odigo en mi idioma, y el ultimo para el resultado de la compilacion. Al igual que con varios botones de varias funciones.



![image](https://user-images.githubusercontent.com/104863690/204939252-b0d4117e-997b-41fa-ba4d-b68163fff4c5.png)

Figura 1: Disenño


2.-Lo primero que hice fue hacer las nuevas reglas que iba a necesitar. Dichas reglas sirven para poder identificar cuando el usuario quiera asignar, declarar o imprimir. Estas son muy b´asicas y parecidas entre si.
![image](https://user-images.githubusercontent.com/104863690/204939350-4aba9a05-aa9d-4b60-b15a-8d9e4610b14e.png)

Figura 2: Gramatica de los metodos


3.-Para  la  visita  de  declaraci´on,  lo  que  use  fue  una  variable  llamada  memoria  de  tipo  mapa,  en  la  cual  se almacenara el nombre de las variables que se est´en declarando.
Esta cuenta con un if para comprobar si un nombre de variable ya fue utilizado y siendo este el caso, imprimir´a un mensaje ”La variable ya esta declarara”. Si no, simplemente la agregara a la memoria.


![image](https://user-images.githubusercontent.com/104863690/204939504-b988678e-8e8f-4464-af43-97c43cff0818.png)

Figura 3: C´odigo de la visita de declaraci´on

4.-Para  la  asignaci´on,  el  m´etodo  usado  es  pr´acticamente  el  mismo  con  la  diferencia  de  que  en  este  si  se considera lo que contiene la variable.


![image](https://user-images.githubusercontent.com/104863690/204939557-55831df3-4d62-4e1a-88ff-70fe3fdc3236.png)


Figura 4: C´odigo de la visita de asignaci´on 


5.-La impresi´on fue la mas f´acil de las 3, simplemente se imprime.

![image](https://user-images.githubusercontent.com/104863690/204939813-e932699d-a5bf-4c5c-a169-8ed700fdfe20.png)

Figura 5: C´odigo de la visita de impresi´on


6.-Para la traducci´on se necesito una gram´atica nueva, al igual que una nueva clase MyVisitor. A continuaci´on se muestra un poco de la gram´atica.

![image](https://user-images.githubusercontent.com/104863690/204939845-e8fc1eae-692c-41bd-a387-52e886250929.png)
Figura 6: Gram´atica para traducci´on



7.-En  el  nuevo  visitor  la  forma  en  la  que  se  usaron  las  visitas  es  muy  parecida  entre  si,  si  forma  el  c´odigo con el texto en mi idioma ya sea escribi´endolo directamente o usando el ctx.


![image](https://user-images.githubusercontent.com/104863690/204939878-7a2bbdf5-0bb7-49e4-9fb6-95b0e867e50a.png)

Figura 7: Algunos ejemplos de como sirve la traducci´on



![image](https://user-images.githubusercontent.com/104863690/204939892-7b520af3-a44b-4354-96c8-208ff7edc514.png)

Figura 8: Ejemplo declaraci´on, asignaci´on, impresi´on y traducci´on

8.- Fue necesaria la utilizaci´on de un m´etodo para subir archivos de texto y que este los lea.

![image](https://user-images.githubusercontent.com/104863690/204940137-3aabbb3f-ae4c-4c44-ad20-7cad202b20dd.png)

Figura 9: M´etodo para subir archivos



![image](https://user-images.githubusercontent.com/104863690/204940167-ff7c1de4-f406-4bad-bd9a-18da98fcc8bb.png)

Figura 10: Ejemplo de ventana de archivos


9.- Actualizaci´on de disen˜o y funciones.

![image](https://user-images.githubusercontent.com/104863690/204940207-4ba329af-4c07-431e-ab7d-d5ae10f46e00.png)

Figura 11: Nuevo cascaron


10.- Implementaci´on de el m´etodo if.

![image](https://user-images.githubusercontent.com/104863690/204940251-4561c5b6-0088-472b-a2ee-fd8e22d8fdca.png)

Figura 12: Gram´atica del if

11.- La forma en que sirve la visita es preguntado si existe una condici´on, siendo el caso de que si, este hace lo que se encuentre dentro del cuerpo.

![image](https://user-images.githubusercontent.com/104863690/204940276-2ad22a33-a112-4856-b083-4a8aa7ed7ad6.png)

Figura 13: Visita al if

![image](https://user-images.githubusercontent.com/104863690/204940313-50825703-5774-4ead-8c0f-97e2b11be8a9.png)

Figura 14: Ejemplo if

12.- Implementaci´on del m´etodo else.

![image](https://user-images.githubusercontent.com/104863690/204940338-afa3e7f4-313e-49df-b8e5-8e16ec1b6cb2.png)

Figura 15: Gram´atica else
13.- En caso de que haya un else, su visita simplemente llama al cuerpo. Para esto, fue necesario actualizar la visita al if.

![image](https://user-images.githubusercontent.com/104863690/204940368-a7637b0e-ad95-4eb5-80f9-0513f15f225b.png)

Figura 16: Visita else

![image](https://user-images.githubusercontent.com/104863690/204940394-e5488e9a-e071-4627-a4fe-a0521a42457b.png)

Figura 17: Ejemplo else



14.- Se pregunta si el else es diferente de nulo, siendo el caso, se visita este mismo .
![image](https://user-images.githubusercontent.com/104863690/204940429-0f13fb36-92d0-45f8-86be-51f3bff2c43b.png)

Figura 18: Visita if nueva
![image](https://user-images.githubusercontent.com/104863690/204940465-9d8167d4-b6ac-455b-9940-2f46dbabd83f.png)


15.- Gramatica else if.
![image](https://user-images.githubusercontent.com/104863690/204940756-d144ded2-1ac3-4e13-a57b-cca3259a7464.png)

Figura 19: Gram´atica else if

16.- Igual que con el else, para el else if la visita no es muy complicada, siendo el caso de que exista, solo se visita el cuerpo.
![image](https://user-images.githubusercontent.com/104863690/204940782-a1f770dd-4f99-4933-a728-7d5dfe672330.png)

Figura 20: Gram´atica else if


17.-De nuevo se actualiza la visita del if en el caso de que exista un else if, Lo que hace primero es preguntar si la visita al else if es diferente de nula, si si, se usa un ciclo para visitarlo las veces que sea necesario en caso de que haya mas de uno.
![image](https://user-images.githubusercontent.com/104863690/204940809-91e70b8c-f568-410b-af02-09f1299447c0.png)

Figura 21: Segunda actualizaci´on al if

![image](https://user-images.githubusercontent.com/104863690/204940835-52e8aedb-7bdf-4cde-8b72-2997ed2955f6.png)

Figura 22: Ejemplo else if

18.- Para el for, igual que en todo lo dem´as se creo una nueva regla basada en la estructura de este.
![image](https://user-images.githubusercontent.com/104863690/204940862-9892adb0-dda7-4368-95c9-735f2220e6dd.png)

Figura 23: Gram´atica for


19.- La visita del forma es la mas larga y complicada hasta el momento, principalmente porque consiste de dos  partes  las  cuales  son  id´enticas  con  la  u´nica  diferencia  de  que  una  se  usa  para  declarar  variables  dentro  del for.
Lo primero que se hace es preguntar cual de estas dos condiciones es, digamos que es en la que viene la asignaci´on. El primer if es para el caso en el que el for incrementa. En el for las visitas se acomodan de la misma manera en la que ir´ıan en un for, primero se coloca ya sea la declaraci´on o la declaraci´on-asignaci´on, despu´es se coloca la condici´on, para finalizar con el incremento.
El else es igual y sirve para el caso de que sea decremento.

![image](https://user-images.githubusercontent.com/104863690/204940923-b00840b2-ff5d-4cb8-be4b-69beb4d549ed.png)

Figura 24: Gram´atica for

![image](https://user-images.githubusercontent.com/104863690/204940982-0bb8cf81-f96b-42fa-aeb7-934c42848f25.png)

Figura 25: Ejemplo for


20-. Para la implementaci´on del and y or, lo primero fue agregarlos como tokens a la gram´atica.

![image](https://user-images.githubusercontent.com/104863690/204941030-c28084b8-7b28-490e-a521-0995d1317183.png)


Figura 26: Tokens and y or 


21-. Esos tokens fueron agregados a la regla de las condiciones.
![image](https://user-images.githubusercontent.com/104863690/204941055-f44f54a6-1165-4f4a-b33e-5c0320e75f15.png)

Figura 27: Tokens en condicion


22-. En la visita, lo que hace es crear dos variables, izq y der a las cuales se les da el valor de la primer y la segunda condici´on. Seguido viene un if el cual compara el texto de la operaci´on con un ””, su es igual hace que las variables regresen con un ”&&”, y si son diferentes regresan con un ”∥∥”.

![image](https://user-images.githubusercontent.com/104863690/204941172-df1d70ff-135d-4e4a-9188-6254fa42862a.png)

Figura 28: Tokens en condici´on

![image](https://user-images.githubusercontent.com/104863690/204941184-76df3bbc-6f7c-475f-9a06-7b7586e132ef.png)

Figura 29: Ejemplo and


23.- Creaci´on del scope. El componente con mas paso y mas complicado hasta el momento.
Para empezar, fue necesario la creaci´on de una clase nueva, la cual llame ”scope”. Esta clase consiste de varios m´etodos,  agregar,  asignar,  buscar  y  regresar.  Estas  de  manera  simple  funcionan  comparando  2  cosas  entre  si, el mapa llamado variables, y la variable de tipos scope llamada padre. En cada nivel que se baja, los datos se pasan de una a la otra comprobando que estos no se repitan, siendo el caso de que si, salta la excepci´on.
A continuaci´on se presenta uno el m´etodo asignar usado en el scope.
![image](https://user-images.githubusercontent.com/104863690/204941213-3d3d7a4c-f0cf-417f-814f-6db8779d98ef.png)

Figura 30: Metodo asignar en scope


Este metodo comienza preguntado si el mapa de variables contiene algo dentro, siendo el caso de que si estas ser´an  remplazadas.  Si  no,  dar´a  el  error  de  que  la  variable  no  existe.  En  el  caso  del  else  if,  entra  a  este  si  la variable padre se encuentra vac´ıa y le coloca las variables, este ultima parte funciona de manera recursiva.
24.-El siguiente punto importante es la clase de verificar. Lo u´nico que hace esta es leer el c´odigo para saber si la forma es la que esta escrito tiene sentido. La forma en la que funciona es muy parecida al visitor original con la diferencia de que este no modifica nada. Los puntos en los que cambio son los siguientes.

![image](https://user-images.githubusercontent.com/104863690/204941261-065fc50e-2ff0-41ff-b38e-e1244708ef9d.png)

Figura 31: Visita if en la clase verificar


![image](https://user-images.githubusercontent.com/104863690/204941273-4b7068e1-7d4b-4806-be19-2ca78b915308.png)

Figura 32: Visita else en la clase verificar

![image](https://user-images.githubusercontent.com/104863690/204941295-edfa1949-ff09-42ce-9b1a-fdbed84405ca.png)

Figura 33: Visita else if en la clase verificar

![image](https://user-images.githubusercontent.com/104863690/204941309-4c363e7e-7f2c-467c-ae76-a9be1e17e1fa.png)

Figura 34: Visita for en la clase verificar







### Introduccion (Jasmin)
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


El poder hacer un lenguaje y compilador propio es interesante ya que pone a prueba diferentes conocimientos de programaci´on que hasta el momento no hab´ıan sido utilizados. Mientras mas est´es avanzando en el desarrollo de  este  mas  te  das  cuenta  de  como  funcionan  los  compiladores  comu´nmente  usado  pero  de  una  manera  b´asica lo cual te puede ayudar a mejorar tu l´ogica de programaci´on.











