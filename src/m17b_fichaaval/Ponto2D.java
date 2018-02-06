package m17b_fichaaval;
/**
 * Classe do ponto
 * @author Joao Marques - Martim Marreiros
 * @version 1.0
 */
public class Ponto2D {

    private int x;
    private int y;

    public Ponto2D() {
        x = 0;
        y = 0;
    }

    /**
     * @param x é a coordenada
     * @param y é a ordenada
     */
    public Ponto2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * @param a é um ponto
     * @return a distância dos dois pontos
     */
    public double distancia(Ponto2D a) {
        return Math.abs(Math.sqrt(Math.pow((x - a.x), 2) + Math.pow((y - a.y), 2)));
    }

    /**
     *
     * @return valor de x
     */
    public int getX() {
        return x;
    }

    /**
     *
     * @param x define o valor de x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     *
     * @return valor de y
     */
    public int getY() {
        return y;
    }

    /**
     *
     * @param y define o valor de y
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     *
     * @return uma string a com o valor das coordenadas do ponto
     */
    @Override
    public String toString() {
        return "Ponto2D{" + "x=" + x + ", y=" + y + '}';
    }
}
