// 9- Dado um array com números positivos e negativos, encontre o subarray com a maior soma.

public class exercicio9 {
    public static void main(String[] args) {
        int[] lista = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int maxima = lista[0];
        int soma = lista[0];

        for (int i = 1; i < lista.length; i++) {
            soma = Math.max(lista[i], soma + lista[i]);
            maxima = Math.max(maxima, soma);
        }

        System.out.println("A maior soma foi de: " + maxima);
    }
}
