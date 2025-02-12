import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua unidade:");
        String uni = sc.nextLine();
        System.out.println("Digite sua nota:");
        int nota = sc.nextInt();
        System.out.println("Digite sua Frequencia:");
        int freq = sc.nextInt();
        int aulas = 80;
        if (freq > (0.75 * aulas)) {
            switch (uni) {
                case "villa alpina":
                    if (nota > 60) {
                        System.out.println("Parabéns! Você foi aprovado com uma nota de " + nota);
                    } else {
                        System.out.println("Nota baixa. Reprovado");
                    }
                    break;
                case "mooca":
                    if (nota > 50) {
                        System.out.println("Parabéns! Você foi aprovado com uma nota de " + nota);
                    } else {
                        System.out.println("Nota baixa. Reprovado");
                    }
                    break;
                default:
                    System.out.println("Unidade não econtrada, digite novamente");
            }
        } else {
            System.out.println("A frequência mínima não foi atingida. O aluno está reprovado.");
        }


    }
}
