package br.com.econoMy.classes;
import static br.com.econoMy.classes.IntervalosAplicacao.intervaloNivelMedio;
import static br.com.econoMy.classes.IntervalosAplicacao.intervaloNivelMenor;

public class Usuario {
    private String nome;
    private int idadeDoUsuario;


    public void exibeMensagemDeBoasVindas() {
        System.out.println("| Bem-vindo(a) ao EconoMy! |");
    }

    public void digiteNome() {
        System.out.print("Digite seu nome: ");
    }

    public void digiteIdade() {
        System.out.print("Digite sua idade: ");
    }

    public void exibeInformacaoSobreSenha() {
        IntervalosAplicacao.intervaloNivelMedio();
        System.out.println("Agora informe a senha da sua conta!");
        IntervalosAplicacao.intervaloNivelMedio();
        System.out.println("Somente números, por favor.");
        IntervalosAplicacao.intervaloNivelMedio();
    }

    public void informeIdade() {
        System.out.println("Você é de maior? Informe sua idade abaixo!");
    }

    public void olaTudoBem() {
        System.out.println("Olá, " + getNome() + ", tudo bem?");
    }

    public void idadeInformada() {
        System.out.println("Idade informada: " + getIdadeDoUsuario());
        IntervalosAplicacao.intervaloNivelMedio();
        System.out.println("Verificando idade...");
        IntervalosAplicacao.intervaloNivelMedio();
    }

    public void exibeBoasVindasAoUsuarioDaConta() {
        System.out.println("Seja bem-vindo(a), " + getNome());
    }

    public void carregandoMenu() {
        System.out.println("Exibindo menu...");
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
