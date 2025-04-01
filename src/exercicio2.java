// 2- Dado um array de números inteiros, calcule e exiba a média dos elementos.

public class exercicio2 {
    public static void main(String[] args) {
        int []lista = {11, 27, 32, 43, 59};
        int quantidade = lista.length;
        double soma = 0;
        double media;
            
            for (int num : lista) {
                soma += num;
            }
            media = soma / quantidade;
    
            System.out.println("A média da lista é " + media);
    }
}