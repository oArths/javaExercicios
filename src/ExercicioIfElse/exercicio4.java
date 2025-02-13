package ExercicioIfElse;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua nota:");
        int nota = sc.nextInt();

        if (nota < 20) {
            System.out.println("Reprovado");
        } else if (nota < 40) {
            System.out.println("Rec 1");
        } else if (nota < 50) {
            System.out.println("Rec 2");
        }else {
            System.out.println("Aprovado");
        }

    }
}
