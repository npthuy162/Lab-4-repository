package com.mycompany.texteditorhistory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            TextEditor editor = new TextEditor();
            int choice;
            
            do {
                System.out.println("\n=== Text Editor ===");
                System.out.println("1. Add Text");
                System.out.println("2. Undo");
                System.out.println("3. Redo");
                System.out.println("4. Show Current Text");
                System.out.println("0. Exit");
                System.out.print("Choose an option: ");
                
                choice = scanner.nextInt();
                scanner.nextLine();
                
                switch (choice) {
                    
                    case 1:
                        System.out.print("Enter text: ");
                        String text = scanner.nextLine();
                        editor.add(text);
                        editor.printCurrent();
                        break;
                        
                    case 2:
                        System.out.println("After undo: " + editor.undo());
                        break;
                        
                    case 3:
                        System.out.println("After redo: " + editor.redo());
                        break;
                        
                    case 4:
                        editor.printCurrent();
                        break;
                        
                    case 0:
                        System.out.println("Goodbye!");
                        break;
                        
                    default:
                        System.out.println("Invalid option.");
                }
                
            } while (choice != 0);
        }
    }
}
