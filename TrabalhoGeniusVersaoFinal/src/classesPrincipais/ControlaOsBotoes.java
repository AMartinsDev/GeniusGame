package classesPrincipais;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.Timer;

import classesAuxiliares.NumeraCor;


//essa classe controla aspectos de velocidade, sons e forma das cores;

public class ControlaOsBotoes {

    private final JButton botao;
    private final NumeraCor cor;
    private int tempo;
    private Timer tempo2;  //tipo timer para automatizar tarefas que se repetem no código, como clarear e escurecer;
    private Timer tempo3;

    public ControlaOsBotoes(JButton botao, NumeraCor cor, int tempo) {
        this.botao = botao;
        this.cor = cor;
        this.tempo = tempo;
    }

    
    //"clareia" o botão da cor na mesma proporção que toca a sua música respectiva;
	private void clarearBotao() {
		try {
			Clip clip;
			AudioInputStream amarelo = AudioSystem
					.getAudioInputStream(this.getClass().getResourceAsStream("/amarelo.mid"));
			AudioInputStream azul = AudioSystem
					.getAudioInputStream(this.getClass().getResourceAsStream("/azul.mid"));
			AudioInputStream verde = AudioSystem
					.getAudioInputStream(this.getClass().getResourceAsStream("/verde.mid"));
			AudioInputStream vermelho = AudioSystem
					.getAudioInputStream(this.getClass().getResourceAsStream("/vermelho.mid"));
			switch (this.cor) {
			case VERDE:
				botao.setBackground(new Color(0, 255, 0));
				clip = AudioSystem.getClip();
				clip.open(verde);
				clip.start();
				break;
			case VERMELHO:
				clip = AudioSystem.getClip();
				clip.open(vermelho);
				clip.start();
				botao.setBackground(new Color(255, 0, 0));
				break;
			case AZUL:
				clip = AudioSystem.getClip();
				clip.open(azul);
				clip.start();
				botao.setBackground(new Color(0, 0, 255));
				break;
			case AMARELO:
				clip = AudioSystem.getClip();
				clip.open(amarelo);
				clip.start();
				botao.setBackground(new Color(255, 255, 0));
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	//cor de quando o botão está "apagado", sem cliques
    private void escurecerBotao() {
        switch (this.cor) {
            case VERDE:
                botao.setBackground(new Color(0, 125, 0));
                break;
            case VERMELHO:
                botao.setBackground(new Color(125, 0, 0));
                break;
            case AZUL:
                botao.setBackground(new Color(0, 0, 125));
                break;
            case AMARELO:
                botao.setBackground(new Color(125, 125, 0));
                break;
        }
    }

    //repete as tarefas de piscar o botão quando invocado o metodo;
    public void piscarBotao(int escurecer) {
        tempo3 = new Timer(this.tempo - 300, (ActionEvent e) -> {
            clarearBotao();
            tempo2 = new Timer(escurecer, (ActionEvent e2) -> {
                escurecerBotao();
            });
            tempo2.setRepeats(false);
            tempo2.start();
        });
        tempo3.setRepeats(false);
        tempo3.start();

    }
}
