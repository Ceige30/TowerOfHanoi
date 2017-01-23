package com.company;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int totalD = 0;

        System.out.println("Tower of Hanoi Game.");
        System.out.println("This program will solve this puzzle for you.");
        System.out.println("Please input number of disks to solve for:");
        while(totalD < 1)
        {
            try
            {
                totalD = input.nextInt();
                if(totalD < 1)
                    throw new Exception();
            }
            catch(Exception e)
            {System.out.println("The amount of disks you want must be higher than one");}
        }
        TowersOfHanoi tower = new TowersOfHanoi(totalD);
        System.out.println("Instructions:");
        tower.solve();
        System.out.println("Complete");
    }
}