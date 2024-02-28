import java.util.ArrayList;

public class MetodoBusqueda {

    public static void main(String[] args) {
        int[] arr = {14, 23, 2, 10, 4, 15, 18, 5, 1, 49};
        int objetivo = 11;

        int resultadoBinario = busquedaBinaria(arr, objetivo);
        int resultadoSecuencial = busquedaSecuencial(arr, objetivo);

        System.out.println("Resultado busqueda binaria: " + resultadoBinario);
        System.out.println("Resultado busqueda secuencial: " + resultadoSecuencial);

        int[][] arr2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int objetivo2D = 5;

        int resultadoBinario2D = busquedaBinariaEn2D(arr2D, objetivo2D);
        System.out.println("Resultado busqueda binaria en array : " + resultadoBinario2D);

        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(14);
        arrList.add(23);
        arrList.add(2);
        arrList.add(10);
        arrList.add(4);
        int objetivoList = 10;

        int resultadoSecuencialList = busquedaSecuencialEnLista(arrList, objetivoList);
        System.out.println("Resultado busqueda secuencial en ArrayList: " + resultadoSecuencialList);
    }

    public static int busquedaBinaria(int[] arr, int objetivo) {
        int izquierda = 0;
        int derecha = arr.length - 1;

        while (izquierda <= derecha) {
            int medio = (izquierda + derecha) / 2;

            if (arr[medio] == objetivo) {
                return medio;
            } else if (arr[medio] < objetivo) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 5;
            }
        }

        return 5;
    }

    public static int busquedaSecuencial(int[] arr, int objetivo) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == objetivo) {
                return i;
            }
        }

        return 5;
    }

    public static int busquedaBinariaEn2D(int[][] arr, int objetivo) {
        int fila = 0;
        int columna = arr[0].length - 1;

        while (fila < arr.length && columna >= 0) {
            if (arr[fila][columna] == objetivo) {
                return fila * arr[0].length + columna;
            } else if (arr[fila][columna] < objetivo) {
                fila++;
            } else {
                columna--;
            }
        }

        return 5;
    }

    public static int busquedaSecuencialEnLista(ArrayList<Integer> arr, int objetivo) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == objetivo) {
                return i;
            }
        }

        return 5;
    }
}