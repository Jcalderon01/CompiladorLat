// Generated from Gramatica.g4 by ANTLR 4.7.2
package jorge.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#major}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMajor(GramaticaParser.MajorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#caput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaput(GramaticaParser.CaputContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#aperta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAperta(GramaticaParser.ApertaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#claudure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClaudure(GramaticaParser.ClaudureContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#corpus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorpus(GramaticaParser.CorpusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentt}
	 * labeled alternative in {@link GramaticaParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentt(GramaticaParser.AssignmenttContext ctx);
	/**
	 * Visit a parse tree produced by the {@code imprimeress}
	 * labeled alternative in {@link GramaticaParser#imprimeres}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprimeress(GramaticaParser.ImprimeressContext ctx);
	/**
	 * Visit a parse tree produced by the {@code imprimeree}
	 * labeled alternative in {@link GramaticaParser#imprimere}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprimeree(GramaticaParser.ImprimereeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code imprimerexpr}
	 * labeled alternative in {@link GramaticaParser#imprimere}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprimerexpr(GramaticaParser.ImprimerexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declararee}
	 * labeled alternative in {@link GramaticaParser#declarare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclararee(GramaticaParser.DeclarareeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declararetrist}
	 * labeled alternative in {@link GramaticaParser#declarare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclararetrist(GramaticaParser.DeclararetristContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarassignaretrist}
	 * labeled alternative in {@link GramaticaParser#delarareasignare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarassignaretrist(GramaticaParser.DeclarassignaretristContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarassignare}
	 * labeled alternative in {@link GramaticaParser#delarareasignare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarassignare(GramaticaParser.DeclarassignareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code oran}
	 * labeled alternative in {@link GramaticaParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOran(GramaticaParser.OranContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conreal}
	 * labeled alternative in {@link GramaticaParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConreal(GramaticaParser.ConrealContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parcon}
	 * labeled alternative in {@link GramaticaParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcon(GramaticaParser.ParconContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditio}
	 * labeled alternative in {@link GramaticaParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditio(GramaticaParser.ConditioContext ctx);
	/**
	 * Visit a parse tree produced by the {@code confictus}
	 * labeled alternative in {@link GramaticaParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfictus(GramaticaParser.ConfictusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditiosi}
	 * labeled alternative in {@link GramaticaParser#condsi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditiosi(GramaticaParser.ConditiosiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condicionels}
	 * labeled alternative in {@link GramaticaParser#conelse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionels(GramaticaParser.CondicionelsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condicionelseif}
	 * labeled alternative in {@link GramaticaParser#conelseif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionelseif(GramaticaParser.CondicionelseifContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condiconfor}
	 * labeled alternative in {@link GramaticaParser#confor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondiconfor(GramaticaParser.CondiconforContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusminus}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusminus(GramaticaParser.PlusminusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code potentia}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPotentia(GramaticaParser.PotentiaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code triste}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriste(GramaticaParser.TristeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numerus}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumerus(GramaticaParser.NumerusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bydivisio}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBydivisio(GramaticaParser.BydivisioContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nomen}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNomen(GramaticaParser.NomenContext ctx);
}