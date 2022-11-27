package com.example.interfazfinallat;

import jorge.parser.GramaticaBaseVisitor;
import jorge.parser.GramaticaParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MyVisitor extends GramaticaBaseVisitor {

    Scope memoria = new Scope(null);
    ArrayList<String> contador = new ArrayList();
    int numeroif=0;


    @Override public Object visitImprimerexpr(GramaticaParser.ImprimerexprContext ctx)
    {
        HelloController controller = new HelloController();
        controller.texto("getstatic java/lang/System/out Ljava/io/PrintStream;");
        visit(ctx.expr());
        controller.texto("invokevirtual java/io/PrintStream/println(I)V\n");
        return "";
        //return visit(ctx.expr());
    }

    @Override public Object visitImprimeree(GramaticaParser.ImprimereeContext ctx)
    {
        HelloController controller = new HelloController();
        controller.texto("getstatic java/lang/System/out Ljava/io/PrintStream;");
        String texto;
        texto=ctx.FILUM().getText();
        controller.texto("ldc "+texto);
        controller.texto("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V\n");
        return  "";
        //return ctx.FILUM().getText();
    }

    @Override public String visitCabeza(GramaticaParser.CabezaContext ctx)
    {
        HelloController.texto(".class public Hola \n.super java/lang/Object");
        HelloController.texto(".method public static main([Ljava/lang/String;)V ");
        HelloController.texto(".limit stack 10\n" + ".limit locals 10\n");

        return null;
    }

    //asignacion
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

    //declaracion
    @Override public Double visitDeclararee(GramaticaParser.DeclarareeContext ctx)
    {
        contador.add(ctx.ID().getText());
        memoria.declarar(ctx.ID().getText());
        return null;
    }

    //declaracion asignacion
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

    //declarar floats
    @Override public Object visitDeclararetrist(GramaticaParser.DeclararetristContext ctx)
    {
        String id = ctx.ID().getText();
        if(!memoria.buscar(ctx.ID().getText() ))
        {
            memoria.declarar(id);
            contador.add(id);
        }
        else
        {
          //  HelloController.texto("La variable ya esta declarada");
        }
        return null;
    }


    //declarar y asignar floats
    @Override public Object visitDeclarassignaretrist(GramaticaParser.DeclarassignaretristContext ctx)
    {
        String id = ctx.ID().getText();
        double valor = (double) visit(ctx.expr());
        if(!memoria.buscar(id))
        {
            memoria.declarar(ctx.ID().getText());
            HelloController.texto("fstore " + contador.indexOf(ctx.ID().getText()));
            memoria.asignar(id,valor);
        }
        else
        {
            HelloController.texto("La variable ya esta declarada");
        }
        return null;
    }

    //if
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
        //si se cuple el if
        controller.texto("label"+now+":");
        numeroif++;
        visit(ctx.corpus());
        //para que no se cicle el if
        controller.texto("sino"+now+":");

        return null;
    }

    //else
    @Override public Object visitCondicionels(GramaticaParser.CondicionelsContext ctx)
    {
        int now = numeroif;
        HelloController controller = new HelloController();
        numeroif++;
        visit(ctx.corpus());
        controller.texto("goto sino"+now);
        return null;
    }

    //else if
    @Override public Object visitCondicionelseif(GramaticaParser.CondicionelseifContext ctx)
    {
        if((boolean) visit(ctx.cond())){
            memoria = new Scope(memoria);
            visit(ctx.corpus());
            memoria = memoria.padre;
            return true;
        }
        return false;
    }

    //for
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

    @Override public Object visitIncremento(GramaticaParser.IncrementoContext ctx)
    {
        HelloController.texto("iinc "+contador.indexOf(ctx.ID().getText())+" 1");
        return null;
    }


    //condicional
    @Override public Boolean visitConditio(GramaticaParser.ConditioContext ctx)
    {
        HelloController controller = new HelloController();
        double izq = (double)visit(ctx.expr(0));
        double der = (double)visit(ctx.expr(1));
        switch (ctx.op.getType()){
            case GramaticaParser.MENORIGUAL:controller.texto("if_icmple label"+numeroif);
                return izq<=der;
            case GramaticaParser.MAYORIGUAL:controller.texto("if_icmpge label"+numeroif);
                return izq>=der;
            case GramaticaParser.IGUAL:controller.texto("if_icmpeq label"+numeroif);
                return izq==der;
            case GramaticaParser.MENORQ:controller.texto("if_icmplt label"+numeroif);
                return izq<der;
            case GramaticaParser.MAYORQ:controller.texto("if_icmpgt label"+numeroif);
                return izq>der;
            case GramaticaParser.DIFERENTE: controller.texto("if_icmpne label"+numeroif);
                return izq!=der;
        }
        return false;
    }

    //and y or
    @Override public Boolean visitOran(GramaticaParser.OranContext ctx)
    {
        Boolean izq = (Boolean) visit(ctx.cond(0));
        Boolean der = (Boolean) visit(ctx.cond(1));
        if(ctx.op.getText().equals("&&")){
            return izq && der;
        }
        else {
            return izq || der;

        }
    }

    @Override public Boolean visitParcon(GramaticaParser.ParconContext ctx) { return (Boolean) visit(ctx.cond()); }


    @Override public Boolean visitConreal(GramaticaParser.ConrealContext ctx) { return true; }

    @Override public Boolean visitConfictus(GramaticaParser.ConfictusContext ctx) { return false; }


    @Override public Object visitImprimeress(GramaticaParser.ImprimeressContext ctx)
    {
        HelloController.texto(String.valueOf(visit(ctx.imprimere())));
        return null;
    }

    @Override public Double visitNumerus(GramaticaParser.NumerusContext ctx)
    {
        HelloController.texto("bipush " + ctx.NUM().getText());
        return Double.valueOf(ctx.NUM().getText());
    }

    @Override public Double visitTriste(GramaticaParser.TristeContext ctx)
    {
        return Double.valueOf((ctx.TRSITE()).getText());
    }


    @Override public Double visitNomen(GramaticaParser.NomenContext ctx)
    {
        //int id = new ArrayList<String>(memoria.variables.keySet()).indexOf(ctx.ID().getText());
        HelloController.texto("iload "+contador.indexOf(ctx.ID().getText())+"\n");
        return memoria.regresar(ctx.ID().getText());
    }

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

    @Override public Double visitPotentia(GramaticaParser.PotentiaContext ctx)
    {
        Double a = (Double) visit(ctx.expr());
        Double b = Double.valueOf(Integer.parseInt(ctx.NUM().getText()));

        Double c =  Math.pow(a,b);

        return c;
    }
    @Override public Boolean visitIdcon(GramaticaParser.IdconContext ctx)
    {
        //int id = new ArrayList<String>(memoria.variables.keySet()).indexOf(ctx.ID().getText());
        HelloController.texto("iload "+contador.indexOf(ctx.ID().getText())+"\n");
        HelloController.texto("ifne label \n");
        double valor = memoria.regresar(ctx.ID().getText());
        return valor !=0;
    }

}

