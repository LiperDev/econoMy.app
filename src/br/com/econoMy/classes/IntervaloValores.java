package br.com.econoMy.classes;

public enum IntervaloValores {
    INTERVALO_PEQUENO(1000),
    INTERVALO_MEDIO(2000),
    INTERVALO_ALTO(2500);

    private final int valor;

    IntervaloValores(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
