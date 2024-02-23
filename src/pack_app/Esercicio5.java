/*
 * stampa i numeri primi tra 1 e N
 * 
 * start
 *      leggi N
 *      conta = 1
 *      while(conta <= n) do
 *          if (conta è primo) then
 *              stampa conta        
 *          end if
 *          conta = conta + 1
 *      end while
 * end
 */
package pack_app;

import pack_2.Funtion;

public class Esercicio5 {
    public static void main(String[] args) {
        int n = Funtion.leggiNumero();
        int conta = 1;
        while(conta <= n) {
            if(Funtion.isNumeroPrimo(conta));
            System.out.println(conta);
        }
        conta += 1;
    }
}
