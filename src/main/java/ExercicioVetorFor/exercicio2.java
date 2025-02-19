package ExercicioVetorFor;

import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[4];
        for (int i = 0; i <= 3; i++) {
            int num = i + 1;
            System.out.println("Digite o " + num + "°nome:");
            nomes[i] = sc.nextLine();
        }
        for (int i = 0; i <= 3; i++){
            System.out.println("Bom dia "+nomes[i]);
        }
    }
}
