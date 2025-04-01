// 4- Crie um programa que inverta a ordem dos elementos de um array sem usar uma nova estrutura de dados auxiliar.

public class exercicio4 {

    public static void main(String[] args) {
        int[] lista = {5, 10, 15, 20, 25};
        int inicio = 0;
        int fim = lista.length - 1;
        
        while (inicio < fim) {
            int dentro = lista[inicio];
            lista[inicio] = lista[fim];
            lista[fim] = dentro;
            
            inicio++;
            fim--;
        }

        for (int numero : lista) {
            System.out.print(numero + " ");
        }
    }
}
