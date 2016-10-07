/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m05myutils;

import java.time.LocalDateTime;

/**
 *
 * @author Jorge
 */
public class MyUtils {

    /**
     *
     * @param cadena Strint cadena que es vol invertir
     * @return cadena invertida (null per cadenes nulls).
     */
    public static String inverteix(String cadena) {
        String resultat = "";

        if (!(cadena == "")) {
            for (int i = cadena.length() - 1; i >= 0; i--) {
                resultat += cadena.charAt(i);
            }
        }
        return resultat;
    }

    /**
     *
     * @param day int dia del naixement
     * @param month int mes del naixement
     * @param year int any del naixement
     * @return edat de la persona, per edat>150 retorna -1, per dates
     * impossibles retorna -2
     *
     */
    public static int edat(int day, int month, int year) {
        LocalDateTime now = LocalDateTime.now();
        int anyo = now.getYear();
        int mes = now.getMonthValue();
        int dia = now.getDayOfMonth();

        int resultat = 0;

        if ((anyo - year) >= 150) {
            return -1;
        }
        if ((anyo - year) < 0) {
            if ((mes - anyo) < 0) {
                if ((dia - day) < 0) {
                    return -2;
                }
            }
        }

        if (anyo == year) {
            if (mes == month) {
                if (dia == day) {
                    resultat = 0;
                }
            } else if (dia > day) {
                resultat = anyo - year + 1;
            } else {
                resultat = anyo - year;
            }
        } else if (mes > month) {
            resultat = anyo - year + 1;
        } else {
            resultat = anyo - year;
        }

        return resultat;
    }

    /**
     *
     * @param numero número del que es calcula el factorial
     * @return retorna el factorial d'un número. Si el nombre es negatiu retorna
     * -1.
     */
    public static double factorial(double numero) {

        if (numero == 0) {
            return 1;
        } else {
            double resultat = numero * factorial(numero - 1);
            return resultat;
        }
    }
}
