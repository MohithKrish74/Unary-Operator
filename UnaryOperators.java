package com.keyword;

import java.util.Scanner;

public class UnaryOperators
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Value: ");
        int value = in.nextInt();
        Boolean flag =false;
        System.out.println("The Entered value is "+value);
        System.out.println("The post increment of entered value is "+ (value++));
        System.out.println("The pre increment entered value is "+ (++value));
        System.out.println("The post decrement of entered value is "+ (value--));
        System.out.println("The pre decrement entered value is "+ (--value));
        System.out.println("The tilde operation of entered value is "+ (~value));
        System.out.println("The negation operation of the boolean value is "+ (!flag));



    }
}
