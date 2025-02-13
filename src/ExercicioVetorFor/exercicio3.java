package ExercicioVetorFor;

import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[5];
        Double[] preco = new Double[5];
        for (int i = 0; i <= 4; i++) {
            System.out.println("Informe o nome do produtio:");
            nomes[i] = sc.nextLine();
            System.out.println("Informe o preço:");
            preco[i] = sc.nextDouble();
            sc.nextLine();

        }
        for (int i = 0; i <= 4; i++) {
            System.out.println("O produto " + nomes[i] + " custa R$ " + preco[i]);
        }
    }
}
