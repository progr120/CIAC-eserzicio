/*
 * boolean isNumeroPrimo(num)
 * 
 * start
 *      if(num == 0) then
 *              return false
 *      end if
 * 
 *      conta = 2
 *      while(conta < num) do
 *          if (num % conta == 0) then
 *                  return false
 *          end if
 *          conta = conta + 1
 * 
 *      end while
 *      return true
 * end
 * 
 * altro modo
 * 
 *  start
 *      risultado = true
 *      
 *      if(num == 0) then
 *          risultado = false
 *      end if
 *      
 *      conta = 2
 *      while (conta < num e risultato) do
 *          if (num % conta == 0) then
 *                  return false
 *          end if
 *          conta = conta + 1
 *      end while    
 *      return true
 * end
 */
package pack_2;

import java.util.Scanner;

public class Funtion {

public static int leggiNumero() {
    return leggiNumero("Inserisce un numero: ");
}

public static int leggiNumero(String msg) {
        System.out.println(msg);
        final Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        return n;
        }
    public static boolean isNumeroPrimo(int num){
        if (num == 0)
            return false;
        int conta = 2;
        while(conta < num) {
            if (num % conta == 0)
                    return false;
        conta ++;            
        }     
        return true;
    }
}

