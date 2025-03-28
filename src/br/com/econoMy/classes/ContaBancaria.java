package br.com.econoMy.classes;

// Área da conta bancária

public class ContaBancaria {
    private int senhaDaConta = 1;
    private double saldoAtual;
    private int chavePix = 1;

    // Metodo que irá verificar se a senha informada como argumento é igual a senha padrão do sistema

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
        IntervalosAplicacao.intervaloNivelMenor();
    }

    public void exibeDepositoSucesso(double valorADepositar) {
        System.out.println("Valor depositado em sua conta: " + valorADepositar);
    }

    public void adicionaUmValorAConta(double valorInformado) {
        this.saldoAtual = this.saldoAtual + valorInformado;
    }

    public void trocaDeSenha(int senhaInformada) {
        if (senhaInformada == this.senhaDaConta) {
            System.out.println("Senha idêntica!");
            IntervalosAplicacao.intervaloNivelMenor();
            System.out.println("Não foi possível efetuar a troca");
        } else {
            this.senhaDaConta = senhaInformada;
            System.out.println("Troca de senha bem sucedida!");
        }
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
