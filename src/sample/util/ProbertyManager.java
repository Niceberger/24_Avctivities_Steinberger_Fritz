package sample.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ProbertyManager {
    // Singleton
    private String filename;
    private Properties properties = new Properties();
    private static ProbertyManager instance;
    private String fileName = "";


    public static ProbertyManager getInstance() {
        if(instance == null) {
            instance = new ProbertyManager();
        }
        return instance;
    }
    public void setFilename(String filename) {
        this.filename = filename;
        this.fillProperties();
    }

    private void fillProperties() {
        try(FileReader reader = new FileReader(this.filename)) {
            properties.load(reader);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public String readProperty(String key,String defaultValue) {
        return this.properties.getProperty(key,defaultValue);
    }
}
