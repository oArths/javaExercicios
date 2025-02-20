package ExercicioFuncoes;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        aniversario();
    }

    public static void aniversario() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String name = sc.nextLine();
        System.out.println("Feliz aniversário "+name);

    }
}
