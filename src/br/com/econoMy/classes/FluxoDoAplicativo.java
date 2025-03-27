package br.com.econoMy.classes;

public class FluxoDoAplicativo {

    public static void finalizando() {
        System.out.println("Finalizando a aplicação!");
        IntervalosAplicacao.intervaloNivelMedio();
    }

    public static void finaliza() {
        System.out.println("Finalizado!");
    }

    public static void retorna() {
        System.out.println("Retornando ao menu...");
        IntervalosAplicacao.intervaloNivelMedio();
    }

}
