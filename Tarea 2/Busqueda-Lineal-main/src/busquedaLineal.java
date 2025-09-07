public class busquedaLineal {
    public static int buscar(int[] arreglo, int valor_a_buscar) {
        int comparacionesRealizadas = 0;
        for (int i = 0; i < arreglo.length; i++) {
            comparacionesRealizadas++;
            if (arreglo[i] == valor_a_buscar) {
                System.out.println("Número encontrado");
                return comparacionesRealizadas;
            }
        }
        System.out.println("Número no encontrado");
        return comparacionesRealizadas;
    }
}
//Complejidad Temporal y Espacial
//Tn = 1+n+n+n+1+1+1 = 3+3n -> T(n)=n
//S(n) = 1+1+1 = 3





