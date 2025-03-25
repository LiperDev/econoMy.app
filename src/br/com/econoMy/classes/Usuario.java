package br.com.econoMy.classes;
import static br.com.econoMy.classes.IntervalosAplicacao.intervaloNivelMedio;

public class Usuario {
    private String nome;
    private int idadeDoUsuario;


    public void exibeMensagemDeBoasVindas() {
        System.out.println("Seja bem-vindo ao aplicativo econoMy!");
    }

    public void exibeProcedimentoInicial() {
        IntervalosAplicacao.intervaloNivelMedio();
        System.out.println("Primeiros passos para criar sua conta!");
        IntervalosAplicacao.intervaloNivelMenor();
        System.out.println("| 1 - Insira o seu nome; ");
        IntervalosAplicacao.intervaloNivelMenor();
        System.out.println("| 2 - Insira a sua idade. ");
        IntervalosAplicacao.intervaloNivelMenor();
    }

    public void olaTudoBem() {
        System.out.println("Olá, " + getNome() + ", tudo bem?");
    }

    public void idadeInformada() {
        System.out.println("Idade informada: " + getIdadeDoUsuario());
    }

    public void exibeBoasVindasAoUsuarioDaConta() {
        System.out.println("Seja bem-vindo(a), " + getNome());
    }

    public void verificaIdadePermitida(int idade) {
        if (idade <= 0) {
            intervaloNivelMedio();
            System.out.println("Idade inválida!");
        } else if (idade < 18) {
            intervaloNivelMedio();
            System.out.println("Idade não permitida!");
        } else {
            intervaloNivelMedio();
            System.out.println("Idade permitida!");
            this.idadeDoUsuario = idade;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdadeDoUsuario() {
        return idadeDoUsuario;
    }

    public void setIdadeDoUsuario(int idadeDoUsuario) {
        this.idadeDoUsuario = idadeDoUsuario;
    }
}
