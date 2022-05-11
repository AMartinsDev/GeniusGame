package classesPrincipais;

import java.util.ArrayList;
import java.util.Random;

import classesAuxiliares.NumeraCor;

//gerador das cores, recebe a classe "NumeraCor" para auxiliar;
public class GeradorDeCores {

    private final ArrayList<NumeraCor> sequenciaCor;

    public GeradorDeCores() {
        this.sequenciaCor = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "ControlaRodadas{" + "sequenciaCor=" + sequenciaCor + '}';
    }

    public ArrayList<NumeraCor> getSequenciaDeCores() {
        return sequenciaCor;
    }

    public NumeraCor getCor(int index) {
        return sequenciaCor.get(index);
    }

    public void setCor(NumeraCor cor) {
        this.sequenciaCor.add(cor);
    }

    //randomiza as cores geradas na hora da rodada
    public NumeraCor getRandomCor() {
        Random rand = new Random();
        int a = rand.nextInt(5);
        switch (a) {
            case 0:
                return NumeraCor.VERDE;
            case 1:
                return NumeraCor.VERMELHO;
            case 2:
                return NumeraCor.AZUL;
            default:
                return NumeraCor.AMARELO;
        }
    }

}
