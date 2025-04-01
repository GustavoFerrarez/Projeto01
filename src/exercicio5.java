// 5- Peça ao usuário um número e verifique se ele está presente no array. Exiba a posição caso esteja.

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] lista = {15, 23, 36, 47, 58};
        
        System.out.println("Digite o número: ");
        int numero = in.nextInt();
        int posicao = -1;

        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == numero) {
                posicao = i;
            }
        }
        if (posicao != -1) {
            System.out.println("O número " + numero + " está na posição " + posicao);
        } else {
            System.out.println("O número não está na lista.");
        }
    }
}


