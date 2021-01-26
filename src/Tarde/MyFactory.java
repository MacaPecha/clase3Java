package Tarde;

public class MyFactory {

    public static Object getInstance(String objName) throws  ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class c = Class.forName(objName);
        Object clase = c.newInstance();
        return clase;
    }

}
