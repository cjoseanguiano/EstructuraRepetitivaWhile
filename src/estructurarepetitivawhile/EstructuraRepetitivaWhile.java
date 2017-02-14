/*
1. Ejemplo de uso de while: Programa Java que muestre los números del 1 al 100 utilizando la instrucción while.

 */
package estructurarepetitivawhile;

/**
 *
 * @author carlosjoseanguiano
 */
public class EstructuraRepetitivaWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int multiplicar = 0;
        while (multiplicar < 100) {
            multiplicar = multiplicar * 1;
            multiplicar++;
            System.out.println("Valor :" + multiplicar);
        }
    }

}
