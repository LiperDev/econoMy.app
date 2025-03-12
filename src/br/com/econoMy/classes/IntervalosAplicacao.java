package br.com.econoMy.classes;

// Adição de uma nova classe herdada por Usuário, responsabilidade de intervalos da aplicaçãoo
public class IntervalosAplicacao {
    private static final int INTERVALO_PEQUENO = 1000;
    private static final int INTERVALO_MEDIO = 2000;
    private static final int INTERVALO_ALTO = 2500;

    public void intervaloNivelMenor() {
        try {
            Thread.sleep(INTERVALO_PEQUENO);
        } catch (InterruptedException e) {
            System.out.println("O intervalo foi interrompido!");
        }
    }

    public void intervaloNivelMedio() {
        try {
            Thread.sleep(INTERVALO_MEDIO);
        } catch (InterruptedException e) {
            System.out.println("O intervalo foi interrompido!");
        }
    }

    public void intervaloNivelAlto() {
        try {
            Thread.sleep(INTERVALO_ALTO);
        } catch (InterruptedException e) {
            System.out.println("O intervalo foi interrompido!");
        }
    }
}
