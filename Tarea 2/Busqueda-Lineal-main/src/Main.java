
public class Main{
    public static void main(String[] args) {
        int[] numeros = {8, 10 , 15 ,5 ,6};
        int numeroBuscado = 2;

        int comparaciones = busquedaLineal.buscar(numeros, numeroBuscado);
        System.out.println("Número de comparaciones realizadas: " + comparaciones);
    }
}



