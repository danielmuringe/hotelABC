package com.example.hotelabc;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javafx.fxml.FXMLLoader;
import kotlin.ParameterName;

public class ApplicationUtils {

    public static List<String> listFiles(String directoryPath) {
        List<String> fileList = new ArrayList<String>();

        // Create a File object representing the directory
        File directory = new File(directoryPath);

        // Check if the directory exists and is a directory
        if (directory.exists() && directory.isDirectory()) {
            // Get the list of files in the directory
            File[] files = directory.listFiles();

            // Iterate through the list and append filenames to the StringBuilder
            if (files != null) {
                for (File file : files) {
                    fileList.add(file.getName());
                }
            }
        } else {
            throw new IllegalArgumentException("Invalid directory path: " + directoryPath);
        }

        return fileList;
    }

    public static class FXMLTemplates {

        private String templatesDirectory;

        public FXMLTemplates(String templatesDirectory) {
            this.templatesDirectory = templatesDirectory;
            load();
        }

        @SuppressWarnings("exports")
        public HashMap<String, FXMLLoader> all = new HashMap<String, FXMLLoader>();

        public void load() {
            for (String FXMLFileName : listFiles(this.templatesDirectory)) {
                String baseName = FXMLFileName.split(".fxml")[0];
                this.all.put(baseName, new FXMLLoader(HotelAbcApplication.class.getResource(FXMLFileName)));
            }
        }

        @SuppressWarnings("exports")
        public FXMLLoader get(String templateName) {
            return this.all.get(templateName);
        }
    }

}
