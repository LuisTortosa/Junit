/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myutils;
import java.time.LocalDate;



/**
 *
 * @author Raúl
 * Classe de funcions pròpies utils.
 */
public class MyUtils {
   


/**
 *
 * @param cadena Strint cadena que es vol invertir
 * @return cadena invertida (null per cadenes nulls).
 */
public static String inverteix (String cadena)
{
    String resultat="";
    for (int i = cadena.length() -1; i >= 0; i--) {
        resultat = resultat + cadena.charAt(i);
    }
    return resultat;
}
/**
 *
 * @param day int dia del naixement
 * @param month int  mes del naixement
 * @param year int any del naixement
 * @return edat de la persona, per edat>150 retorna -1, per dates impossibles retorna -2
 *
 */
public static int edat (int day, int month, int year)
{
    
    int resultat=0;
    resultat = 2024 - year;
    if(resultat > 150){
        return -1;
    }else if(resultat < 0){
        return -2;
    }else{
        return resultat;
    }
    
    
}


/**
 *
 * @param numero número del que es calcula el factorial
 * @return retorna el factorial d'un número. Si el nombre es negatiu retorna -1.
 */
public static double factorial (double numero) {
    double resultat = 1;
    if (numero==0 || numero<0){
        return -1;
    }else{
        for (int i = 1; i <= numero; i++) {
                resultat *= i;
            }

            return resultat;
    }
}
}
