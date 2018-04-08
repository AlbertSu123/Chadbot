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
    /**
     *    Prompts the user for a string of characters and returns the string.
     *    @param ask    the prompt
     *    @return        the input string from user
     */
    public static String getString (String ask)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print(ask + " -> ");
        String input = scanner.nextLine();
        return input;
    }
    
    /**
     *    Prompts the user for a character and returns the character.
     *     @param ask    the prompt
     *     @return     the character input from user
     */
    public static char getChar (String ask)
    {
        boolean badInput = false;
        String input = new String("");
        char character = 'a';
        do{
            badInput = false;
            input = getString(ask);
            if(input.length() > 1)
                badInput = true;
            else
                character = input.charAt(0);
        } while(badInput);
        return character;
    }
    
    /**
     *    Prompts the user for an integer and returns the integer.
     *     @param ask    the prompt line
     *     @return        the integer input from user
     */
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
    
    /**
     *    Prompts the user for an integer using a range of min to max,
     *    and returns the integer.
     *     @param ask    the prompt line
     *     @param min    the minimum integer accepted
     *     @param max    the maximum integer accepted
     *     @return        the integer input from user
     */
    public static int getInt (String ask, int min, int max)
    {
        int value = 0;
        do
        {
            value = getInt(ask + " (" + min + " - " + max + ")");
        } while(value < min || value > max);
        return value;
    }
    
    /**
     *    Prompts user for a double and returns the double
     *     @param ask    the prompt line
     *     @return        the double input from user
     */
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
    
    /**
     *    Prompts the user for an double using a range of min to max,
     *     and returns the double.
     *     @param ask    the prompt line
     *     @param min    the minimum double accepted
     *     @param max    the maximum double accepted
     *     @return        the double input from user
     */
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



