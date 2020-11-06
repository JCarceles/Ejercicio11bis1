/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author CES
 */
public class SustituyeAscii {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Indique la frase");
        String laFrase = lector.nextLine();
        int posicion = 0;
        StringBuilder frase = new StringBuilder(laFrase);
        frase = sustituye("a", frase);
        frase = sustituye("A", frase);
        frase = sustituye("e", frase);
        frase = sustituye("E", frase);
        frase = sustituye("i", frase);
        frase = sustituye("I", frase);
        frase = sustituye("o", frase);
        frase = sustituye("O", frase);
        frase = sustituye("u", frase);
        frase = sustituye("U", frase);
        
        System.out.println(frase.toString());

    }
    
    static String devuelveAscii(String caracter){
        char car = caracter.charAt(0);
        int ascii = (int) car;
        return String.valueOf(ascii);
    }
    
    static StringBuilder sustituye(String caracter, StringBuilder frase){
        int posicion = 0;
        do{
            posicion = frase.indexOf(caracter);
            if (posicion!=-1){
                frase.deleteCharAt(posicion);
                frase.insert(posicion, devuelveAscii(caracter));
            }
        }while (posicion != -1);
        return frase;
    }

}
