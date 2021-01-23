public class NumerosConsecutivos {
    public static void main(String [] args){
        int contador = 1;
        int suma = 0;

        while(contador <= 10){
            System.out.println("Contador + Suma: " + contador + " + " + suma + " = " + (contador+suma));
            suma = contador + suma;
            contador++;
        }

        System.out.println("El Total de la Suma es: " + suma);
    }
}
