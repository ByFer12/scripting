package com.scripting.manejadores;

import com.scripting.flexcup.ScriptLex;
import com.scripting.flexcup.parser;
import com.scripting.frontend.Principal;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.StringReader;
import java.util.*;

public class Manejador {
    static int contador=0;

    static String cod[];
    static List<String> coder;

    public static void run(int point) {
        cod=Principal.codigo.getText().trim().split("\n");
         coder= Arrays.asList(cod);
        if (point > contador) {
            for (int i = contador; i < coder.size(); i++) {
                if (coder.get(i).endsWith(";")) {
                    if (i != point - 1) {
                        contador++;
                        ScriptLex lex = new ScriptLex(new BufferedReader(new StringReader(coder.get(i))));
                        parser p = new parser(lex);
                        try {
                            Principal.mensajes.setText("Ultimo ejecutado: " + coder.get(i));
                            System.out.println("Ultimo ejecutado: " + coder.get(i));
                            p.parse();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else {

                        System.out.println("CONTADOR: "+contador);
                        break;
                    }
                } else {
                    String err = "Utima linea debe llevar ;";
                    parser.erroresSintacticos.add(err);
                }
            }
        }else{
            String err = "No se puede mover a una linea anterior a la posicion actual";
            parser.erroresSemanticos.add(err);
            System.out.println(err);
            System.out.println("CONTADOR: "+contador);
        }
    }

    public static void step() {

        for (int i = contador; i < coder.size(); i++) {
            if (coder.get(i).endsWith(";")) {
                if(coder.get(i).isEmpty()){
                    JOptionPane.showMessageDialog(null,"La fila no tiene codigo");
                }

                ScriptLex lex = new ScriptLex(new BufferedReader(new StringReader(coder.get(i))));
                parser p = new parser(lex);
                try {
                    Principal.mensajes.setText("Ultimo ejecutado: " + coder.get(i));
                    System.out.println("Ultimo ejecutado: " + coder.get(i));
                    p.parse();
                    contador++;
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                }

            } else {
                String err = "Utima linea debe llevar ;";
                parser.erroresSintacticos.add(err);
            }
        }

    }

    public static void stop() {

        contador = 0;

    }


}
