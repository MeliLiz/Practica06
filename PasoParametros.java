/**
 * Clase PasoParametros Clase para entender cómo funciona el paso de parámetros
 * por valor y por referencia.
 * 
 * @author Melissa Fernández
 * @version 1.0
 */
public class PasoParametros {
    /**
     * Método principal
     * 
     * @param args Los argumentos
     */
    public static void main(String[] args) {
        int x = 7; // declaramos variable x con valor de 7
        int[] a = new int[4]; // hacemos un arreglo de enteros de longitud 4
        // ciclo for para asignar un valor entero a cada espacio del arreglo
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        a[0] = 7; // en el lugar 0 del arreglo asignamos el 7

        // Paso de parámetros por valor. Aplicamos el método multiplica a x pero el
        // valor de la variable original
        // no se modifica
        System.out.println("**Paso de parámetros por valor**");
        multiplica(x); // Aplicamos el método multiplica a x (que vale 7)
        System.out.println("Valor de x en main: " + x);// Imprimimos el valor de x

        // Paso de parámetros por referencia. Aplicamos el método multiplica al arreglo
        // a y al imprimir el valor
        // que está en el último espacio del arreglo nos da el valor resultante del
        // método.
        System.out.println("**Paso de parámetros por referencia**");
        multiplica(a); // aplicamos el método multiplica al arreglo a
        System.out.println(a[a.length - 1]); // Iprimimos el valor que hay en el último espacio del arreglo

        // Para cambiar el valor de la variable:
        // asignamos a x el valor de x cuando le aplicamoe el método
        System.out.println("**Cambiando el valor de la variable en main**");
        x = alCuadrado(x);
        System.out.println("Nuevo valor de x en main con método: " + x);

    }

    /**
     * Método multiplica que recibe un entero y lo multiplica por sí mismo
     * 
     * @param x El numero entero
     */
    public static void multiplica(int x) {
        x *= x; // Se multiplica x por si mismo
    }

    /**
     * Metodo multiplica que recibe un arreglo de enteros y los multiplica
     * 
     * @param x El arreglo de enteros
     */
    public static void multiplica(int[] x) {
        int multiplicacion = 1;
        // Ciclo for para multiplicar el valor de multiplicacion por el valor en cada
        // espacio del arreglo
        for (int i = 0; i < x.length; i++) {
            multiplicacion *= x[i];
        }
        x[x.length - 1] = multiplicacion;// al ultimo espacio del arreglo asignamos el valor de multiplicacion
    }

    /**
     * Metodo alCuadrado recibe un número y regresa el cuadrado del mismo
     * 
     * @param x El numero entero
     * @return El numero elevado al cuadrado
     */
    public static int alCuadrado(int x) {
        x *= x;
        return x; // regresamos el nuevo valor de x para poder cambiar el valor de la variable
                  // original
    }
}