package plp.enquanto.parser;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import plp.enquanto.linguagem.Linguagem.*;

public class MeuListener extends EnquantoBaseListener {
	private final Leia leia = new Leia();
	private final Skip skip = new Skip();
	private final ParseTreeProperty<Object> values = new ParseTreeProperty<>();

	private Programa programa;

	public Programa getPrograma() {
		return programa;
	}

	private void setValue(final ParseTree node, final Object value) {
		values.put(node, value);
	}

	private Object getValue(final ParseTree node) {
		return values.get(node);
	}

	@Override
	public void exitBooleano(final EnquantoParser.BooleanoContext ctx) {
		setValue(ctx, new Booleano(ctx.getText().equals("verdadeiro")));
	}

	@Override
	public void exitLeia(final EnquantoParser.LeiaContext ctx) {
		setValue(ctx, leia);
	}

	@Override
	public void exitSe(final EnquantoParser.SeContext ctx) {
		final ArrayList<Bool> condicao = new ArrayList<>();
		final ArrayList<Comando> comando = new ArrayList<>();
		for(int i = 0; i < ctx.comando().size(); i++)
			comando.add((Comando) getValue(ctx.comando(i)));
		for(int i = 0; i < ctx.bool().size(); i++)
			condicao.add((Bool) getValue(ctx.bool(i)));
		setValue(ctx, new Se(comando, condicao));
	}

	@Override
	public void exitInteiro(final EnquantoParser.InteiroContext ctx) {
		setValue(ctx, new Inteiro(Integer.parseInt(ctx.getText())));
	}

	@Override
	public void exitSkip(final EnquantoParser.SkipContext ctx) {
		setValue(ctx, skip);
	}

	@Override
	public void exitEscreva(final EnquantoParser.EscrevaContext ctx) {
		final Expressao exp = (Expressao) getValue(ctx.expressao());
		setValue(ctx, new Escreva(exp));
	}

	@Override
	public void exitPrograma(final EnquantoParser.ProgramaContext ctx) {
		@SuppressWarnings("unchecked")
		final List<Comando> cmds = (List<Comando>) getValue(ctx.seqComando());
		programa = new Programa(cmds);
		setValue(ctx, programa);
	}

	@Override
	public void exitId(final EnquantoParser.IdContext ctx) {
		setValue(ctx, new Id(ctx.ID().getText()));
	}

	@Override
	public void exitSeqComando(final EnquantoParser.SeqComandoContext ctx) {
		final List<Comando> comandos = new ArrayList<>();
		for (EnquantoParser.ComandoContext c : ctx.comando()) {
			comandos.add((Comando) getValue(c));
		}
		setValue(ctx, comandos);
	}

	@Override
	public void exitAtribuicao(final EnquantoParser.AtribuicaoContext ctx) {
		final String id = ctx.ID().getText();
		final Expressao exp = (Expressao) getValue(ctx.expressao());
		setValue(ctx, new Atribuicao(id, exp));
	}

	@Override
	public void exitBloco(final EnquantoParser.BlocoContext ctx) {
		@SuppressWarnings("unchecked")
		final List<Comando> cmds = (List<Comando>) getValue(ctx.seqComando());
		setValue(ctx, new Bloco(cmds));
	}

	@Override
	public void exitPara(final EnquantoParser.ParaContext ctx) {
		final Expressao de = (Expressao) getValue(ctx.expressao(0));
		final Expressao para = (Expressao) getValue(ctx.expressao(1));
		final Expressao passo = (Expressao) getValue(ctx.expressao(2));
		final Comando faca = (Comando) getValue(ctx.comando());
		final String id = (String) ctx.ID().getText();
		int passoInt = passo != null ? passo.getValor() : 1;
		setValue(ctx, new Para(de, para, id, passoInt, faca));
	}
	
	@Override
	public void exitOpBin(final EnquantoParser.OpBinContext ctx) {
		final Expressao esq = (Expressao) getValue(ctx.expressao(0));
		final Expressao dir = (Expressao) getValue(ctx.expressao(1));
		final String op = ctx.getChild(1).getText();
		final ExpBin exp;
		switch (op) {
		case "+":
			exp = new ExpSoma(esq, dir);
			break;
		case "*":
			exp = new ExpMult(esq, dir);
			break;
		case "-":
			exp = new ExpSub(esq, dir);
			break;
		case "/":
			exp = new ExpDiv(esq,dir);
			break;
		case "^":
			exp = new ExpPot(esq,dir);
			break;
		default:
			exp = new ExpSoma(esq, dir);
		}
		setValue(ctx, exp);
	}

	@Override
	public void exitEnquanto(final EnquantoParser.EnquantoContext ctx) {
		final Bool condicao = (Bool) getValue(ctx.bool());
		final Comando comando = (Comando) getValue(ctx.comando());
		setValue(ctx, new Enquanto(condicao, comando));
	}

	@Override
	public void exitELogico(final EnquantoParser.ELogicoContext ctx) {
		final Bool esq = (Bool) getValue(ctx.bool(0));
		final Bool dir = (Bool) getValue(ctx.bool(1));
		setValue(ctx, new ELogico(esq, dir));
	}
	
	@Override
	public void exitOuLogico(final EnquantoParser.OuLogicoContext ctx) {
		final Bool esq = (Bool) getValue(ctx.bool(0));
		final Bool dir = (Bool) getValue(ctx.bool(1));
		setValue(ctx, new OULogico(esq, dir));
	}
	
	@Override
	public void exitXorLogico(final EnquantoParser.XorLogicoContext ctx) {
		final Bool esq = (Bool) getValue(ctx.bool(0));
		final Bool dir = (Bool) getValue(ctx.bool(1));
		setValue(ctx, new XorLogico(esq, dir));
	}

	@Override
	public void exitBoolPar(final EnquantoParser.BoolParContext ctx) {
		setValue(ctx, getValue(ctx.bool()));
	}

	@Override
	public void exitNaoLogico(final EnquantoParser.NaoLogicoContext ctx) {
		final Bool b = (Bool) getValue(ctx.bool());
		setValue(ctx, new NaoLogico(b));
	}

	@Override
	public void exitExpPar(final EnquantoParser.ExpParContext ctx) {
		setValue(ctx, getValue(ctx.expressao()));
	}

	@Override
	public void exitExiba(final EnquantoParser.ExibaContext ctx) {
		final String t = ctx.Texto().getText();
		final String texto = t.substring(1, t.length() - 1);
		setValue(ctx, new Exiba(texto));
	}

	@Override
	public void exitOpRel(final EnquantoParser.OpRelContext ctx) {
		final Expressao esq = (Expressao) getValue(ctx.expressao(0));
		final Expressao dir = (Expressao) getValue(ctx.expressao(1));
		final String op = ctx.getChild(1).getText();
		final ExpRel exp;
		switch (op) {
		case "=":
			exp = new ExpIgual(esq, dir);
			break;
		case "<>":
			exp = new ExpDiferente(esq, dir);
			break;
		case "<=":
			exp = new ExpMenorIgual(esq, dir);
			break;
		case ">=":
			exp = new ExpMaiorIgual(esq, dir);
			break;
		default:
			exp = new ExpIgual(esq, dir);
		}
		setValue(ctx, exp);
	}
}
