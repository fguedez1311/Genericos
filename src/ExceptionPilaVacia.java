public class ExceptionPilaVacia extends RuntimeException{
    public ExceptionPilaVacia(){
        this("La pila esta vacia");
    }
    public ExceptionPilaVacia(String exception){
        super(exception);
    }
}
