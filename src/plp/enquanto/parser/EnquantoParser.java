// Generated from Enquanto.g4 by ANTLR 4.4
package plp.enquanto.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EnquantoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__34=1, T__33=2, T__32=3, T__31=4, T__30=5, T__29=6, T__28=7, T__27=8, 
		T__26=9, T__25=10, T__24=11, T__23=12, T__22=13, T__21=14, T__20=15, T__19=16, 
		T__18=17, T__17=18, T__16=19, T__15=20, T__14=21, T__13=22, T__12=23, 
		T__11=24, T__10=25, T__9=26, T__8=27, T__7=28, T__6=29, T__5=30, T__4=31, 
		T__3=32, T__2=33, T__1=34, T__0=35, INT=36, ID=37, Texto=38, Espaco=39;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'{'", "';'", "'='", "'}'", "'^'", "'faca'", "'ate'", 
		"':='", "'passo'", "'<='", "'de'", "'nao'", "'falso'", "'ou'", "'('", 
		"'para'", "'entao'", "'*'", "'exiba'", "'verdadeiro'", "'se'", "'senaose'", 
		"'senao'", "'>='", "'skip'", "'xor'", "'escreva'", "'<>'", "'e'", "'enquanto'", 
		"')'", "'+'", "'-'", "'leia'", "INT", "ID", "Texto", "Espaco"
	};
	public static final int
		RULE_programa = 0, RULE_seqComando = 1, RULE_comando = 2, RULE_expressao = 3, 
		RULE_bool = 4;
	public static final String[] ruleNames = {
		"programa", "seqComando", "comando", "expressao", "bool"
	};

	@Override
	public String getGrammarFileName() { return "Enquanto.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EnquantoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public SeqComandoContext seqComando() {
			return getRuleContext(SeqComandoContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnquantoVisitor ) return ((EnquantoVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10); seqComando();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SeqComandoContext extends ParserRuleContext {
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public SeqComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seqComando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterSeqComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitSeqComando(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnquantoVisitor ) return ((EnquantoVisitor<? extends T>)visitor).visitSeqComando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeqComandoContext seqComando() throws RecognitionException {
		SeqComandoContext _localctx = new SeqComandoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_seqComando);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12); comando();
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__32) {
				{
				{
				setState(13); match(T__32);
				setState(14); comando();
				}
				}
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComandoContext extends ParserRuleContext {
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
	 
		public ComandoContext() { }
		public void copyFrom(ComandoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AtribuicaoContext extends ComandoContext {
		public TerminalNode ID() { return getToken(EnquantoParser.ID, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public AtribuicaoContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitAtribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnquantoVisitor ) return ((EnquantoVisitor<? extends T>)visitor).visitAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SeContext extends ComandoContext {
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public BoolContext bool(int i) {
			return getRuleContext(BoolContext.class,i);
		}
		public List<BoolContext> bool() {
			return getRuleContexts(BoolContext.class);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public SeContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterSe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitSe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnquantoVisitor ) return ((EnquantoVisitor<? extends T>)visitor).visitSe(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExibaContext extends ComandoContext {
		public TerminalNode Texto() { return getToken(EnquantoParser.Texto, 0); }
		public ExibaContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterExiba(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitExiba(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnquantoVisitor ) return ((EnquantoVisitor<? extends T>)visitor).visitExiba(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EnquantoContext extends ComandoContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public EnquantoContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterEnquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitEnquanto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnquantoVisitor ) return ((EnquantoVisitor<? extends T>)visitor).visitEnquanto(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParaContext extends ComandoContext {
		public TerminalNode ID() { return getToken(EnquantoParser.ID, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public ParaContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitPara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnquantoVisitor ) return ((EnquantoVisitor<? extends T>)visitor).visitPara(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlocoContext extends ComandoContext {
		public SeqComandoContext seqComando() {
			return getRuleContext(SeqComandoContext.class,0);
		}
		public BlocoContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitBloco(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnquantoVisitor ) return ((EnquantoVisitor<? extends T>)visitor).visitBloco(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EscrevaContext extends ComandoContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public EscrevaContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterEscreva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitEscreva(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnquantoVisitor ) return ((EnquantoVisitor<? extends T>)visitor).visitEscreva(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SkipContext extends ComandoContext {
		public SkipContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterSkip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitSkip(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnquantoVisitor ) return ((EnquantoVisitor<? extends T>)visitor).visitSkip(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comando);
		int _la;
		try {
			setState(66);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new AtribuicaoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(20); match(ID);
				setState(21); match(T__26);
				setState(22); expressao(0);
				}
				break;
			case T__9:
				_localctx = new SkipContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(23); match(T__9);
				}
				break;
			case T__13:
				_localctx = new SeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(24); match(T__13);
				setState(25); bool(0);
				setState(26); match(T__17);
				setState(27); comando();
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(28); match(T__12);
					setState(29); bool(0);
					setState(30); match(T__17);
					setState(31); comando();
					}
					}
					setState(35); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__12 );
				setState(37); match(T__11);
				setState(38); comando();
				}
				break;
			case T__4:
				_localctx = new EnquantoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(40); match(T__4);
				setState(41); bool(0);
				setState(42); match(T__28);
				setState(43); comando();
				}
				break;
			case T__15:
				_localctx = new ExibaContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(45); match(T__15);
				setState(46); match(Texto);
				}
				break;
			case T__7:
				_localctx = new EscrevaContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(47); match(T__7);
				setState(48); expressao(0);
				}
				break;
			case T__33:
				_localctx = new BlocoContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(49); match(T__33);
				setState(50); seqComando();
				setState(51); match(T__30);
				}
				break;
			case T__18:
				_localctx = new ParaContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(53); match(T__18);
				setState(54); match(ID);
				setState(55); match(T__23);
				setState(56); expressao(0);
				setState(57); match(T__27);
				setState(58); expressao(0);
				setState(61);
				_la = _input.LA(1);
				if (_la==T__25) {
					{
					setState(59); match(T__25);
					setState(60); expressao(0);
					}
				}

				setState(63); match(T__28);
				setState(64); comando();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressaoContext extends ParserRuleContext {
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
	 
		public ExpressaoContext() { }
		public void copyFrom(ExpressaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LeiaContext extends ExpressaoContext {
		public LeiaContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterLeia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitLeia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnquantoVisitor ) return ((EnquantoVisitor<? extends T>)visitor).visitLeia(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InteiroContext extends ExpressaoContext {
		public TerminalNode INT() { return getToken(EnquantoParser.INT, 0); }
		public InteiroContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterInteiro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitInteiro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnquantoVisitor ) return ((EnquantoVisitor<? extends T>)visitor).visitInteiro(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OpBinContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public OpBinContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterOpBin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitOpBin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnquantoVisitor ) return ((EnquantoVisitor<? extends T>)visitor).visitOpBin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends ExpressaoContext {
		public TerminalNode ID() { return getToken(EnquantoParser.ID, 0); }
		public IdContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnquantoVisitor ) return ((EnquantoVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpParContext extends ExpressaoContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ExpParContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterExpPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitExpPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnquantoVisitor ) return ((EnquantoVisitor<? extends T>)visitor).visitExpPar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		return expressao(0);
	}

	private ExpressaoContext expressao(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, _parentState);
		ExpressaoContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expressao, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			switch (_input.LA(1)) {
			case INT:
				{
				_localctx = new InteiroContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(69); match(INT);
				}
				break;
			case T__0:
				{
				_localctx = new LeiaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(70); match(T__0);
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(71); match(ID);
				}
				break;
			case T__19:
				{
				_localctx = new ExpParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(72); match(T__19);
				setState(73); expressao(0);
				setState(74); match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(93);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new OpBinContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(78);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(79); match(T__16);
						setState(80); expressao(7);
						}
						break;
					case 2:
						{
						_localctx = new OpBinContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(81);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(82); match(T__2);
						setState(83); expressao(6);
						}
						break;
					case 3:
						{
						_localctx = new OpBinContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(84);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(85); match(T__1);
						setState(86); expressao(5);
						}
						break;
					case 4:
						{
						_localctx = new OpBinContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(87);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(88); match(T__34);
						setState(89); expressao(4);
						}
						break;
					case 5:
						{
						_localctx = new OpBinContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(90);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(91); match(T__29);
						setState(92); expressao(3);
						}
						break;
					}
					} 
				}
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BoolContext extends ParserRuleContext {
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
	 
		public BoolContext() { }
		public void copyFrom(BoolContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ELogicoContext extends BoolContext {
		public BoolContext bool(int i) {
			return getRuleContext(BoolContext.class,i);
		}
		public List<BoolContext> bool() {
			return getRuleContexts(BoolContext.class);
		}
		public ELogicoContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterELogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitELogico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnquantoVisitor ) return ((EnquantoVisitor<? extends T>)visitor).visitELogico(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanoContext extends BoolContext {
		public BooleanoContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterBooleano(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitBooleano(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnquantoVisitor ) return ((EnquantoVisitor<? extends T>)visitor).visitBooleano(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XorLogicoContext extends BoolContext {
		public BoolContext bool(int i) {
			return getRuleContext(BoolContext.class,i);
		}
		public List<BoolContext> bool() {
			return getRuleContexts(BoolContext.class);
		}
		public XorLogicoContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterXorLogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitXorLogico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnquantoVisitor ) return ((EnquantoVisitor<? extends T>)visitor).visitXorLogico(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NaoLogicoContext extends BoolContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public NaoLogicoContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterNaoLogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitNaoLogico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnquantoVisitor ) return ((EnquantoVisitor<? extends T>)visitor).visitNaoLogico(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OpRelContext extends BoolContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public OpRelContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterOpRel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitOpRel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnquantoVisitor ) return ((EnquantoVisitor<? extends T>)visitor).visitOpRel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolParContext extends BoolContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public BoolParContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterBoolPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitBoolPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnquantoVisitor ) return ((EnquantoVisitor<? extends T>)visitor).visitBoolPar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OuLogicoContext extends BoolContext {
		public BoolContext bool(int i) {
			return getRuleContext(BoolContext.class,i);
		}
		public List<BoolContext> bool() {
			return getRuleContexts(BoolContext.class);
		}
		public OuLogicoContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterOuLogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitOuLogico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnquantoVisitor ) return ((EnquantoVisitor<? extends T>)visitor).visitOuLogico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		return bool(0);
	}

	private BoolContext bool(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolContext _localctx = new BoolContext(_ctx, _parentState);
		BoolContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_bool, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				_localctx = new NaoLogicoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(99); match(T__22);
				setState(100); bool(5);
				}
				break;
			case 2:
				{
				_localctx = new BooleanoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(101);
				_la = _input.LA(1);
				if ( !(_la==T__21 || _la==T__14) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case 3:
				{
				_localctx = new OpRelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(102); expressao(0);
				setState(103); match(T__31);
				setState(104); expressao(0);
				}
				break;
			case 4:
				{
				_localctx = new OpRelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(106); expressao(0);
				setState(107); match(T__6);
				setState(108); expressao(0);
				}
				break;
			case 5:
				{
				_localctx = new OpRelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(110); expressao(0);
				setState(111); match(T__24);
				setState(112); expressao(0);
				}
				break;
			case 6:
				{
				_localctx = new OpRelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(114); expressao(0);
				setState(115); match(T__10);
				setState(116); expressao(0);
				}
				break;
			case 7:
				{
				_localctx = new BoolParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(118); match(T__19);
				setState(119); bool(0);
				setState(120); match(T__3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(135);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(133);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ELogicoContext(new BoolContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bool);
						setState(124);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(125); match(T__5);
						setState(126); bool(5);
						}
						break;
					case 2:
						{
						_localctx = new OuLogicoContext(new BoolContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bool);
						setState(127);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(128); match(T__20);
						setState(129); bool(4);
						}
						break;
					case 3:
						{
						_localctx = new XorLogicoContext(new BoolContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bool);
						setState(130);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(131); match(T__8);
						setState(132); bool(3);
						}
						break;
					}
					} 
				}
				setState(137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3: return expressao_sempred((ExpressaoContext)_localctx, predIndex);
		case 4: return bool_sempred((BoolContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean bool_sempred(BoolContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5: return precpred(_ctx, 4);
		case 6: return precpred(_ctx, 3);
		case 7: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expressao_sempred(ExpressaoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 6);
		case 1: return precpred(_ctx, 5);
		case 2: return precpred(_ctx, 4);
		case 3: return precpred(_ctx, 3);
		case 4: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)\u008d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\3\3\3\3\3\7\3\22\n\3\f\3\16\3"+
		"\25\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\6\4$\n\4"+
		"\r\4\16\4%\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4@\n\4\3\4\3\4\3\4\5\4E\n\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5O\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5`\n\5\f\5\16\5c\13\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\5\6}\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0088\n\6\f"+
		"\6\16\6\u008b\13\6\3\6\2\4\b\n\7\2\4\6\b\n\2\3\4\2\20\20\27\27\u00a2\2"+
		"\f\3\2\2\2\4\16\3\2\2\2\6D\3\2\2\2\bN\3\2\2\2\n|\3\2\2\2\f\r\5\4\3\2\r"+
		"\3\3\2\2\2\16\23\5\6\4\2\17\20\7\5\2\2\20\22\5\6\4\2\21\17\3\2\2\2\22"+
		"\25\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\5\3\2\2\2\25\23\3\2\2\2\26"+
		"\27\7\'\2\2\27\30\7\13\2\2\30E\5\b\5\2\31E\7\34\2\2\32\33\7\30\2\2\33"+
		"\34\5\n\6\2\34\35\7\24\2\2\35#\5\6\4\2\36\37\7\31\2\2\37 \5\n\6\2 !\7"+
		"\24\2\2!\"\5\6\4\2\"$\3\2\2\2#\36\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2\2"+
		"\2&\'\3\2\2\2\'(\7\32\2\2()\5\6\4\2)E\3\2\2\2*+\7!\2\2+,\5\n\6\2,-\7\t"+
		"\2\2-.\5\6\4\2.E\3\2\2\2/\60\7\26\2\2\60E\7(\2\2\61\62\7\36\2\2\62E\5"+
		"\b\5\2\63\64\7\4\2\2\64\65\5\4\3\2\65\66\7\7\2\2\66E\3\2\2\2\678\7\23"+
		"\2\289\7\'\2\29:\7\16\2\2:;\5\b\5\2;<\7\n\2\2<?\5\b\5\2=>\7\f\2\2>@\5"+
		"\b\5\2?=\3\2\2\2?@\3\2\2\2@A\3\2\2\2AB\7\t\2\2BC\5\6\4\2CE\3\2\2\2D\26"+
		"\3\2\2\2D\31\3\2\2\2D\32\3\2\2\2D*\3\2\2\2D/\3\2\2\2D\61\3\2\2\2D\63\3"+
		"\2\2\2D\67\3\2\2\2E\7\3\2\2\2FG\b\5\1\2GO\7&\2\2HO\7%\2\2IO\7\'\2\2JK"+
		"\7\22\2\2KL\5\b\5\2LM\7\"\2\2MO\3\2\2\2NF\3\2\2\2NH\3\2\2\2NI\3\2\2\2"+
		"NJ\3\2\2\2Oa\3\2\2\2PQ\f\b\2\2QR\7\25\2\2R`\5\b\5\tST\f\7\2\2TU\7#\2\2"+
		"U`\5\b\5\bVW\f\6\2\2WX\7$\2\2X`\5\b\5\7YZ\f\5\2\2Z[\7\3\2\2[`\5\b\5\6"+
		"\\]\f\4\2\2]^\7\b\2\2^`\5\b\5\5_P\3\2\2\2_S\3\2\2\2_V\3\2\2\2_Y\3\2\2"+
		"\2_\\\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\t\3\2\2\2ca\3\2\2\2de\b\6"+
		"\1\2ef\7\17\2\2f}\5\n\6\7g}\t\2\2\2hi\5\b\5\2ij\7\6\2\2jk\5\b\5\2k}\3"+
		"\2\2\2lm\5\b\5\2mn\7\37\2\2no\5\b\5\2o}\3\2\2\2pq\5\b\5\2qr\7\r\2\2rs"+
		"\5\b\5\2s}\3\2\2\2tu\5\b\5\2uv\7\33\2\2vw\5\b\5\2w}\3\2\2\2xy\7\22\2\2"+
		"yz\5\n\6\2z{\7\"\2\2{}\3\2\2\2|d\3\2\2\2|g\3\2\2\2|h\3\2\2\2|l\3\2\2\2"+
		"|p\3\2\2\2|t\3\2\2\2|x\3\2\2\2}\u0089\3\2\2\2~\177\f\6\2\2\177\u0080\7"+
		" \2\2\u0080\u0088\5\n\6\7\u0081\u0082\f\5\2\2\u0082\u0083\7\21\2\2\u0083"+
		"\u0088\5\n\6\6\u0084\u0085\f\4\2\2\u0085\u0086\7\35\2\2\u0086\u0088\5"+
		"\n\6\5\u0087~\3\2\2\2\u0087\u0081\3\2\2\2\u0087\u0084\3\2\2\2\u0088\u008b"+
		"\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\13\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\f\23%?DN_a|\u0087\u0089";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}