package ExercicioIfElse;

import java.util.Scanner;

//Pergunte o salário de um funcionário qualquer e verifique se ele paga imposto de renda.
public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira seu salario:");
        double salario = sc.nextDouble();
        double salarioImposto = 2259.21;

        if( salario > salarioImposto){
            System.out.println("Voce ira pagar imposto");

        }else{
            System.out.println("Voce não ira pecisar pagar imposto");
        }

    }
}
