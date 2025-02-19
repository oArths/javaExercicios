package ExercicioVetorFor;

import com.google.gson.Gson;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

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
        Gson gson = new Gson();
        // Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            String name = "produto" + i;
            double price = i * 2;
            DecimalFormat formato = new DecimalFormat("#.##");
            carrefaur.add(new Produto(Double.parseDouble(formato.format(price)), name));
        }

        for (Produto produto : carrefaur) {

            String json = gson.toJson(produto);
            System.out.println(json);
        }
    }
}