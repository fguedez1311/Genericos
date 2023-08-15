public class PilaGenerica<T> {
    private final int tamanio;
    private int superior;
    private T[] elementos;
    public PilaGenerica() {
        this(10);
    }
    public PilaGenerica(int s){
        tamanio=s>0 ? s:10;
        superior=-1;
        elementos=(T[]) new Object[tamanio];
        
    }
    public void push(T valorAmeter){
        if(superior==tamanio-1)
        throw new ExceptionPilaLlena(String.format("Pila esta llena no se puede meter %s",valorAmeter));
        elementos[++superior]=valorAmeter;
    }
    public T pop(){
        if(superior==-1)
            throw new ExceptionPilaVacia("La pila esta vacía, no se puede sacar");
        return elementos[superior--];
    }
    
}
