package ExercicioIfElse;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu email:");
        String email = sc.nextLine();
        int inicio, fim;

        inicio = email.indexOf("@");
        fim = email.lastIndexOf(".");
        if (inicio == -1) {
            System.out.println("Digite um email valido");
            return;
        }
        System.out.println("Seu servidor de email é " + email.substring(inicio, fim));

    }
}
