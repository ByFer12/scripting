/* codigo de usuario */
package com.scripting.flexcup;

import java_cup.runtime.*;
import java.util.LinkedList;

%% //separador de area

%{
    public static LinkedList<String> erroresLexicos=new LinkedList<>();
%}

/* opciones y declaraciones de jflex */
%public
%class ScriptLex
%cup
%line
%column

LineTerminator = \r|\n|\r\n

WhiteSpace = {LineTerminator} | [ \t\f]

/* integer literals */
entero = [0-9]
letters=[a-zA-Z]


%{

  private Symbol symbol(int type) {
    return new Symbol(type, yyline+1, yycolumn+1);
  }

  private Symbol symbol(int type, Object value) {
    return new Symbol(type, yyline+1, yycolumn+1, value);
  }

  private void error(String message) {
    System.out.println("Error LEXXICO en linea line "+(yyline+1)+", columna "+(yycolumn+1)+" : "+message);
  }
%}

%% // separador de areas

/* reglas lexicas */
<YYINITIAL>{

	"CURSO" { return symbol(sym.CURSO,yytext()); }
    "ESTUDIANTE" { return symbol(sym.STUDENT,yytext()); }
    "Eliminar_estudiante" { return symbol(sym.EL_ST,yytext()); }
      "Buscar_estudiante"     {return symbol(sym.BUSCAR_ST,yytext());}
      "Mostrar_estudiante" {return symbol(sym.MOST_ST,yytext());}
      "mostrar_curso" {return symbol(sym.MOST_CUR,yytext());}
	"set"	{ return symbol(sym.SET, yytext());}

	"breakpoint"		{ return symbol(sym.BREAK, yytext());}
     "del"     {return symbol(sym.DEL,yytext());}
      "print"     {return symbol(sym.PRINT,yytext());}
      "run"     {return symbol(sym.RUN,yytext());}
      "step"     {return symbol(sym.STEP,yytext());}
      "stop"     {return symbol(sym.STOP,yytext());}
    ","		{ return symbol(sym.COMA,yytext());}
    ";"     {return symbol(sym.PCOMA,yytext());}
    "["     {return symbol(sym.CA,yytext());}
    "]"     {return symbol(sym.CC,yytext());}
    ">"     {return symbol(sym.MAY,yytext());}
    "<"     {return symbol(sym.MEN,yytext());}
    "("     {return symbol(sym.PARENA,yytext());}
    ")"     {return symbol(sym.PARENC,yytext());}
    {entero}+ {return symbol(sym.NUM, yytext());}
      {letters}+ {return symbol(sym.NAMES, yytext());}

	{WhiteSpace} 	{/* ignoramos */}

    [^] {
String e="Error Lexico: "+yytext()+" token no reconocido en linea: "+yyline+"Columna"+yycolumn;
    System.out.println(e);
      
      erroresLexicos.add(e);

      }
      }