package com.Dimmerling.week1;
        import java.util.*;
public class Main {
    static Scanner input = new Scanner(System.in);
    static HashMap<String, String> tasks = new HashMap<>();
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Please choose an option:\n" +
                "(1) Add a task.\n" +
                "(2) Remove a task.\n" +
                "(3) Update a task.\n" +
                "(4) List all tasks.\n" +
                "(0) Exit.");
        int userInput = Integer.parseInt(input.nextLine());
        while(userInput != 0) {

            switch (userInput) {
                case 1:
                    System.out.println("What task would you like to input");
                    addTask(input.nextLine());
                    break;
                case 2:
                    System.out.println("What task would you like to remove");
                    removeTask(input.nextLine());
                    break;
                case 3:
                    System.out.print("What task would you like to update");
                    updateTask(input.nextLine());
                    break;
                case 4:
                    System.out.println(tasks);
                    break;
                default:
                    System.out.println("That is not a valid input");
            }
            System.out.println("Please choose an option:\n" +
                    "(1) Add a task.\n" +
                    "(2) Remove a task.\n" +
                    "(3) Update a task.\n" +
                    "(4) List all tasks.\n" +
                    "(0) Exit.");
            userInput = Integer.parseInt(input.nextLine());
        }
    }

    public static void addTask(String personsInput){
        System.out.println("Please give a description of this task");
        String stringDesc = input.nextLine();
        tasks.put(personsInput,stringDesc);
    }

    public static void removeTask(String personsInput){
        if(tasks.containsKey(personsInput)){
            tasks.remove(personsInput);
        } else {
            System.out.println("That task doesn't exist");
        }
    }

    public static void updateTask(String personsInput) {
        if(tasks.containsKey(personsInput)){
            System.out.println("What is the new description of this task");
            String newDesc = input.nextLine();
            tasks.replace(personsInput,newDesc);

        } else {
            System.out.println("That task doesn't exist");
        }
    }
}
