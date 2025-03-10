package br.com.econoMy.classes;

public class Usuario {
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

    public void intervaloNivelMenor() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("O intervalo foi interrompido!");
        }
    }

    public void intervaloNivelMedio() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("O intervalo foi interrompido!");
        }
    }

    public void intervaloNivelAlto() {
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            System.out.println("O intervalo foi interrompido!");
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
