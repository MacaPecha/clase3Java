package Mañana;

public class SortUtil {
    public static <T> Precedable<T>[] ordenar(Precedable<T> arr[]){
        Precedable<T>[] nuevo = arr.clone();
        for (int j = 0; j < nuevo.length; j++) {
            for (int i = 0; i < nuevo.length - 1; i++) {
                if(nuevo[i].precedeA((T) nuevo[i+1]) > 0){
                    Precedable<T> aux = nuevo[i];
                    nuevo[i] = nuevo[i+1];
                    nuevo[i+1] = aux;
                }
            }
        }
        return nuevo;
    }
}
