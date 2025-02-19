package ExercicioFor;

import java.util.Scanner;


public  class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Descubra seu Signo");
            System.out.println("Digite o mes que nasceu: ex 01,02..");
            String mes = sc.nextLine();

            switch (mes) {
                case "01":
                    System.out.println("Seu signo é Capricórnio.");
                    break;
                case "02":
                    System.out.println("Seu signo é Aquário.");
                    break;
                case "03":
                    System.out.println("Seu signo é Peixes.");
                    break;
                case "04":
                    System.out.println("Seu signo é Áries.");
                    break;
                case "05":
                    System.out.println("Seu signo é Touro.");
                    break;
                case "06":
                    System.out.println("Seu signo é Gêmeos.");
                    break;
                case "07":
                    System.out.println("Seu signo é Câncer.");
                    break;
                case "08":
                    System.out.println("Seu signo é Leão.");
                    break;
                case "09":
                    System.out.println("Seu signo é Virgem.");
                    break;
                case "10":
                    System.out.println("Seu signo é Libra.");
                    break;
                case "11":
                    System.out.println("Seu signo é Escorpião.");
                    break;
                case "12":
                    System.out.println("Seu signo é Sagitário.");
                    break;
                default:
                    System.out.println("Insira um mes valido");
            }
        }
    }
}

