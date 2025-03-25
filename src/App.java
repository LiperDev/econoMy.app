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
        usuario.exibeInformacaoNome();
        IntervalosAplicacao.intervaloNivelMenor();
        System.out.print("Nome: ");
        nomeDoUsuario = entrada.nextLine();

        usuario.setNome(nomeDoUsuario);
        IntervalosAplicacao.intervaloNivelMedio();
        usuario.olaTudoBem();

        IntervalosAplicacao.intervaloNivelMedio();
        usuario.exibeInformacaoIdade();
        IntervalosAplicacao.intervaloNivelMenor();
        System.out.print("Idade: ");
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

                while (true) {

                    IntervalosAplicacao.intervaloNivelAlto();
                    menuPrincipal.exibeMenuDinamico();
                    menuPrincipal.campoDeDigitacao();
                    digiteOpcaoMenu = entrada.nextInt();

                    switch (digiteOpcaoMenu) {
                        case 1:
                            System.out.println("Exibindo saldo atual da conta ...");
                            IntervalosAplicacao.intervaloNivelMedio();
                            conta.exibeSaldoAtual();
                            historico.exibeRetorno();

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
                                conta.exibeDepositoSucesso(valorADepositar);
                            }
                            IntervalosAplicacao.intervaloNivelMenor();
                            historico.exibeRetorno();
                            IntervalosAplicacao.intervaloNivelMedio();

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
                                    System.out.println(usuario.getNome() + ", sua conta foi bloqueada!");
                                    IntervalosAplicacao.intervaloNivelMenor();
                                    System.out.println("Motivo: inúmeras tentativas");
                                    IntervalosAplicacao.intervaloNivelMedio();
                                    System.out.println("Encerrando o aplicativo ...");

                                    return;
                                }
                            }

                            break;
                        case 4:
                            historico.exibeHistoricoDeTransferencia();
                            historico.exibeRetorno();

                            break;
                        case 5:
                            historico.exibeHistoricoDeDepositos();
                            historico.exibeRetorno();

                            break;
                        case 6:
                            historico.exibeChavePixAtual();
                            historico.exibeRetorno();

                            break;
                        case 7:
                            System.out.print("[0 a 10] Avalie o aplicativo: ");
                            avaliacaoDoEconomy = entrada.nextInt();

                            if (avaliacaoDoEconomy < 0 || avaliacaoDoEconomy > 10) {
                                System.out.println("Valor inválido!");
                                break;
                            } else {
                                historico.avaliacao(avaliacaoDoEconomy);
                                IntervalosAplicacao.intervaloNivelMedio();
                                System.out.println("Avaliação bem sucedida!");
                                IntervalosAplicacao.intervaloNivelMenor();
                                historico.exibeRetorno();
                                IntervalosAplicacao.intervaloNivelMenor();
                            }

                            break;
                        case 8:
                            historico.exibirMediaDasAvaliacoes();
                            historico.exibeRetorno();

                            break;

                        case 9:

                            System.out.print("Informe a chave atual: ");
                            chaveAtualTroca = entrada.nextInt();

                            if (chaveAtualTroca == conta.getChavePix()) {

                                IntervalosAplicacao.intervaloNivelMenor();
                                System.out.print("Informe a nova chave: ");
                                novaChave = entrada.nextInt();

                                conta.trocaDeChavePix(novaChave);
                                IntervalosAplicacao.intervaloNivelMenor();
                                System.out.println("Sua chave foi trocada!");
                                historico.exibeRetorno();
                                IntervalosAplicacao.intervaloNivelMedio();

                            } else {
                                IntervalosAplicacao.intervaloNivelMenor();
                                System.out.println("Chave pix incorreta!");
                                historico.exibeRetorno();
                                IntervalosAplicacao.intervaloNivelMedio();

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
                                historico.exibeRetorno();
                                IntervalosAplicacao.intervaloNivelMedio();

                            } else {
                                IntervalosAplicacao.intervaloNivelMenor();
                                System.out.println("Senha inválida!");
                                IntervalosAplicacao.intervaloNivelMenor();
                                historico.exibeRetorno();
                                IntervalosAplicacao.intervaloNivelMedio();

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