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
        usuario.exibeProcedimentoInicial();

        IntervalosAplicacao.intervaloNivelMedio();
        System.out.print("Informe o seu nome: ");
        nomeDoUsuario = entrada.nextLine();

        usuario.setNome(nomeDoUsuario);
        IntervalosAplicacao.intervaloNivelMenor();
        System.out.println("Olá, " + usuario.getNome() + ", tudo bem?");

        IntervalosAplicacao.intervaloNivelMenor();

        System.out.print("Informe sua idade: ");
        idadeDoUsuario = entrada.nextInt();

        usuario.setIdadeDoUsuario(idadeDoUsuario);
        System.out.println("Idade informada: " + usuario.getIdadeDoUsuario());

        usuario.verificaIdadePermitida(idadeDoUsuario);
        if (idadeDoUsuario >= 18 && idadeDoUsuario <= 120) {

            IntervalosAplicacao.intervaloNivelMedio();
            System.out.print("(somente números) Informe sua senha: ");
            senhaInformada = entrada.nextInt();

            conta.verificaSenha(senhaInformada);

            if (senhaInformada == conta.getSenhaDaConta()) {

                IntervalosAplicacao.intervaloNivelMenor();
                usuario.exibeBoasVindasAoUsuarioDaConta();

                while (true) {

                    IntervalosAplicacao.intervaloNivelAlto();
                    menuPrincipal.exibeMenuDinamico();
                    menuPrincipal.campoDeDigitacao();
                    digiteOpcaoMenu = entrada.nextInt();

                    switch (digiteOpcaoMenu) {
                        case 1:
                            System.out.println("Exibindo saldo atual da conta ...");
                            IntervalosAplicacao.intervaloNivelMedio();
                            System.out.println(usuario.getNome() + ", seu saldo atual é: " + "| " + conta.getSaldoAtual() + " |");

                            break;
                        case 2:
                            IntervalosAplicacao.intervaloNivelMenor();
                            System.out.print("Digite o valor que deseja depositar: ");
                            valorADepositar = entrada.nextDouble();

                            if (valorADepositar <= 0) {
                                IntervalosAplicacao.intervaloNivelMenor();
                                System.out.println("Valor inválido!");
                            } else {
                                conta.adicionaUmValorAConta(valorADepositar);
                                historico.adicionaUmValorAoHistoricoDeDepositos(valorADepositar);
                                IntervalosAplicacao.intervaloNivelMenor();
                                System.out.println("Valor depositado em sua conta: " + valorADepositar);
                            }
                            IntervalosAplicacao.intervaloNivelMenor();
                            System.out.println("Voltando ao menu ...");

                            break;
                        case 3:
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
                                    System.out.println("Conta bloqueada!");
                                    IntervalosAplicacao.intervaloNivelMedio();
                                    System.out.println("Encerrando o aplicativo ...");

                                    return;
                                }
                            }

                            break;
                        case 4:
                            System.out.println("Exibindo histórico de transferências ...");
                            historico.exibeHistoricoDeTransferencia();

                            break;
                        case 5:
                            System.out.println("Exibindo histórico de depósitos ...");
                            historico.exibeHistoricoDeDepositos();

                            break;
                        case 6:
                            System.out.println("Exibindo a chave pix registrada ...");
                            System.out.println("chave pix: " + conta.getChavePix());

                            break;
                        case 7:
                            System.out.print("[0 a 10] Avalie o aplicativo: ");
                            avaliacaoDoEconomy = entrada.nextInt();

                            if (avaliacaoDoEconomy < 0 || avaliacaoDoEconomy > 10) {
                                System.out.println("Valor inválido!");
                                break;
                            } else {
                                historico.avaliacao(avaliacaoDoEconomy);
                                System.out.println("Avaliação bem sucedida!");
                                IntervalosAplicacao.intervaloNivelMenor();
                                System.out.println("Retornando ao menu ...");
                                IntervalosAplicacao.intervaloNivelMenor();
                            }

                            break;
                        case 8:
                            IntervalosAplicacao.intervaloNivelMenor();
                            System.out.println("Exibindo média das avaliações ...");
                            IntervalosAplicacao.intervaloNivelAlto();
                            historico.exibirMediaDasAvaliacoes();
                            IntervalosAplicacao.intervaloNivelMenor();
                            System.out.println("Retornando ao menu ...");
                            IntervalosAplicacao.intervaloNivelMenor();
                            break;

                        case 9:

                            System.out.print("Informe a chave atual: ");
                            chaveAtualTroca = entrada.nextInt();

                            if (chaveAtualTroca == conta.getChavePix()) {

                                IntervalosAplicacao.intervaloNivelMenor();
                                System.out.print("[Somente números] Informe a nova chave: ");
                                novaChave = entrada.nextInt();

                                conta.trocaDeChavePix(novaChave);
                                IntervalosAplicacao.intervaloNivelMenor();
                                System.out.println("Sua chave foi trocada!");

                            } else {
                                IntervalosAplicacao.intervaloNivelMenor();
                                System.out.println("Chave pix incorreta!");

                            }

                            break;

                        case 10:
                            System.out.print("Informe a senha atual: ");
                            senhaAtualTroca = entrada.nextInt();

                            if (senhaAtualTroca == conta.getSenhaDaConta()) {

                                IntervalosAplicacao.intervaloNivelMenor();
                                System.out.print("Informe a senha desejada: ");
                                novaSenha = entrada.nextInt();

                                conta.trocaDeSenha(novaSenha);
                                IntervalosAplicacao.intervaloNivelMenor();
                                System.out.print("Troca de senha bem sucedida!");

                            } else {
                                IntervalosAplicacao.intervaloNivelMenor();
                                System.out.println("Senha inválida!");
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
                                    System.out.println("Finalizando a aplicação ...");
                                    IntervalosAplicacao.intervaloNivelMenor();
                                    System.out.println("Finalizado!");
                                    return;
                                case 2:
                                    IntervalosAplicacao.intervaloNivelMedio();
                                    System.out.println("Retornando ao menu ...");
                                    IntervalosAplicacao.intervaloNivelMenor();
                                    break;
                            }
                            break;

                        default:
                            IntervalosAplicacao.intervaloNivelMenor();
                            System.out.println("Opção inválida!");
                            IntervalosAplicacao.intervaloNivelMenor();
                            System.out.println("Selecione uma opção válida!");

                            break;
                    }
                }

            } else {
                IntervalosAplicacao.intervaloNivelMenor();
                System.out.println("Você não tem acesso a essa conta, " + usuario.getNome()+".");
                IntervalosAplicacao.intervaloNivelMenor();
                System.out.println("Finalizando a aplicação ...");
                IntervalosAplicacao.intervaloNivelMenor();
                System.out.println("Finalizado!");
            }

        } else {

            IntervalosAplicacao.intervaloNivelMenor();
            System.out.println("Finalizando a aplicação ...");
            IntervalosAplicacao.intervaloNivelMenor();
            System.out.println("Finalizado!");
        }
    }
}