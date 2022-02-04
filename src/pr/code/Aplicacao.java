package pr.code;

import pr.code.modelo.Tabuleiro;
import pr.code.visao.TabuleiroConsole;

public class Aplicacao {

    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);

        new TabuleiroConsole(tabuleiro);

        System.out.println(tabuleiro);
    }

}
