package ru.pozdnyakov;

import ru.pozdnyakov.lesson1.exercise1.Program1;
import ru.pozdnyakov.lesson1.exercise2.Program2;
import ru.pozdnyakov.lesson1.exercise3.Program3;
import ru.pozdnyakov.lesson1.exercise4.Program4;
import ru.pozdnyakov.lesson2.exercise1.Program21;
import ru.pozdnyakov.lesson2.exercise2.Program22;
import ru.pozdnyakov.lesson2.exercise3.Program23;
import ru.pozdnyakov.lesson2.exercise4.Program24;
import ru.pozdnyakov.lesson3.exercises.Program31;
import ru.pozdnyakov.lesson4.exercise1.Program41;
import ru.pozdnyakov.lesson4.exercise2.Program42;
import ru.pozdnyakov.lesson4.exercise3.Program43;



public class Menu {
    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            System.out.println("\n\nУРОК 1");            
            System.out.println("1. Задание 1");
            System.out.println("2. Задание 2");
            System.out.println("3. Задание 3");
            System.out.println("4. Задание 4");
            System.out.println("УРОК 2");
            System.out.println("5. Задание 1");
            System.out.println("6. Задание 2");
            System.out.println("7. Задание 3");
            System.out.println("8. Задание 4"); 
            System.out.println("УРОК 3");    
            System.out.println("9. Задания 1-4");
            System.out.println("УРОК 4");
            System.out.println("10. Задание 1");
            System.out.println("11. Задание 2");
            System.out.println("12. Задание 3");                             
            System.out.println("---");         
            System.out.println("13. Завершение работы приложения");
            int num = MyUtilities.inputNaturelNumber("Введите номер задания: ");

            switch (num) {
                case 1:
                    Program1.task1();
                    break;
                case 2:
                    Program2.task2();
                    break;
                case 3:
                    Program3.task3();
                    break;
                case 4:
                    Program4.task4();
                    break;
                case 5:
                    Program21.task1();
                    break;
                case 6:
                    Program22.task2();
                    break;
                case 7:
                    Program23.task3();
                    break;
                case 8:
                    Program24.task4();
                    break;   
                case 9:
                    Program31.task1234();
                    break;   
                case 10:
                    Program41.task1();
                    break;
                case 11:
                    Program42.task2();
                    break;
                case 12:
                    Program43.task3();
                    break;                                                      
                case 13:
                    flag = false;
                    System.out.println("\nДо новых встреч!");
                    System.out.println("Завершение работы приложения.");
                    break;

                default:
                    System.out.println("\nЗадания с таким номером не было.");
                    break;
            }

        }
    }
}
