package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesUtils {


//    public void getMavenProperties() {
//        java.io.InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("my.properties");
//        java.util.Properties properties = new Properties();
//        properties.load(inputStream);
//        String URLfromProp = properties.getProperty("kol");
//
//    }


//}


    public static final String PROP_FILE_NAME = "config.properties";
    private static Map<String, String> props = getPropValues();


    public static String getStringValue(String key) {
        return props.get(key);
    }

    public static long getLongValue(String key) {
        return Long.parseLong(props.get(key));
    }


    public static String getProp(String key) {
        props = getPropValues();
        return props.get(key);
    }

    public static Map<String, String> getPropValues() {
        Map<String, String> props = new HashMap<>();
        InputStream inputStream = null;

        try {
            Properties prop = new Properties();

            File currentDirectory = new File(new File(".").getAbsolutePath());
            inputStream = new FileInputStream(currentDirectory.getCanonicalPath() + "Properties/config.properties");

            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException(String.format("property file '%s' not found in the classpath", PROP_FILE_NAME));
            }

            Set<Object> keys = prop.keySet();
            for (Object key : keys) {
                String k = (String) key;
                props.put(k, prop.getProperty(k));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return props;
    }
}
