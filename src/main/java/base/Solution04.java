/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nader Fares
 */

//Create a simple mad-lib program that
// prompts for a noun, a verb, an adverb, and an adjective and
// injects those into a story that you create.

package base;

import java.util.Scanner;

/*
        program start
        print "Enter a noun: "
        'noun' = read string from user
        repeat for verb, adjective and adverb
        string 'story' = String.format("Do you %s with your %s %s %s? That's hilarious!")
        print 'story'
     */
public class Solution04 {
    public static void main(String[] args)
    {
        //prompt user for noun and store into 'noun' variable
        System.out.print("Enter a noun: ");
        Scanner input = new Scanner(System.in);
        String noun = input.nextLine();

        //prompt user for verb and store into 'verb' variable
        System.out.print("Enter a verb: ");
        String verb = input.nextLine();

        //prompt user for adjective and store into 'adjective' variable
        System.out.print("Enter an adjective: ");
        String adjective = input.nextLine();

        //prompt user for adverb and store into 'adverb' variable
        System.out.print("Enter an adverb: ");
        String adverb = input.nextLine();

        //build output using format()
        String story = String.format("Do you %s with your %s %s %s? That's hilarious!\n", verb, adjective, noun, adverb);

        //display story
        System.out.print(story);
    }
}
