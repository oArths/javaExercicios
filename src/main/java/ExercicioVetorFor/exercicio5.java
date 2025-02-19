package ExercicioVetorFor;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        ArrayList<Integer> users = new ArrayList<>();
        ArrayList<Integer> senhas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            users.add(i );
            senhas.add(i + 1);
        }

        System.out.println("Digite seu numero de Usuario");
        int userInput = sc.nextInt();

        if (users.contains(userInput)) {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Digite sua senha");
                int senhaInput = sc.nextInt();
                if (i == 3) {
                    System.out.println("Acesso negado");
                    break;
                }
                if (senhas.contains(senhaInput) && users.indexOf(userInput) == senhas.indexOf(senhaInput)) {
                    System.out.println("login efetuado");
                    break;
                }
            }
        }


    }
}
