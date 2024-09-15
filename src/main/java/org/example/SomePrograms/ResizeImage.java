package org.example.SomePrograms;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ResizeImage {

    public static void main(String[] args) {
        // Путь к папке с исходными изображениями
        File inputFolder = new File("C:/Users/PC/Desktop/Учёба/МИИТ/Нейронка/DataSetNew/спина");
        // Путь к папке для сохранения изменеsнных изображений
        File outputFolder = new File("C:/Users/PC/Desktop/Учёба/МИИТ/Нейронка/DataSetNew/spinaNew");

        // Убедимся, что папка для вывода существует
        if (!outputFolder.exists()) {
            outputFolder.mkdirs();
        }

        // Перебираем все файлы в папке с входными изображениями
        for (File inputFile : inputFolder.listFiles()) {
            if (inputFile.isFile() && inputFile.getName().endsWith(".png")) {
                try {
                    // Читаем изображение
                    BufferedImage originalImage = ImageIO.read(inputFile);
                    // Меняем размер изображения
                    BufferedImage resizedImage = resizeImage(originalImage, 350, 350);
                    // Создаем файл для записи измененного изображения
                    File outputFile = new File(outputFolder, inputFile.getName());
                    // Записываем измененное изображение в файл
                    ImageIO.write(resizedImage, "png", outputFile);
                    System.out.println("Записали " + inputFile.getName() + " файл");
                } catch (IOException e) {
                    System.out.println("Error processing file: " + inputFile.getName());
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Кончили");
    }

    private static BufferedImage resizeImage(BufferedImage originalImage, int targetWidth, int targetHeight) {
        Image resultingImage = originalImage.getScaledInstance(targetWidth, targetHeight, Image.SCALE_SMOOTH);
        BufferedImage outputImage = new BufferedImage(targetWidth, targetHeight, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = outputImage.createGraphics();
        g2d.drawImage(resultingImage, 0, 0, null);
        g2d.dispose();
        return outputImage;
    }
}
