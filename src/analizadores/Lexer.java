/* The following code was generated by JFlex 1.4.3 on 4/6/22 8:58 */

package analizadores;
import static analizadores.ListaDeTokens.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 4/6/22 8:58 from the specification file
 * <tt>C:/Users/juanj/Documents/NetBeansProjects/AnalizadorSintactico/src/analizadores/Lexer.flex</tt>
 */
public class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\4\1\6\2\0\1\4\22\0\1\4\1\43\1\54\3\0"+
    "\1\41\1\55\1\45\1\46\1\40\1\36\1\50\1\37\1\3\1\5"+
    "\1\53\11\2\1\52\1\51\1\44\1\35\1\44\2\0\5\1\1\31"+
    "\2\1\1\32\6\1\1\30\2\1\1\23\7\1\4\0\1\1\1\0"+
    "\1\14\1\21\1\12\1\26\1\22\1\16\1\24\1\13\1\7\2\1"+
    "\1\17\1\47\1\10\1\20\1\25\1\1\1\15\1\33\1\11\1\27"+
    "\1\1\1\34\3\1\1\0\1\42\uff83\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\13\2"+
    "\1\7\3\5\2\1\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\3\2\1\1\0\1\4\1\17\1\2"+
    "\1\20\13\2\1\21\1\2\1\11\1\22\1\10\1\23"+
    "\2\0\1\24\1\0\1\25\1\26\1\27\16\2\1\26"+
    "\1\30\1\31\7\2\1\32\13\2\1\33\1\2\1\34"+
    "\2\2\1\35\1\36\1\37\4\2\1\40\7\2\1\41"+
    "\1\2\1\42\1\43\7\2\1\44\1\2\1\45\2\2"+
    "\1\46\1\47";

  private static int [] zzUnpackAction() {
    int [] result = new int[137];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\56\0\134\0\212\0\270\0\346\0\56\0\u0114"+
    "\0\u0142\0\u0170\0\u019e\0\u01cc\0\u01fa\0\u0228\0\u0256\0\u0284"+
    "\0\u02b2\0\u02e0\0\u030e\0\u033c\0\u036a\0\u0398\0\u03c6\0\u03f4"+
    "\0\u030e\0\u030e\0\56\0\56\0\56\0\56\0\56\0\u0422"+
    "\0\u0450\0\u047e\0\u04ac\0\u04da\0\56\0\u0508\0\134\0\u0536"+
    "\0\u0564\0\u0592\0\u05c0\0\u05ee\0\u061c\0\u064a\0\u0678\0\u06a6"+
    "\0\u06d4\0\u0702\0\134\0\u0730\0\56\0\56\0\56\0\u0422"+
    "\0\u075e\0\u0450\0\u0450\0\u078c\0\u04ac\0\u04ac\0\134\0\u07ba"+
    "\0\u07e8\0\u0816\0\u0844\0\u0872\0\u08a0\0\u08ce\0\u08fc\0\u092a"+
    "\0\u0958\0\u0986\0\u09b4\0\u09e2\0\u0a10\0\u075e\0\56\0\134"+
    "\0\u0a3e\0\u0a6c\0\u0a9a\0\u0ac8\0\u0af6\0\u0b24\0\u0b52\0\134"+
    "\0\u0b80\0\u0bae\0\u0bdc\0\u0c0a\0\u0c38\0\u0c66\0\u0c94\0\u0cc2"+
    "\0\u0cf0\0\u0d1e\0\u0d4c\0\134\0\u0d7a\0\u0da8\0\u0dd6\0\u0e04"+
    "\0\134\0\134\0\134\0\u0e32\0\u0e60\0\u0e8e\0\u0ebc\0\134"+
    "\0\u0eea\0\u0f18\0\u0f46\0\u0f74\0\u0fa2\0\u0fd0\0\u0ffe\0\134"+
    "\0\u102c\0\134\0\134\0\u105a\0\u1088\0\u10b6\0\u10e4\0\u1112"+
    "\0\u1140\0\u116e\0\134\0\u119c\0\134\0\u11ca\0\u11f8\0\134"+
    "\0\134";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[137];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\2\1\5\1\6\1\7\1\10"+
    "\1\3\1\11\1\12\2\3\1\13\1\14\2\3\1\15"+
    "\1\16\1\17\1\3\1\20\1\21\5\3\1\22\1\23"+
    "\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\1\3\1\35\1\36\1\37\1\40\1\41\1\42"+
    "\57\0\2\3\4\0\26\3\12\0\1\3\3\0\1\3"+
    "\4\0\1\4\1\43\47\0\1\4\6\0\1\5\56\0"+
    "\1\44\27\0\1\45\21\0\2\3\4\0\1\3\1\46"+
    "\5\3\1\47\16\3\12\0\1\3\3\0\1\3\3\0"+
    "\2\3\4\0\6\3\1\50\17\3\12\0\1\3\3\0"+
    "\1\3\3\0\2\3\4\0\4\3\1\51\21\3\12\0"+
    "\1\3\3\0\1\3\3\0\2\3\4\0\13\3\1\52"+
    "\12\3\12\0\1\3\3\0\1\3\3\0\2\3\4\0"+
    "\5\3\1\53\2\3\1\54\7\3\1\55\5\3\12\0"+
    "\1\3\3\0\1\3\3\0\2\3\4\0\11\3\1\56"+
    "\14\3\12\0\1\3\3\0\1\3\3\0\2\3\4\0"+
    "\1\3\1\57\6\3\1\60\15\3\12\0\1\3\3\0"+
    "\1\3\3\0\2\3\4\0\2\3\1\61\23\3\12\0"+
    "\1\3\3\0\1\3\3\0\2\3\4\0\6\3\1\62"+
    "\17\3\12\0\1\3\3\0\1\3\3\0\2\3\4\0"+
    "\11\3\1\63\14\3\12\0\1\3\3\0\1\3\3\0"+
    "\2\3\4\0\4\3\1\64\21\3\12\0\1\3\3\0"+
    "\1\3\37\0\1\65\55\0\1\45\1\66\54\0\1\45"+
    "\1\0\1\66\53\0\1\45\61\0\1\67\56\0\1\67"+
    "\15\0\1\70\1\71\47\0\1\70\2\0\6\72\1\0"+
    "\45\72\1\73\1\72\6\74\1\0\47\74\2\0\1\75"+
    "\50\0\1\76\2\0\6\44\1\0\47\44\1\0\2\3"+
    "\4\0\2\3\1\77\23\3\12\0\1\3\3\0\1\3"+
    "\3\0\2\3\4\0\20\3\1\100\5\3\12\0\1\3"+
    "\3\0\1\3\3\0\2\3\4\0\5\3\1\101\20\3"+
    "\12\0\1\3\3\0\1\3\3\0\2\3\4\0\2\3"+
    "\1\102\2\3\1\103\20\3\12\0\1\3\3\0\1\3"+
    "\3\0\2\3\4\0\10\3\1\104\15\3\12\0\1\3"+
    "\3\0\1\3\3\0\2\3\4\0\11\3\1\105\14\3"+
    "\12\0\1\3\3\0\1\3\3\0\2\3\4\0\1\3"+
    "\1\106\24\3\12\0\1\3\3\0\1\3\3\0\2\3"+
    "\4\0\11\3\1\107\14\3\12\0\1\3\3\0\1\3"+
    "\3\0\2\3\4\0\17\3\1\110\6\3\12\0\1\3"+
    "\3\0\1\3\3\0\2\3\4\0\24\3\1\111\1\3"+
    "\12\0\1\3\3\0\1\3\3\0\2\3\4\0\6\3"+
    "\1\112\17\3\12\0\1\3\3\0\1\3\3\0\2\3"+
    "\4\0\1\113\10\3\1\114\14\3\12\0\1\3\3\0"+
    "\1\3\3\0\2\3\4\0\1\115\25\3\12\0\1\3"+
    "\3\0\1\3\4\0\1\116\50\0\1\116\57\0\1\117"+
    "\1\0\2\3\4\0\13\3\1\120\12\3\12\0\1\3"+
    "\3\0\1\3\3\0\2\3\4\0\6\3\1\77\17\3"+
    "\12\0\1\3\3\0\1\3\3\0\2\3\4\0\20\3"+
    "\1\121\5\3\12\0\1\3\3\0\1\3\3\0\2\3"+
    "\4\0\17\3\1\122\6\3\12\0\1\3\3\0\1\3"+
    "\3\0\2\3\4\0\24\3\1\100\1\3\12\0\1\3"+
    "\3\0\1\3\3\0\2\3\4\0\5\3\1\46\20\3"+
    "\12\0\1\3\3\0\1\3\3\0\2\3\4\0\3\3"+
    "\1\123\22\3\12\0\1\3\3\0\1\3\3\0\2\3"+
    "\4\0\10\3\1\124\15\3\12\0\1\3\3\0\1\3"+
    "\3\0\2\3\4\0\21\3\1\125\1\126\1\127\2\3"+
    "\12\0\1\3\3\0\1\3\3\0\2\3\4\0\13\3"+
    "\1\130\12\3\12\0\1\3\3\0\1\3\3\0\2\3"+
    "\4\0\1\131\25\3\12\0\1\3\3\0\1\3\3\0"+
    "\2\3\4\0\1\3\1\132\24\3\12\0\1\3\3\0"+
    "\1\3\3\0\2\3\4\0\3\3\1\133\11\3\1\134"+
    "\10\3\12\0\1\3\3\0\1\3\3\0\2\3\4\0"+
    "\10\3\1\135\15\3\12\0\1\3\3\0\1\3\3\0"+
    "\2\3\4\0\6\3\1\136\17\3\12\0\1\3\3\0"+
    "\1\3\3\0\2\3\4\0\10\3\1\137\15\3\12\0"+
    "\1\3\3\0\1\3\3\0\2\3\4\0\2\3\1\140"+
    "\23\3\12\0\1\3\3\0\1\3\3\0\2\3\4\0"+
    "\13\3\1\141\12\3\12\0\1\3\3\0\1\3\3\0"+
    "\2\3\4\0\6\3\1\142\17\3\12\0\1\3\3\0"+
    "\1\3\3\0\2\3\4\0\20\3\1\143\5\3\12\0"+
    "\1\3\3\0\1\3\3\0\2\3\4\0\7\3\1\144"+
    "\16\3\12\0\1\3\3\0\1\3\3\0\2\3\4\0"+
    "\1\3\1\145\24\3\12\0\1\3\3\0\1\3\3\0"+
    "\2\3\4\0\2\3\1\146\23\3\12\0\1\3\3\0"+
    "\1\3\3\0\2\3\4\0\13\3\1\147\12\3\12\0"+
    "\1\3\3\0\1\3\3\0\2\3\4\0\6\3\1\150"+
    "\17\3\12\0\1\3\3\0\1\3\3\0\2\3\4\0"+
    "\13\3\1\151\12\3\12\0\1\3\3\0\1\3\3\0"+
    "\2\3\4\0\1\3\1\152\24\3\12\0\1\3\3\0"+
    "\1\3\3\0\2\3\4\0\1\3\1\153\24\3\12\0"+
    "\1\3\3\0\1\3\3\0\2\3\4\0\1\154\25\3"+
    "\12\0\1\3\3\0\1\3\3\0\2\3\4\0\5\3"+
    "\1\155\20\3\12\0\1\3\3\0\1\3\3\0\2\3"+
    "\4\0\11\3\1\156\14\3\12\0\1\3\3\0\1\3"+
    "\3\0\2\3\4\0\1\3\1\157\24\3\12\0\1\3"+
    "\3\0\1\3\3\0\2\3\4\0\15\3\1\160\10\3"+
    "\12\0\1\3\3\0\1\3\3\0\2\3\4\0\10\3"+
    "\1\161\15\3\12\0\1\3\3\0\1\3\3\0\2\3"+
    "\4\0\17\3\1\162\6\3\12\0\1\3\3\0\1\3"+
    "\3\0\2\3\4\0\5\3\1\163\20\3\12\0\1\3"+
    "\3\0\1\3\3\0\2\3\4\0\11\3\1\164\14\3"+
    "\12\0\1\3\3\0\1\3\3\0\2\3\4\0\1\3"+
    "\1\77\24\3\12\0\1\3\3\0\1\3\3\0\2\3"+
    "\4\0\3\3\1\165\11\3\1\166\10\3\12\0\1\3"+
    "\3\0\1\3\3\0\2\3\4\0\3\3\1\167\22\3"+
    "\12\0\1\3\3\0\1\3\3\0\2\3\4\0\1\3"+
    "\1\170\24\3\12\0\1\3\3\0\1\3\3\0\2\3"+
    "\4\0\20\3\1\171\5\3\12\0\1\3\3\0\1\3"+
    "\3\0\2\3\4\0\26\3\12\0\1\172\3\0\1\3"+
    "\3\0\2\3\4\0\1\3\1\173\24\3\12\0\1\3"+
    "\3\0\1\3\3\0\2\3\4\0\13\3\1\174\12\3"+
    "\12\0\1\3\3\0\1\3\3\0\2\3\4\0\6\3"+
    "\1\175\17\3\12\0\1\3\3\0\1\3\3\0\2\3"+
    "\4\0\2\3\1\176\23\3\12\0\1\3\3\0\1\3"+
    "\3\0\2\3\4\0\6\3\1\177\17\3\12\0\1\3"+
    "\3\0\1\3\3\0\2\3\4\0\17\3\1\200\6\3"+
    "\12\0\1\3\3\0\1\3\3\0\2\3\4\0\5\3"+
    "\1\201\20\3\12\0\1\3\3\0\1\3\3\0\2\3"+
    "\4\0\1\202\25\3\12\0\1\3\3\0\1\3\3\0"+
    "\2\3\4\0\13\3\1\203\12\3\12\0\1\3\3\0"+
    "\1\3\3\0\2\3\4\0\20\3\1\204\5\3\12\0"+
    "\1\3\3\0\1\3\3\0\2\3\4\0\26\3\12\0"+
    "\1\205\3\0\1\3\3\0\2\3\4\0\11\3\1\206"+
    "\14\3\12\0\1\3\3\0\1\3\3\0\2\3\4\0"+
    "\6\3\1\207\17\3\12\0\1\3\3\0\1\3\3\0"+
    "\2\3\4\0\1\3\1\210\24\3\12\0\1\3\3\0"+
    "\1\3\3\0\2\3\4\0\13\3\1\211\12\3\12\0"+
    "\1\3\3\0\1\3\2\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4646];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\4\1\1\11\23\1\5\11\3\1\1\0"+
    "\1\1\1\11\17\1\3\11\1\1\2\0\1\1\1\0"+
    "\22\1\1\11\72\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[137];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    public String lexeme;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 132) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public ListaDeTokens yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 39: 
          { lexeme=yytext(); return EndProcedure;
          }
        case 40: break;
        case 2: 
          { lexeme=yytext(); return Identificador;
          }
        case 41: break;
        case 13: 
          { lexeme=yytext(); return P_coma;
          }
        case 42: break;
        case 26: 
          { lexeme=yytext(); return Else;
          }
        case 43: break;
        case 33: 
          { lexeme=yytext(); return Println;
          }
        case 44: break;
        case 30: 
          { lexeme=yytext(); return Return;
          }
        case 45: break;
        case 5: 
          { lexeme=yytext(); return Op_arimetico;
          }
        case 46: break;
        case 31: 
          { lexeme=yytext(); return ReadLN;
          }
        case 47: break;
        case 1: 
          { return ERROR_Lexico;
          }
        case 48: break;
        case 6: 
          { return Linea;
          }
        case 49: break;
        case 19: 
          { lexeme=yytext(); return ERROR_Entero;
          }
        case 50: break;
        case 9: 
          { lexeme = yytext(); return Op_relacional;
          }
        case 51: break;
        case 8: 
          { lexeme=yytext(); return Op_logico;
          }
        case 52: break;
        case 18: 
          { lexeme = yytext(); return Op_incremento;
          }
        case 53: break;
        case 3: 
          { lexeme=yytext(); return Numero;
          }
        case 54: break;
        case 21: 
          { lexeme=yytext(); return Flotante;
          }
        case 55: break;
        case 24: 
          { lexeme=yytext(); return Litcar;
          }
        case 56: break;
        case 10: 
          { lexeme=yytext(); return Parentesis_a;
          }
        case 57: break;
        case 28: 
          { lexeme=yytext(); return Print;
          }
        case 58: break;
        case 38: 
          { lexeme=yytext(); return EndFunction;
          }
        case 59: break;
        case 22: 
          { lexeme=yytext(); return ERROR_Flotante;
          }
        case 60: break;
        case 32: 
          { lexeme=yytext(); return Cadena;
          }
        case 61: break;
        case 17: 
          { lexeme=yytext(); return Do;
          }
        case 62: break;
        case 23: 
          { lexeme=yytext(); return T_dato;
          }
        case 63: break;
        case 27: 
          { lexeme=yytext(); return EndIf;
          }
        case 64: break;
        case 35: 
          { lexeme=yytext(); return Function;
          }
        case 65: break;
        case 36: 
          { lexeme=yytext(); return Procedure;
          }
        case 66: break;
        case 11: 
          { lexeme=yytext(); return Parentesis_c;
          }
        case 67: break;
        case 15: 
          { lexeme = yytext(); return Op_Asignacion;
          }
        case 68: break;
        case 7: 
          { lexeme=yytext(); return Igual;
          }
        case 69: break;
        case 12: 
          { lexeme=yytext(); return Coma;
          }
        case 70: break;
        case 34: 
          { lexeme=yytext(); return Program;
          }
        case 71: break;
        case 37: 
          { lexeme=yytext(); return EndProgram;
          }
        case 72: break;
        case 29: 
          { lexeme=yytext(); return While;
          }
        case 73: break;
        case 4: 
          { /*Ignore*/
          }
        case 74: break;
        case 25: 
          { lexeme = yytext(); return Op_booleano;
          }
        case 75: break;
        case 16: 
          { lexeme=yytext(); return If;
          }
        case 76: break;
        case 14: 
          { lexeme=yytext(); return D_puntos;
          }
        case 77: break;
        case 20: 
          { lexeme=yytext(); return Litcad;
          }
        case 78: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
