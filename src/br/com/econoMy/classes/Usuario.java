package br.com.econoMy.classes;
import static br.com.econoMy.classes.IntervalosAplicacao.intervaloNivelMedio;
import static br.com.econoMy.classes.IntervalosAplicacao.intervaloNivelMenor;

public class Usuario {
    private String nome;
    private int idadeDoUsuario;


    public void exibeMensagemDeBoasVindas() {
        System.out.println("Seja bem-vindo ao aplicativo econoMy!");
    }

    public void exibeInformacaoNome() {
        System.out.println("[Digite o seu nome]");
    }

    public void exibeInformacaoSobreSenha() {
        System.out.println("| Agora, informe a senha da sua conta");
        intervaloNivelMenor();
        System.out.println("| Lembre-se: a senha não possui letras");
    }

    public void exibeInformacaoIdade() {
        System.out.println("Confirme que você é maior de idade");
        IntervalosAplicacao.intervaloNivelMedio();
        System.out.println("[Digite a sua idade]");
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
