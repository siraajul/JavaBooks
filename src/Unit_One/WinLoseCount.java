package Unit_One;

import java.util.Scanner;

public class WinLoseCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Wins: ");
        int wins = sc.nextInt();

        System.out.print("Enter Draws: ");
        int draws = sc.nextInt();

        System.out.print("Enter Losses: ");
        int losses = sc.nextInt();

        int score_wins = wins*3;
        int score_draws = draws;

        int total_score = score_wins+score_draws;

        System.out.println("Total Points: "+total_score);

    }
}
