package br.com.econoMy.classes;

import br.com.econoMy.interfaces.IMenu;

public class MenuSair implements IMenu {

    @Override
    public void exibeMenuDinamico() {
        System.out.println("Você tem certeza?");
        System.out.println("1 - Sim, tenho certeza!");
        System.out.println("2 - Não, gostaria de voltar!");
    }

    @Override
    public void campoDeDigitacao() {
        System.out.print("Digite o que gostaria de fazer: ");
    }
}
