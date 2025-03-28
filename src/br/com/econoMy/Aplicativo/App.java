package br.com.econoMy.Aplicativo;
import br.com.econoMy.classes.*;
import br.com.econoMy.interfaces.IMenu;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        IMenu menuPrincipal = new MenuPrincipal();
        IMenu menuSair = new MenuSair();
        Usuario usuario = new Usuario();
        ContaBancaria conta = new ContaBancaria();
        Historicos historico = new Historicos(conta);

        String nomeDoUsuario;
        int idadeDoUsuario, senhaInformada, digiteOpcaoMenu, senhaAtualTroca, novaSenha, chaveAtualTroca, novaChave, opcaoSair;
        int tentativasDeTransferencias = 0;
        int avaliacaoDoEconomy;
        double valorADepositar, valorATransferir, chaveInformada;

        usuario.exibeMensagemDeBoasVindas();

        IntervalosAplicacao.intervaloNivelMedio();
        usuario.digiteNome();
        nomeDoUsuario = entrada.nextLine();

        usuario.setNome(nomeDoUsuario);
        IntervalosAplicacao.intervaloNivelMedio();
        usuario.olaTudoBem();

        usuario.informeIdade();
        IntervalosAplicacao.intervaloNivelMenor();
        usuario.digiteIdade();
        idadeDoUsuario = entrada.nextInt();

        usuario.setIdadeDoUsuario(idadeDoUsuario);
        usuario.idadeInformada();

        usuario.verificaIdadePermitida(idadeDoUsuario);
        if (idadeDoUsuario >= 18 && idadeDoUsuario <= 120) {

            usuario.exibeInformacaoSobreSenha();
            System.out.print("Informe sua senha: ");
            senhaInformada = entrada.nextInt();

            conta.verificaSenha(senhaInformada);

            if (senhaInformada == conta.getSenhaDaConta()) {

                IntervalosAplicacao.intervaloNivelMenor();
                usuario.exibeBoasVindasAoUsuarioDaConta();
                usuario.carregandoMenu();

                while (true) {

                    IntervalosAplicacao.intervaloNivelAlto();
                    menuPrincipal.exibeMenuDinamico();
                    menuPrincipal.campoDeDigitacao();
                    digiteOpcaoMenu = entrada.nextInt();

                    switch (digiteOpcaoMenu) {
                        case 1:
                            FluxoDoAplicativo.setoresBemVindos(SetorAplicativo.SALDO);
                            System.out.println("Exibindo saldo atual da conta ...");
                            IntervalosAplicacao.intervaloNivelMedio();
                            conta.exibeSaldoAtual();
                            FluxoDoAplicativo.retorna();

                            break;
                        case 2:
                            FluxoDoAplicativo.setoresBemVindos(SetorAplicativo.DEPOSITO);
                            IntervalosAplicacao.intervaloNivelMenor();
                            System.out.print("Digite o valor que deseja depositar: ");
                            valorADepositar = entrada.nextDouble();

                            if (valorADepositar <= 0) {
                                IntervalosAplicacao.intervaloNivelMenor();
                                FluxoDoAplicativo.valorInvalido();
                            } else {
                                conta.adicionaUmValorAConta(valorADepositar);
                                historico.adicionaUmValorAoHistoricoDeDepositos(valorADepositar);
                                IntervalosAplicacao.intervaloNivelMenor();
                                conta.exibeDepositoSucesso(valorADepositar);
                            }
                            IntervalosAplicacao.intervaloNivelMenor();
                            FluxoDoAplicativo.retorna();

                            break;
                        case 3:
                            FluxoDoAplicativo.setoresBemVindos(SetorAplicativo.TRANSFERENCIAS);
                            IntervalosAplicacao.intervaloNivelMenor();
                            System.out.print("Informe sua chave pix: ");
                            chaveInformada = entrada.nextDouble();

                            if (chaveInformada == conta.getChavePix()) {

                                IntervalosAplicacao.intervaloNivelMenor();
                                System.out.print("Valor a transferir: ");
                                valorATransferir = entrada.nextDouble();

                                historico.transfereUmValorDaConta(valorATransferir);
                                IntervalosAplicacao.intervaloNivelMenor();

                            } else {
                                IntervalosAplicacao.intervaloNivelMenor();
                                System.out.println("Chave pix errada!");
                                tentativasDeTransferencias++;

                                if (tentativasDeTransferencias == 3) {
                                    IntervalosAplicacao.intervaloNivelMenor();
                                    System.out.println(usuario.getNome() + ", sua conta foi bloqueada!");
                                    IntervalosAplicacao.intervaloNivelMedio();
                                    System.out.println("Motivo: inúmeras tentativas");
                                    IntervalosAplicacao.intervaloNivelMedio();
                                    FluxoDoAplicativo.finalizando();
                                    FluxoDoAplicativo.finaliza();

                                    return;
                                }
                            }

                            break;
                        case 4:
                            FluxoDoAplicativo.setoresBemVindos(SetorAplicativo.HISTORICO_TRANSFERENCIA);
                            historico.exibeHistoricoDeTransferencia();
                            FluxoDoAplicativo.retorna();

                            break;
                        case 5:
                            FluxoDoAplicativo.setoresBemVindos(SetorAplicativo.HISTORICO_TRANSFERENCIA);
                            historico.exibeHistoricoDeDepositos();
                            FluxoDoAplicativo.retorna();

                            break;
                        case 6:
                            FluxoDoAplicativo.setoresBemVindos(SetorAplicativo.VERIFICAR_CHAVE_REGISTRADA);
                            historico.exibeChavePixAtual();
                            FluxoDoAplicativo.retorna();

                            break;
                        case 7:
                            FluxoDoAplicativo.setoresBemVindos(SetorAplicativo.AVALIACAO);
                            System.out.print("[0 a 10] Avalie o aplicativo: ");
                            avaliacaoDoEconomy = entrada.nextInt();

                            if (avaliacaoDoEconomy < 0 || avaliacaoDoEconomy > 10) {
                                FluxoDoAplicativo.valorInvalido();
                                break;
                            } else {
                                historico.avaliacao(avaliacaoDoEconomy);
                                IntervalosAplicacao.intervaloNivelMedio();
                                System.out.println("Avaliação bem sucedida!");
                                IntervalosAplicacao.intervaloNivelMenor();
                                FluxoDoAplicativo.retorna();

                            }

                            break;
                        case 8:
                            FluxoDoAplicativo.setoresBemVindos(SetorAplicativo.AVALIACAO_MEDIA);
                            historico.exibirMediaDasAvaliacoes();
                            FluxoDoAplicativo.retorna();

                            break;

                        case 9:
                            FluxoDoAplicativo.setoresBemVindos(SetorAplicativo.TROCAR_CHAVE);
                            System.out.print("Informe a chave atual: ");
                            chaveAtualTroca = entrada.nextInt();

                            if (chaveAtualTroca == conta.getChavePix()) {

                                IntervalosAplicacao.intervaloNivelMenor();
                                System.out.print("Informe a nova chave: ");
                                novaChave = entrada.nextInt();

                                conta.trocaDeChavePix(novaChave);
                                IntervalosAplicacao.intervaloNivelMenor();
                                System.out.println("Sua chave foi trocada!");
                                FluxoDoAplicativo.retorna();

                            } else {
                                IntervalosAplicacao.intervaloNivelMenor();
                                FluxoDoAplicativo.chaveInvalida();
                                FluxoDoAplicativo.retorna();

                            }

                            break;

                        case 10:
                            FluxoDoAplicativo.setoresBemVindos(SetorAplicativo.TROCAR_SENHA);
                            System.out.print("Informe a senha atual: ");
                            senhaAtualTroca = entrada.nextInt();

                            if (senhaAtualTroca == conta.getSenhaDaConta()) {

                                IntervalosAplicacao.intervaloNivelMenor();
                                System.out.print("Informe a senha desejada: ");
                                novaSenha = entrada.nextInt();

                                conta.trocaDeSenha(novaSenha);
                                IntervalosAplicacao.intervaloNivelMedio();
                                FluxoDoAplicativo.retorna();

                            } else {
                                IntervalosAplicacao.intervaloNivelMenor();
                                FluxoDoAplicativo.senhaInvalida();
                                IntervalosAplicacao.intervaloNivelMenor();
                                FluxoDoAplicativo.retorna();

                                break;
                            }
                            break;

                        case 11:
                            menuSair.exibeMenuDinamico();
                            menuSair.campoDeDigitacao();
                            opcaoSair = entrada.nextInt();

                            switch (opcaoSair) {
                                case 1:
                                    IntervalosAplicacao.intervaloNivelMedio();
                                    FluxoDoAplicativo.finalizando();
                                    IntervalosAplicacao.intervaloNivelMenor();
                                    FluxoDoAplicativo.finaliza();
                                    return;
                                case 2:
                                    IntervalosAplicacao.intervaloNivelMedio();
                                    FluxoDoAplicativo.retorna();

                                    break;
                            }
                            break;

                        default:
                            IntervalosAplicacao.intervaloNivelMenor();
                            FluxoDoAplicativo.opcaoInvalida();
                            IntervalosAplicacao.intervaloNivelMenor();
                            System.out.println("Selecione uma opção válida!");

                            break;
                    }
                }

            } else {
                IntervalosAplicacao.intervaloNivelMenor();
                System.out.println("Você não tem acesso a essa conta, " + usuario.getNome()+".");
                IntervalosAplicacao.intervaloNivelMenor();
                FluxoDoAplicativo.finalizando();
                FluxoDoAplicativo.finaliza();
            }

        } else {

            FluxoDoAplicativo.finalizando();
            FluxoDoAplicativo.finaliza();
        }
    }
}