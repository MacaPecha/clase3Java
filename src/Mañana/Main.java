package Mañana;

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

        System.out.println("personas");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("celulares");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        SortUtil.ordenar(arr);
        SortUtil.ordenar(arr2);

        System.out.println("personas ordenado");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("celulares ordenado");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }



    }
}
