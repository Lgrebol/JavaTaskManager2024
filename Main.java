package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Afegir tasca");
            System.out.println("2. Marcar tasca com a completada");
            System.out.println("3. Mostrar llista de tasques");
            System.out.println("4. Sortir");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    // Membre 1: Afegir nova tasca
                    System.out.println("Descripció de la nova tasca:");
                    scanner.nextLine();  // Per consumir la nova línia
                    String description = scanner.nextLine();
                    tasks.add(new Task(description));
                    System.out.println("Tasca afegida!");
                    break;
            }}}}
