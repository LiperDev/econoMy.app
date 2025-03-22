package br.com.econoMy.classes;
import br.com.econoMy.interfaces.IMenu;

public class MenuPrincipal implements IMenu {

    @Override
    public void exibeMenuDinamico() {
        System.out.println("| 1 - Verificar saldo atual");
        System.out.println("| 2 - Depositar um valor");
        System.out.println("| 3 - Transferir um valor");
        System.out.println("| 4 - Verificar histórico de transferências");
        System.out.println("| 5 - Verificar histórico de depósitos");
        System.out.println("| 6 - Verificar chave pix registrada");
        System.out.println("| 7 - Avaliar o econoMy");
        System.out.println("| 8 - Mostrar média das avaliações");
        System.out.println("| 9 - Trocar chave pix");
        System.out.println("| 10 - Trocar senha");
        System.out.println("| 11 - Sair do econoMy");
    }

    @Override
    public void campoDeDigitacao() {
        System.out.print("Digite a opção de navegação: ");
    }
}
