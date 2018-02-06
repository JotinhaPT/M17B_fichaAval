//https://github.com/JotinhaPT/M17B_fichaAval

/**
 * Ficha de avaliação Main 
 * @author João Marques & Martim Marreiros
 * @version 1.0
 */
package m17b_fichaaval;

public class Main {

    public static void main(String[] args) {
        Ponto2D p1 = new Ponto2D(5, 7);
        Ponto2D p2 = new Ponto2D(2, 8);

        System.out.println(p1);
        System.out.println(p2);

        System.out.println(p2.distancia(p1));
    }
}
