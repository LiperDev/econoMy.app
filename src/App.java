import br.com.econoMy.classes.ContaBancaria;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();
        String nomeDoUsuario;
        int idadeDoUsuario, senhaInformada, digiteOpcaoMenu, senhaAtualTroca, novaSenha, chaveAtualTroca, novaChave;
        int tentativasDeTransferencias = 0;
        int avaliacaoDoEconomy;
        double valorADepositar, valorATransferir, chaveInformada;

        conta.exibeMensagemDeBoasVindas();
        conta.exibeProcedimentoInicial();

        System.out.print("Informe o seu nome: ");
        nomeDoUsuario = entrada.nextLine();

        conta.setNome(nomeDoUsuario);
        conta.intervaloNivelMenor();
        System.out.println("Nome informado: " + conta.getNome());

        conta.intervaloNivelMenor();
        System.out.print("Informe sua idade: ");
        idadeDoUsuario = entrada.nextInt();

        conta.verificaIdadePermitida(idadeDoUsuario);
        if (idadeDoUsuario >= 18 && idadeDoUsuario <= 120) {

            conta.intervaloNivelMedio();
            System.out.print("Informe sua senha: ");
            senhaInformada = entrada.nextInt();

            conta.verificaSenha(senhaInformada);

            if (senhaInformada == conta.getSenhaDaConta()) {

                conta.intervaloNivelMenor();
                conta.exibeBoasVindasAoUsuarioDaConta();

                while (true) {

                    conta.intervaloNivelAlto();
                    conta.exibeMenuDinamico();
                    System.out.print("Digite sua opção: ");
                    digiteOpcaoMenu = entrada.nextInt();

                    switch (digiteOpcaoMenu) {
                        case 1:
                            System.out.println("Exibindo saldo atual da conta ...");
                            conta.intervaloNivelMedio();
                            System.out.println(conta.getNome() + ", seu saldo atual é: " + conta.getSaldoAtual());

                            break;
                        case 2:
                            conta.intervaloNivelMenor();
                            System.out.print("Digite o valor que deseja depositar: ");
                            valorADepositar = entrada.nextDouble();

                            if (valorADepositar <= 0) {
                                conta.intervaloNivelMenor();
                                System.out.println("Valor inválido!");
                            } else {
                                conta.adicionaUmValorAConta(valorADepositar);
                                conta.adicionaUmValorAoHistoricoDeDepositos(valorADepositar);
                                conta.intervaloNivelMenor();
                                System.out.println("Valor depositado em sua conta: " + valorADepositar);
                            }
                            conta.intervaloNivelMenor();
                            System.out.println("Voltando ao menu ...");

                            break;
                        case 3:
                            conta.intervaloNivelMenor();
                            System.out.print("Informe sua chave pix: ");
                            chaveInformada = entrada.nextDouble();

                            if (chaveInformada == conta.getChavePix()) {

                                conta.intervaloNivelMenor();
                                System.out.print("Valor a transferir: ");
                                valorATransferir = entrada.nextDouble();

                                conta.transfereUmValorDaConta(valorATransferir);
                                conta.intervaloNivelMenor();

                            } else {
                                conta.intervaloNivelMenor();
                                System.out.println("Chave pix errada!");
                                tentativasDeTransferencias++;

                                if (tentativasDeTransferencias == 3) {
                                    conta.intervaloNivelMenor();
                                    System.out.println("Conta bloqueada!");
                                    conta.intervaloNivelMedio();
                                    System.out.println("Encerrando o aplicativo ...");

                                    return;
                                }
                            }

                            break;
                        case 4:
                            System.out.println("Exibindo histórico de transferências ...");
                            System.out.println(conta.getHistoricoDeTransferencias());

                            break;
                        case 5:
                            System.out.println("Exibindo histórico de depósitos ...");
                            System.out.println(conta.getHistoricoDeDeposito());

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
                                conta.avaliacao(avaliacaoDoEconomy);
                                System.out.println("Avaliação bem sucedida!");
                                conta.intervaloNivelMenor();
                                System.out.println("Retornando ao menu ...");
                                conta.intervaloNivelMenor();
                            }

                            break;
                        case 8:
                            conta.intervaloNivelMenor();
                            System.out.println("Exibindo média das avaliações ...");
                            conta.intervaloNivelMedio();
                            conta.exibirMediaDasAvaliacoes();
                            conta.intervaloNivelMenor();
                            System.out.println("Retornando ao menu ...");
                            conta.intervaloNivelMenor();
                            break;

                        case 9:

                            System.out.print("Informe a chave atual: ");
                            chaveAtualTroca = entrada.nextInt();

                            if (chaveAtualTroca == conta.getChavePix()) {

                                conta.intervaloNivelMenor();
                                System.out.print("[Somente números] Informe a nova chave: ");
                                novaChave = entrada.nextInt();

                                conta.trocaDeChavePix(novaChave);
                                conta.intervaloNivelMenor();
                                System.out.println("Sua chave foi trocada!");

                            } else {
                                conta.intervaloNivelMenor();
                                System.out.println("Chave pix incorreta!");

                            }

                            break;

                        case 10:
                            System.out.print("Informe a senha atual: ");
                            senhaAtualTroca = entrada.nextInt();

                            if (senhaAtualTroca == conta.getSenhaDaConta()) {

                                conta.intervaloNivelMenor();
                                System.out.print("Informe a senha desejada: ");
                                novaSenha = entrada.nextInt();

                                conta.trocaDeSenha(novaSenha);
                                conta.intervaloNivelMenor();
                                System.out.print("Troca de senha bem sucedida!");

                            } else {
                                conta.intervaloNivelMenor();
                                System.out.println("Senha inválida!");
                                break;
                            }
                            break;

                        case 11:
                            conta.intervaloNivelMedio();
                            System.out.println("Finalizando a aplicação ...");
                            conta.intervaloNivelMenor();
                            System.out.println("Finalizado!");

                            return;

                        default:
                            conta.intervaloNivelMenor();
                            System.out.println("Opção inválida!");
                            conta.intervaloNivelMenor();
                            System.out.println("Selecione uma opção válida!");

                            break;
                    }

                }

            } else {
                conta.intervaloNivelMenor();
                System.out.println("Você não tem acesso a essa conta, " + conta.getNome()+".");
                conta.intervaloNivelMenor();
                System.out.println("Finalizando a aplicação ...");
                conta.intervaloNivelMenor();
                System.out.println("Finalizado!");
            }

        } else {

            conta.intervaloNivelMenor();
            System.out.println("Finalizando a aplicação ...");
            conta.intervaloNivelMenor();
            System.out.println("Finalizado!");
        }
    }
}