package implementacion_arbol;

/**
 *
 * @author l
 */
public class ARBOL {

    Cursor cursor_arbol = new Cursor();

    public int PADRE(int... n) {
        int control = RAIZ();
        try {
            control = n[1];
        } catch (Exception e) {
        }
        if (n[0] < 0) {
            return -2;
        } else {
            if (cursor_arbol.exist(n[0])) {
                if (control == n[0]) {
                    return -1;
                } else {
                    while (HERMANO_DER(n[0]) >= 0) {

                    }
                    return -1; //a retornar padre, retorno actual provicional
                }
            } else {
                return -2;
            }
        }

    }

    public int HIJO_MAS_IZQ(int n) {
        if (n < 0) {
            return -2;
        } else {
            if (cursor_arbol.exist(n)) {
                return cursor_arbol.getHijoMasIzq(n);
            } else {
                return -2;
            }
        }
    }

    public int HERMANO_DER(int n) {
        if (n < 0) {
            return -2;
        } else {
            if (cursor_arbol.exist(n)) {
                return cursor_arbol.getHermanoDer(n);
            } else {
                return -2;
            }
        }
    }

    public Object ETIQUETA(int n) {
        if (n < 0) {
            return -1;
        } else {
            if (cursor_arbol.exist(n)) {
                return cursor_arbol.getEtiquet(n);
            } else {
                return -1;
            }
        }
    }

    public void CREA(Object etiqueta, Object... hijos) {

    }

    public int RAIZ() {
        return cursor_arbol.getRaiz();
    }

    public void ANULA() {
        cursor_arbol.setRaiz(-1);
        cursor_arbol.anularMemoria();
    }

}
