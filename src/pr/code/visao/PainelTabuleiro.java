package pr.code.visao;

import pr.code.modelo.Tabuleiro;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class PainelTabuleiro extends JPanel {

    public PainelTabuleiro(Tabuleiro tabuleiro){

        setLayout(new GridLayout(tabuleiro.getLinhas(), tabuleiro.getColunas()));

        tabuleiro.paraCada(c -> add(new BotaoCampo(c)));

        tabuleiro.registrarObservador(e -> {
            //TODO mostrar resultado para o usuário
        });
    }
}
