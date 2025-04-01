// 7- Implemente um programa que rotacione os elementos do array k posições para a direita.

public class exercicio7 {
    public static void main(String[] args) {
        int[] lista = {1, 2, 3, 4, 5};
        int k = 2;

        int n = lista.length;
        int[] resultado = new int[n];

        for (int i = 0; i < n; i++) {
            int novaPosicao = (i + k) % n;
            resultado[novaPosicao] = lista[i];
        }

        for (int numero : resultado) {
            System.out.print(numero + " ");
        }
    }
}


