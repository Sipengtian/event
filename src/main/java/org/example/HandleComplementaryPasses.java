package org.example;
import java.lang.reflect.Type;
import java.util.Scanner;
import java.util.Stack;
public class HandleComplementaryPasses {

    Scanner reader = new Scanner(System.in);

    Stack<ComplementaryPasses> comPassess = new Stack<>();

    public void handleComplenmentaryPasses(){
        int choice = 0;
        do{
            System.out.println("\n"+"Here are the complementary passes operations available to you:"+"\n");
            System.out.println("1.to redeem complementary passes:" + "\n");
            System.out.println("2.to display the list of the complementary passes" + "\n");
            System.out.println("3.to display the last redeemed complementary pass" + "\n");
            System.out.println("4.to undo any of the redeemed complementary pass" + "\n");
            System.out.println("5. TO QUIT" + "\n");
            choice = reader.nextInt();
            reader.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("How many complementary passes would you like to redeem?");
                    int num = reader.nextInt();
                    reader.nextLine();
                    redeemComplementaryPasses(num);
                    break;
                case 2:
                    displayComplementaryPasses();
                    break;
                case 3:
                    displayLastRedeemComplementaryPass();
                    break;
                case 4:
                    undoRedeemComplementaryPass();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("This is a not exit choice , please enter a exit choice.");
            }
        }while (choice !=5);

    }
    public void redeemComplementaryPasses(int numOfPases) {
        if (numOfPases >= 10 || comPassess.size() >=10) {
            System.out.println("\n" + "Invalid operation. All the passes have been redeemed");
            System.out.println("You can choice to see the list of the redeemed complementary passes.Please enter (Yes/No)");
            char choice = reader.nextLine().charAt(0);
            if (choice == 'Y') {
                displayComplementaryPasses();
                return;
            }
        }
        else{

            for (int i =0;i<numOfPases;i++){
                System.out.println("Enter the Complementary Pass ID: ");
                String ID = reader.nextLine();

                System.out.println("enter tne access level:");
                String accessLevel = reader.nextLine();

                ComplementaryPasses pass = new ComplementaryPasses(ID, accessLevel);
                comPassess.push(pass);

            }
        }

    }
    public void displayComplementaryPasses(){
        System.out.println("The list of Complementary Passes:" + "\n" + comPassess);

    }

    public void displayLastRedeemComplementaryPass(){
        System.out.println("The last redeem complementary is" + comPassess.peek());
}
    public void undoRedeemComplementaryPass(){
        System.out.println("Enter the Pass ID you want to undo: ");
        String ID = reader.nextLine();
        for(ComplementaryPasses pass : comPassess){
            if(pass.getPassID().equals(ID)){
                comPassess.pop();
                System.out.println("The pass with the ID" + ID +"has been removed from the redeem list");
            }
        }
    }





















}
