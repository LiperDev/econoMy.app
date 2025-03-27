package br.com.econoMy.classes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Historicos extends ContaBancaria{
    private List<Double> historicoDeDeposito = new ArrayList<Double>();
    private List<Double> historicoDeTransferencias = new ArrayList<Double>();
    private List<Integer> historicoAvaliacoes = new ArrayList<Integer>();
    private ContaBancaria contaBancaria;
    private int mediaDasAvaliacoes;
    private int somaDasAvaliacoes;
    private int quantidadeDeAvaliacoes;

    public Historicos(ContaBancaria contaBancaria) {
        this.contaBancaria = contaBancaria;
    }

    public void adicionaUmValorAoHistoricoDeDepositos(double valorInformado) {
        historicoDeDeposito.add(valorInformado);
    }

    public void avaliacao(int avaliacao) {
        this.historicoAvaliacoes.add(avaliacao);
        this.somaDasAvaliacoes = this.somaDasAvaliacoes + avaliacao;
        this.quantidadeDeAvaliacoes++;
    }

    public void transfereUmValorDaConta(double valorInformado) {
        System.out.println("Saldo atual: " + contaBancaria.getSaldoAtual());
        if (valorInformado > contaBancaria.getSaldoAtual()) {
            IntervalosAplicacao.intervaloNivelMedio();
            System.out.println("Saldo insuficiente!");
        } else {
            System.out.println("Transferência realizada!");
            contaBancaria.setSaldoAtual(contaBancaria.getSaldoAtual() - valorInformado);
            historicoDeTransferencias.add(valorInformado);
        }
    }

    public void exibirMediaDasAvaliacoes() {
        if (this.quantidadeDeAvaliacoes > 0) {
            this.mediaDasAvaliacoes = (this.somaDasAvaliacoes / this.quantidadeDeAvaliacoes);
            System.out.println("média das avaliações: " + getMediaDasAvaliacoes());
        } else {
            System.out.println("O sistema não possui avaliações!");
            IntervalosAplicacao.intervaloNivelMenor();
        }
    }

    public void exibeRetorno() {
        System.out.println("Retornando ao menu...");
        IntervalosAplicacao.intervaloNivelMedio();
    }

    public void exibeChavePixAtual() {
        System.out.println("Exibindo a chave pix registrada ...");
        IntervalosAplicacao.intervaloNivelMedio();
        System.out.println("chave pix registrada: " + getChavePix());
        IntervalosAplicacao.intervaloNivelMedio();
    }

    public void exibeHistoricoDeTransferencia() {
        ordenaHistoricoDeTransferencias(this.historicoDeTransferencias);
        System.out.println("Exibindo histórico de transferências ...");
        IntervalosAplicacao.intervaloNivelMedio();
        System.out.println(this.historicoDeTransferencias);
        IntervalosAplicacao.intervaloNivelMedio();
    }

    public void exibeHistoricoDeDepositos() {
        ordenaHistoricoDeDepositos(this.historicoDeDeposito);
        System.out.println("Exibindo histórico de depósitos ...");
        IntervalosAplicacao.intervaloNivelMedio();
        System.out.println(this.historicoDeDeposito);
        IntervalosAplicacao.intervaloNivelMedio();
    }

    // metodo que ordenará todos os itens do histórico de depósito
    private void ordenaHistoricoDeDepositos(List<Double> historicoDeposito) {
        Collections.sort(historicoDeposito);
    }

    // metodo que ordenará todos os itens do histórico de transações
    private void ordenaHistoricoDeTransferencias(List<Double> historicoTransferencia) {
        Collections.sort(historicoTransferencia);
    }

    public int getMediaDasAvaliacoes() {
        return mediaDasAvaliacoes;
    }
}
