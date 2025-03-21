package br.com.econoMy.classes;

// Responsável apenas por criar intervalos na aplicação

public class IntervalosAplicacao {
    private static final int INTERVALO_PEQUENO = 1000;
    private static final int INTERVALO_MEDIO = 2000;
    private static final int INTERVALO_ALTO = 2500;


    public static void intervaloNivelMenor() {
        try {
            Thread.sleep(INTERVALO_PEQUENO);
        } catch (InterruptedException e) {
            System.out.println("O intervalo foi interrompido!");
        }
    }

    public static void intervaloNivelMedio() {
        try {
            Thread.sleep(INTERVALO_MEDIO);
        } catch (InterruptedException e) {
            System.out.println("O intervalo foi interrompido!");
        }
    }

    public static void intervaloNivelAlto() {
        try {
            Thread.sleep(INTERVALO_ALTO);
        } catch (InterruptedException e) {
            System.out.println("O intervalo foi interrompido!");
        }
    }
}
