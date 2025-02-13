package ExercicioVetor;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        String[] nomes = new String[4];
        for (int i =0 ; i <=3;  i++){
            System.out.println("Informe seu Nome:");
            nomes[i] = sc.nextLine();
        }
        for (int i = 0; i<=3; i++ ){
            System.out.println(i+1 +" - "+nomes[i]);
        }
    }
}
