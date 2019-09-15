package tda_arbol;

import implementacion_arbol.ARBOL;

/**
 *
 * @author l
 */
public class TDA_ARBOL {

    public static void main(String[] args) {
        ARBOL arbol = new ARBOL();
        int[] nodos = new int[7];

        nodos[0] = arbol.CREA("G");
        nodos[1] = arbol.CREA("F", nodos[0]);
        nodos[2] = arbol.CREA("E");
        nodos[3] = arbol.CREA("D", nodos[2], nodos[1]);
        nodos[4] = arbol.CREA("B", nodos[3]);
        nodos[5] = arbol.CREA("C");
        nodos[6] = arbol.CREA("A", nodos[4], nodos[5]);

        System.out.println("nodos");
        for (int nodo : nodos) {
            System.out.println(nodo);
        }

        System.out.println("\nPadres");
        for (int nodo : nodos) {
            System.out.println(nodo + " " + arbol.PADRE(nodo));
        }

        System.out.println("\nHijo izquierdo");
        for (int nodo : nodos) {
            System.out.println(nodo + " " + arbol.HIJO_MAS_IZQ(nodo));
        }

        System.out.println("\nHermano derecho");
        for (int nodo : nodos) {
            System.out.println(nodo + " " + arbol.HERMANO_DER(nodo));
        }

        System.out.println("\nEtiquetas");
        for (int nodo : nodos) {
            System.out.println(nodo + "" + arbol.ETIQUETA(nodo));
        }

        System.out.println("Raiz " + arbol.RAIZ());
    }

}
