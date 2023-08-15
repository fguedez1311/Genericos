public class ExceptionPilaLlena extends RuntimeException {
    public ExceptionPilaLlena(){
        this("La pila esté Llena");
    }
    public ExceptionPilaLlena(String exception){
        super(exception);
    }
}
