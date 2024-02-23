/* 
 * start
 * 
 *      leggi N
 *      ris = 0
 *      while=(ris<=n) do
 *          stampa ris
 *          ris = ris + 1
 * fine
 * 
 * prova
 * n=3
 * ris=0
 * stampa 0
*/
package pack_app;

import pack_2.Funtion;

public class Esercicio1 {

    public static void main(String[] args) {
        int n = Funtion.leggiNumero();
        int ris = 0;
        while (ris <= n) {
            System.out.println(ris);
            ris = ris + 1;
        }
    }
}