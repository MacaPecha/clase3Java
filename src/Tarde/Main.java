package Tarde;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {
        Sorter s = null;
        try {
            s = (Sorter) MyFactory.getInstance(getPropValues());
        } catch (Exception e) {
            e.printStackTrace();
        }
        Integer[] iArr = new Integer[100000];
        Comparator<Integer> comparatorInteger = (a,b) -> a-b;
        Comparator<String> comparatorString = (a,b) -> a.length()-b.length();
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = iArr.length - i;
        }

        String[] sArr = new String[3];
        sArr[0] = "wqer";
        sArr[1] = "wettyy";
        sArr[2] = "e";

        Time inicial = new Time();
        inicial.start();
        s.sort(iArr, comparatorInteger);
        inicial.stop();
        System.out.println(inicial.elapsedTime());
        s.sort(sArr, comparatorString);
//        System.out.println(Arrays.toString(iArr));
//        System.out.println(Arrays.toString(sArr));


    }

    public static String getPropValues() {
        Properties prop = null;
        try (InputStream input = new FileInputStream("/Users/mpecha/Documents/ProyectosBootcamp/clase3Java/src/Tarde/MiFactory.properties")) {
            prop = new Properties();
            prop.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return prop.getProperty("sorter");
    }

}
