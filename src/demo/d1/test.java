package demo.d1;

import java.util.Scanner;

import WorkHour.WorkHour;

/**
 * Application to calculate the correct workhours
 * @author Esa Kesti
 * @version 5.9.2022
 *
 */
public class test {
    
    private int[] h;
    private int m = 0;
    
    /**
     * @param h hours
     * @param m minuts
     */
    public test(int[] h, int m) {
        this.h = h;
        this.m = m;
    }
    /**
     * @param days constructo
     */
    public test(int[] days) {
        this.h = days;
    }

    /**
     * @param args not in use
     */
    public static void main(String[] args) {
       
        
        
        int[] days = new int[5];
        int summa = 0;
        
        try (Scanner uInput = new Scanner (System.in)) {
            for (int i = 0; i < days.length; i++) {
                System.out.println("Enter the hours of the day: ");
                days[i] = uInput.nextInt();
                test i1 = new test(days);
                
                
            }
        }
        
        for (int i = 0; i < days.length; i++)
            summa += days[i];
 
        System.out.println(summa);
    }
    }
