package com.softserve.TASK.Conditions.n2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
         * Enter the number of the day of the week. Display the name in three languages.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the day of the week: ");
        int day = sc.nextInt();
        switch(day) {
            case 1:{
                System.out.println("Monday, понеділок, понедельник ");
                break;
            }
            case 2:{
                System.out.println("Tuesday, вівторок, вторник ");
                break;
            }
            case 3:{
                System.out.println("Wednesday, середа, среда ");
                break;
            }
            case 4:{
                System.out.println("Thursday, четвер, четверг ");
                break;
            }
            case 5:{
                System.out.println("Friday, п'ятниця, п'ятница ");
                break;
            }
            case 6:{
                System.out.println("Saturday, субота, субота ");
                break;
            }
            case 7:{
                System.out.println("Sunday, неділя, воскресенье ");
                break;
            }

        }
    }

}

