package org.ies.tierno;
//Lo cambie para que encajara con mi proyecto. Antes era org.example.

import java.util.Scanner;

public class Refactor {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menuOptions();
    }

    public static void showMenu() {
        System.out.println("Elige una opción:");
        System.out.println("    1. Sumatorio");
        System.out.println("    2. Media");
        System.out.println("    3. Salir");
    }

    public static void menuOptions() {
        int option;
        do {
            showMenu();
            option = scanner.nextInt();
            scanner.nextLine();
            if (option == 1) {
                summation();
            } else if (option == 2) {
                average();
            } else if (option == 3) {
                exit();
            } else {
                optionNoValid();
            }
        } while (option != 3);
    }

    public static int askPositiveNumber() {
        int number;
        do {
            System.out.print("Introduce un entero positivo: ");
            number = scanner.nextInt();
            scanner.nextLine();
        } while (number <= 0);
        return number;
    }

    public static void summation() {
        int number = askPositiveNumber();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println("El sumatorio es " + sum);
    }

    public static void average() {
        System.out.print("¿Cuántos números vas a introducir? ");
        int number = askPositiveNumber();
        double sum = 0;
        for (int i = 0; i < number; i++) {
            System.out.print("Introduce un número:");
            sum += scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("La media es " + (sum / number));
    }

    public static void exit() {
        System.out.println("Saliendo...");
    }

    public static void optionNoValid() {
        System.out.println("Opción inválida");
    }
}
