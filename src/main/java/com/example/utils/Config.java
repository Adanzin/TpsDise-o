package com.example.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {
    private static Config instance;
    private Properties properties;

    // Constructor privado
    private Config(String filePath) {
        properties = new Properties();
        try (FileInputStream input = new FileInputStream(filePath)) {
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método público para obtener la instancia
    public static Config getInstance() {
        if (instance == null) {
            instance = new Config("./src/main/java/configurations.properties");
        }
        return instance;
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}