// DO NOT EDIT
// Generated by JFlex 1.9.1 http://jflex.de/
// source: script.flex

/* codigo de usuario */
package com.scripting.flexcup;

import java_cup.runtime.*;
import java.util.LinkedList;


@SuppressWarnings("fallthrough")
public class ScriptLex implements java_cup.runtime.Scanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
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
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\u10ff\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
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
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\1\0\1\1\1\3\22\0\1\1"+
    "\7\0\1\4\1\5\2\0\1\6\3\0\12\7\1\0"+
    "\1\10\1\11\1\0\1\12\2\0\1\13\1\14\1\15"+
    "\1\16\1\17\3\20\1\21\3\20\1\22\1\23\1\24"+
    "\2\20\1\25\1\26\1\27\1\30\5\20\1\31\1\0"+
    "\1\32\1\0\1\33\1\0\1\34\1\35\1\36\1\37"+
    "\1\40\3\20\1\41\1\20\1\42\1\43\1\44\1\45"+
    "\1\46\1\47\1\20\1\50\1\51\1\52\1\53\5\20"+
    "\u0185\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[512];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
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
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\5\12\1\13\1\14\30\12\1\15\2\12"+
    "\1\16\1\17\12\12\1\20\1\21\1\12\1\22\5\12"+
    "\1\23\6\12\1\0\5\12\1\0\2\12\1\0\1\12"+
    "\2\0\1\12\2\0\1\12\2\0\1\24\2\0\1\25"+
    "\14\0\1\26\11\0\1\27\3\0\1\30\1\31";

  private static int [] zzUnpackAction() {
    int [] result = new int[124];
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
    "\0\0\0\54\0\54\0\130\0\54\0\54\0\54\0\204"+
    "\0\54\0\54\0\54\0\260\0\334\0\u0108\0\u0134\0\u0160"+
    "\0\54\0\54\0\u018c\0\u01b8\0\u01e4\0\u0210\0\u023c\0\u0268"+
    "\0\u0294\0\u02c0\0\u02ec\0\u0318\0\u0344\0\u0370\0\u039c\0\u03c8"+
    "\0\u03f4\0\u0420\0\u044c\0\u0478\0\u04a4\0\u04d0\0\u04fc\0\u0528"+
    "\0\u0554\0\u0580\0\260\0\u05ac\0\u05d8\0\260\0\260\0\u0604"+
    "\0\u0630\0\u065c\0\u0688\0\u06b4\0\u06e0\0\u070c\0\u0738\0\u0764"+
    "\0\u0790\0\260\0\260\0\u07bc\0\260\0\u07e8\0\u0814\0\u0840"+
    "\0\u086c\0\u0898\0\260\0\u08c4\0\u08f0\0\u091c\0\u0948\0\u0974"+
    "\0\u09a0\0\u09cc\0\u09f8\0\u0a24\0\u0a50\0\u0a7c\0\u0aa8\0\u0ad4"+
    "\0\u0b00\0\u0b2c\0\u0b58\0\u0b84\0\u0bb0\0\u0bdc\0\u0c08\0\u0c34"+
    "\0\u0c60\0\u0c8c\0\u0cb8\0\u0ce4\0\260\0\u0d10\0\u0d3c\0\260"+
    "\0\u0d68\0\u0d94\0\u0dc0\0\u0dec\0\u0e18\0\u0e44\0\u0e70\0\u0e9c"+
    "\0\u0ec8\0\u0ef4\0\u0f20\0\u0f4c\0\54\0\u0f78\0\u0fa4\0\u0fd0"+
    "\0\u0ffc\0\u1028\0\u1054\0\u1080\0\u10ac\0\u10d8\0\54\0\u1104"+
    "\0\u1130\0\u115c\0\54\0\54";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[124];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\14\1\17\2\14"+
    "\1\20\6\14\1\21\1\22\1\2\1\14\1\23\1\14"+
    "\1\24\4\14\1\25\2\14\1\26\1\27\1\30\2\14"+
    "\56\0\1\3\60\0\1\10\57\0\16\14\3\0\20\14"+
    "\13\0\16\14\3\0\17\14\1\31\13\0\15\14\1\32"+
    "\3\0\20\14\13\0\13\14\1\33\2\14\3\0\7\14"+
    "\1\34\10\14\13\0\16\14\3\0\12\14\1\35\5\14"+
    "\13\0\16\14\3\0\14\14\1\36\3\14\13\0\16\14"+
    "\3\0\4\14\1\37\13\14\13\0\16\14\3\0\12\14"+
    "\1\40\5\14\13\0\16\14\3\0\14\14\1\41\3\14"+
    "\13\0\16\14\3\0\17\14\1\42\13\0\16\14\3\0"+
    "\4\14\1\43\11\14\1\44\1\14\13\0\16\14\3\0"+
    "\15\14\1\45\2\14\13\0\12\14\1\46\3\14\3\0"+
    "\20\14\13\0\14\14\1\47\1\14\3\0\20\14\13\0"+
    "\16\14\3\0\5\14\1\50\12\14\13\0\16\14\3\0"+
    "\15\14\1\51\2\14\13\0\16\14\3\0\4\14\1\52"+
    "\13\14\13\0\16\14\3\0\7\14\1\53\10\14\13\0"+
    "\16\14\3\0\15\14\1\54\2\14\13\0\16\14\3\0"+
    "\5\14\1\55\12\14\13\0\16\14\3\0\11\14\1\56"+
    "\6\14\13\0\16\14\3\0\16\14\1\57\1\14\13\0"+
    "\16\14\3\0\4\14\1\60\5\14\1\61\5\14\13\0"+
    "\16\14\3\0\2\14\1\62\15\14\13\0\13\14\1\63"+
    "\2\14\3\0\20\14\13\0\15\14\1\64\3\0\20\14"+
    "\13\0\16\14\3\0\10\14\1\65\7\14\13\0\16\14"+
    "\3\0\16\14\1\66\1\14\13\0\16\14\3\0\1\67"+
    "\17\14\13\0\16\14\3\0\16\14\1\70\1\14\13\0"+
    "\16\14\3\0\11\14\1\71\6\14\13\0\16\14\3\0"+
    "\13\14\1\72\4\14\13\0\16\14\3\0\13\14\1\73"+
    "\4\14\13\0\16\14\3\0\1\74\17\14\13\0\11\14"+
    "\1\75\4\14\3\0\20\14\13\0\3\14\1\76\12\14"+
    "\3\0\20\14\13\0\16\14\3\0\5\14\1\77\12\14"+
    "\13\0\16\14\3\0\14\14\1\100\3\14\13\0\16\14"+
    "\3\0\6\14\1\101\11\14\13\0\16\14\3\0\14\14"+
    "\1\102\3\14\13\0\16\14\3\0\16\14\1\103\1\14"+
    "\13\0\16\14\3\0\14\14\1\104\3\14\13\0\6\14"+
    "\1\105\7\14\3\0\20\14\13\0\16\14\3\0\11\14"+
    "\1\106\6\14\13\0\16\14\3\0\1\107\17\14\13\0"+
    "\16\14\3\0\13\14\1\110\4\14\13\0\16\14\3\0"+
    "\1\111\17\14\13\0\16\14\2\0\1\112\20\14\13\0"+
    "\1\113\15\14\3\0\20\14\13\0\16\14\3\0\1\114"+
    "\17\14\13\0\16\14\3\0\14\14\1\115\3\14\13\0"+
    "\16\14\3\0\12\14\1\116\5\14\13\0\16\14\3\0"+
    "\14\14\1\117\3\14\40\0\1\120\26\0\10\14\1\121"+
    "\5\14\3\0\20\14\13\0\16\14\3\0\14\14\1\122"+
    "\3\14\13\0\16\14\2\0\1\123\20\14\13\0\16\14"+
    "\3\0\5\14\1\124\12\14\13\0\16\14\2\0\1\125"+
    "\20\14\51\0\1\126\15\0\14\14\1\127\1\14\3\0"+
    "\20\14\13\0\16\14\2\0\1\130\20\14\40\0\1\131"+
    "\26\0\16\14\3\0\11\14\1\132\6\14\36\0\1\133"+
    "\67\0\1\134\14\0\4\14\1\135\11\14\3\0\20\14"+
    "\40\0\1\136\64\0\1\137\15\0\16\14\3\0\16\14"+
    "\1\140\1\14\53\0\1\141\53\0\1\142\51\0\1\143"+
    "\54\0\1\144\51\0\1\145\42\0\1\146\66\0\1\147"+
    "\54\0\1\150\51\0\1\151\43\0\1\152\65\0\1\153"+
    "\37\0\1\154\62\0\1\155\41\0\1\156\56\0\1\157"+
    "\55\0\1\160\57\0\1\161\47\0\1\162\46\0\1\163"+
    "\71\0\1\164\35\0\1\165\64\0\1\166\46\0\1\167"+
    "\60\0\1\170\60\0\1\171\53\0\1\172\41\0\1\173"+
    "\53\0\1\174\13\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[4488];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
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


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\1\1\3\11\1\1\3\11\5\1\2\11"+
    "\67\1\1\0\5\1\1\0\2\1\1\0\1\1\2\0"+
    "\1\1\2\0\1\1\2\0\1\1\2\0\1\1\14\0"+
    "\1\11\11\0\1\11\3\0\2\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[124];
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

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen())];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;

  /* user code: */
    public static LinkedList<String> erroresLexicos=new LinkedList<>();

  private Symbol symbol(int type) {
    return new Symbol(type, yyline+1, yycolumn+1);
  }

  private Symbol symbol(int type, Object value) {
    return new Symbol(type, yyline+1, yycolumn+1, value);
  }

  private void error(String message) {
    System.out.println("Error LEXXICO en linea line "+(yyline+1)+", columna "+(yycolumn+1)+" : "+message);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public ScriptLex(java.io.Reader in) {
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate && zzCanGrow()) {
      /* if not, and it can grow: blow it up */
      char newBuffer[] = new char[Math.min(zzBuffer.length * 2, zzMaxBufferLen())];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      if (requested == 0) {
        throw new java.io.EOFException("Scan buffer limit reached ["+zzBuffer.length+"]");
      }
      else {
        throw new java.io.IOException(
            "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
      }
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    int initBufferSize = Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen());
    if (zzBuffer.length > initBufferSize) {
      zzBuffer = new char[initBufferSize];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  @Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { String e="Error Lexico: "+yytext()+" token no reconocido en linea: "+yyline+"Columna"+yycolumn;
    System.out.println(e);
      
      erroresLexicos.add(e);
            }
          // fall through
          case 26: break;
          case 2:
            { /* ignoramos */
            }
          // fall through
          case 27: break;
          case 3:
            { return symbol(sym.PARENA,yytext());
            }
          // fall through
          case 28: break;
          case 4:
            { return symbol(sym.PARENC,yytext());
            }
          // fall through
          case 29: break;
          case 5:
            { return symbol(sym.COMA,yytext());
            }
          // fall through
          case 30: break;
          case 6:
            { return symbol(sym.NUM, yytext());
            }
          // fall through
          case 31: break;
          case 7:
            { return symbol(sym.PCOMA,yytext());
            }
          // fall through
          case 32: break;
          case 8:
            { return symbol(sym.MEN,yytext());
            }
          // fall through
          case 33: break;
          case 9:
            { return symbol(sym.MAY,yytext());
            }
          // fall through
          case 34: break;
          case 10:
            { return symbol(sym.NAMES, yytext());
            }
          // fall through
          case 35: break;
          case 11:
            { return symbol(sym.CA,yytext());
            }
          // fall through
          case 36: break;
          case 12:
            { return symbol(sym.CC,yytext());
            }
          // fall through
          case 37: break;
          case 13:
            { return symbol(sym.DEL,yytext());
            }
          // fall through
          case 38: break;
          case 14:
            { return symbol(sym.RUN,yytext());
            }
          // fall through
          case 39: break;
          case 15:
            { return symbol(sym.SET, yytext());
            }
          // fall through
          case 40: break;
          case 16:
            { return symbol(sym.STEP,yytext());
            }
          // fall through
          case 41: break;
          case 17:
            { return symbol(sym.STOP,yytext());
            }
          // fall through
          case 42: break;
          case 18:
            { return symbol(sym.CURSO,yytext());
            }
          // fall through
          case 43: break;
          case 19:
            { return symbol(sym.PRINT,yytext());
            }
          // fall through
          case 44: break;
          case 20:
            { return symbol(sym.STUDENT,yytext());
            }
          // fall through
          case 45: break;
          case 21:
            { return symbol(sym.BREAK, yytext());
            }
          // fall through
          case 46: break;
          case 22:
            { return symbol(sym.MOST_CUR,yytext());
            }
          // fall through
          case 47: break;
          case 23:
            { return symbol(sym.BUSCAR_ST,yytext());
            }
          // fall through
          case 48: break;
          case 24:
            { return symbol(sym.MOST_ST,yytext());
            }
          // fall through
          case 49: break;
          case 25:
            { return symbol(sym.EL_ST,yytext());
            }
          // fall through
          case 50: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
