package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HandlePerformance {
    Scanner scanner = new Scanner(System.in);
    Queue<Performance> performances = new LinkedList<>();
    public void handleperformance() {

        int choice = 0;
        while (choice !=4){
            System.out.println("enter you option");
            System.out.println("1.Add performances");
            System.out.println("2.Display all the performances");
            System.out.println("3.Start the performances");
            System.out.println("4.quit");
        }
        switch (choice){
            case 1:
                System.out.println("Enter the number of the performance you want to add");
                int number = scanner.nextInt();
                scanner.nextLine();
                addperformance(number);
                break;

            case 2:
                displayperformance();
                break;
            case 3:
                startperformance();
                break;
            case 4:
                break;
            default:
                System.out.println("you enter an unsure choice ,please try again. ");
        }



    }
public void addperformance(int num){
        for(int i = 0; i < num; i++){
            System.out.println("enter the performanceID");
            String id = scanner.nextLine();
            System.out.println("enter the performanceName");
            String name = scanner.nextLine();
            System.out.println("enter the leadName");
            String leadName = scanner.nextLine();
            System.out.println("enter you performanceGroup");
            int group = scanner.nextInt();
            scanner.nextLine();
            performances.add(new Performance(id,name,leadName,group));
            System.out.println("performance has been added");
        }
}
public void displayperformance(){
    System.out.println("Performances:");
    for (Performance performance : performances) {
        System.out.println(performance);
    }
}
public void startperformance(){
    if (!performances.isEmpty()) {
        Performance firstPerformance = performances.peek();
        System.out.println("First Performance:");
        System.out.println(firstPerformance);
    } else {
        System.out.println("No performances found.");
    }
}
}
