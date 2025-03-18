package oo.heranca;

public class Jogador {


    int vida = 100;
    int x;
    int y;

    Jogador(int x, int y) {
        this.x = x;
        this.y = y;

    }

    boolean atacar(Jogador oponente) {
        int deltaX = x - Math.abs(x - oponente.x);
        int deltaY = y - Math.abs(y - oponente.y);

        if (deltaX == 0 && deltaY == 1) {
            oponente.vida -= 10;
        } else if (deltaX == 1 && deltaY == 0) {
            oponente.vida -= 10;
            return true;
        } else {
            return false;
        }
        return true;
    }

    boolean andar(Direcao direcao) {

        switch (direcao) {
            case NORTE:
                y--;
                break;
            case LESTE:
                x++;
                break;
            case SUL:
                y++;
                break;
            case OESTE:
                x--;
                break;
        }
        return true;
    }
}
