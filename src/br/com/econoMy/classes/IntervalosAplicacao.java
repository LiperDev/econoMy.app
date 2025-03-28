package br.com.econoMy.classes;

public class IntervalosAplicacao {

    public static void intervaloNivelMenor() {
        try {
            Thread.sleep(IntervaloValores.INTERVALO_PEQUENO.getValor());
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("O intervalo foi interrompido!");
        }
    }

    public static void intervaloNivelMedio() {
        try {
            Thread.sleep(IntervaloValores.INTERVALO_MEDIO.getValor());
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("O intervalo foi interrompido!");
        }
    }

    public static void intervaloNivelAlto() {
        try {
            Thread.sleep(IntervaloValores.INTERVALO_ALTO.getValor());
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("O intervalo foi interrompido!");
        }
    }
}
