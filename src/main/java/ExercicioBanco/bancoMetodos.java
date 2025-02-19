package ExercicioBanco;

import org.example.Main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class bancoMetodos {

    public static class Usuario {
        String nome;
        String cpf;
        String senha;
        Double saldo;
        Double divida;
        int contaNumero;

        public Usuario(String nome, String senha, String cpf, Double saldo, Double divida, Integer contaNumero) {
            this.nome = nome;
            this.senha = senha;
            this.cpf = cpf;
            this.saldo = saldo;
            this.divida = (divida != null && divida >= 0) ? divida : 0.0;
            this.contaNumero = contaNumero;

        }
    }

    public static void main(String[] args) {

        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("João", "123456789", "233.342.243-12", 0.0, 3.3, 12345));
        usuarios.add(new Usuario("Maria", "987654321", "153.542.233-42", 500.0, 2324.23, 67890));
        Scanner sc = new Scanner(System.in);
        System.out.println("Possui Cadastro do Banco?\n 1 - Sim\n 2 - Nâo\n 3 - Sair ");
        int opc = sc.nextInt();
        switch (opc) {
            case 1:
                Login(usuarios);
                break;
            case 2:
                Cadastro(usuarios);
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Digite uma opção valida!");

        }

    }

    public static void Cadastro(ArrayList<Usuario> usuarios) {

        Scanner sc = new Scanner(System.in);
        String nome, cpf, clearCpf, senha;
        double saldo;
        int contaNumero;
        while (true) {
            System.out.println("Digite o nome do usuario: ");
            nome = sc.nextLine();
            if (nome.length() < 3) {
                System.out.println("Digite um nome valido");
            } else {
                break;
            }

        }
        while (true) {
            System.out.println("Digite sua senha entre 6 e 8 caracteres: ");
            senha = sc.nextLine();
            if (senha.length() < 6 || senha.length() > 8) {
                System.out.println("Digite uma senha valida");
            } else {
                break;
            }

        }
        while (true) {
            System.out.println("Digite o numero de CPF: ");
            cpf = sc.nextLine();
            clearCpf = cpf.replaceAll("[^0-9]", "");
            if (clearCpf.length() != 11) {
                System.out.println("Digite um CPF valido");
            } else {
                break;
            }

        }
        System.out.println("Digite um Saldo inicial: ");
        saldo = sc.nextDouble();
        Random gerador = new Random();
        contaNumero = gerador.nextInt((9999 - 1000) + 1) + 1000;
        usuarios.add(new Usuario(nome, senha, cpf, saldo, 0.0, contaNumero));
        String[] args = {};
        main(args);
    }

    public static void Login(ArrayList<Usuario> usuarios) {
        Scanner sc = new Scanner(System.in);
        int tentativa = 0;
        while (tentativa < 3) {
            boolean userEncontrado = false;
            boolean senhaCorreta = false;
            int index = -1;

            System.out.println("Digite o nome do usuario: ");
            String nome = sc.nextLine();
            System.out.println("Digite sua senha: ");
            String senha = sc.nextLine();


            for (int i = 0; i < usuarios.size(); i++) {
                Usuario usuario = usuarios.get(i);
                if (usuario.nome.equals(nome) && usuario.senha.equals(senha)) {
                    userEncontrado = true;
                    senhaCorreta = true;
                    index = i;
                    break;
                }
            }
            if (userEncontrado && senhaCorreta) {
                System.out.println("Login efetuado");

                Conta(index, usuarios.get(index), usuarios);
                break;
            } else {
                tentativa++;
                if (tentativa >= 3) {
                    System.out.println("Acesso negado. Número máximo de tentativas atingido.");
                    break;
                } else {
                    System.out.println("Login incorreto. Você tem " + (3 - tentativa) + " tentativas restantes.");
                }
            }


        }
    }

    public static void Conta(int index, Usuario usuario, ArrayList<Usuario> usuarios) {

        Scanner sc = new Scanner(System.in);
        System.out.println("O que deseja fazer?\n 1 - Tranferencia para outro usuario\n 2 - Emprestimo\n 3 - Sair ");
        int opc = sc.nextInt();
        if (opc == 1) {
            System.out.println("Digite o valor a ser tranferido: ");
            double valor = sc.nextDouble();
            if (usuario.saldo < valor) {
                System.out.println("Saldo insuficiente, Deseja fazer um emprestimo?\n 1 - Sim\n 2 - Não ");
                opc = sc.nextInt();
                if (opc != 1) {
                    System.exit(0);
                }
                System.out.println("Digite o valor do Emprestimo: ");
                double empres = sc.nextDouble();
                if (empres > usuario.divida || empres > 100000) {
                    System.out.println("Não é possivel fazer um emrestimo maior que a divida que você ja detem ou maior que R$ 10.0000,00");
                    System.exit(0);
                }
                usuarios.get(index).saldo = usuario.saldo + empres;
                System.out.println("Emprestimo de R$ " + empres + " efetuado com sucesso!");
            }
            int reciveUser;
            int reciveIndex = -1;
            while (true) {

                System.out.println("Digite o numero da conta do usuario que ira receber: ");
                reciveUser = sc.nextInt();


                for (int i = 0; i < usuarios.size(); i++) {
                    if (usuarios.get(i).contaNumero == reciveUser) {
                        reciveIndex = i;
                        break;
                    }
                }
                if (reciveIndex == -1) {
                    System.out.println("Usuario não encontrado");
                } else {
                    break;
                }
            }
            Usuario usuarioRecive = usuarios.get(reciveIndex);
            usuarioRecive.saldo = usuarioRecive.saldo + valor;
            System.out.println("Envio de R$ " + usuarioRecive.saldo + " finalizado com sucesso!");


        }
    }
}
