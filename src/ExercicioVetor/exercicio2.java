package ExercicioVetor;

public class exercicio2 {
    public static void main(String[] args) {
        double[] num = new double[3];
        num[0] = 1.1;
        num[1] = 2.1;
        num[2] = 3.1;
        double media = num[0]+num[1]+num[2]/3;
        System.out.println("a media é "+ String.format("%.2f",media));
    }
}
