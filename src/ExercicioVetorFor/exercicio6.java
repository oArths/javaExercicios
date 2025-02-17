package ExercicioVetorFor;

import java.util.ArrayList;

public class exercicio6 {
    static class Produto {
        double preco;
        String nome;


        public Produto(double preco, String nome) {
            this.preco = preco;
            this.nome = nome;
        }
    }

    public static void main(String[] args) {

        ArrayList<Produto> carrefaur = new ArrayList<>();
        ArrayList<Produto> almarti = new ArrayList<>();

        carrefaur.add(new Produto(12.3, "banana"));


        System.out.println(almarti);
    }
}
