import java.util.Scanner;

public class HomeRenoCalculator {

    public static Scanner numscan = new Scanner(System.in);
    public static Scanner wordscan = new Scanner(System.in);

    public static void main(String[] args) {
        int width;
        int length;
        int height;
        int doors;
        int remove;
        int option;

        boolean run = true;
        boolean options = true;

        System.out.println();
        System.out.println("WELCOME TO HARSH'S OUTRAGEOUS RENO SHOP");
        System.out.println();

        while (run == true) {
            System.out.println();
            System.out.println("What is the width of the room in feet? Whole numbers only.");
            width = numscan.nextInt();

            System.out.println();
            System.out.println("What is the length of the room in feet? Whole numbers only.");
            length = numscan.nextInt();

            System.out.println();
            System.out.println("What is the height of the room in feet? Whole numbers only.");
            height = numscan.nextInt();

            System.out.println();
            System.out.println("How many doors are in the room");
            doors = numscan.nextInt();
            remove = doors * 20;

            while (options == true) {
                System.out.println();
                System.out.println("Which of the following estimates would you like to view first?");
                System.out.println("1. Flooring");
                System.out.println("2. Painting");
                System.out.println("3. Wallpaper");
                System.out.println("4. Hottub");
                System.out.println();
                System.out.println("Please enter the NUMERICAL VALUE of the option you would like to view below.");
                option = numscan.nextInt();

                if (option == 1) {
                    flooring(width, length);
                } else if (option == 2) {
                    painting(width, length, height, remove);
                } else if (option == 3) {
                    wallpaper(width, length, height, remove);
                } else if (option == 4) {
                    hottub(width, length);
                }

                System.out.println();
                System.out.println("Do you want the estimates for another feature? Yes or No");
                String check = wordscan.nextLine();
                if (check.equalsIgnoreCase("yes")) {
                    options = true;
                } else {
                    options = false;
                }
            }//end while options

            System.out.println();
            System.out.println("Do you want the estimates for another room? Yes or No");
            String Estimates = wordscan.nextLine();
            if (Estimates.equalsIgnoreCase("yes")) {
                run = true;
                options = true;
            } else {
                run = false;
            }
        }//end while run

    }//end main

    public static void flooring(int width, int length) {
        int floor = width * length;
        int carpeting = 5;
        System.out.println();
        System.out.println("Your total square feet is " + floor);
        System.out.println("Our carpeting price per square foot is $" + carpeting);
        System.out.println("Your total will be $" + (floor * carpeting));
    }//end flooring

    public static void painting(int width, int length, int height, int remove) {
        int wall = (width * height * 2) + (length * height * 2);
        int wallWithoutDoor = (wall - remove);
        int ppg = 15;
        int price = ppg * (wallWithoutDoor / 350);
        System.out.println();
        System.out.println("Your total square feet is " + wall);
        System.out.println("Your total square feet without doors is " + wallWithoutDoor);
        System.out.println("That requires " + (wallWithoutDoor / 350) + " gallons of paint");
        System.out.println("Price per gallon is $" + ppg);
        System.out.println("Your total will be $" + price);
    }// end paining

    public static void wallpaper(int width, int length, int height, int remove) {
        int wall = (width * height * 2) + (length * height * 2);
        int wallWithoutDoor = (wall - remove);
        int roll = 35;
        int ppr = 30;
        int cost = ppr * (wallWithoutDoor / roll);
        System.out.println();
        System.out.println("Your total square feet is " + wall);
        System.out.println("Your total square feet without doors is " + wallWithoutDoor);
        System.out.println("That requires " + (wallWithoutDoor / roll) + " rolls of wallpaper");
        System.out.println("Price per gallon is $" + ppr);
        System.out.println("Your total will be $" + cost);
    }

    public static void hottub(int width, int length) {
        System.out.println();
        if (width > length) {
            double volume = (double) Math.PI * Math.pow((width / 2) - 2, 2) * (3);
            System.out.println("The largest diameter tub you can fit is " + (width - 4));
            System.out.println("The volume of water needed to fill the tub is " + volume + " feet cubed");
        }//if width is greater
        else if (length < width) {
            double volume = (double) Math.PI * Math.pow((length / 2) - 2, 2) * (3);
            System.out.println("The largest diameter tub you can fit is " + (length - 4));
            System.out.println("The volume of water needed to fill the tub is " + volume + " feet cubed");
        }//if length is greater
        else if (length == width) {
            double volume = (double) Math.PI * Math.pow((length / 2) - 2, 2) * (3);
            System.out.println("The largest diameter tub you can fit is " + (length - 4));
            System.out.println("The volume of water needed to fill the tub is " + volume + " feet cubed");
        }//if width = length
    }//end hottub

}//end class
