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

                case 2:
                    // Membre 2: Marcar una tasca com a completada
                    if (tasks.isEmpty()) {
                        System.out.println("No hi ha tasques per completar.");
                        break;
                    }

                    System.out.println("Selecciona el número de la tasca a marcar com a completada:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i).getDescription());
                    }
                    int taskIndex = scanner.nextInt() - 1;
                    if (taskIndex >= 0 && taskIndex < tasks.size()) {
                        tasks.get(taskIndex).setCompleted(true);
                        System.out.println("Tasca marcada com a completada!");
                    } else {
                        System.out.println("Número de tasca no vàlid.");
                    }
                    break;

                case 3:
                    // Membre 2: Mostrar la llista de tasques
                    if (tasks.isEmpty()) {
                        System.out.println("No hi ha tasques disponibles.");
                    } else {
                        System.out.println("Llista de tasques:");
                        for (int i = 0; i < tasks.size(); i++) {
                            Task task = tasks.get(i);
                            System.out.println((i + 1) + ". " + task.getDescription() + 
                                               " [Completada: " + task.isCompleted() + "]");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Sortint de l'aplicació...");
                    System.exit(0);

                default:
                    System.out.println("Opció no vàlida. Torna-ho a provar.");
            }
        }
    }
}
