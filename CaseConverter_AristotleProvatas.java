/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caseconverter_aristotleprovatas;

import java.util.Scanner;

/**
 *
 * @author 6312971
 */
public class CaseConverter_AristotleProvatas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter a word: ");
        String word = input.next();
        
        System.out.print("Please choose the case you want to convert :\n"
                + "1. 'l' or 'L' for lowercase\n"
                + "2. 'u' or 'U' for uppercase\n"
                + "3. 't' or 'T' for titlecase\n");
        String userOption = input.next();
        String caseType = userOption.toLowerCase();
        
        String firstCase = toTitleCase(word);
        String userCase = "gg";
        
        if (caseType.equals("l")){
            userCase = toTitleCase(word);
        }
        if (caseType.equals("u")) {
            userCase = toUpperCase(word);
        }
        if (caseType.equals("t")) {
            userCase = toLowerCase(word);
        }

        System.out.printf("\n%-38s: %s\n%-38s: %s\n%-38s: %s\n","Original word",word,
                "Calling the first convertCase method",firstCase,
                "Calling the second convertCase method",userCase);
    }
    
    public static String toTitleCase(String newWord){
        String newUpperCaseVersion = newWord.toUpperCase();
        char firstLetter = newUpperCaseVersion.charAt(0);
        
        String endOfOriginalString = newWord.substring(1);
        String newEndOfString = endOfOriginalString.toLowerCase();
        
        String titleCase = firstLetter + newEndOfString;
        
        return titleCase;
    }
    
    public static String toUpperCase(String upperCaseWord) {
        String upperCaseVersion = upperCaseWord.toUpperCase();
        
        return upperCaseVersion;
    }   
    
    public static String toLowerCase(String lowerCaseWord) {
        String lowerCaseVersion = lowerCaseWord.toLowerCase();
        
        return lowerCaseVersion;
    }
}

