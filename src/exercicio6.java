// 6- Dado um array, remova os valores duplicados e exiba o novo array sem repetições.

public class exercicio6 {
    public static void main(String[] args) {
        int[] lista = {1, 2, 3, 4, 5, 1, 2, 3, 6, 7};
        int[] novo = new int[lista.length];
        int j = 0;

        for (int i = 0; i < lista.length; i++) {
            boolean duplicado = false;

            for (int k = 0; k < j; k++) {
                if (lista[i] == novo[k]) {
                    duplicado = true;
                    break;
                }
            }

            if (!duplicado) {
                novo[j++] = lista[i];
            }
        }

        for (int i = 0; i < j; i++) {
            System.out.print(novo[i] + " ");
        }
    }
}

