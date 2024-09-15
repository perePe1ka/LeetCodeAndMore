package org.example.SomePrograms;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

public class DirectoryToJson {
    public static void main(String[] args) {
        // Укажите путь к директории
        String directoryPath = "C:/Users/PC/Desktop/Учёба/МИИТ/Нейронка/DataSetNew/спина";

        // Создаем объект для директории
        File directory = new File(directoryPath);

        // Проверяем, является ли путь директорией
        if (directory.isDirectory()) {
            // Получаем список всех файлов в директории
            File[] files = directory.listFiles();

            // Создаем JSON массив для хранения данных
            JsonArray jsonArray = new JsonArray();

            // Проходимся по всем файлам
            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        // Создаем JSON объект для каждого файла
                        JsonObject jsonObject = new JsonObject();
                        jsonObject.add("image_name", new JsonPrimitive(file.getName()));
                        jsonObject.add("position_of_policman", new JsonPrimitive("спина"));
                        jsonObject.add("what_to_do", new JsonPrimitive("стоп"));

                        // Добавляем JSON объект в JSON массив
                        jsonArray.add(jsonObject);
                    }
                }
            }

            // Записываем JSON массив в файл
            try (FileWriter fileWriter = new FileWriter("output_spina.json")) {
                fileWriter.write(jsonArray.toString());
                System.out.println("JSON файл успешно создан!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Указанный путь не является директорией.");
        }
    }
}
