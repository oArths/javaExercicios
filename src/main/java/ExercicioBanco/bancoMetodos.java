package ExercicioBanco;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class bancoMetodos {

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
        System.out.println("CADASTRO:");
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
        Login(usuarios);
    }

    public static void Login(ArrayList<Usuario> usuarios) {
        Scanner sc = new Scanner(System.in);
        int tentativa = 0;
        while (tentativa < 3) {
            System.out.println("LOGIN:");
            System.out.println("Digite o nome do usuario: ");
            String nome = sc.nextLine();
            System.out.println("Digite sua senha: ");
            String senha = sc.nextLine();


            for (Usuario usuario : usuarios) {
                if (usuario.realizarLogin(nome, senha)) {
                    System.out.println("Login efetuado com sucesso!");
                    Conta(usuario, usuarios);
                    return;
                }
            }
            tentativa++;
            System.out.println("Login incorreto. Tentativas restantes: " + (3 - tentativa));
        }
        System.out.println("Número máximo de tentativas atingido. Acesso negado.");
    }

    public static Usuario encontrarUsuarioPorConta(ArrayList<Usuario> usuarios, int numeroConta) {
        for (Usuario usuario : usuarios) {
            if (usuario.getContaNumero() == numeroConta) {
                return usuario;
            }
        }
        return null;
    }

    public static void Conta(Usuario usuario, ArrayList<Usuario> usuarios) {

        Scanner sc = new Scanner(System.in);
        int opc = 0;
        do {
            System.out.println("O que deseja fazer?\n 1 - Tranferencia para outro usuario\n 2 - Emprestimo\n 3 - Consultar Saldo\n 4 - Pagar divida \n 5 - Sair ");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Digite o número da conta do destinatário: ");
                    int numeroConta = sc.nextInt();
                    Usuario destinatario = encontrarUsuarioPorConta(usuarios, numeroConta);

                    if (destinatario != null) {
                        System.out.println("Digite o valor a ser transferido: ");
                        double valor = sc.nextDouble();
                        usuario.transferir(destinatario, valor);
                    } else {
                        System.out.println("Destinatário não encontrado.");
                    }
                    break;
                case 2:
                    System.out.println("Digite o valor do empréstimo: ");
                    double valorEmprestimo = sc.nextDouble();
                    usuario.solicitarEmprestimo(valorEmprestimo);
                    break;
                case 3:
                    usuario.consultarSaldo();
                    break;
                case 4 :
                    System.out.println("Deseja pagar divida com\n 1 - Saldo\n 2 - Deposito");
                    int op = sc.nextInt();
                    usuario.pagarDivida(op);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opc != 4);
    }


}


