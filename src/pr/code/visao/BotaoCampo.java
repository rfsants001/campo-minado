package pr.code.visao;

import pr.code.modelo.Campo;
import pr.code.modelo.CampoEvento;
import pr.code.modelo.CampoObservador;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class BotaoCampo extends JButton implements CampoObservador {

    private final Color BG_PADRAO = new Color(184, 184, 184);
    private final Color BG_MARCAR = new Color(8, 179, 247);
    private final Color BG_EXPLODIR = new Color(189, 66, 68);
    private final Color TXT_VERDE = new Color(0, 100, 0);

    private Campo campo;

    public BotaoCampo(Campo campo){
        this.campo = campo;
        setBorder(BorderFactory.createBevelBorder(0));
        setBackground(BG_PADRAO);
        campo.registrarObservador(this);
    }

    @Override
    public void eventoOcorreu(Campo campo, CampoEvento evento) {
        switch(evento){
            case ABRIR:
                aplicarEstiloAbrir();
                break;

            case MARCAR:
                aplicarEstiloMarcar();
                break;

            case EXPLODIR:
                aplicarEstiloExplodir();
                break;
                
            default:
                aplicarEstiloPadrao();
        }
    }

    private void aplicarEstiloPadrao() {
    }

    private void aplicarEstiloExplodir() {
    }

    private void aplicarEstiloMarcar() {
    }

    private void aplicarEstiloAbrir() {
    }
}
