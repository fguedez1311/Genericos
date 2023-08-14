public class MetodoGenerico {

    public static <T> void imprimirArreglo(T[] arregloEntrada){
        for (T elemento : arregloEntrada){
            System.out.printf("%s ",elemento);
        }
    }
    public static void main(String[] args) throws Exception {
        Integer[] arregloInteger={1,2,3,4,5,6};
        Double[] arregloDoubles={1.1,1.2,3.3,4.4,5.5,6.6,7.7};
        Character[] arregloCharacters={'H','O','L','A'};
        System.out.println("El Arreglo ArregloInteger contiene: ");
        imprimirArreglo(arregloInteger);
        System.out.println("\nEl Arreglo ArregloDouble contiene: ");
        imprimirArreglo(arregloDoubles);
        System.out.println("\nEl Arreglo ArregloCharacter contiene: ");
        imprimirArreglo(arregloCharacters);
    }
}
