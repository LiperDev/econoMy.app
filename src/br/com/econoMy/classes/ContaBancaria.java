package br.com.econoMy.classes;

import java.util.ArrayList;

public class ContaBancaria extends Usuario {
    private int senhaDaConta = 2856113;
    private double saldoAtual;
    private double deposito;
    private int chavePix = 48829951;
    private final ArrayList<Double> historicoDeDeposito = new ArrayList<Double>();
    private final ArrayList<Double> historicoDeTransferencias = new ArrayList<Double>();
    private final ArrayList<Integer> historicoAvaliacoes = new ArrayList<Integer>();
    private int mediaDasAvaliacoes;
    private int somaDasAvaliacoes;
    private int quantidadeDeAvaliacoes;

    public void exibeMensagemDeBoasVindas() {
        System.out.println("Seja bem-vindo ao aplicativo econoMy!");
    }

    public void exibeBoasVindasAoUsuarioDaConta() {
        System.out.println("Seja bem-vindo(a), " + getNome());
    }

    public void exibeProcedimentoInicial() {
        intervaloNivelMedio();
        System.out.println("Primeiros passos para criar sua conta!");
        intervaloNivelMenor();
        System.out.println("| 1 - Insira o seu nome ");
        System.out.println("| 2 - Insira a sua idade ");
    }

    public void verificaSenha(int senha) {
        if (senha == this.senhaDaConta) {
            intervaloNivelMenor();
            System.out.println("Senha correta!");
        } else {
            intervaloNivelMenor();
            System.out.println("Senha incorreta!");
        }
    }

    public void transfereUmValorDaConta(double valorInformado) {
        if (valorInformado > this.saldoAtual) {
            intervaloNivelMedio();
            System.out.println("Saldo menor que o valor que deseja transferir!");
        } else if (valorInformado == this.saldoAtual) {
            System.out.println("Transferência realizada, " + getNome());
            this.saldoAtual = this.saldoAtual - valorInformado;
            historicoDeTransferencias.add(valorInformado);
        } else {
            System.out.println("Transferência realizada, " + getNome());
            this.saldoAtual = this.saldoAtual - valorInformado;
            historicoDeTransferencias.add(valorInformado);
        }
    }

    public void adicionaUmValorAConta(double valorInformado) {
        this.saldoAtual = this.saldoAtual + valorInformado;
    }

    public void adicionaUmValorAoHistoricoDeDepositos(double valorInformado) {
        historicoDeDeposito.add(valorInformado);
    }

    public void avaliacao(int avaliacao) {
        this.historicoAvaliacoes.add(avaliacao);
        this.somaDasAvaliacoes = this.somaDasAvaliacoes + avaliacao;
        this.quantidadeDeAvaliacoes++;
    }

    public void exibirMediaDasAvaliacoes() {
        if (this.quantidadeDeAvaliacoes > 0) {
            this.mediaDasAvaliacoes = (this.somaDasAvaliacoes / this.quantidadeDeAvaliacoes);
            System.out.println("média das avaliações: " + getMediaDasAvaliacoes());
        } else {
            System.out.println("Nenhuma avaliação realizada no momento.");
        }
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

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public int getChavePix() {
        return chavePix;
    }

    public ArrayList<Double> getHistoricoDeDeposito() {
        return historicoDeDeposito;
    }

    public ArrayList<Double> getHistoricoDeTransferencias() {
        return historicoDeTransferencias;
    }

    public ArrayList<Integer> getAvaliacao() {
        return this.historicoAvaliacoes;
    }

    public int getMediaDasAvaliacoes() {
        return mediaDasAvaliacoes;
    }

    public void setMediaDasAvaliacoes(int mediaDasAvaliacoes) {
        this.mediaDasAvaliacoes = mediaDasAvaliacoes;
    }

    public int getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public void setSomaDasAvaliacoes(int somaDasAvaliacoes) {
        this.somaDasAvaliacoes = somaDasAvaliacoes;
    }

    public int getQuantidadeDeAvaliacoes() {
        return quantidadeDeAvaliacoes;
    }

    public void setQuantidadeDeAvaliacoes(int quantidadeDeAvaliacoes) {
        this.quantidadeDeAvaliacoes = quantidadeDeAvaliacoes;
    }
}
