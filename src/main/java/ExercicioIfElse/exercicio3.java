package ExercicioIfElse;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome do funcionaio: ");
        String nome = sc.nextLine();
        System.out.println("Salário do Funcionário: ");
        int salario  = sc.nextInt();
        System.out.println("Vendas Totais do Funcionário: ");
        int vendasF = sc.nextInt();
        System.out.println("Vendas Totais da Empresa: ");
        int vendasE = sc.nextInt();
        int bonus = 0;

        if(vendasE >= 200000 && vendasF >= 30000 ){
            bonus = salario / 5;
            System.out.println("Parabéns "+nome+"! Você dobrou a meta! ");

        } else if (vendasE >= 200000 &&  vendasF >= 15000 ) {
            bonus = salario / 10;
            System.out.println("Parabéns "+nome+"! Você cumpriu a meta! ");
        }
        salario = salario + bonus;
        System.out.println("Seu salário esse mês foi de: R$ "+salario);
    }
}
