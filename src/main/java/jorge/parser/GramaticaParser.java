// Generated from Gramatica.g4 by ANTLR 4.7.2
package jorge.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, FOR=9, 
		AND=10, OR=11, TRUE=12, FALSE=13, MAYORQ=14, MENORQ=15, MENORIGUAL=16, 
		MAYORIGUAL=17, IGUAL=18, DIFERENTE=19, POTENTIA=20, TOTUM=21, TRISTEQUE=22, 
		SIGNO=23, FILUM=24, INANIS=25, MAJOR=26, IMPRIMERE=27, PLUS=28, MINUS=29, 
		DIVISIO=30, BY=31, IDEM=32, TRSITE=33, ID=34, NUM=35, COMMENT=36, COM=37, 
		AS=38;
	public static final int
		RULE_major = 0, RULE_caput = 1, RULE_aperta = 2, RULE_claudure = 3, RULE_corpus = 4, 
		RULE_assignment = 5, RULE_imprimeres = 6, RULE_imprimere = 7, RULE_declarare = 8, 
		RULE_delarareasignare = 9, RULE_cond = 10, RULE_condsi = 11, RULE_conelse = 12, 
		RULE_conelseif = 13, RULE_confor = 14, RULE_expr = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"major", "caput", "aperta", "claudure", "corpus", "assignment", "imprimeres", 
			"imprimere", "declarare", "delarareasignare", "cond", "condsi", "conelse", 
			"conelseif", "confor", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "'if'", "'else'", "'++'", "'--'", "'for'", 
			"'&&'", "'||'", "'true'", "'false'", "'>'", "'<'", "'<='", "'>='", "'=='", 
			"'!='", "'^'", "'totum'", "'tristeque'", "';'", null, "'inanis'", "'major'", 
			"'imprimere'", "'+'", "'-'", "'/'", "'*'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "FOR", "AND", "OR", 
			"TRUE", "FALSE", "MAYORQ", "MENORQ", "MENORIGUAL", "MAYORIGUAL", "IGUAL", 
			"DIFERENTE", "POTENTIA", "TOTUM", "TRISTEQUE", "SIGNO", "FILUM", "INANIS", 
			"MAJOR", "IMPRIMERE", "PLUS", "MINUS", "DIVISIO", "BY", "IDEM", "TRSITE", 
			"ID", "NUM", "COMMENT", "COM", "AS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MajorContext extends ParserRuleContext {
		public CaputContext caput() {
			return getRuleContext(CaputContext.class,0);
		}
		public ApertaContext aperta() {
			return getRuleContext(ApertaContext.class,0);
		}
		public CorpusContext corpus() {
			return getRuleContext(CorpusContext.class,0);
		}
		public ClaudureContext claudure() {
			return getRuleContext(ClaudureContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GramaticaParser.EOF, 0); }
		public MajorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_major; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitMajor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MajorContext major() throws RecognitionException {
		MajorContext _localctx = new MajorContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_major);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			caput();
			setState(33);
			aperta();
			setState(34);
			corpus();
			setState(35);
			claudure();
			setState(36);
			match(EOF);
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

	public static class CaputContext extends ParserRuleContext {
		public TerminalNode INANIS() { return getToken(GramaticaParser.INANIS, 0); }
		public TerminalNode MAJOR() { return getToken(GramaticaParser.MAJOR, 0); }
		public CaputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caput; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitCaput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaputContext caput() throws RecognitionException {
		CaputContext _localctx = new CaputContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_caput);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(INANIS);
			setState(39);
			match(MAJOR);
			setState(40);
			match(T__0);
			setState(41);
			match(T__1);
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

	public static class ApertaContext extends ParserRuleContext {
		public ApertaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aperta; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitAperta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApertaContext aperta() throws RecognitionException {
		ApertaContext _localctx = new ApertaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_aperta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(T__2);
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

	public static class ClaudureContext extends ParserRuleContext {
		public ClaudureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_claudure; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitClaudure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClaudureContext claudure() throws RecognitionException {
		ClaudureContext _localctx = new ClaudureContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_claudure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__3);
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

	public static class CorpusContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<ImprimeresContext> imprimeres() {
			return getRuleContexts(ImprimeresContext.class);
		}
		public ImprimeresContext imprimeres(int i) {
			return getRuleContext(ImprimeresContext.class,i);
		}
		public List<DeclarareContext> declarare() {
			return getRuleContexts(DeclarareContext.class);
		}
		public DeclarareContext declarare(int i) {
			return getRuleContext(DeclarareContext.class,i);
		}
		public List<DelarareasignareContext> delarareasignare() {
			return getRuleContexts(DelarareasignareContext.class);
		}
		public DelarareasignareContext delarareasignare(int i) {
			return getRuleContext(DelarareasignareContext.class,i);
		}
		public List<CondsiContext> condsi() {
			return getRuleContexts(CondsiContext.class);
		}
		public CondsiContext condsi(int i) {
			return getRuleContext(CondsiContext.class,i);
		}
		public List<ConforContext> confor() {
			return getRuleContexts(ConforContext.class);
		}
		public ConforContext confor(int i) {
			return getRuleContext(ConforContext.class,i);
		}
		public CorpusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpus; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitCorpus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CorpusContext corpus() throws RecognitionException {
		CorpusContext _localctx = new CorpusContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_corpus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << FOR) | (1L << TOTUM) | (1L << TRISTEQUE) | (1L << IMPRIMERE) | (1L << TRSITE) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				setState(54);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(47);
					expr(0);
					}
					break;
				case 2:
					{
					setState(48);
					assignment();
					}
					break;
				case 3:
					{
					setState(49);
					imprimeres();
					}
					break;
				case 4:
					{
					setState(50);
					declarare();
					}
					break;
				case 5:
					{
					setState(51);
					delarareasignare();
					}
					break;
				case 6:
					{
					setState(52);
					condsi();
					}
					break;
				case 7:
					{
					setState(53);
					confor();
					}
					break;
				}
				}
				setState(58);
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

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignmenttContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode IDEM() { return getToken(GramaticaParser.IDEM, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SIGNO() { return getToken(GramaticaParser.SIGNO, 0); }
		public AssignmenttContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitAssignmentt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment);
		try {
			_localctx = new AssignmenttContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(ID);
			setState(60);
			match(IDEM);
			setState(61);
			expr(0);
			setState(62);
			match(SIGNO);
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

	public static class ImprimeresContext extends ParserRuleContext {
		public ImprimeresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimeres; }
	 
		public ImprimeresContext() { }
		public void copyFrom(ImprimeresContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ImprimeressContext extends ImprimeresContext {
		public TerminalNode IMPRIMERE() { return getToken(GramaticaParser.IMPRIMERE, 0); }
		public ImprimereContext imprimere() {
			return getRuleContext(ImprimereContext.class,0);
		}
		public TerminalNode SIGNO() { return getToken(GramaticaParser.SIGNO, 0); }
		public ImprimeressContext(ImprimeresContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitImprimeress(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImprimeresContext imprimeres() throws RecognitionException {
		ImprimeresContext _localctx = new ImprimeresContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_imprimeres);
		try {
			_localctx = new ImprimeressContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(IMPRIMERE);
			setState(65);
			match(T__0);
			setState(66);
			imprimere();
			setState(67);
			match(T__1);
			setState(68);
			match(SIGNO);
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

	public static class ImprimereContext extends ParserRuleContext {
		public ImprimereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimere; }
	 
		public ImprimereContext() { }
		public void copyFrom(ImprimereContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ImprimerexprContext extends ImprimereContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ImprimerexprContext(ImprimereContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitImprimerexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImprimereeContext extends ImprimereContext {
		public TerminalNode FILUM() { return getToken(GramaticaParser.FILUM, 0); }
		public ImprimereeContext(ImprimereContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitImprimeree(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImprimereContext imprimere() throws RecognitionException {
		ImprimereContext _localctx = new ImprimereContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_imprimere);
		try {
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FILUM:
				_localctx = new ImprimereeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				match(FILUM);
				}
				break;
			case TRSITE:
			case ID:
			case NUM:
				_localctx = new ImprimerexprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				expr(0);
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

	public static class DeclarareContext extends ParserRuleContext {
		public DeclarareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarare; }
	 
		public DeclarareContext() { }
		public void copyFrom(DeclarareContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclarareeContext extends DeclarareContext {
		public TerminalNode TOTUM() { return getToken(GramaticaParser.TOTUM, 0); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode SIGNO() { return getToken(GramaticaParser.SIGNO, 0); }
		public DeclarareeContext(DeclarareContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitDeclararee(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclararetristContext extends DeclarareContext {
		public TerminalNode TRISTEQUE() { return getToken(GramaticaParser.TRISTEQUE, 0); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode SIGNO() { return getToken(GramaticaParser.SIGNO, 0); }
		public DeclararetristContext(DeclarareContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitDeclararetrist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarareContext declarare() throws RecognitionException {
		DeclarareContext _localctx = new DeclarareContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declarare);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOTUM:
				_localctx = new DeclarareeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(TOTUM);
				setState(75);
				match(ID);
				setState(76);
				match(SIGNO);
				}
				break;
			case TRISTEQUE:
				_localctx = new DeclararetristContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				match(TRISTEQUE);
				setState(78);
				match(ID);
				setState(79);
				match(SIGNO);
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

	public static class DelarareasignareContext extends ParserRuleContext {
		public DelarareasignareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delarareasignare; }
	 
		public DelarareasignareContext() { }
		public void copyFrom(DelarareasignareContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclarassignareContext extends DelarareasignareContext {
		public TerminalNode TOTUM() { return getToken(GramaticaParser.TOTUM, 0); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode IDEM() { return getToken(GramaticaParser.IDEM, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SIGNO() { return getToken(GramaticaParser.SIGNO, 0); }
		public DeclarassignareContext(DelarareasignareContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitDeclarassignare(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclarassignaretristContext extends DelarareasignareContext {
		public TerminalNode TRISTEQUE() { return getToken(GramaticaParser.TRISTEQUE, 0); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode IDEM() { return getToken(GramaticaParser.IDEM, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SIGNO() { return getToken(GramaticaParser.SIGNO, 0); }
		public DeclarassignaretristContext(DelarareasignareContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitDeclarassignaretrist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DelarareasignareContext delarareasignare() throws RecognitionException {
		DelarareasignareContext _localctx = new DelarareasignareContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_delarareasignare);
		try {
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRISTEQUE:
				_localctx = new DeclarassignaretristContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				match(TRISTEQUE);
				setState(83);
				match(ID);
				setState(84);
				match(IDEM);
				setState(85);
				expr(0);
				setState(86);
				match(SIGNO);
				}
				break;
			case TOTUM:
				_localctx = new DeclarassignareContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(TOTUM);
				setState(89);
				match(ID);
				setState(90);
				match(IDEM);
				setState(91);
				expr(0);
				setState(92);
				match(SIGNO);
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

	public static class CondContext extends ParserRuleContext {
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	 
		public CondContext() { }
		public void copyFrom(CondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OranContext extends CondContext {
		public Token op;
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public TerminalNode OR() { return getToken(GramaticaParser.OR, 0); }
		public TerminalNode AND() { return getToken(GramaticaParser.AND, 0); }
		public OranContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitOran(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConrealContext extends CondContext {
		public TerminalNode TRUE() { return getToken(GramaticaParser.TRUE, 0); }
		public ConrealContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitConreal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParconContext extends CondContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public ParconContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitParcon(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditioContext extends CondContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MAYORQ() { return getToken(GramaticaParser.MAYORQ, 0); }
		public TerminalNode MENORQ() { return getToken(GramaticaParser.MENORQ, 0); }
		public TerminalNode MENORIGUAL() { return getToken(GramaticaParser.MENORIGUAL, 0); }
		public TerminalNode MAYORIGUAL() { return getToken(GramaticaParser.MAYORIGUAL, 0); }
		public TerminalNode IGUAL() { return getToken(GramaticaParser.IGUAL, 0); }
		public TerminalNode DIFERENTE() { return getToken(GramaticaParser.DIFERENTE, 0); }
		public ConditioContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitConditio(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConfictusContext extends CondContext {
		public TerminalNode FALSE() { return getToken(GramaticaParser.FALSE, 0); }
		public ConfictusContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitConfictus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		return cond(0);
	}

	private CondContext cond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondContext _localctx = new CondContext(_ctx, _parentState);
		CondContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_cond, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRSITE:
			case ID:
			case NUM:
				{
				_localctx = new ConditioContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(97);
				expr(0);
				setState(98);
				((ConditioContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAYORQ) | (1L << MENORQ) | (1L << MENORIGUAL) | (1L << MAYORIGUAL) | (1L << IGUAL) | (1L << DIFERENTE))) != 0)) ) {
					((ConditioContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(99);
				expr(0);
				}
				break;
			case TRUE:
				{
				_localctx = new ConrealContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(101);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				_localctx = new ConfictusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(102);
				match(FALSE);
				}
				break;
			case T__0:
				{
				_localctx = new ParconContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(103);
				match(T__0);
				setState(104);
				cond(0);
				setState(105);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OranContext(new CondContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_cond);
					setState(109);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(110);
					((OranContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
						((OranContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(111);
					cond(6);
					}
					} 
				}
				setState(116);
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

	public static class CondsiContext extends ParserRuleContext {
		public CondsiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condsi; }
	 
		public CondsiContext() { }
		public void copyFrom(CondsiContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConditiosiContext extends CondsiContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public CorpusContext corpus() {
			return getRuleContext(CorpusContext.class,0);
		}
		public List<ConelseifContext> conelseif() {
			return getRuleContexts(ConelseifContext.class);
		}
		public ConelseifContext conelseif(int i) {
			return getRuleContext(ConelseifContext.class,i);
		}
		public ConelseContext conelse() {
			return getRuleContext(ConelseContext.class,0);
		}
		public ConditiosiContext(CondsiContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitConditiosi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondsiContext condsi() throws RecognitionException {
		CondsiContext _localctx = new CondsiContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condsi);
		int _la;
		try {
			int _alt;
			_localctx = new ConditiosiContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__4);
			setState(118);
			match(T__0);
			setState(119);
			cond(0);
			setState(120);
			match(T__1);
			setState(121);
			match(T__2);
			setState(122);
			corpus();
			setState(123);
			match(T__3);
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(124);
					conelseif();
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(130);
				conelse();
				}
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

	public static class ConelseContext extends ParserRuleContext {
		public ConelseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conelse; }
	 
		public ConelseContext() { }
		public void copyFrom(ConelseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CondicionelsContext extends ConelseContext {
		public CorpusContext corpus() {
			return getRuleContext(CorpusContext.class,0);
		}
		public CondicionelsContext(ConelseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitCondicionels(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConelseContext conelse() throws RecognitionException {
		ConelseContext _localctx = new ConelseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_conelse);
		try {
			_localctx = new CondicionelsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__5);
			setState(134);
			match(T__2);
			setState(135);
			corpus();
			setState(136);
			match(T__3);
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

	public static class ConelseifContext extends ParserRuleContext {
		public ConelseifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conelseif; }
	 
		public ConelseifContext() { }
		public void copyFrom(ConelseifContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CondicionelseifContext extends ConelseifContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public CorpusContext corpus() {
			return getRuleContext(CorpusContext.class,0);
		}
		public CondicionelseifContext(ConelseifContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitCondicionelseif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConelseifContext conelseif() throws RecognitionException {
		ConelseifContext _localctx = new ConelseifContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_conelseif);
		try {
			_localctx = new CondicionelseifContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__5);
			setState(139);
			match(T__4);
			setState(140);
			match(T__0);
			setState(141);
			cond(0);
			setState(142);
			match(T__1);
			setState(143);
			match(T__2);
			setState(144);
			corpus();
			setState(145);
			match(T__3);
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

	public static class ConforContext extends ParserRuleContext {
		public ConforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_confor; }
	 
		public ConforContext() { }
		public void copyFrom(ConforContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CondiconforContext extends ConforContext {
		public Token op;
		public TerminalNode FOR() { return getToken(GramaticaParser.FOR, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode SIGNO() { return getToken(GramaticaParser.SIGNO, 0); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public CorpusContext corpus() {
			return getRuleContext(CorpusContext.class,0);
		}
		public DelarareasignareContext delarareasignare() {
			return getRuleContext(DelarareasignareContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public CondiconforContext(ConforContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitCondiconfor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConforContext confor() throws RecognitionException {
		ConforContext _localctx = new ConforContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_confor);
		int _la;
		try {
			_localctx = new CondiconforContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(FOR);
			setState(148);
			match(T__0);
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(149);
				delarareasignare();
				}
				break;
			case 2:
				{
				}
				break;
			case 3:
				{
				setState(151);
				assignment();
				}
				break;
			}
			setState(154);
			cond(0);
			setState(155);
			match(SIGNO);
			setState(156);
			match(ID);
			setState(157);
			((CondiconforContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__6 || _la==T__7) ) {
				((CondiconforContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(158);
			match(T__1);
			setState(159);
			match(T__2);
			setState(160);
			corpus();
			setState(161);
			match(T__3);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PlusminusContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(GramaticaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(GramaticaParser.MINUS, 0); }
		public PlusminusContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitPlusminus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PotentiaContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode POTENTIA() { return getToken(GramaticaParser.POTENTIA, 0); }
		public TerminalNode NUM() { return getToken(GramaticaParser.NUM, 0); }
		public PotentiaContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitPotentia(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TristeContext extends ExprContext {
		public TerminalNode TRSITE() { return getToken(GramaticaParser.TRSITE, 0); }
		public TristeContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitTriste(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumerusContext extends ExprContext {
		public TerminalNode NUM() { return getToken(GramaticaParser.NUM, 0); }
		public NumerusContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitNumerus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BydivisioContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode BY() { return getToken(GramaticaParser.BY, 0); }
		public TerminalNode DIVISIO() { return getToken(GramaticaParser.DIVISIO, 0); }
		public BydivisioContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitBydivisio(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NomenContext extends ExprContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public NomenContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitNomen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRSITE:
				{
				_localctx = new TristeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(164);
				match(TRSITE);
				}
				break;
			case NUM:
				{
				_localctx = new NumerusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165);
				match(NUM);
				}
				break;
			case ID:
				{
				_localctx = new NomenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(178);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new BydivisioContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(169);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(170);
						((BydivisioContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==DIVISIO || _la==BY) ) {
							((BydivisioContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(171);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new PlusminusContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(172);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(173);
						((PlusminusContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((PlusminusContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(174);
						expr(5);
						}
						break;
					case 3:
						{
						_localctx = new PotentiaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(175);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(176);
						match(POTENTIA);
						setState(177);
						match(NUM);
						}
						break;
					}
					} 
				}
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		case 10:
			return cond_sempred((CondContext)_localctx, predIndex);
		case 15:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean cond_sempred(CondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u00ba\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\7\69\n\6\f\6\16\6<\13\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\5\tK\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5\nS\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13a\n\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fn\n\f\3\f\3\f\3\f\7\fs\n\f\f\f\16\f"+
		"v\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0080\n\r\f\r\16\r\u0083\13"+
		"\r\3\r\5\r\u0086\n\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\5\20\u009b\n\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u00aa\n\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00b5\n\21\f\21\16"+
		"\21\u00b8\13\21\3\21\2\4\26 \22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \2\7\3\2\20\25\3\2\f\r\3\2\t\n\3\2 !\3\2\36\37\2\u00c0\2\"\3\2\2\2\4"+
		"(\3\2\2\2\6-\3\2\2\2\b/\3\2\2\2\n:\3\2\2\2\f=\3\2\2\2\16B\3\2\2\2\20J"+
		"\3\2\2\2\22R\3\2\2\2\24`\3\2\2\2\26m\3\2\2\2\30w\3\2\2\2\32\u0087\3\2"+
		"\2\2\34\u008c\3\2\2\2\36\u0095\3\2\2\2 \u00a9\3\2\2\2\"#\5\4\3\2#$\5\6"+
		"\4\2$%\5\n\6\2%&\5\b\5\2&\'\7\2\2\3\'\3\3\2\2\2()\7\33\2\2)*\7\34\2\2"+
		"*+\7\3\2\2+,\7\4\2\2,\5\3\2\2\2-.\7\5\2\2.\7\3\2\2\2/\60\7\6\2\2\60\t"+
		"\3\2\2\2\619\5 \21\2\629\5\f\7\2\639\5\16\b\2\649\5\22\n\2\659\5\24\13"+
		"\2\669\5\30\r\2\679\5\36\20\28\61\3\2\2\28\62\3\2\2\28\63\3\2\2\28\64"+
		"\3\2\2\28\65\3\2\2\28\66\3\2\2\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2"+
		"\2\2;\13\3\2\2\2<:\3\2\2\2=>\7$\2\2>?\7\"\2\2?@\5 \21\2@A\7\31\2\2A\r"+
		"\3\2\2\2BC\7\35\2\2CD\7\3\2\2DE\5\20\t\2EF\7\4\2\2FG\7\31\2\2G\17\3\2"+
		"\2\2HK\7\32\2\2IK\5 \21\2JH\3\2\2\2JI\3\2\2\2K\21\3\2\2\2LM\7\27\2\2M"+
		"N\7$\2\2NS\7\31\2\2OP\7\30\2\2PQ\7$\2\2QS\7\31\2\2RL\3\2\2\2RO\3\2\2\2"+
		"S\23\3\2\2\2TU\7\30\2\2UV\7$\2\2VW\7\"\2\2WX\5 \21\2XY\7\31\2\2Ya\3\2"+
		"\2\2Z[\7\27\2\2[\\\7$\2\2\\]\7\"\2\2]^\5 \21\2^_\7\31\2\2_a\3\2\2\2`T"+
		"\3\2\2\2`Z\3\2\2\2a\25\3\2\2\2bc\b\f\1\2cd\5 \21\2de\t\2\2\2ef\5 \21\2"+
		"fn\3\2\2\2gn\7\16\2\2hn\7\17\2\2ij\7\3\2\2jk\5\26\f\2kl\7\4\2\2ln\3\2"+
		"\2\2mb\3\2\2\2mg\3\2\2\2mh\3\2\2\2mi\3\2\2\2nt\3\2\2\2op\f\7\2\2pq\t\3"+
		"\2\2qs\5\26\f\bro\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\27\3\2\2\2vt"+
		"\3\2\2\2wx\7\7\2\2xy\7\3\2\2yz\5\26\f\2z{\7\4\2\2{|\7\5\2\2|}\5\n\6\2"+
		"}\u0081\7\6\2\2~\u0080\5\34\17\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2"+
		"\2\u0084\u0086\5\32\16\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\31\3\2\2\2\u0087\u0088\7\b\2\2\u0088\u0089\7\5\2\2\u0089\u008a\5\n\6"+
		"\2\u008a\u008b\7\6\2\2\u008b\33\3\2\2\2\u008c\u008d\7\b\2\2\u008d\u008e"+
		"\7\7\2\2\u008e\u008f\7\3\2\2\u008f\u0090\5\26\f\2\u0090\u0091\7\4\2\2"+
		"\u0091\u0092\7\5\2\2\u0092\u0093\5\n\6\2\u0093\u0094\7\6\2\2\u0094\35"+
		"\3\2\2\2\u0095\u0096\7\13\2\2\u0096\u009a\7\3\2\2\u0097\u009b\5\24\13"+
		"\2\u0098\u009b\3\2\2\2\u0099\u009b\5\f\7\2\u009a\u0097\3\2\2\2\u009a\u0098"+
		"\3\2\2\2\u009a\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\5\26\f\2"+
		"\u009d\u009e\7\31\2\2\u009e\u009f\7$\2\2\u009f\u00a0\t\4\2\2\u00a0\u00a1"+
		"\7\4\2\2\u00a1\u00a2\7\5\2\2\u00a2\u00a3\5\n\6\2\u00a3\u00a4\7\6\2\2\u00a4"+
		"\37\3\2\2\2\u00a5\u00a6\b\21\1\2\u00a6\u00aa\7#\2\2\u00a7\u00aa\7%\2\2"+
		"\u00a8\u00aa\7$\2\2\u00a9\u00a5\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00a8"+
		"\3\2\2\2\u00aa\u00b6\3\2\2\2\u00ab\u00ac\f\7\2\2\u00ac\u00ad\t\5\2\2\u00ad"+
		"\u00b5\5 \21\b\u00ae\u00af\f\6\2\2\u00af\u00b0\t\6\2\2\u00b0\u00b5\5 "+
		"\21\7\u00b1\u00b2\f\b\2\2\u00b2\u00b3\7\26\2\2\u00b3\u00b5\7%\2\2\u00b4"+
		"\u00ab\3\2\2\2\u00b4\u00ae\3\2\2\2\u00b4\u00b1\3\2\2\2\u00b5\u00b8\3\2"+
		"\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7!\3\2\2\2\u00b8\u00b6"+
		"\3\2\2\2\178:JR`mt\u0081\u0085\u009a\u00a9\u00b4\u00b6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}