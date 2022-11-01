package com.example.interfazfinallat;

import jorge.parser.GramaticaBaseVisitor;
import jorge.parser.GramaticaParser;

import java.util.HashMap;
import java.util.Map;

public class MyVisitor extends GramaticaBaseVisitor {

    Scope memoria = new Scope(null);

    @Override public Object visitImprimerexpr(GramaticaParser.ImprimerexprContext ctx)
    {
        return visit(ctx.expr());
    }

    @Override public Object visitImprimeree(GramaticaParser.ImprimereeContext ctx) {
        return ctx.FILUM().getText();
    }

    //asignacion
    @Override public Double visitAssignmentt(GramaticaParser.AssignmenttContext ctx)
    {

        String id = ctx.ID().getText();
        Double valor = (Double) visit(ctx.expr());
        if(memoria.buscar(id))
        {
            memoria.asignar(id,valor);
        }
        else
        {
            //HelloController.texto("La variable ya esta declarada");
        }
        return null;
    }

    //declaracion
    @Override public Double visitDeclararee(GramaticaParser.DeclarareeContext ctx)
    {
        String id = ctx.ID().getText();
        if(!memoria.buscar(ctx.ID().getText() ))
        {
            memoria.declarar(id);
        }
        else
        {
           // HelloController.texto("La variable ya esta declarada");
        }
        return null;
    }

    //declaracion asignacion
    @Override public Object visitDeclarassignare(GramaticaParser.DeclarassignareContext ctx)
    {
        String id = ctx.ID().getText();
        Double valor = (Double) visit(ctx.expr());
        if(!memoria.buscar(id))
        {
            memoria.declarar(id);
            memoria.asignar(id,valor);
        }
        else
        {
           // HelloController.texto("La variable ya esta declarada");
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
            memoria.declarar(id);
            memoria.asignar(id,valor);
        }
        else
        {
           // HelloController.texto("La variable ya esta declarada");
        }
        return null;
    }

    //if
    @Override public Object visitConditiosi(GramaticaParser.ConditiosiContext ctx)
    {
        if((Boolean) visit(ctx.cond())){
            memoria = new Scope(memoria);
            visit(ctx.corpus());
            memoria = memoria.padre;
            return null;
        }
        if (ctx.conelseif()!=null){
            for (GramaticaParser.ConelseifContext c: ctx.conelseif()) {
                boolean condicion = (boolean)visit(c);
                if (condicion){
                    return null;
                }
            }
        }
        if(ctx.conelse()!=null){
            visit(ctx.conelse());
        }
        return true;
    }

    //else
    @Override public Object visitCondicionels(GramaticaParser.CondicionelsContext ctx)
    {
        memoria = new Scope(memoria);
        visit(ctx.corpus());
        memoria = memoria.padre;
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

        if(ctx.delarareasignare()==null) {
            if (ctx.op.getText().equals("++")) {

                for (visit(ctx.assignment()); (boolean) visit(ctx.cond()); memoria.asignar(ctx.ID().getText(), memoria.regresar(ctx.ID().getText()) + 1)) {
                    memoria = new Scope(memoria);
                    visit(ctx.corpus());
                    memoria = memoria.padre;
                }
            } else {
                for (visit(ctx.assignment()); (boolean) visit(ctx.cond()); memoria.asignar(ctx.ID().getText(), memoria.regresar(ctx.ID().getText()) - 1)) {
                    memoria = new Scope(memoria);
                    visit(ctx.corpus());
                    memoria = memoria.padre;
                }
            }
        }
        else {
            if (ctx.op.getText().equals("++")) {

                for (visit(ctx.delarareasignare()); (boolean) visit(ctx.cond()); memoria.asignar(ctx.ID().getText(), memoria.regresar(ctx.ID().getText()) + 1)) {
                    memoria = new Scope(memoria);
                    visit(ctx.corpus());
                    memoria = memoria.padre;
                }
            } else {
                for (visit(ctx.delarareasignare()); (boolean) visit(ctx.cond()); memoria.asignar(ctx.ID().getText(), memoria.regresar(ctx.ID().getText()) - 1)) {
                    memoria = new Scope(memoria);
                    visit(ctx.corpus());
                    memoria = memoria.padre;
                }
            }
        }


        return null;
    }


    //condicional
    @Override public Boolean visitConditio(GramaticaParser.ConditioContext ctx)
    {
        double izq = (double)visit(ctx.expr(0));
        double der = (double)visit(ctx.expr(1));
        switch (ctx.op.getType()){
            case GramaticaParser.MENORIGUAL: return izq<=der;
            case GramaticaParser.MAYORIGUAL: return izq>=der;
            case GramaticaParser.IGUAL: return izq==der;
            case GramaticaParser.MENORQ: return izq<der;
            case GramaticaParser.MAYORQ: return izq>der;
            case GramaticaParser.DIFERENTE: return izq!=der;
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
        return Double.valueOf((ctx.NUM()).getText());
    }

    @Override public Double visitTriste(GramaticaParser.TristeContext ctx)
    {
        return Double.valueOf((ctx.TRSITE()).getText());
    }


    @Override public Double visitNomen(GramaticaParser.NomenContext ctx)
    {
        return memoria.regresar(ctx.ID().getText());
    }

    @Override public Double visitPlusminus(GramaticaParser.PlusminusContext ctx)
    {
        Double izq = (Double) visit(ctx.expr(0));
        Double der = (Double) visit(ctx.expr(1));
        if(ctx.op.getText().equals("+")){
            return izq + der;
        }
        else {
            return izq - der;
        }
    }

    @Override public Double visitBydivisio(GramaticaParser.BydivisioContext ctx)
    {
        Double izq = (Double) visit(ctx.expr(0));
        Double der = (Double) visit(ctx.expr(1));
        if(ctx.op.getText().equals("*")){
            return izq * der;
        }
        else {
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
}

