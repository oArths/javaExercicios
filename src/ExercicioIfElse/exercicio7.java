package ExercicioIfElse;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" 1 - Questão a)\n 2 - Questão a.a)\n 3 - Questão b)\n 4 - Questão c)");
        System.out.println("Digite o numero da sua opção:");
        int op = sc.nextInt();

        switch (op) {
            case 1:
                ExercicioA(args);
                break;
            case 2:
                ExercicioAA(args);
                break;
            case 3:
                ExercicioB(args);
                break;
            case 4:
                ExercicioC(args);
                break;
            default:
                System.out.println("escolha uma opção valida");

        }


    }

    public static void ExercicioA(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua nota:");
        int nota = sc.nextInt();
        if (nota >= 50) {
            System.out.println("Aprovado");
            return;
        }
        System.out.println("Reprovado");

    }

    public static void ExercicioAA(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua nota:");
        int nota = sc.nextInt();

        if (nota >= 30 && nota < 50) {
            System.out.println("Recuperação");
            return;
        } else if (nota >= 50) {
            System.out.println("Aprovado");
            return;
        }
        System.out.println("Reprovado");
    }

    public static void ExercicioB(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua nota:");
        int nota = sc.nextInt();
        System.out.println("Digite a quantidade de horas do curso");
        int horas = sc.nextInt();

        System.out.println("Digite a quantidade de faltas:");
        int faltas = sc.nextInt();
        int freq = 1 - faltas / horas;

        if (nota > 50 && freq > 0.75) {
            System.out.println("Aprovado");
            return;
        }
        System.out.println("Reprovado");


    }

    public static void ExercicioC(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digote o nome da sua escola");
        String escola = sc.nextLine();
        System.out.println("Digite a quantidade de horas do curso");
        int horas = sc.nextInt();
        System.out.println("Digite a quantidade de faltas:");
        int faltas = sc.nextInt();
        int freq = 1 - faltas / horas;

        switch (escola) {
            case "HRC":
                if (freq < 0.50) {
                    System.out.println("Reprovado");
                    break;
                }
                return;
            default:
                if (freq < 0.40) {
                    System.out.println("Reprovado");
                    break;
                }
                return;
        }
        System.out.println("Digite sua nota:");
        int nota = sc.nextInt();
        System.out.println("Digote seu nome");
        String nome = sc.nextLine();

        if (nota > 70) {
            System.out.println("Aluno " + nome + " foi aprovado!");
        } else if (nota >= 30 && nota < 50) {
            System.out.println("O aluno" + nome + " esta de recuperação");
        } else if (nota >= 50 && nota < 70) {
            System.out.println("O aluno" + nome + " esta de exame");
        } else {
            System.out.println("o aluno" + nome + "esta reprovado");
        }


    }
}
