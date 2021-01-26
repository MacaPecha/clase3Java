package Tarde;

public class SorterFactory {
    public static Sorter crearSorter(){
        return new QuickSortSorterImple();
    }
}
