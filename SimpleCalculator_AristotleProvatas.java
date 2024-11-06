/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simplecalculator_aristotleprovatas;

import java.util.Scanner;

/**
 *
 * @author 6312971
 */
public class SimpleCalculator_AristotleProvatas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter two numbers, separated by space: ");
        String num = input.nextLine();
        
        double firstValue = Double.parseDouble(num.substring(0,(num.indexOf(" ") + 1)));
        double secondValue = Double.parseDouble(num.substring(num.indexOf(" ") + 1));
        
        double firstMethod = doAddition(firstValue,secondValue);
        
        System.out.print("Please enter the operator (+, -, *, or /): ");
        String op = input.nextLine();
           
        double secondMethod = doOperation(firstValue,secondValue,op);
        
        System.out.print("Please enter a formular, e.g.: \"3.14 * 2\": ");
        String formula = input.nextLine();
        
        double firstValue2 = Double.parseDouble(formula.substring(0,(formula.indexOf(" ") + 1)));
        double secondValue2 = Double.parseDouble(formula.substring(formula.lastIndexOf(" ") + 1));
        String op2 = formula.substring((formula.indexOf(" ") + 1),(formula.indexOf(" ") + 2));
        
        double thirdMethod = doOperation(firstValue2,secondValue2,op2);
        
        System.out.printf("\n%-26s: %.2f + %.2f = %.2f\n%-26s: %.2f %s %.2f = %.2f\n%-26s: %s = %.2f\n","Calling the first method", firstValue,secondValue,firstMethod,"Calling the second method",firstValue,op,secondValue,secondMethod,"Calling the third method",formula,thirdMethod);
    }
    public static double doAddition(double firstVal, double secondVal) {
        double result = firstVal + secondVal;
        return result;
    }
    
    public static double doOperation(double firstV, double secondV, String operationType) {
        
        double answer = 0;
        
        if (operationType.equals("*")) {
            answer = firstV * secondV;
            
        }   else if (operationType.equals("-")) {
            
                answer = firstV - secondV;
                
        }   else if (operationType.equals("+")) {
            
                answer = firstV + secondV;
            
        }   else if (operationType.equals("/")) {
            
                answer = firstV / secondV;
        }
        return answer;
    }
}
