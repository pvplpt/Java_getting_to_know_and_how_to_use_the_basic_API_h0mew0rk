/*
 * Задание 2. Реализуйте алгоритм сортировки пузырьком числового массива, 
 * результат после каждой итерации запишите в лог-файл.
 */
package ru.pozdnyakov.lesson2.exercise2;

import java.io.File;
import java.io.FileWriter;

import ru.pozdnyakov.MyUtilities;

public class Program22 {
    public static void main(String[] args) {
        task2();
    }

    public static void task2() {
        int sizeArray = MyUtilities.inputNaturelNumber("Введите размер массива: ");
        int[] array = MyUtilities.createArrayInteger(sizeArray, -100, 100);
        System.out.println("\nИсходный массив: ");
        MyUtilities.printArrayInteger(array);

        sortBubbleWithLog(array);

        System.out.println("\nОтсортированный массив: ");
        MyUtilities.printArrayInteger(array);
    }

    static void sortBubbleWithLog(int[] arr) {
        if (arr.length < 2)
            return;
        File logFile = new File("log_ex2_les2.txt");
        System.out.println("\nРезультат каждой итерации будет записан в лог-файл: ");
        System.out.println(logFile.getAbsolutePath());

        try (FileWriter fileWriter = new FileWriter(logFile, false)) {
            for (int i = 1; i < arr.length; i++) {
                boolean isSorted = true;
                for (int j = 0; j < arr.length - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        isSorted = false;
                        int tmp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = tmp;
                    }
                    fileWriter.write(MyUtilities.intArrayToString(arr) + "\n");
                }
                if (isSorted) {
                    return;
                }
            }

        } catch (Exception e) {
            System.out.println("Ошибка работы с файлом!");
        }

    }
}
