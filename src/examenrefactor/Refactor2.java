/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenrefactor;

/**
 *
 * @author slorenzorodriguez
 */
//Código Formateado
public class Refactor2 {

    public static void main(String[] args) {

        int j;
        int f;

        j = 8;

        int i;
        if (j == 0) {
            f = 1;
        } else {
            f = 1;
            for (i = j; i >= 1; i--) {
                f = f * i;
            }
        }

        System.out.println(f);

    }

}
