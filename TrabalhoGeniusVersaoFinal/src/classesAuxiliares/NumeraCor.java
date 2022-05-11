package classesAuxiliares;

//classe para saber qual a cor;

public enum NumeraCor {  //constante de enumera��o "enum", cada cor � atribuida a um n�mero
    VERDE(0), VERMELHO(1), AZUL(2), AMARELO(3);

    private final int valor;

    private NumeraCor(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public static NumeraCor getVERDE() {
        return VERDE;
    }

    public static NumeraCor getVERMELHO() {
        return VERMELHO;
    }

    public static NumeraCor getAZUL() {
        return AZUL;
    }

    public static NumeraCor getAMARELO() {
        return AMARELO;
    }


}
