package ExercicioVetorFor;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha uma forma de Resolução:");
        System.out.println("1 - Padrão\n" + "2 - ArrayList");
        int op = sc.nextInt();

        switch (op) {
            case 1:
                solucao1(args);
                break;
            case 2:
                solucao2(args);
                break;
            default:
                System.out.println("Digite uma opção valida");
                break;

        }
    }

    public static void solucao1(String[] args) {
        String[] sabores = {"sabor1", "sabor2", "sabor3", "sabor4", "sabor5", "", "", "", "", ""};
        Double[] precos = {12.2, 43.5, 5.6, 2.3, 54.6, 1.1, 1.1, 1.1, 1.1, 1.1};
        Scanner sc = new Scanner(System.in);
        for (int i = 5; i <= 9; i++) {
            System.out.println("Digite o sabor da sua Pizza");
            sabores[i] = sc.nextLine();
            System.out.println("Digite o valor da Pizza");
            precos[i] = sc.nextDouble();
            sc.nextLine();
        }
        for (int i = 0; i <= 9; i++) {
            System.out.println("Pizza do sabor " + sabores[i] + " é vendida a R$" + precos[i]);
        }
    }

    public static void solucao2(String[] args) {
        ArrayList<String> sabores = new ArrayList<>();
        ArrayList<Double> precos = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            sabores.add("sabor" + i);
           // double random = ThreadLocalRandom.current().nextDouble(i, i * 10);
            precos.add(i * 2.2);
        }
        Scanner sc = new Scanner(System.in);
        for (int i = 5; i <= 9; i++) {
            System.out.println("Digite o sabor da sua Pizza");
            sabores.add(sc.nextLine());
            System.out.println("Digite o valor da Pizza");
            precos.add(sc.nextDouble());
            sc.nextLine();
        }
        for (int i = 0; i <= 9; i++) {
            System.out.println("Pizza do sabor " + sabores.get(i) + " é vendida a R$" + precos.get(i));
        }

    }

}
