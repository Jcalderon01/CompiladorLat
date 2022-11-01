// Generated from Traductor.g4 by ANTLR 4.7.2
package jorge.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TraductorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TraductorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TraductorParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(TraductorParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorParser#cabeza}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCabeza(TraductorParser.CabezaContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorParser#abrir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbrir(TraductorParser.AbrirContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorParser#cerrar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCerrar(TraductorParser.CerrarContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorParser#cuerpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuerpo(TraductorParser.CuerpoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asignarr}
	 * labeled alternative in {@link TraductorParser#asignar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignarr(TraductorParser.AsignarrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code imprecioness}
	 * labeled alternative in {@link TraductorParser#impreciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprecioness(TraductorParser.ImprecionessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code imprecionn}
	 * labeled alternative in {@link TraductorParser#imprecion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprecionn(TraductorParser.ImprecionnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code imprecionexpr}
	 * labeled alternative in {@link TraductorParser#imprecion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprecionexpr(TraductorParser.ImprecionexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declararr}
	 * labeled alternative in {@link TraductorParser#declarar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclararr(TraductorParser.DeclararrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declararfloats}
	 * labeled alternative in {@link TraductorParser#declarar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclararfloats(TraductorParser.DeclararfloatsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declararasignar}
	 * labeled alternative in {@link TraductorParser#declararasignar2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclararasignar(TraductorParser.DeclararasignarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declararasignarfloats}
	 * labeled alternative in {@link TraductorParser#declararasignar2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclararasignarfloats(TraductorParser.DeclararasignarfloatsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code oran}
	 * labeled alternative in {@link TraductorParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOran(TraductorParser.OranContext ctx);
	/**
	 * Visit a parse tree produced by the {@code contrue}
	 * labeled alternative in {@link TraductorParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContrue(TraductorParser.ContrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code confalse}
	 * labeled alternative in {@link TraductorParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfalse(TraductorParser.ConfalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parcon}
	 * labeled alternative in {@link TraductorParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcon(TraductorParser.ParconContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditio}
	 * labeled alternative in {@link TraductorParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditio(TraductorParser.ConditioContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditiosi}
	 * labeled alternative in {@link TraductorParser#condsi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditiosi(TraductorParser.ConditiosiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condicionels}
	 * labeled alternative in {@link TraductorParser#conelse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionels(TraductorParser.CondicionelsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condicionelseif}
	 * labeled alternative in {@link TraductorParser#conelseif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionelseif(TraductorParser.CondicionelseifContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condiconfor}
	 * labeled alternative in {@link TraductorParser#confor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondiconfor(TraductorParser.CondiconforContext ctx);
	/**
	 * Visit a parse tree produced by the {@code potencia}
	 * labeled alternative in {@link TraductorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPotencia(TraductorParser.PotenciaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code masmenos}
	 * labeled alternative in {@link TraductorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMasmenos(TraductorParser.MasmenosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floats}
	 * labeled alternative in {@link TraductorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloats(TraductorParser.FloatsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code num}
	 * labeled alternative in {@link TraductorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(TraductorParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link TraductorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(TraductorParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code muldiv}
	 * labeled alternative in {@link TraductorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMuldiv(TraductorParser.MuldivContext ctx);
}