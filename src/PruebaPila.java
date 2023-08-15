import javax.print.Doc;

public class PruebaPila {
    private Double[] elementosDouble = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6 };
    private Integer[] elementosInteger = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
    

    /**
     * Prueba objeto pila
     * 
     * @param args
     * @throws Exception
     */
    public void pruebaPilas() {
        PilaGenerica pilaTipoCrudo1=new PilaGenerica(5);
        PilaGenerica pilaTipoCrudo2=new PilaGenerica<Double>(5);
        PilaGenerica<Integer> pilaInteger=new PilaGenerica(10);
        probarPush("pilatipoCrudo1",pilaTipoCrudo1,elementosDouble);
        probarPop("pilTipoCrudo1",pilaTipoCrudo1);
        probarPush("pilatipoCrudo2",pilaTipoCrudo2,elementosDouble);
        probarPop("pilTipoCrudo2",pilaTipoCrudo2);
        probarPush("pilaInteger",pilaInteger,elementosInteger);
        probarPop("pilaInteger",pilaInteger);

    }

    public <T> void probarPush(String nombre,PilaGenerica<T> pilaGenerica,T[] elementos) {
        try {
            System.out.printf("\nMetiendo elementos a %s\n",nombre);
            for (T elemento : elementos) {
                System.out.printf("%s ", elemento);
                pilaGenerica.push(elemento);
            }
        } catch (ExceptionPilaLlena exceptionPilaLlena) {
            System.err.println();
            exceptionPilaLlena.printStackTrace();
        }

    }

    public <T> void probarPop(String nombre,PilaGenerica<T> pila) {
        try {
            System.out.printf("\nSacanado elementos de %s\n",nombre);
            T valorAsacar;
            while (true) {
                valorAsacar = pila.pop();
                System.out.printf("%s ", valorAsacar);
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
