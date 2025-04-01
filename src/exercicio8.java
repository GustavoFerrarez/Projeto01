// 8- Dado dois arrays ordenados, crie um terceiro array que contenha todos os elementos ordenados.

public class exercicio8 {
    public static void main(String[] args) {
        int[] lista1 = {1, 3, 5};
        int[] lista2 = {2, 4, 6};

        int tamanho1 = lista1.length;
        int tamanho2 = lista2.length;
        int[] listaFinal = new int[tamanho1 + tamanho2];

        int i = 0, j = 0, k = 0;

        while (i < tamanho1 && j < tamanho2) {
            if (lista1[i] < lista2[j]) {
                listaFinal[k++] = lista1[i++];
            } else {
                listaFinal[k++] = lista2[j++];
            }
        }

        while (i < tamanho1) {
            listaFinal[k++] = lista1[i++];
        }

        while (j < tamanho2) {
            listaFinal[k++] = lista2[j++];
        }

        for (int numero : listaFinal) {
            System.out.print(numero + " ");
        }
    }
}
