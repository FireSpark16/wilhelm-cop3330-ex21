/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Xander Wilhelm
 */

package Ex21.base;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        
        int monthNum = myApp.getMonth();
        String month = myApp.selectMonth(monthNum);
        myApp.output(month);
        
    }

    private void output(String month) {
        System.out.print("The name of the month is " + month + ".");
    }

    private String selectMonth(int monthNum) {
        return switch (monthNum) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "beyond your comprehension :)";
        };
    }

    private int getMonth() {
        System.out.print("Please enter the number of the month: ");
        return Integer.parseInt(in.nextLine());
    }

}
