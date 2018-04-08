package defaultpackage;

import java.util.Scanner;
/**
 *    Prompt.java
 *    Provide some utilities for user input.  We want to enhance the Scanner class,
 *    so that our programs can recover from "bad" input, and also provide a way to
 *    limit numerical input to a range of values.
 */
public class Prompt
{
    public static String getString (String ask)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print(ask + " -> ");
        String input = scanner.nextLine();
        return input;
    }

    public static int getInt (String ask)
    {
        boolean badInput = false;
        String input = new String("");
        int value = 0;
        do
        {
            badInput = false;
            input = getString(ask);
            try
            {
                value = Integer.parseInt(input);
            }
            catch(NumberFormatException e)
            {
                badInput = true;
            }
        } while (badInput);
        
        return value;
    }

    public static int getInt (String ask, int min, int max)
    {
        int value = 0;
        do
        {
            value = getInt(ask + " (" + min + " - " + max + ")");
        } while(value < min || value > max);
        return value;
    }
    
    public static double getDouble (String ask)
    {
        boolean badInput = false;
        String input = new String("");
        double value = 0.0;
        do
        {
            badInput = false;
            input = getString(ask);
            try
            {
                value = Double.parseDouble(input);
            }
            catch(NumberFormatException e)
            {
                badInput = true;
            }
        } while(badInput);
    
        return value;
    }

    public static double getDouble (String ask, double min, double max)
    {
        double value = 0.0;
        do
        {
            value = getInt(ask + " (" + min + " - " + max + ")");
        } while(value < min || value > max);
        return value;
    }
}



