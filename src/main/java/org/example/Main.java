package org.example;

import java.util.Scanner;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击间距中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Event event = new Event();
    HandleComplementaryPasses complementaryPasses = new HandleComplementaryPasses();
    HandlePerformance handlePerformance = new HandlePerformance();

    int choice ;
    do {
        System.out.println("\n--- Event Organizer Menu ---");
        System.out.println("1. Display Event Details");
        System.out.println("2. enter Attendee information");
        System.out.println("3. remove Attendee");
        System.out.println("4. update Attendee");
        System.out.println("5. find Attendee");
        System.out.println("6. display all the attendees from the event");
        System.out.println("7.enter 7 to over the program");
        System.out.println("8. Handle complementary passes");
        System.out.println("9.Handle performances");
        System.out.println("10.Get seat details");
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();
        scanner.nextLine();
        event.organizedEvent(choice);
        if(choice ==8){
        complementaryPasses.handleComplenmentaryPasses();
        }
        if(choice ==9){
            handlePerformance.handleperformance();
        }
    }while (choice !=7);
    scanner.close();
}
}





