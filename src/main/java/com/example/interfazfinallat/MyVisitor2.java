package com.example.interfazfinallat;

import jorge.parser.GramaticaParser;
import jorge.parser.TraductorBaseVisitor;
import jorge.parser.TraductorParser;
import jorge.parser.TraductorVisitor;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.stringtemplate.v4.ST;

public class MyVisitor2 extends TraductorBaseVisitor <String> {

        @Override public String visitCabeza(TraductorParser.CabezaContext ctx)
        {
            HelloController.traduccion("inanis major () {");
            return visitChildren(ctx);
        }

        @Override public String visitNum(TraductorParser.NumContext ctx) { return ctx.NUM().getText(); }

        @Override public String visitFloats(TraductorParser.FloatsContext ctx) { return ctx.FLOATS().getText(); }

        @Override public String visitAsignarr(TraductorParser.AsignarrContext ctx)
        {
                HelloController.traduccion(ctx.ID().getText()+ " = "+ visit(ctx.expr()) +";");
                return visitChildren(ctx);
        }
        @Override public String visitDeclararasignar(TraductorParser.DeclararasignarContext ctx)
        {
                HelloController.traduccion("totum "+ctx.ID().getText()+ '='+ visit(ctx.expr())+";");
                return visitChildren(ctx);
        }

        @Override public String visitDeclararasignarfloats(TraductorParser.DeclararasignarfloatsContext ctx)
        {
                HelloController.traduccion("tristeque "+ctx.ID().getText()+ '='+ visit(ctx.expr())+";");
                return visitChildren(ctx);
        }

        @Override public String visitImprecioness(TraductorParser.ImprecionessContext ctx)
        {
                HelloController.traduccion("imprimere ("+ctx.imprecion().getText()+");");
                return visitChildren(ctx); }

        @Override public String visitDeclararr(TraductorParser.DeclararrContext ctx)
        {
                HelloController.traduccion("totum "+ctx.ID().getText()+";");
                return visitChildren(ctx);
        }

        @Override public String visitDeclararfloats(TraductorParser.DeclararfloatsContext ctx)
        {
                HelloController.traduccion("tristeque "+ctx.ID().getText()+";");
                return visitChildren(ctx);
        }
        @Override public String visitConditiosi(TraductorParser.ConditiosiContext ctx)
        {
                HelloController.traduccion("if("+ctx.cond().getText()+"){");
                visit(ctx.cuerpo());
                HelloController.traduccion("}");
                if (ctx.conelseif()!=null){
                        for (TraductorParser.ConelseifContext c: ctx.conelseif()) {
                               visit(c);
                        }
                }
                if(ctx.conelse()!=null){
                        visit(ctx.conelse());
                }
                return null;
        }

        @Override public String  visitCondicionels(TraductorParser.CondicionelsContext ctx)
        {
                HelloController.traduccion("else"+"{");
                visit(ctx.cuerpo());
                HelloController.traduccion("}");
                return null;
        }

        @Override public String visitCondicionelseif(TraductorParser.CondicionelseifContext ctx)
        {
                HelloController.traduccion("else if("+ctx.cond().getText()+")"+"{");
                visit(ctx.cuerpo());
                HelloController.traduccion("}");
                return null;

        }

        @Override public String visitCondiconfor(TraductorParser.CondiconforContext ctx) {
        {
                if (ctx.declararasignar2()==null) {
                        HelloController.traduccion("for(" + ctx.asignar().getText() + ctx.cond().getText() + ";" + ctx.ID().getText() + ctx.op.getText() + "){");
                }
                else{
                        HelloController.traduccion("for(" + ctx.declararasignar2().getText() + ctx.cond().getText() + ";" + ctx.ID().getText() + ctx.op.getText() + "){");
                }
                visit(ctx.cuerpo());
                HelloController.traduccion("}");
                return null;
        }

 }

        @Override public String visitPotencia(TraductorParser.PotenciaContext ctx)
        {
                HelloController.traduccion(ctx.expr()+ "^"+ visit(ctx.NUM()) ) ;
                return visitChildren(ctx);
        }

        @Override public String visitConditio(TraductorParser.ConditioContext ctx) { return null;}

        @Override public String visitMasmenos(TraductorParser.MasmenosContext ctx) { return visit(ctx.expr(0))+ctx.op.getText()+visit(ctx.expr(1));}

        @Override public String visitId(TraductorParser.IdContext ctx) { return ctx.ID().getText(); }

        @Override public String visitMuldiv(TraductorParser.MuldivContext ctx) { return visit(ctx.expr(0))+ctx.op.getText()+visit(ctx.expr(1));}



}
