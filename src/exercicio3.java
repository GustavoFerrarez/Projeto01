// 3- Preencha um array com 10 números e conte quantos são pares e quantos são ímpares.

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int []lista = new int[10];
        int par = 0;
        int impar = 0;

        for (int i = 0; i < lista.length; i++) {
            System.out.print("Número: " + (i + 1) + ": ");
            lista[i] = in.nextInt();
        }

        for (int i = 0; i < lista.length; i++) {
            if (lista[i] % 2 == 0){
                par++;
            } else {
                impar++;
            }
        }
        
        System.out.println("Quantidade de números pares: " + par);
        System.out.println("Quantidade de números impares: " + impar);
    }
}
