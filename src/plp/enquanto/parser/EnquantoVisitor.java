// Generated from Enquanto.g4 by ANTLR 4.4
package plp.enquanto.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EnquantoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EnquantoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EnquantoParser#seqComando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqComando(@NotNull EnquantoParser.SeqComandoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atribuicao}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicao(@NotNull EnquantoParser.AtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code enquanto}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnquanto(@NotNull EnquantoParser.EnquantoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code leia}
	 * labeled alternative in {@link EnquantoParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeia(@NotNull EnquantoParser.LeiaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eLogico}
	 * labeled alternative in {@link EnquantoParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitELogico(@NotNull EnquantoParser.ELogicoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inteiro}
	 * labeled alternative in {@link EnquantoParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteiro(@NotNull EnquantoParser.InteiroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bloco}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloco(@NotNull EnquantoParser.BlocoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code naoLogico}
	 * labeled alternative in {@link EnquantoParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaoLogico(@NotNull EnquantoParser.NaoLogicoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code escreva}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscreva(@NotNull EnquantoParser.EscrevaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opRel}
	 * labeled alternative in {@link EnquantoParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpRel(@NotNull EnquantoParser.OpRelContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnquantoParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(@NotNull EnquantoParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code skip}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkip(@NotNull EnquantoParser.SkipContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expPar}
	 * labeled alternative in {@link EnquantoParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpPar(@NotNull EnquantoParser.ExpParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolPar}
	 * labeled alternative in {@link EnquantoParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolPar(@NotNull EnquantoParser.BoolParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ouLogico}
	 * labeled alternative in {@link EnquantoParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOuLogico(@NotNull EnquantoParser.OuLogicoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code se}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSe(@NotNull EnquantoParser.SeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exiba}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExiba(@NotNull EnquantoParser.ExibaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code para}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPara(@NotNull EnquantoParser.ParaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleano}
	 * labeled alternative in {@link EnquantoParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleano(@NotNull EnquantoParser.BooleanoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xorLogico}
	 * labeled alternative in {@link EnquantoParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXorLogico(@NotNull EnquantoParser.XorLogicoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opBin}
	 * labeled alternative in {@link EnquantoParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpBin(@NotNull EnquantoParser.OpBinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link EnquantoParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(@NotNull EnquantoParser.IdContext ctx);
}