package com.example.interfazfinallat;

import jorge.parser.GramaticaBaseVisitor;
import jorge.parser.GramaticaParser;
import jorge.parser.TraductorParser;

public class MyVisitor3 extends GramaticaBaseVisitor <String>{

    @Override public String visitCaput(GramaticaParser.CaputContext ctx)
    {
        HelloController.traduccion2("void main() {");
        return visitChildren(ctx);
    }

    @Override public String visitNumerus(GramaticaParser.NumerusContext ctx) { return ctx.NUM().getText(); }

    @Override public String visitTriste(GramaticaParser.TristeContext ctx) { return ctx.TRSITE().getText(); }

    @Override public String visitAssignmentt(GramaticaParser.AssignmenttContext ctx)
    {
        HelloController.traduccion2(ctx.ID().getText()+ " = "+ visit(ctx.expr()) +";");
        return visitChildren(ctx);
    }
    @Override public String visitDeclarassignare(GramaticaParser.DeclarassignareContext ctx)
    {
        HelloController.traduccion2("int "+ctx.ID().getText()+ '='+ visit(ctx.expr())+";");
        return visitChildren(ctx);
    }

    @Override public String visitDeclarassignaretrist(GramaticaParser.DeclarassignaretristContext ctx)
    {
        HelloController.traduccion2("float "+ctx.ID().getText()+ '='+ visit(ctx.expr())+";");
        return visitChildren(ctx);
    }

    @Override public String visitDeclararetrist(GramaticaParser.DeclararetristContext ctx)
    {
        HelloController.traduccion2("float "+ctx.ID().getText()+";");
        return visitChildren(ctx);
    }

    @Override public String visitImprimeress(GramaticaParser.ImprimeressContext ctx)
    {
        HelloController.traduccion2("printf("+ctx.imprimere().getText()+");");
        return visitChildren(ctx);
    }

    @Override public String visitDeclararee(GramaticaParser.DeclarareeContext ctx)
    {
        HelloController.traduccion2("int "+ctx.ID().getText()+";");
        return visitChildren(ctx);
    }

    @Override public String visitConditiosi(GramaticaParser.ConditiosiContext ctx)
    {
        HelloController.traduccion2("if("+ctx.cond().getText()+"){");
        visit(ctx.corpus());
        HelloController.traduccion2("}");
        if (ctx.conelseif()!=null){
            for (GramaticaParser.ConelseifContext c: ctx.conelseif()) {
                visit(c);
            }
        }
        if(ctx.conelse()!=null){
            visit(ctx.conelse());
        }
        return null;
    }

    //else
    @Override public String visitCondicionels(GramaticaParser.CondicionelsContext ctx)
    {
        HelloController.traduccion2("else"+"{");
        visit(ctx.corpus());
        HelloController.traduccion2("}");
        return null;
    }

    //else if
    @Override public String visitCondicionelseif(GramaticaParser.CondicionelseifContext ctx)
    {
        HelloController.traduccion2("else if("+ctx.cond().getText()+")"+"{");
        visit(ctx.corpus());
        HelloController.traduccion2("}");
        return null;

    }


    @Override public String visitPotentia(GramaticaParser.PotentiaContext ctx)
    {
        HelloController.traduccion2(ctx.expr()+ "^"+ visit(ctx.NUM()) ) ;
        return visitChildren(ctx);
    }

    @Override public String visitPlusminus(GramaticaParser.PlusminusContext ctx)
    {
        return visit(ctx.expr(0))+ctx.op.getText()+visit(ctx.expr(1));
    }

    @Override public String visitBydivisio(GramaticaParser.BydivisioContext ctx)
    {
        return visit(ctx.expr(0))+ctx.op.getText()+visit(ctx.expr(1));
    }

    @Override public String visitNomen(GramaticaParser.NomenContext ctx) { return ctx.ID().getText(); }

}
