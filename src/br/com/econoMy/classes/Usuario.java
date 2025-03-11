package br.com.econoMy.classes;

public class Usuario extends IntervalosAplicacao{
    private String nome;
    private int idadeDoUsuario;

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

    public int getIdade() {
        return idadeDoUsuario;
    }
}
