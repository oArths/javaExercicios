import java.util.Scanner;

//Crie um programa que, pergunte a nota de um aluno e verifique se ele passou na nota de corte (acima de 50)
public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira sua nota");
        int nota = sc.nextInt();

        if (nota > 50) {
            System.out.println("Parabens, você foi aprovado");

        } else {
            System.out.println("infelizmente, você não foi aprovado");
        }

    }
}