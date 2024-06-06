
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615
//----------------------------------------------------

package com.scripting.flexcup;

import java_cup.runtime.*;
import java.util.ArrayList;
import java.util.List;
import com.scripting.models.*;
import com.scripting.frontend.Principal;
import com.scripting.manejadores.Manejador;
import java.util.LinkedList;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\032\000\002\016\003\000\002\002\004\000\002\012" +
    "\004\000\002\012\003\000\002\002\003\000\002\002\003" +
    "\000\002\002\003\000\002\002\003\000\002\002\003\000" +
    "\002\002\003\000\002\002\003\000\002\003\011\000\002" +
    "\004\013\000\002\005\007\000\002\006\007\000\002\007" +
    "\006\000\002\010\006\000\002\011\003\000\002\011\003" +
    "\000\002\011\003\000\002\013\006\000\002\013\006\000" +
    "\002\014\005\000\002\015\005\000\002\015\004\000\002" +
    "\015\004" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\104\000\032\004\034\005\013\006\033\007\011\010" +
    "\032\011\024\012\022\014\017\015\030\016\023\017\021" +
    "\020\004\001\002\000\004\024\106\001\002\000\034\002" +
    "\ufff0\004\ufff0\005\ufff0\006\ufff0\007\ufff0\010\ufff0\011\ufff0" +
    "\012\ufff0\014\ufff0\015\ufff0\016\ufff0\017\ufff0\020\ufff0\001" +
    "\002\000\034\002\001\004\034\005\013\006\033\007\011" +
    "\010\032\011\024\012\022\014\017\015\030\016\023\017" +
    "\021\020\004\001\002\000\034\002\uffef\004\uffef\005\uffef" +
    "\006\uffef\007\uffef\010\uffef\011\uffef\012\uffef\014\uffef\015" +
    "\uffef\016\uffef\017\uffef\020\uffef\001\002\000\034\002\ufffc" +
    "\004\ufffc\005\ufffc\006\ufffc\007\ufffc\010\ufffc\011\ufffc\012" +
    "\ufffc\014\ufffc\015\ufffc\016\ufffc\017\ufffc\020\ufffc\001\002" +
    "\000\004\031\101\001\002\000\034\002\ufffe\004\ufffe\005" +
    "\ufffe\006\ufffe\007\ufffe\010\ufffe\011\ufffe\012\ufffe\014\ufffe" +
    "\015\ufffe\016\ufffe\017\ufffe\020\ufffe\001\002\000\004\031" +
    "\071\001\002\000\034\002\ufffd\004\ufffd\005\ufffd\006\ufffd" +
    "\007\ufffd\010\ufffd\011\ufffd\012\ufffd\014\ufffd\015\ufffd\016" +
    "\ufffd\017\ufffd\020\ufffd\001\002\000\034\002\ufff9\004\ufff9" +
    "\005\ufff9\006\ufff9\007\ufff9\010\ufff9\011\ufff9\012\ufff9\014" +
    "\ufff9\015\ufff9\016\ufff9\017\ufff9\020\ufff9\001\002\000\004" +
    "\002\070\001\002\000\004\013\065\001\002\000\034\002" +
    "\ufff7\004\ufff7\005\ufff7\006\ufff7\007\ufff7\010\ufff7\011\ufff7" +
    "\012\ufff7\014\ufff7\015\ufff7\016\ufff7\017\ufff7\020\ufff7\001" +
    "\002\000\004\024\064\001\002\000\004\013\061\001\002" +
    "\000\004\022\057\001\002\000\004\031\054\001\002\000" +
    "\034\002\ufffb\004\ufffb\005\ufffb\006\ufffb\007\ufffb\010\ufffb" +
    "\011\ufffb\012\ufffb\014\ufffb\015\ufffb\016\ufffb\017\ufffb\020" +
    "\ufffb\001\002\000\034\002\uffee\004\uffee\005\uffee\006\uffee" +
    "\007\uffee\010\uffee\011\uffee\012\uffee\014\uffee\015\uffee\016" +
    "\uffee\017\uffee\020\uffee\001\002\000\034\002\ufff8\004\ufff8" +
    "\005\ufff8\006\ufff8\007\ufff8\010\ufff8\011\ufff8\012\ufff8\014" +
    "\ufff8\015\ufff8\016\ufff8\017\ufff8\020\ufff8\001\002\000\004" +
    "\022\052\001\002\000\034\002\ufffa\004\ufffa\005\ufffa\006" +
    "\ufffa\007\ufffa\010\ufffa\011\ufffa\012\ufffa\014\ufffa\015\ufffa" +
    "\016\ufffa\017\ufffa\020\ufffa\001\002\000\004\031\047\001" +
    "\002\000\004\031\043\001\002\000\004\031\035\001\002" +
    "\000\004\022\036\001\002\000\004\023\037\001\002\000" +
    "\004\021\040\001\002\000\004\032\041\001\002\000\004" +
    "\024\042\001\002\000\034\002\ufff6\004\ufff6\005\ufff6\006" +
    "\ufff6\007\ufff6\010\ufff6\011\ufff6\012\ufff6\014\ufff6\015\ufff6" +
    "\016\ufff6\017\ufff6\020\ufff6\001\002\000\004\022\044\001" +
    "\002\000\004\032\045\001\002\000\004\024\046\001\002" +
    "\000\034\002\ufff4\004\ufff4\005\ufff4\006\ufff4\007\ufff4\010" +
    "\ufff4\011\ufff4\012\ufff4\014\ufff4\015\ufff4\016\ufff4\017\ufff4" +
    "\020\ufff4\001\002\000\004\032\050\001\002\000\004\024" +
    "\051\001\002\000\034\002\ufff2\004\ufff2\005\ufff2\006\ufff2" +
    "\007\ufff2\010\ufff2\011\ufff2\012\ufff2\014\ufff2\015\ufff2\016" +
    "\ufff2\017\ufff2\020\ufff2\001\002\000\004\024\053\001\002" +
    "\000\034\002\uffeb\004\uffeb\005\uffeb\006\uffeb\007\uffeb\010" +
    "\uffeb\011\uffeb\012\uffeb\014\uffeb\015\uffeb\016\uffeb\017\uffeb" +
    "\020\uffeb\001\002\000\004\032\055\001\002\000\004\024" +
    "\056\001\002\000\034\002\ufff1\004\ufff1\005\ufff1\006\ufff1" +
    "\007\ufff1\010\ufff1\011\ufff1\012\ufff1\014\ufff1\015\ufff1\016" +
    "\ufff1\017\ufff1\020\ufff1\001\002\000\004\024\060\001\002" +
    "\000\034\002\uffea\004\uffea\005\uffea\006\uffea\007\uffea\010" +
    "\uffea\011\uffea\012\uffea\014\uffea\015\uffea\016\uffea\017\uffea" +
    "\020\uffea\001\002\000\004\022\062\001\002\000\004\024" +
    "\063\001\002\000\034\002\uffed\004\uffed\005\uffed\006\uffed" +
    "\007\uffed\010\uffed\011\uffed\012\uffed\014\uffed\015\uffed\016" +
    "\uffed\017\uffed\020\uffed\001\002\000\034\002\uffe9\004\uffe9" +
    "\005\uffe9\006\uffe9\007\uffe9\010\uffe9\011\uffe9\012\uffe9\014" +
    "\uffe9\015\uffe9\016\uffe9\017\uffe9\020\uffe9\001\002\000\004" +
    "\022\066\001\002\000\004\024\067\001\002\000\034\002" +
    "\uffec\004\uffec\005\uffec\006\uffec\007\uffec\010\uffec\011\uffec" +
    "\012\uffec\014\uffec\015\uffec\016\uffec\017\uffec\020\uffec\001" +
    "\002\000\004\002\000\001\002\000\004\022\072\001\002" +
    "\000\004\023\073\001\002\000\004\021\074\001\002\000" +
    "\004\023\075\001\002\000\004\022\076\001\002\000\004" +
    "\032\077\001\002\000\004\024\100\001\002\000\034\002" +
    "\ufff5\004\ufff5\005\ufff5\006\ufff5\007\ufff5\010\ufff5\011\ufff5" +
    "\012\ufff5\014\ufff5\015\ufff5\016\ufff5\017\ufff5\020\ufff5\001" +
    "\002\000\004\022\102\001\002\000\004\032\103\001\002" +
    "\000\004\024\104\001\002\000\034\002\ufff3\004\ufff3\005" +
    "\ufff3\006\ufff3\007\ufff3\010\ufff3\011\ufff3\012\ufff3\014\ufff3" +
    "\015\ufff3\016\ufff3\017\ufff3\020\ufff3\001\002\000\034\002" +
    "\uffff\004\uffff\005\uffff\006\uffff\007\uffff\010\uffff\011\uffff" +
    "\012\uffff\014\uffff\015\uffff\016\uffff\017\uffff\020\uffff\001" +
    "\002\000\034\002\uffe8\004\uffe8\005\uffe8\006\uffe8\007\uffe8" +
    "\010\uffe8\011\uffe8\012\uffe8\014\uffe8\015\uffe8\016\uffe8\017" +
    "\uffe8\020\uffe8\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\104\000\034\002\011\003\013\004\007\005\024\006" +
    "\030\007\014\010\026\011\017\012\005\013\004\014\006" +
    "\015\025\016\015\001\001\000\002\001\001\000\002\001" +
    "\001\000\030\002\104\003\013\004\007\005\024\006\030" +
    "\007\014\010\026\011\017\013\004\014\006\015\025\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    Manejador ma = new Manejador();
    public static LinkedList<String> erroresSintacticos=new LinkedList();
    public static LinkedList<String> erroresSemanticos=new LinkedList();
    public static List<Curso> cur= new ArrayList<>();
    public static List<Estudiante> est= new ArrayList<>();
    public static List<Integer> breakpoints=new ArrayList();


    // Connect this parser to a scanner!
    public parser(ScriptLex lex) {
	    super(lex);
	  }


    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception {
           String lexema=s.value.toString();
           int columna=s.right;
           int fila=s.left;
          System.out.println("Error Sintactico: "+lexema+" en fila: "+fila+" y columna: "+columna);
            String er="Error Sintactico: "+lexema+" en fila: "+fila+" y columna: "+columna;
            erroresSintacticos.add(er);
    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // programa ::= instrucciones 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("programa",12, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= programa EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // instrucciones ::= instrucciones instruccion 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("instrucciones",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // instrucciones ::= instruccion 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("instrucciones",8, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // instruccion ::= curso 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruccion",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // instruccion ::= estudiante 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruccion",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // instruccion ::= eliminar_estudiante 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruccion",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // instruccion ::= buscar_estudiante 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruccion",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // instruccion ::= mostrar_estudiante 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruccion",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // instruccion ::= mostrar_curso 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruccion",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // instruccion ::= comando_debug 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruccion",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // curso ::= CURSO PARENA NUM COMA NAMES PARENC PCOMA 
            {
              Object RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		Object n = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int mleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int mright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object m = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		
                                                        int id=Integer.parseInt(n.toString());
                                                        Curso curs=null;
                                                        for (Curso c:cur){
                                                            if(c.getID()==id){
                                                                curs=c;
                                                                break;
                                                            }
                                                        }
                                                        if(curs!=null){
                                                             String we="El curso con el ID: "+id+" ya existe";
                                                             erroresSemanticos.add(we);
                                                        }else{
                                                        Curso c=new Curso(id,m.toString());
                                                        cur.add(c);
                                                        Principal.result.setText("Cursos agregados correctamente");
                                                        }
                                                        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("curso",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // estudiante ::= STUDENT PARENA NUM COMA NAMES COMA NUM PARENC PCOMA 
            {
              Object RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)).right;
		Object id = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-6)).value;
		int nomleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int nomright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		Object nom = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int idAleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int idAright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object idA = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		

                                                                                int idS=Integer.parseInt(id.toString());
                                                                                int idC=Integer.parseInt(idA.toString());
                                                                                  Estudiante estu = null;
                                                                                  Curso cu=null;
                                                                                            for (Estudiante e : est) {
                                                                                                if (e.getID() == idS) {
                                                                                                    estu = e;
                                                                                                    break; // Salir del bucle una vez que se encuentra la persona
                                                                                                }
                                                                                            }
                                                                                            for (Curso c:cur){
                                                                                                if(c.getID()==idC){
                                                                                                    cu=c;
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            if (estu != null) {
                                                                                              String w="El estudiante con el ID: "+idS+" ya existe";
                                                                                              erroresSemanticos.add(w);
                                                                                              if(cu==null){
                                                                                               w="El curso con el ID: "+idC+" no existe";
                                                                                              erroresSemanticos.add(w);
                                                                                              }

                                                                                            } else{
                                                                                            String w="";
                                                                                            if(cu==null){
                                                                                                w="El curso con el ID: "+idC+" no existe";
                                                                                                erroresSemanticos.add(w);
                                                                                            }else{
                                                                                                   Estudiante e=new Estudiante(idS,nom.toString(),idC);
                                                                                                   est.add(e);
                                                                                                   Principal.result.setText("Estudiantes agregados correctamente");
                                                                                              }
                                                                                            }

                                                                                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("estudiante",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-8)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // eliminar_estudiante ::= EL_ST PARENA NUM PARENC PCOMA 
            {
              Object RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object id = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		
                                                            int idEE=Integer.parseInt(id.toString());
                                                final boolean[] encontrado = {false};

                                               est.removeIf(estudiante -> {
                                                   if (estudiante.getID() == idEE) {
                                                       encontrado[0] = true;
                                                       return true; // Eliminar si el ID coincide con idEE
                                                   } else {
                                                       return false; // No eliminar el estudiante
                                                   }
                                               });

                                               if (!encontrado[0]) {
                                                   String semanError="El estudiante con ID: "+idEE+" no existe";
                                                   erroresSemanticos.add(semanError);
                                               }else{
                                                    Principal.result.setText("Estudiante con ID: "+idEE+" Eliminado correctamente");
                                               }


                                                        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("eliminar_estudiante",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // buscar_estudiante ::= BUSCAR_ST PARENA NUM PARENC PCOMA 
            {
              Object RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object id = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		

                                                             int idB=Integer.parseInt(id.toString());
                                                             Estudiante estu = null;
                                                                     for (Estudiante e : est) {
                                                                         if (e.getID() == idB) {
                                                                             estu = e;
                                                                             break; // Salir del bucle una vez que se encuentra la persona
                                                                         }
                                                                     }
                                                                     if (estu != null) {
                                                                       Principal.result.setText("Estudiantes encontrado ID: "+estu.getID()+" Nombre: "+estu.getNombre());
                                                                     } else {
                                                                         Principal.result.setText("Estudiante no encontrado");
                                                                     }
                                                            
              CUP$parser$result = parser.getSymbolFactory().newSymbol("buscar_estudiante",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // mostrar_estudiante ::= MOST_ST PARENA PARENC PCOMA 
            {
              Object RESULT =null;
		
                                                StringBuilder st=new StringBuilder();
                                                st.append("ID        NOMBRE         idCurso\n\n");
                                                for (Estudiante e:est){
                                                    st.append(" "+e.getID()+"           "+e.getNombre()+"               "+e.getCurso()+"\n");

                                                }
                                                Principal.result.setText(st.toString());
                                                Principal.resultados.setText("Listado de estudiantes");

                                                 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("mostrar_estudiante",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // mostrar_curso ::= MOST_CUR PARENA PARENC PCOMA 
            {
              Object RESULT =null;
		
                                                StringBuilder st=new StringBuilder();
                                                st.append("ID        NOMBRE\n\n");
                                                for (Curso c:cur){
                                                    st.append(" "+c.getID()+"           "+c.getNombre()+"\n");

                                                }
                                                Principal.result.setText(st.toString());
                                                Principal.resultados.setText("Listado de cursos");
                                                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("mostrar_curso",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // comando_debug ::= comando_break 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("comando_debug",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // comando_debug ::= comando_print 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("comando_debug",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // comando_debug ::= comando_run 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("comando_debug",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // comando_break ::= SET BREAK NUM PCOMA 
            {
              Object RESULT =null;
		int numleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int numright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object num = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
                                      int point=Integer.parseInt(num.toString());
                                      breakpoints.add(point);
                                        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("comando_break",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // comando_break ::= DEL BREAK NUM PCOMA 
            {
              Object RESULT =null;
		int numleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int numright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object num = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		     int point=Integer.parseInt(num.toString());
                                       breakpoints.remove(Integer.valueOf(point));
              CUP$parser$result = parser.getSymbolFactory().newSymbol("comando_break",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // comando_print ::= PRINT NUM PCOMA 
            {
              Object RESULT =null;
		int numleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int numright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object num = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
                                int point=Integer.parseInt(num.toString());
                                            Estudiante estu = null;
                                            for (Estudiante e : est) {
                                                if (e.getID() == point) {
                                                    estu = e;
                                                    break; // Salir del bucle una vez que se encuentra la persona
                                                }
                                            }
                                            if (estu != null) {
                                                Principal.result.setText("Estudiantes encontrado ID: "+estu.getID()+" Nombre: "+estu.getNombre());
                                            } else {
                                                Principal.result.setText("Estudiante no encontrado");
                                            }
                                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("comando_print",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // comando_run ::= RUN NUM PCOMA 
            {
              Object RESULT =null;
		int ruptleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int ruptright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object rupt = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
                           if(!breakpoints.isEmpty()){
                            int rup=Integer.parseInt(rupt.toString());
                            ma.run(rup);
                           }else{
                           String errors="No tienes puntos de ruptura agregados";
                           erroresSemanticos.add(errors);
                           }
                            
              CUP$parser$result = parser.getSymbolFactory().newSymbol("comando_run",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // comando_run ::= STEP PCOMA 
            {
              Object RESULT =null;
		
              if(!breakpoints.isEmpty()){
              ma.step();
              }else{
              String errors="No tienes puntos de ruptura agregados";
              erroresSemanticos.add(errors);
              }
              
              CUP$parser$result = parser.getSymbolFactory().newSymbol("comando_run",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // comando_run ::= STOP PCOMA 
            {
              Object RESULT =null;
		
                                ma.stop();
                            
              CUP$parser$result = parser.getSymbolFactory().newSymbol("comando_run",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}