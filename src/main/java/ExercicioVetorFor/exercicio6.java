package ExercicioVetorFor;

import com.google.gson.Gson;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

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
        for (int i = 1; i <= 5; i++) {
            String name = "produto " + i;
            double priceCa = ThreadLocalRandom.current().nextDouble(i * Math.random(), i * Math.random() * 10);
            carrefaur.add(new Produto(priceCa, name));
            double priceAl = ThreadLocalRandom.current().nextDouble(i * Math.random(), i * Math.random() * 10);
            almarti.add(new Produto(priceAl , name));
        }

        for (int i = 0; i <= 4; i++) {
            DecimalFormat formato = new DecimalFormat("#.00");
            Double carrefurPreco = carrefaur.get(i).preco;
            Double almartiPreco = almarti.get(i).preco;
            if (carrefurPreco > almartiPreco) {
                System.out.println("O " + carrefaur.get(i).nome + "Custa R$ " + formato.format(carrefaur.get(i).preco) + " sendo mais barato no Carrefur");
            } else if (carrefurPreco < almartiPreco) {
                System.out.println("O " + almarti.get(i).nome + "Custa R$ " + formato.format(almarti.get(i).preco) + " sendo mais barato no Almarti");
            } else {
                System.out.println("O " + carrefaur.get(i).nome + " e " + almarti.get(i).nome + " custam o mesmo valor: R$ " + formato.format(carrefaur.get(i).preco) + ".");
            }
           // String json = gson.toJson(carrefaur.get(i));
           // System.out.println(json);

        }
    }
}