package com.nguyen;
import java.util.Random;
import java.util.Scanner;

public class guessingNumberGame {
	// Function that implements the number guessing game
	public static void guessingNumberGame() {
		String userInput;
		do {
		Random randGen = new Random();
		int randNum = randGen.nextInt(100) + 1;
		int maxGuess = 10;
		int score = 10;        
		
		

		Scanner scnr = new Scanner(System.in);
			System.out.println("Guess any integer number from 1 to 100 (You have 10 guesses equivalent with 10 scores. One wrong guess will deduct one score):");

			int i;

			for (i = 0; i < maxGuess; i++) {

				int userNum = scnr.nextInt();

				if (userNum == randNum) {
					System.out.println("Congratulation! You pick the correct number.");
					break;
				}          
				else if (userNum < randNum) {
					score -= 1;


					System.out.println("Sorry the guess is too low. You have " + score + " guess(es) left.");
				}          
                                                                    //Number of guesses left equals score
				else if (userNum > randNum) {
					score -= 1;
					System.out.println("Sorry the guess is too high. You have " + score + " guess(es) left.");
				}
			}

			if (i >= maxGuess) {
				System.out.println("You reached the maximum guess. You lost! The correct number was: " + randNum);

			}


			System.out.println("Do you want to play another game? (y/n)");
			userInput = scnr.next();
			
		}

		while (userInput.equals("y"));

		System.out.println("See you later!");

	}

	// Driver Code
	public static void main(String arg[]) {
		// Function Call
		guessingNumberGame();
	}
}




