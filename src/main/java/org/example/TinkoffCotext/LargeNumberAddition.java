package org.example.TinkoffCotext;

public class LargeNumberAddition {

    public static String addLargeNumbers(String num1, String num2) {
        // Убедимся, что строки одинаковой длины
        if (num1.length() > num2.length()) {
            num2 = "0".repeat(num1.length() - num2.length()) + num2;
        } else if (num2.length() > num1.length()) {
            num1 = "0".repeat(num2.length() - num1.length()) + num1;
        }

        StringBuilder result = new StringBuilder();
        int carry = 0;
        
        // Проходимся по числам с конца к началу
        for (int i = num1.length() - 1; i >= 0; i--) {
            int digit1 = num1.charAt(i) - '0'; // Преобразуем символ в цифру
            int digit2 = num2.charAt(i) - '0'; // Преобразуем символ в цифру
            
            int sum = digit1 + digit2 + carry; // Суммируем цифры и перенос
            carry = sum / 10; // Вычисляем новый перенос
            result.append(sum % 10); // Добавляем последнюю цифру суммы
        }

        // Если остался перенос, добавляем его
        if (carry > 0) {
            result.append(carry);
        }

        // Результат в обратном порядке, нужно перевернуть
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        String num1 = "123456789012345678901234567890";
        String num2 = "987654321098765432109876543210";

        String result = addLargeNumbers(num1, num2);
        System.out.println("Result: " + result);
    }
}