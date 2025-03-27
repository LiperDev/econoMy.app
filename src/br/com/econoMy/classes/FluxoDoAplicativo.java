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

    public static void valorInvalido() {
        System.out.println("Valor inválido!");
    }

    public static void opcaoInvalida() {
        System.out.println("Opção inválida!");
    }

    public static void senhaInvalida() {
        System.out.println("Senha inválida!");
    }

    public static void chaveInvalida() {
        System.out.println("Chave pix incorreta!");
    }
}
