package main;

import Command.*;
import observer.*;
import proxy.*;
import singleton.*;

//Home Automation
//Singleton ✅
//Observer ✅ - Notify all home members about admin actions
//Proxy ✅
//Command ✅

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Home home = Home.getInstance();
        int option = 0;
        Scanner sc = new Scanner(System.in);
        String input = "";
        while (option != 3) {
            home.printMenu();
            input = sc.nextLine();
            option = Integer.parseInt(input);
            if (option == 1) {
                System.out.println("Want to login as Home owner ?");
                System.out.println("1. Yes\n2. No");
                input = sc.nextLine();
                int selection = Integer.parseInt(input);
                if (selection == 1) {
                    System.out.print("Enter name: ");
                    String user = sc.nextLine();
                    System.out.print("Enter password: ");
                    String pass = sc.nextLine();
                    home.addNewHomeMember(user, pass);
                } else {
                    home.addNewHomeMember("user", "123");
                }
            }
            if (option == 2) {
                System.out.println("Do you want to turn On or Off ?");
                System.out.println("1. ON");
                System.out.println("2. OFF");
                int op = 0;
                input = sc.nextLine();
                op = Integer.parseInt(input);
                System.out.println("Which home appliance you want to turn ON/OFF ?");
                System.out.println("1. AC");
                System.out.println("2. TV");
                System.out.println("3. Refrigerator");
                input = sc.nextLine();
                int selection = Integer.parseInt(input);
                if (selection == 1) {
                    home.turnOnOffHomeAppliances("AC", op);
                }
                if (selection == 2) {
                    home.turnOnOffHomeAppliances("TV", op);
                }
                if (selection == 3) {
                    home.turnOnOffHomeAppliances("Refrigerator", op);
                }
            }
        }
    }
}
