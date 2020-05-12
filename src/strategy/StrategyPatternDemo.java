/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.Scanner;

/**
 *
 * @author Ali Abo Al-khear
 */
public class StrategyPatternDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = input.nextInt();

        System.out.println("Enter the second number : ");
        int num2 = input.nextInt();

        Context context = new Context(new OperationAdd());
        System.out.println(num1 + " + " + num2 + " = " + context.executeStrategy(num1, num2));

        context = new Context(new OperationSubstract());
        System.out.println(num1 + " - " + num2 + " = " + context.executeStrategy(num1, num2));

        context = new Context(new OperationMultiply());
        System.out.println(num1 + " * " + num2 + " = " + context.executeStrategy(num1, num2));
    }
}
