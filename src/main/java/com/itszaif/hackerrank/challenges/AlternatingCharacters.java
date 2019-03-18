package com.itszaif.hackerrank.challenges;

/**
 * Hacker rank problem Alternating characters
 * @author <a href="mailto:zafrullah.syed@silbury.com">Zafrullah Syed</a>
 * @since 18.03.2019
 */

//https://www.hackerrank.com/challenges/alternating-characters/problem
public class AlternatingCharacters
{
    public static void main(String[] args)
    {
        String message = "ABABBAA";

        String[] strings = new String[message.length()];

        int counter = 0;
        for(int i = 0; i < message.length(); i++)
        {
            strings[i] = Character.toString(message.charAt(i));

            if(i > 0 && (strings[i - 1].equals(strings[i])))
            {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
