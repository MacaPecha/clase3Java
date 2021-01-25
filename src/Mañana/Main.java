package Mañana;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("juan", 323);
        Persona p1 = new Persona("pepe", 223);
        Persona p2 = new Persona("toto", 24523);
        Persona p3 = new Persona("michi", 56);

        Celular c = new Celular( 323, "juan");
        Celular c1 = new Celular(223, "pepe");
        Celular c2 = new Celular(24523,"toto");
        Celular c3 = new Celular( 56,"michi");

        Persona arr[] = new Persona[4];
        arr[0] = p;
        arr[1] = p1;
        arr[2] = p2;
        arr[3] = p3;

        Celular arr2[] = new Celular[4];
        arr2[0] = c;
        arr2[1] = c1;
        arr2[2] = c2;
        arr2[3] = c3;

        System.out.println("---Personas---");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("---Celulares---");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        System.out.println("---Personas ordenado---");
        Persona[] arrOrd = (Persona[]) SortUtil.ordenar(arr);
        for (int i = 0; i < arrOrd.length; i++) {
            System.out.println(arrOrd[i]);
        }
        System.out.println("---Celulares ordenado---");
        Celular[] arr2Ord = (Celular[]) SortUtil.ordenar(arr2);
        for (int i = 0; i < arr2Ord.length; i++) {
            System.out.println(arr2Ord[i]);
        }

        System.out.println("---ORIGINALES---");
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arr2));
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

    }
}
