package classesAuxiliares;

//classe que será usada no controle de rodadas;

public class Rodadas {

    private int rodada;
    private int indexVerificar;

    public Rodadas() {
        this.rodada = 1;
        this.indexVerificar = 0;
    }

    public int getRodada() {
        return rodada;
    }

    public void setRodada(int rodada) {
        this.rodada = rodada;
    }

    public int getIndexVerificar() {
        return indexVerificar;
    }

    public void setIndexVerificar(int indexVerificar) {
        this.indexVerificar = indexVerificar;
    }

    public void rodada(){
        this.rodada++;
    }
    
    public void index(){
        this.indexVerificar++;
    }
}
