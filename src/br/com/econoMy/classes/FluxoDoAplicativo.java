package br.com.econoMy.classes;

public class FluxoDoAplicativo {

    public static void setoresBemVindos(SetorAplicativo setor) {
        switch (setor) {
            case SALDO -> System.out.println("Bem-vindo(a) ao setor de verificação de saldo!");
            case DEPOSITO -> System.out.println("Bem-vindo(a) ao setor de depósitos!");
            case TRANSFERENCIAS -> System.out.println("Bem-vindo(a) ao setor de transferências!");
            case HISTORICO_TRANSFERENCIA -> System.out.println("Bem-vindo(a) ao histórico de transferências!");
            case HISTORICO_DEPOSITO -> System.out.println("Bem-vindo(a) ao histórico de depósitos!");
            case VERIFICAR_CHAVE_REGISTRADA -> System.out.println("Bem-vindo(a) ao verificar chave registrada!");
            case AVALIACAO -> System.out.println("Bem-vindo(a) ao setor de avaliação!");
            case AVALIACAO_MEDIA -> System.out.println("Bem-vindo(a) ao verificar média de avaliações!");
            case TROCAR_CHAVE -> System.out.println("Bem-vindo(a) ao setor de troca de chave pix!");
            case TROCAR_SENHA -> System.out.println("Bem-vindo(a) ao setor de troca de senha de usuário!");
        }
    }

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
