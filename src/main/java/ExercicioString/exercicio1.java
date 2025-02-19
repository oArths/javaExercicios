package ExercicioString;

import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String name = sc.nextLine();
        System.out.println(name.toUpperCase());
    }
}
