package br.com.econoMy.classes;

// Área focada em mensagens simples do fluxo do app, somente com métodos

public class FluxoDoAplicativo {
    private static final int OPCAO_SALDO = 1;
    private static final int OPCAO_DEPOSITO = 2;
    private static final int OPCAO_TRANSFERENCIAS = 3;
    private static final int OPCAO_HISTORICO_TRANSFERENCIA = 4;
    private static final int OPCAO_HISTORICO_DEPOSITO = 5;
    private static final int OPCAO_VERIFICAR_CHAVE_REGISTRADA = 6;
    private static final int OPCAO_AVALIACAO = 7;
    private static final int OPCAO_AVALIACAO_MEDIA = 8;
    private static final int OPCAO_TROCAR_CHAVE = 9;
    private static final int OPCAO_TROCAR_SENHA = 10;

    public static void setoresBemVindos(String setor) {
        switch (setor) {
            case "OPCAO_SALDO":
                System.out.println("Bem-vindo(a) ao setor de verificação de saldo!");
                IntervalosAplicacao.intervaloNivelMedio();
                break;
            case "OPCAO_DEPOSITO":
                System.out.println("Bem-vindo(a) ao setor de depósitos!");
                IntervalosAplicacao.intervaloNivelMedio();
                break;
            case "OPCAO_TRANSFERENCIAS":
                System.out.println("Bem-vindo(a) ao setor de transferências!");
                IntervalosAplicacao.intervaloNivelMedio();
                break;
            case "OPCAO_HISTORICO_TRANSFERENCIA":
                System.out.println("Bem-vindo(a) ao histórico de transferências!");
                IntervalosAplicacao.intervaloNivelMedio();
                break;
            case "OPCAO_HISTORICO_DEPOSITO":
                System.out.println("Bem-vindo(a) ao histórico de depósitos!");
                IntervalosAplicacao.intervaloNivelMedio();
                break;
            case "OPCAO_VERIFICAR_CHAVE_REGISTRADA":
                System.out.println("Bem-vindo(a) ao verificar chave registrada!");
                IntervalosAplicacao.intervaloNivelMedio();
                break;
            case "OPCAO_AVALIACAO":
                System.out.println("Bem-vindo(a) ao setor de avaliação!");
                IntervalosAplicacao.intervaloNivelMedio();
                break;
            case "OPCAO_AVALIACAO_MEDIA":
                System.out.println("Bem-vindo(a) ao verificar média de avaliações!");
                IntervalosAplicacao.intervaloNivelMedio();
                break;
            case "OPCAO_TROCAR_CHAVE":
                System.out.println("Bem-vindo(a) ao setor de troca de chave pix!");
                IntervalosAplicacao.intervaloNivelMedio();
                break;
            case "OPCAO_TROCAR_SENHA":
                System.out.println("Bem-vindo(a) ao setor de troca de senha de usuário!");
                IntervalosAplicacao.intervaloNivelMedio();
                break;
            default:
                System.out.println("Opção fora do fluxo do app!");
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
