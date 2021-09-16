package com.appslab;

public class Game {
    public void rps(String player1, String player2){
        String rock = "rock";
        String paper = "paper";
        String scissors= "scissors";
        String winner1 = "Player1 wins !!";
        String winner2 = "Player2 wins !!";
        String tie = "TIE !!";

        if(player1.equals(rock) && player2.equals(paper)){
            System.out.println(winner2);
        }
        else if (player1.equals(rock) && player2.equals(scissors)){
            System.out.println(winner1);
        }
        else if (player1.equals(rock) && player2.equals(rock)){
            System.out.println(tie);
        }

        if(player1.equals(paper) && player2.equals(paper)){
            System.out.println(tie);
        }
        else if (player1.equals(paper) && player2.equals(scissors)){
            System.out.println(winner2);
        }
        else if (player1.equals(paper) && player2.equals(rock)){
            System.out.println(winner1);
        }

        if(player1.equals(scissors) && player2.equals(paper)){
            System.out.println(winner1);
        }
        else if (player1.equals(scissors) && player2.equals(scissors)){
            System.out.println(tie);
        }
        else if (player1.equals(scissors) && player2.equals(rock)){
            System.out.println(winner2);
        }

    }
}
