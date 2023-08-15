public class PruebaPila {
    private double[] elementosDouble = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6 };
    private int[] elementosInteger = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
    private PilaGenerica<Double> pilaDouble;
    private PilaGenerica<Integer> pilaInteger;

    /**
     * Prueba objeto pila
     * 
     * @param args
     * @throws Exception
     */
    public void pruebaPilas() {
        pilaDouble = new PilaGenerica<Double>(5);
        pilaInteger = new PilaGenerica<Integer>(10);
        pruebaPushDouble();
        pruebaPopDouble();
        pruebaPushInteger();
        pruebaPopInteger();

    }

    public void pruebaPushDouble() {
        try {
            System.out.println("\nMetiendo elemnto en la pila Double");
            for (double elemento : elementosDouble) {
                System.out.printf("%.1f ", elemento);
                pilaDouble.push(elemento);
            }
        } catch (ExceptionPilaLlena exceptionPilaLlena) {
            System.err.println();
            exceptionPilaLlena.printStackTrace();
        }

    }

    private void pruebaPopDouble() {
        try {
            System.out.println("\nSacanado elementos de pilaDouble");
            double valorAsacar;
            while (true) {
                valorAsacar = pilaDouble.pop();
                System.out.printf("%.1f ", valorAsacar);
            }
        } catch (ExceptionPilaVacia exceptionPilaVacia) {
            System.err.println();
            exceptionPilaVacia.printStackTrace();
        }
    }

    private void pruebaPushInteger() {
        try {
            System.out.println("\nMetiendo elementos apilaInteger ");
            for (Integer elemento : elementosInteger) {
                System.out.printf("%d ", elemento);
                pilaInteger.push(elemento);
            }

        } catch (ExceptionPilaLlena exceptionPilaLlena) {
            System.err.println();
            exceptionPilaLlena.printStackTrace();
        }
    }

    private void pruebaPopInteger() {
        try {
            System.out.println("\nSacanado elementos de pilaInteger");
            Integer valorAsacar;
            while (true) {
                valorAsacar = pilaInteger.pop();
                System.out.printf("%d ", valorAsacar);
            }
        } catch (ExceptionPilaVacia exceptionPilaVacia) {
            System.err.println();
            exceptionPilaVacia.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        PruebaPila aplicacion = new PruebaPila();
        aplicacion.pruebaPilas();
    }
}
