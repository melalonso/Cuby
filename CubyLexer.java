// Generated from Cuby.g4 by ANTLR 4.5
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CubyLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, COMA=3, DOSPUNTOS=4, PUNTO_COMA=5, PUNTO=6, DOBLEPUNTO=7, 
		OP_NEGACION=8, OP_AND=9, OP_OR=10, OP_IGUALQUE=11, OP_DIFERENTEQUE=12, 
		OP_MAYORQUE=13, OP_MENORQUE=14, OP_MENOROIGUAL=15, OP_MAYOROIGUAL=16, 
		OP_NEGATIVO=17, OP_MULTIPLICACION=18, OP_DIVISION=19, OP_MOD=20, OP_SUMA=21, 
		OP_RESTA=22, OP_DECREMENTAR=23, OP_INCREMENTAR=24, OP_ASIGNACION=25, OP_ASIGNAR_RESTA=26, 
		OP_ASIGNAR_SUMA=27, OP_ASIGNAR_MULTIPLICACION=28, OP_ASIGNAR_DIVISION=29, 
		OP_ASIGNAR_MODULO=30, DELIMITADOR_BLOQUE=31, FIN_LINEA=32, ENTERO=33, 
		BOOLEANO=34, IDENTIFICADOR=35, COMENTARIO=36, ESPACIOS_BLANCO=37, CARACTER=38, 
		TEXTO=39, FUNC_IMPRIMIR=40, FUNC_PRINCIPAL=41, FUNC_A_MAYUSCULA=42, FUNC_A_MINUSCULA=43, 
		FUNC_CARACTER_A_ENTERO=44, FUNC_ENTERO_A_CARACTER=45, FUNC_ENTERO_A_TEXTO=46, 
		FUNC_TEXTO_A_ENTERO=47, FUNC_LONGITUD_TEXTO=48, FUNC_INVERTIR_TEXTO=49, 
		FUNC_ES_LETRA=50, FUNC_ES_DIGITO=51, PARA=52, REPITA=53, MIENTRAS=54, 
		SI=55, SII=56, SINO=57, DEF=58, SALIR=59, RET=60, CASO=61, CUANDO=62, 
		SEGUIR=63, VECES=64, HASTA=65, TIPO_ENTERO=66, TIPO_CARACTER=67, TIPO_TEXTO=68, 
		TIPO_BOOLEANO=69;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "COMA", "DOSPUNTOS", "PUNTO_COMA", "PUNTO", "DOBLEPUNTO", 
		"OP_NEGACION", "OP_AND", "OP_OR", "OP_IGUALQUE", "OP_DIFERENTEQUE", "OP_MAYORQUE", 
		"OP_MENORQUE", "OP_MENOROIGUAL", "OP_MAYOROIGUAL", "OP_NEGATIVO", "OP_MULTIPLICACION", 
		"OP_DIVISION", "OP_MOD", "OP_SUMA", "OP_RESTA", "OP_DECREMENTAR", "OP_INCREMENTAR", 
		"OP_ASIGNACION", "OP_ASIGNAR_RESTA", "OP_ASIGNAR_SUMA", "OP_ASIGNAR_MULTIPLICACION", 
		"OP_ASIGNAR_DIVISION", "OP_ASIGNAR_MODULO", "DELIMITADOR_BLOQUE", "FIN_LINEA", 
		"COMILLA", "ENTERO", "BOOLEANO", "IDENTIFICADOR", "COMENTARIO", "ESPACIOS_BLANCO", 
		"CARACTER", "TEXTO", "FUNC_IMPRIMIR", "FUNC_PRINCIPAL", "FUNC_A_MAYUSCULA", 
		"FUNC_A_MINUSCULA", "FUNC_CARACTER_A_ENTERO", "FUNC_ENTERO_A_CARACTER", 
		"FUNC_ENTERO_A_TEXTO", "FUNC_TEXTO_A_ENTERO", "FUNC_LONGITUD_TEXTO", "FUNC_INVERTIR_TEXTO", 
		"FUNC_ES_LETRA", "FUNC_ES_DIGITO", "PARA", "REPITA", "MIENTRAS", "SI", 
		"SII", "SINO", "DEF", "SALIR", "RET", "CASO", "CUANDO", "SEGUIR", "VECES", 
		"HASTA", "TIPO_ENTERO", "TIPO_CARACTER", "TIPO_TEXTO", "TIPO_BOOLEANO"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "','", "':'", "';'", "'.'", "'..'", "'~'", "'&&'", 
		"'||'", "'=='", "'!='", "'>'", "'<'", "'<='", "'>='", null, "'*'", "'/'", 
		"'%'", "'+'", null, "'--'", "'++'", "'='", "'-='", "'+='", "'*='", "'/='", 
		"'%='", "'|'", null, null, null, null, null, null, null, null, "'escribir'", 
		"'principal'", "'aMay'", "'aMin'", "'cae'", "'eac'", "'eat'", "'tae'", 
		"'longitud'", "'invertir'", "'esLetra?'", "'esDigito?'", "'para'", "'repita'", 
		"'mientras'", "'si'", "'sii'", "'sino'", "'def'", "'salir'", "'ret'", 
		"'caso'", "'cuando'", "'seguir'", "'veces'", "'hasta'", "'entero'", "'caracter'", 
		"'texto'", "'booleano'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "COMA", "DOSPUNTOS", "PUNTO_COMA", "PUNTO", "DOBLEPUNTO", 
		"OP_NEGACION", "OP_AND", "OP_OR", "OP_IGUALQUE", "OP_DIFERENTEQUE", "OP_MAYORQUE", 
		"OP_MENORQUE", "OP_MENOROIGUAL", "OP_MAYOROIGUAL", "OP_NEGATIVO", "OP_MULTIPLICACION", 
		"OP_DIVISION", "OP_MOD", "OP_SUMA", "OP_RESTA", "OP_DECREMENTAR", "OP_INCREMENTAR", 
		"OP_ASIGNACION", "OP_ASIGNAR_RESTA", "OP_ASIGNAR_SUMA", "OP_ASIGNAR_MULTIPLICACION", 
		"OP_ASIGNAR_DIVISION", "OP_ASIGNAR_MODULO", "DELIMITADOR_BLOQUE", "FIN_LINEA", 
		"ENTERO", "BOOLEANO", "IDENTIFICADOR", "COMENTARIO", "ESPACIOS_BLANCO", 
		"CARACTER", "TEXTO", "FUNC_IMPRIMIR", "FUNC_PRINCIPAL", "FUNC_A_MAYUSCULA", 
		"FUNC_A_MINUSCULA", "FUNC_CARACTER_A_ENTERO", "FUNC_ENTERO_A_CARACTER", 
		"FUNC_ENTERO_A_TEXTO", "FUNC_TEXTO_A_ENTERO", "FUNC_LONGITUD_TEXTO", "FUNC_INVERTIR_TEXTO", 
		"FUNC_ES_LETRA", "FUNC_ES_DIGITO", "PARA", "REPITA", "MIENTRAS", "SI", 
		"SII", "SINO", "DEF", "SALIR", "RET", "CASO", "CUANDO", "SEGUIR", "VECES", 
		"HASTA", "TIPO_ENTERO", "TIPO_CARACTER", "TIPO_TEXTO", "TIPO_BOOLEANO"
	};
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


	public CubyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cuby.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2G\u01e1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3"+
		"\"\3\"\3#\3#\3#\7#\u00e3\n#\f#\16#\u00e6\13#\5#\u00e8\n#\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u00f8\n$\3%\6%\u00fb\n%\r%\16%\u00fc\3"+
		"&\3&\3&\3&\7&\u0103\n&\f&\16&\u0106\13&\3&\3&\3&\3&\3&\3\'\6\'\u010e\n"+
		"\'\r\'\16\'\u010f\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\5(\u011c\n(\3)\6)\u011f"+
		"\n)\r)\16)\u0120\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3"+
		"\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3"+
		"\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38"+
		"\38\38\38\38\38\38\38\39\39\39\3:\3:\3:\3:\3;\3;\3;\3;\3;\3<\3<\3<\3<"+
		"\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3A"+
		"\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D"+
		"\3D\3D\3E\3E\3E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G"+
		"\3G\3G\3G\3\u0104\2H\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C\2E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_\60a\61c\62"+
		"e\63g\64i\65k\66m\67o8q9s:u;w<y={>}?\177@\u0081A\u0083B\u0085C\u0087D"+
		"\u0089E\u008bF\u008dG\3\2\t\4\2\f\f==\3\2\62\62\3\2\63;\3\2\62;\3\2c|"+
		"\6\2\13\f\17\17\"\"))\4\2))^^\u01e8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]"+
		"\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2"+
		"\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2"+
		"\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2"+
		"\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2"+
		"\u008b\3\2\2\2\2\u008d\3\2\2\2\3\u008f\3\2\2\2\5\u0091\3\2\2\2\7\u0093"+
		"\3\2\2\2\t\u0095\3\2\2\2\13\u0097\3\2\2\2\r\u0099\3\2\2\2\17\u009b\3\2"+
		"\2\2\21\u009e\3\2\2\2\23\u00a0\3\2\2\2\25\u00a3\3\2\2\2\27\u00a6\3\2\2"+
		"\2\31\u00a9\3\2\2\2\33\u00ac\3\2\2\2\35\u00ae\3\2\2\2\37\u00b0\3\2\2\2"+
		"!\u00b3\3\2\2\2#\u00b6\3\2\2\2%\u00b8\3\2\2\2\'\u00ba\3\2\2\2)\u00bc\3"+
		"\2\2\2+\u00be\3\2\2\2-\u00c0\3\2\2\2/\u00c2\3\2\2\2\61\u00c5\3\2\2\2\63"+
		"\u00c8\3\2\2\2\65\u00ca\3\2\2\2\67\u00cd\3\2\2\29\u00d0\3\2\2\2;\u00d3"+
		"\3\2\2\2=\u00d6\3\2\2\2?\u00d9\3\2\2\2A\u00db\3\2\2\2C\u00dd\3\2\2\2E"+
		"\u00e7\3\2\2\2G\u00f7\3\2\2\2I\u00fa\3\2\2\2K\u00fe\3\2\2\2M\u010d\3\2"+
		"\2\2O\u011b\3\2\2\2Q\u011e\3\2\2\2S\u0122\3\2\2\2U\u012b\3\2\2\2W\u0135"+
		"\3\2\2\2Y\u013a\3\2\2\2[\u013f\3\2\2\2]\u0143\3\2\2\2_\u0147\3\2\2\2a"+
		"\u014b\3\2\2\2c\u014f\3\2\2\2e\u0158\3\2\2\2g\u0161\3\2\2\2i\u016a\3\2"+
		"\2\2k\u0174\3\2\2\2m\u0179\3\2\2\2o\u0180\3\2\2\2q\u0189\3\2\2\2s\u018c"+
		"\3\2\2\2u\u0190\3\2\2\2w\u0195\3\2\2\2y\u0199\3\2\2\2{\u019f\3\2\2\2}"+
		"\u01a3\3\2\2\2\177\u01a8\3\2\2\2\u0081\u01af\3\2\2\2\u0083\u01b6\3\2\2"+
		"\2\u0085\u01bc\3\2\2\2\u0087\u01c2\3\2\2\2\u0089\u01c9\3\2\2\2\u008b\u01d2"+
		"\3\2\2\2\u008d\u01d8\3\2\2\2\u008f\u0090\7*\2\2\u0090\4\3\2\2\2\u0091"+
		"\u0092\7+\2\2\u0092\6\3\2\2\2\u0093\u0094\7.\2\2\u0094\b\3\2\2\2\u0095"+
		"\u0096\7<\2\2\u0096\n\3\2\2\2\u0097\u0098\7=\2\2\u0098\f\3\2\2\2\u0099"+
		"\u009a\7\60\2\2\u009a\16\3\2\2\2\u009b\u009c\7\60\2\2\u009c\u009d\7\60"+
		"\2\2\u009d\20\3\2\2\2\u009e\u009f\7\u0080\2\2\u009f\22\3\2\2\2\u00a0\u00a1"+
		"\7(\2\2\u00a1\u00a2\7(\2\2\u00a2\24\3\2\2\2\u00a3\u00a4\7~\2\2\u00a4\u00a5"+
		"\7~\2\2\u00a5\26\3\2\2\2\u00a6\u00a7\7?\2\2\u00a7\u00a8\7?\2\2\u00a8\30"+
		"\3\2\2\2\u00a9\u00aa\7#\2\2\u00aa\u00ab\7?\2\2\u00ab\32\3\2\2\2\u00ac"+
		"\u00ad\7@\2\2\u00ad\34\3\2\2\2\u00ae\u00af\7>\2\2\u00af\36\3\2\2\2\u00b0"+
		"\u00b1\7>\2\2\u00b1\u00b2\7?\2\2\u00b2 \3\2\2\2\u00b3\u00b4\7@\2\2\u00b4"+
		"\u00b5\7?\2\2\u00b5\"\3\2\2\2\u00b6\u00b7\7/\2\2\u00b7$\3\2\2\2\u00b8"+
		"\u00b9\7,\2\2\u00b9&\3\2\2\2\u00ba\u00bb\7\61\2\2\u00bb(\3\2\2\2\u00bc"+
		"\u00bd\7\'\2\2\u00bd*\3\2\2\2\u00be\u00bf\7-\2\2\u00bf,\3\2\2\2\u00c0"+
		"\u00c1\7/\2\2\u00c1.\3\2\2\2\u00c2\u00c3\7/\2\2\u00c3\u00c4\7/\2\2\u00c4"+
		"\60\3\2\2\2\u00c5\u00c6\7-\2\2\u00c6\u00c7\7-\2\2\u00c7\62\3\2\2\2\u00c8"+
		"\u00c9\7?\2\2\u00c9\64\3\2\2\2\u00ca\u00cb\7/\2\2\u00cb\u00cc\7?\2\2\u00cc"+
		"\66\3\2\2\2\u00cd\u00ce\7-\2\2\u00ce\u00cf\7?\2\2\u00cf8\3\2\2\2\u00d0"+
		"\u00d1\7,\2\2\u00d1\u00d2\7?\2\2\u00d2:\3\2\2\2\u00d3\u00d4\7\61\2\2\u00d4"+
		"\u00d5\7?\2\2\u00d5<\3\2\2\2\u00d6\u00d7\7\'\2\2\u00d7\u00d8\7?\2\2\u00d8"+
		">\3\2\2\2\u00d9\u00da\7~\2\2\u00da@\3\2\2\2\u00db\u00dc\t\2\2\2\u00dc"+
		"B\3\2\2\2\u00dd\u00de\7)\2\2\u00deD\3\2\2\2\u00df\u00e8\t\3\2\2\u00e0"+
		"\u00e4\t\4\2\2\u00e1\u00e3\t\5\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2"+
		"\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e7\u00df\3\2\2\2\u00e7\u00e0\3\2\2\2\u00e8F\3\2\2\2"+
		"\u00e9\u00ea\7x\2\2\u00ea\u00eb\7g\2\2\u00eb\u00ec\7t\2\2\u00ec\u00ed"+
		"\7f\2\2\u00ed\u00ee\7c\2\2\u00ee\u00ef\7f\2\2\u00ef\u00f0\7g\2\2\u00f0"+
		"\u00f1\7t\2\2\u00f1\u00f8\7q\2\2\u00f2\u00f3\7h\2\2\u00f3\u00f4\7c\2\2"+
		"\u00f4\u00f5\7n\2\2\u00f5\u00f6\7u\2\2\u00f6\u00f8\7q\2\2\u00f7\u00e9"+
		"\3\2\2\2\u00f7\u00f2\3\2\2\2\u00f8H\3\2\2\2\u00f9\u00fb\t\6\2\2\u00fa"+
		"\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2"+
		"\2\2\u00fdJ\3\2\2\2\u00fe\u00ff\7\61\2\2\u00ff\u0100\7,\2\2\u0100\u0104"+
		"\3\2\2\2\u0101\u0103\13\2\2\2\u0102\u0101\3\2\2\2\u0103\u0106\3\2\2\2"+
		"\u0104\u0105\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0107\3\2\2\2\u0106\u0104"+
		"\3\2\2\2\u0107\u0108\7,\2\2\u0108\u0109\7\61\2\2\u0109\u010a\3\2\2\2\u010a"+
		"\u010b\b&\2\2\u010bL\3\2\2\2\u010c\u010e\t\7\2\2\u010d\u010c\3\2\2\2\u010e"+
		"\u010f\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\3\2"+
		"\2\2\u0111\u0112\b\'\2\2\u0112N\3\2\2\2\u0113\u0114\7)\2\2\u0114\u0115"+
		"\13\2\2\2\u0115\u011c\7)\2\2\u0116\u011c\n\b\2\2\u0117\u0118\5C\"\2\u0118"+
		"\u0119\13\2\2\2\u0119\u011a\5C\"\2\u011a\u011c\3\2\2\2\u011b\u0113\3\2"+
		"\2\2\u011b\u0116\3\2\2\2\u011b\u0117\3\2\2\2\u011cP\3\2\2\2\u011d\u011f"+
		"\5O(\2\u011e\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u011e\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121R\3\2\2\2\u0122\u0123\7g\2\2\u0123\u0124\7u\2\2\u0124"+
		"\u0125\7e\2\2\u0125\u0126\7t\2\2\u0126\u0127\7k\2\2\u0127\u0128\7d\2\2"+
		"\u0128\u0129\7k\2\2\u0129\u012a\7t\2\2\u012aT\3\2\2\2\u012b\u012c\7r\2"+
		"\2\u012c\u012d\7t\2\2\u012d\u012e\7k\2\2\u012e\u012f\7p\2\2\u012f\u0130"+
		"\7e\2\2\u0130\u0131\7k\2\2\u0131\u0132\7r\2\2\u0132\u0133\7c\2\2\u0133"+
		"\u0134\7n\2\2\u0134V\3\2\2\2\u0135\u0136\7c\2\2\u0136\u0137\7O\2\2\u0137"+
		"\u0138\7c\2\2\u0138\u0139\7{\2\2\u0139X\3\2\2\2\u013a\u013b\7c\2\2\u013b"+
		"\u013c\7O\2\2\u013c\u013d\7k\2\2\u013d\u013e\7p\2\2\u013eZ\3\2\2\2\u013f"+
		"\u0140\7e\2\2\u0140\u0141\7c\2\2\u0141\u0142\7g\2\2\u0142\\\3\2\2\2\u0143"+
		"\u0144\7g\2\2\u0144\u0145\7c\2\2\u0145\u0146\7e\2\2\u0146^\3\2\2\2\u0147"+
		"\u0148\7g\2\2\u0148\u0149\7c\2\2\u0149\u014a\7v\2\2\u014a`\3\2\2\2\u014b"+
		"\u014c\7v\2\2\u014c\u014d\7c\2\2\u014d\u014e\7g\2\2\u014eb\3\2\2\2\u014f"+
		"\u0150\7n\2\2\u0150\u0151\7q\2\2\u0151\u0152\7p\2\2\u0152\u0153\7i\2\2"+
		"\u0153\u0154\7k\2\2\u0154\u0155\7v\2\2\u0155\u0156\7w\2\2\u0156\u0157"+
		"\7f\2\2\u0157d\3\2\2\2\u0158\u0159\7k\2\2\u0159\u015a\7p\2\2\u015a\u015b"+
		"\7x\2\2\u015b\u015c\7g\2\2\u015c\u015d\7t\2\2\u015d\u015e\7v\2\2\u015e"+
		"\u015f\7k\2\2\u015f\u0160\7t\2\2\u0160f\3\2\2\2\u0161\u0162\7g\2\2\u0162"+
		"\u0163\7u\2\2\u0163\u0164\7N\2\2\u0164\u0165\7g\2\2\u0165\u0166\7v\2\2"+
		"\u0166\u0167\7t\2\2\u0167\u0168\7c\2\2\u0168\u0169\7A\2\2\u0169h\3\2\2"+
		"\2\u016a\u016b\7g\2\2\u016b\u016c\7u\2\2\u016c\u016d\7F\2\2\u016d\u016e"+
		"\7k\2\2\u016e\u016f\7i\2\2\u016f\u0170\7k\2\2\u0170\u0171\7v\2\2\u0171"+
		"\u0172\7q\2\2\u0172\u0173\7A\2\2\u0173j\3\2\2\2\u0174\u0175\7r\2\2\u0175"+
		"\u0176\7c\2\2\u0176\u0177\7t\2\2\u0177\u0178\7c\2\2\u0178l\3\2\2\2\u0179"+
		"\u017a\7t\2\2\u017a\u017b\7g\2\2\u017b\u017c\7r\2\2\u017c\u017d\7k\2\2"+
		"\u017d\u017e\7v\2\2\u017e\u017f\7c\2\2\u017fn\3\2\2\2\u0180\u0181\7o\2"+
		"\2\u0181\u0182\7k\2\2\u0182\u0183\7g\2\2\u0183\u0184\7p\2\2\u0184\u0185"+
		"\7v\2\2\u0185\u0186\7t\2\2\u0186\u0187\7c\2\2\u0187\u0188\7u\2\2\u0188"+
		"p\3\2\2\2\u0189\u018a\7u\2\2\u018a\u018b\7k\2\2\u018br\3\2\2\2\u018c\u018d"+
		"\7u\2\2\u018d\u018e\7k\2\2\u018e\u018f\7k\2\2\u018ft\3\2\2\2\u0190\u0191"+
		"\7u\2\2\u0191\u0192\7k\2\2\u0192\u0193\7p\2\2\u0193\u0194\7q\2\2\u0194"+
		"v\3\2\2\2\u0195\u0196\7f\2\2\u0196\u0197\7g\2\2\u0197\u0198\7h\2\2\u0198"+
		"x\3\2\2\2\u0199\u019a\7u\2\2\u019a\u019b\7c\2\2\u019b\u019c\7n\2\2\u019c"+
		"\u019d\7k\2\2\u019d\u019e\7t\2\2\u019ez\3\2\2\2\u019f\u01a0\7t\2\2\u01a0"+
		"\u01a1\7g\2\2\u01a1\u01a2\7v\2\2\u01a2|\3\2\2\2\u01a3\u01a4\7e\2\2\u01a4"+
		"\u01a5\7c\2\2\u01a5\u01a6\7u\2\2\u01a6\u01a7\7q\2\2\u01a7~\3\2\2\2\u01a8"+
		"\u01a9\7e\2\2\u01a9\u01aa\7w\2\2\u01aa\u01ab\7c\2\2\u01ab\u01ac\7p\2\2"+
		"\u01ac\u01ad\7f\2\2\u01ad\u01ae\7q\2\2\u01ae\u0080\3\2\2\2\u01af\u01b0"+
		"\7u\2\2\u01b0\u01b1\7g\2\2\u01b1\u01b2\7i\2\2\u01b2\u01b3\7w\2\2\u01b3"+
		"\u01b4\7k\2\2\u01b4\u01b5\7t\2\2\u01b5\u0082\3\2\2\2\u01b6\u01b7\7x\2"+
		"\2\u01b7\u01b8\7g\2\2\u01b8\u01b9\7e\2\2\u01b9\u01ba\7g\2\2\u01ba\u01bb"+
		"\7u\2\2\u01bb\u0084\3\2\2\2\u01bc\u01bd\7j\2\2\u01bd\u01be\7c\2\2\u01be"+
		"\u01bf\7u\2\2\u01bf\u01c0\7v\2\2\u01c0\u01c1\7c\2\2\u01c1\u0086\3\2\2"+
		"\2\u01c2\u01c3\7g\2\2\u01c3\u01c4\7p\2\2\u01c4\u01c5\7v\2\2\u01c5\u01c6"+
		"\7g\2\2\u01c6\u01c7\7t\2\2\u01c7\u01c8\7q\2\2\u01c8\u0088\3\2\2\2\u01c9"+
		"\u01ca\7e\2\2\u01ca\u01cb\7c\2\2\u01cb\u01cc\7t\2\2\u01cc\u01cd\7c\2\2"+
		"\u01cd\u01ce\7e\2\2\u01ce\u01cf\7v\2\2\u01cf\u01d0\7g\2\2\u01d0\u01d1"+
		"\7t\2\2\u01d1\u008a\3\2\2\2\u01d2\u01d3\7v\2\2\u01d3\u01d4\7g\2\2\u01d4"+
		"\u01d5\7z\2\2\u01d5\u01d6\7v\2\2\u01d6\u01d7\7q\2\2\u01d7\u008c\3\2\2"+
		"\2\u01d8\u01d9\7d\2\2\u01d9\u01da\7q\2\2\u01da\u01db\7q\2\2\u01db\u01dc"+
		"\7n\2\2\u01dc\u01dd\7g\2\2\u01dd\u01de\7c\2\2\u01de\u01df\7p\2\2\u01df"+
		"\u01e0\7q\2\2\u01e0\u008e\3\2\2\2\13\2\u00e4\u00e7\u00f7\u00fc\u0104\u010f"+
		"\u011b\u0120\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}