/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.oop;
import java.util.Scanner;
import com.leapfrog.oop.util.CalculatorHelper;
/**
 *
 * @author OWNER
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        CalculatorHelper helper = new CalculatorHelper();
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter First Number");
        double x = input.nextDouble();
        
        System.out.println("Enter Second Number");
        double y = input.nextDouble();
        
        System.out.println("SELECT OPERATOR(+,-,*,/)");
        String op = input.next();
        
        
        if(op.equals("+"))
        {
            double sum = helper.add(x, y);
            System.out.println("SUM =" +sum);
        }
        
        else if(op.equals("-"))
        {
            double sub = helper.sub(x, y);
            System.out.println("SUM =" +sub);
        }
        
        else if(op.equals("*"))
        {
            double mul = helper.mul(x, y);
            System.out.println("SUM =" +mul);
        }
         
        else if(op.equals("/"))
        {
            double div = helper.div(x, y);
            System.out.println("SUM =" +div);
        }
        
        else if(op.equals("^"))
        {
            System.out.println("The power is =" +helper.powerMethod(x, y));
        }
        else 
        {
            System.out.println("INVALID OPERATOR");
        }
       
        System.out.println("Maximum between two numbers are" +helper.maxMethod(x, y));
        System.out.println("Minimum between two numbers are" +helper.minMethod(x, y));
    }
    
}
