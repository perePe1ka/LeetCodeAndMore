package org.example.SomePrograms;

import java.io.File;

public class ImageRenamer {
    public static void main(String[] args) throws InterruptedException {
        // Путь к папке с изображениями
        String folderPath = "C:/Users/PC/Desktop/Учёба/МИИТ/Нейронка/DataSetNew/вправо";

        // Получаем список файлов в папке
        File folder = new File(folderPath);
        File[] files = folder.listFiles();

        // Счетчик для нумерации изображений
        int count = 5000;

        // Перебираем файлы и переименовываем PNG изображения
        for (File file : files) {
            if (file.isFile() && file.getName().toLowerCase().endsWith(".png")) {
                // Создаем новое имя файла
                String newName = folderPath + File.separator + "image" + count + ".png";

                // Переименовываем файл
                file.renameTo(new File(newName));

                // Увеличиваем счетчик
                Thread.sleep(50);
                count++;
            }
        }

        System.out.println("Переименование завершено!");
    }
}
