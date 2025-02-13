package ExercicioFor;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 01; i <= 5; i++) {
            System.out.println("Digite seu nome:");
            String nome = sc.nextLine();
            System.out.println("Bom dia " + nome + "!");
        }
    }
}
