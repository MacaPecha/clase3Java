package Tarde;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

public class MyFactory {

    public static Object getInstance(String objName) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class c = Class.forName(objName);
        Object clase = c.newInstance();
        return clase;
    }


}
