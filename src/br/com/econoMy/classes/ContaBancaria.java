package br.com.econoMy.classes;

// Exibe saldo, verifica a senha do usuário.

public class ContaBancaria {
    private int senhaDaConta = 6541;
    private double saldoAtual;;
    private int chavePix = 1251;


    public void verificaSenha(int senha) {
        if (senha == this.senhaDaConta) {
            IntervalosAplicacao.intervaloNivelMenor();
            System.out.println("Senha correta!");
        } else {
            IntervalosAplicacao.intervaloNivelMenor();
            System.out.println("Senha incorreta!");
        }
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
