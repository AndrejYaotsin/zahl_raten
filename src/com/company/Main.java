package com.company;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static int randNummer = ThreadLocalRandom.current().nextInt(1 ,100+ 1);
    public static int count = 0;

    public static void main(String[] args) {
        deinName();
        age();
        nextRound();
    }
    public static void deinName () {
        System.out.println("Hallo wie heiß du?");
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        System.out.println("Hallo " + name);
    }
    public static void age () {
        System.out.println("Wie alt bis du?");
        Scanner console = new Scanner(System.in);
        int alt = console.nextInt();
        if (alt >= 18) {
            System.out.println("Gib eine Zahl bitte ein: ");
        }else {
            System.out.println("Es tut mir leid , Du bist zu jung!");
            System.exit(1);
        }
    }
    public static void nextRound() {
        count++;
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        numberSuch(number);

    }
    public static void numberSuch(int number) {
        if (number == randNummer) {
            System.out.println("YUHU!!! Du hast gewonen!");
            System.out.println("Du hast " + count + " mal versuchst!") ;
        } else {
            System.out.println("Du hast falsch geraten");
            if (number < randNummer) {
                System.out.println("Deine Zahl ist zu klein!");
            } else {
                System.out.println("Deine Zahl ist zu groß!");
            }
            nextRound();
        }
    }
}