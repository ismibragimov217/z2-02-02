package org.example;

public class Main{
    public static void main(String[] args) {
        // Параметры старой версии
        long gold = 1500000000L;
        byte silver = 50;
        short wood = 3000;
        long health = 75;
        boolean hasHelper = true;

        // Сохранение параметров в новые переменные
        int characterGold = (int) gold;
        int characterSilver = silver * 100;
        double characterWood = wood;
        byte characterHealth = (byte) health;
        byte characterHelpersNumber = hasHelper ? (byte) 1 : (byte) 0;

        // Вывод значений новых переменных
        System.out.println("Character Gold: " + characterGold);
        System.out.println("Character Silver: " + characterSilver);
        System.out.println("Character Wood: " + characterWood);
        System.out.println("Character Health: " + characterHealth);
        System.out.println("Character Helpers Number: " + characterHelpersNumber);
    }
}


