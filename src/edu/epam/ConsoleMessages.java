package edu.epam;

public class ConsoleMessages extends ComputerLogics {
    public static void hasHumanLose() {
        System.out.println("Осталась 1 спичка. Человек проиграл");
    }

    public static void enterNumber() {
        System.out.print("Введите число от 1 до 3: ");
    }

    public static void hasComputerLose() {
        System.out.println("Осталась 1 спичка. Компьютер проиграл");
    }

}
