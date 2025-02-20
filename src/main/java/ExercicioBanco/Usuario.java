package ExercicioBanco;

import java.util.Scanner;

public class Usuario {

    private String nome;
    private String cpf;
    private String senha;
    private double saldo;
    private double divida;
    private int contaNumero;

    public Usuario(String nome, String senha, String cpf, double saldo, double divida, int contaNumero) {
        this.nome = nome;
        this.senha = senha;
        this.cpf = cpf;
        this.saldo = saldo;
        this.divida = (divida > 0) ? divida : 0.0;
        this.contaNumero = contaNumero;

    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getSenha() {
        return senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getDivida() {
        return divida;
    }

    public int getContaNumero() {
        return contaNumero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setDivida(double divida) {
        this.divida = divida;
    }

    public void transferir(Usuario destinatario, double valor) {
        if (this.saldo < valor) {
            System.out.println("Saldo insuficiente.");
            return;
        }
        this.saldo -= valor;
        destinatario.saldo += valor;
        System.out.println("Transferência de R$ " + valor + " para " + destinatario.getNome() + " realizada com sucesso!");
    }

    public void solicitarEmprestimo(double valor) {
        if (valor > 100000) {
            System.out.println("Empréstimo não pode ser maior que R$ 100.000,00.");
            return;
        }
        this.saldo += valor;
        this.divida += valor;
        System.out.println("Empréstimo de R$ " + valor + " realizado com sucesso!");
    }

    public void consultarSaldo() {
        System.out.println("Saldo: R$ " + this.saldo);
        System.out.println("Dívida: R$ " + this.divida);
    }

    public boolean realizarLogin(String nome, String senha) {
        return this.nome.equals(nome) && this.senha.equals(senha);
    }
    public void pagarDivida(int op){
        Scanner sc = new Scanner(System.in);
        switch (op){
            case 1:
                if(this.saldo < this.divida){
                    System.out.println("Saldo insuficiente para pagar a divida");
                }
                else{
                    this.saldo -= this.divida;
                    System.out.println("Divida paga, novo saldo R$"+this.saldo);
                }
                break;
            case 2:
                System.out.println("Digite o valor de Deposito");
                double dep = sc.nextInt();
                sc.nextLine();
                this.divida -=  dep;
                System.out.println( "Divida paga");
                break;
            default:
                System.out.println("Escolha uma opção valida");
        }
    }
}

