package ExercicioVetor;

// //SEM O USO DO FOR CRIEI UM VETOR COM 5 NOMES E CRIE TAMBEM UM VETOR DE 5 // UNIDADES IMPRIMA A MENSAGEM
// "A pessoa {nome} possui a idade {anos}". // apos terminar refaça a impreção utilizando o for para interar entre os vetores
public class exercicio5 {
    public static void main(String[] args) {

        String[] nomes = {"Arthur", "Bernado", "Lucas", "Luis", "Maria"};
        int[] idades = {12, 45, 64, 46, 67};
        System.out.println("A pessoa " + nomes[0] + " possui a idade " + idades[0]);
        System.out.println("A pessoa " + nomes[1] + " possui a idade " + idades[1]);
        System.out.println("A pessoa " + nomes[2] + " possui a idade " + idades[2]);
        System.out.println("A pessoa " + nomes[3] + " possui a idade " + idades[3]);
        System.out.println("A pessoa " + nomes[4] + " possui a idade " + idades[4]);
        System.out.println("************************************************");
        for (
                int i = 0;
                i <= 4; i++) {
            System.out.println("A pessoa " + nomes[i] + " possui a idade " + idades[i]);
        }
    }

}
