package ExercicioString;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu Cpf para ser validado");
        String cpf = sc.nextLine();
        String clearCpf = cpf.replaceAll("[^0-9]", "");
        if (clearCpf.length() != 11) {
            System.out.println("Favor digitar somente números e onze dígitos.");
        return;
        }
        System.out.println("CPF valido");
    }
}
