package classesPrincipais;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.Timer;

import classesAuxiliares.Jogadores;
import classesAuxiliares.NumeraCor;
import classesAuxiliares.Rodadas;

//controla aspectos gerais do jogo, como rodadas, pontuação, vencedor e tempo de jogada;

public class ControlaAspectosGerais {

    private final Rodadas controlaRodadas;
    private final GeradorDeCores gerarCores;
    @SuppressWarnings("unused")
	private Timer tempo5Segundos;

    public ControlaAspectosGerais() {                    //instancia os objetos
        gerarCores = new GeradorDeCores();
        controlaRodadas = new Rodadas();
    }

    public void zerarIndex() {              //zera a rodada
        controlaRodadas.setIndexVerificar(0);
    }

    public void recomecarRodada() {       
        controlaRodadas.setRodada(1);
        controlaRodadas.setIndexVerificar(0);
    }

    public ArrayList<NumeraCor> gerarListaCor() {
        for (int i = 0; i < 21; i++) {                   //até 21 repetições possíveis na hora da sequencia
            gerarCores.setCor(gerarCores.getRandomCor());
        }
        return gerarCores.getSequenciaDeCores();
    }

    public boolean verificarCor(NumeraCor cor) {        //serve para fazer a verificação da cor na hora que a pessoa clicar na mesma;
        if (gerarCores.getCor(controlaRodadas.getIndexVerificar()) == cor) {
            return true;
        }
        return false;
    }

    public int getRodada() {   //recebe qual a rodada atual
        return controlaRodadas.getRodada();
    } 

    public void msgTempoExpeirado() {
        JOptionPane.showMessageDialog(null, "O TEMPO EXPIROU", "FIM DE JOGO", JOptionPane.ERROR_MESSAGE);  //se passar 5s, o tempo é expirado
    }

    public void msgPressionarBotaoErrado() {
        JOptionPane.showMessageDialog(null, "SEQUENCIA ERRADA", "FIM DE JOGO", JOptionPane.ERROR_MESSAGE);
    }

    public void msgEmpate() {
        JOptionPane.showMessageDialog(null, "JOGO EMPATADO", "FIM DE JOGO", JOptionPane.ERROR_MESSAGE);
    }
    
    public void msgJogadorParabens(String nome) {
        JOptionPane.showMessageDialog(null, "PARABENS "+ nome +" VOCE GANHOU O JOGO!!!", "FIM DE JOGO", JOptionPane.PLAIN_MESSAGE);
    }

    public void msgParabens() {
    	JOptionPane.showMessageDialog(null, "PARABENS, VOCE EH UM GENIUS", "FIM DE JOGO", JOptionPane.PLAIN_MESSAGE); //caso você zere o jogo
    }
    
    public void msgPlacar(Jogadores jogador1, Jogadores jogador2) {
    	JOptionPane.showMessageDialog(   //exibe o placar final
    			null, 
    			String.valueOf(jogador1.getNome() + " - " + jogador1.getPontos() + " pontos") + "\n" +
    			String.valueOf(jogador2.getNome() + " - " + jogador2.getPontos() + " pontos"),
    			"PLACAR FINAL",
    			JOptionPane.PLAIN_MESSAGE);
    }

    public int getIndex() {
        return controlaRodadas.getIndexVerificar();
    }

    public void setRodada() {
        controlaRodadas.rodada();
    }

    public void setIndex() {
        controlaRodadas.index();
    }

}
