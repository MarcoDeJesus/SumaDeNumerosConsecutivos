public class NumerosConsecutivos {
    public static void main(String [] args){
        int contador = 1;
        int suma = 0;

        while(contador <= 10){
            suma = contador + suma;
            contador++;
        }

        System.out.println("El Total de la Suma es: " + suma);
    }
}
