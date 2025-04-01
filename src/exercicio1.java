// 1- Peça ao usuário para inserir um conjunto de números e determine o maior e o menor valor.

import java.util.Scanner;

public class exercicio1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Quantos números você vai digitar? ");
        int quantidade = in.nextInt();

        System.out.print("Digite o primeiro número: ");
        int numero = in.nextInt();
        int maior = numero;
        int menor = numero;

        for (int i = 1; i < quantidade; i++) {
            System.out.print("Digite o próximo número: ");
            numero = in.nextInt();
            if (numero > maior) {
                maior = numero;
            }
            else if (numero < menor) {
                menor = numero;
            }
        }
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
    }
}
