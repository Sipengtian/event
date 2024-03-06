package org.example;

import java.util.Scanner;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击间距中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    System.out.print("Enter Event ID: ");
    String eventID = scanner.nextLine();

    System.out.print("Enter Event Name: ");
    String eventName = scanner.nextLine();

    System.out.print("Enter Event Venue: ");
    String eventVenue = scanner.nextLine();

    System.out.print("Enter Event Date: ");
    String eventDate = scanner.nextLine();

    Event event = new Event(eventID, eventName, eventVenue, eventDate);



    boolean exit = false;
    while (!exit) {
        System.out.println("\n--- Event Organizer Menu ---");
        System.out.println("1. Add Attendee");
        System.out.println("2. Remove Attendee");
        System.out.println("3. Update Attendee");
        System.out.println("4. Find Attendee");
        System.out.println("5. Display Event Details");
        System.out.println("6. Exit");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Enter Attendee Name: ");
                String attendeeName = scanner.nextLine();
                event.addAttendee(attendeeName);
                break;
            case 2:
                System.out.print("Enter Attendee Name: ");
                String removeName = scanner.nextLine();
                event.removeAttendee(removeName);
                break;
            case 3:
                System.out.print("Enter Old Attendee Name: ");
                String oldName = scanner.nextLine();
                System.out.print("Enter New Attendee Name: ");
                String newName = scanner.nextLine();
                String app= event.updateAttendee(oldName, newName);
                System.out.print(app);
                break;
            case 4:
                System.out.print("Enter Attendee Name: ");
                String findName = scanner.nextLine();
                System.out.println(event.findAttendee(findName));
                break;
            case 5:
                System.out.println(event.toString());
                break;
            case 6:
                exit = true;
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}
}

