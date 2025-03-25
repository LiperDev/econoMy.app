package br.com.econoMy.classes;

public class ContaBancaria {
    private int senhaDaConta = 6541;
    private double saldoAtual;;
    private int chavePix = 1251;


    public void verificaSenha(int senha) {
        if (senha == this.senhaDaConta) {
            IntervalosAplicacao.intervaloNivelMenor();
            System.out.println("Senha correta!");
            IntervalosAplicacao.intervaloNivelMenor();
            System.out.println("Entrando na sua conta ...");
            IntervalosAplicacao.intervaloNivelMenor();
            System.out.println("Aguarde ...");
            IntervalosAplicacao.intervaloNivelMenor();
            System.out.println("Entrou!");
        } else {
            IntervalosAplicacao.intervaloNivelMenor();
            System.out.println("Senha incorreta!");
        }
    }

    public void exibeSaldoAtual() {
        System.out.println("Seu saldo atual é: " + getSaldoAtual());
    }

    public void exibeDepositoSucesso(double valorADepositar) {
        System.out.println("Valor depositado em sua conta: " + valorADepositar);
    }

    public void adicionaUmValorAConta(double valorInformado) {
        this.saldoAtual = this.saldoAtual + valorInformado;
    }

    public void trocaDeSenha(int senhaInformada) {
        this.senhaDaConta = senhaInformada;
    }

    public void trocaDeChavePix(int chaveInformada) {
        this.chavePix = chaveInformada;
    }

    public int getSenhaDaConta() {
        return senhaDaConta;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public int getChavePix() {
        return chavePix;
    }
}
