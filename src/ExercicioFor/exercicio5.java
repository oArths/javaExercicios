package ExercicioFor;

public class exercicio5 {
    public static void main(String[] args) {
        int bonus = 0;
        for (int i = 700; i >= 640; i -= 7) {
            if (i % 2 == 0) {
                bonus = i * 4;
                System.out.println("Funcionário " + i + " Receberá R$ " + bonus + ",00 de Bônus");
            } else {

                System.out.println("Funcionário " + i + " Receberá R$ " + i+ ",00 de Bônus");
            }
        }

    }
}
