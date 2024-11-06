/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulochecker_aristotleprovatas;

import java.util.Scanner;

/**
 *
 * @author 6312971
 */
public class ModuloChecker_AristotleProvatas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter a number and a base, separated by space: ");
        int num = input.nextInt();
        int base1 = input.nextInt();      
        isDivisible(num,base1);
        
        System.out.print("\nPlease enter an English letter: ");       
        String eLetter = input.next();
        char englishLetter = eLetter.charAt(0);
        
        System.out.print("Please enter a number base and an English letter base, seperated by space: ");
        int num2 = input.nextInt();
        String strBase = input.next();        
        char base2 = strBase.charAt(0);
        
        System.out.print("\n");
        
        isDivisible(englishLetter,num2);
        isDivisible(englishLetter,base2);
       
    }
    public static int letterToNumber(char c) {
        char letter = Character.toUpperCase(c);
        int num = letter - 65;
        return num;
    }
    public static void isDivisibleBy3(int num) {
        boolean answer = (num % 3 == 0);
        if (answer == true) {
            System.out.println(num+" is divisible by 3");
        }   else if (answer == false) {
            System.out.println(num+" is not divisible by 3");
        }
    }
    public static void isDivisible(int num, int base) {
        boolean answer = (num % base == 0);
        if (answer == true) {
            System.out.println(num+" is divisible by "+base);
        }   else if (answer == false) {
            System.out.println(num+" is not divisible by "+base);
        }
    }
    public static void isDivisible(int num,char base) {
        boolean answer = (num % (base - 0) == 0);
        letterToNumber(base);
        if (answer == true) {
            System.out.println(num+" is divisible by \'"+base+"\'");
        }   else if (answer == false) {
            System.out.println(num+" is not divisible by \'"+base+"\'");
        }
    }
    public static void isDivisible(char num,int base) {
        char letter = Character.toUpperCase(num);
        int num1 = letter - 65;
        boolean answer = (num1 % base == 0);
        if (answer == true) {
            System.out.println("\'"+num+"\' is divisible by "+base);
        }   else if (answer == false) {
            System.out.println("\'"+num+"\' is not divisible by "+base);
        }
    }
    public static void isDivisible(char num,char base) {
        letterToNumber(base);
        char letter = Character.toUpperCase(num);
        int num1 = letter - 65;
        boolean answer = (num1 % letter == 0);
        if (answer == true) {
            System.out.println("\'"+num+"\' is divisible by \'"+base+"\'");
        }   else if (answer == false) {
            System.out.println("\'"+num+"\' is not divisible by \'"+base+"\'");
        }
    }
}
