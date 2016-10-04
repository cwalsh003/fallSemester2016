package Problem5;

import java.util.Scanner;

/**
 * Created by cwalsh on 9/30/16.
 */
public class Main {

    public static void main(String[] args){
        Maze maze = new Maze();

        Scanner kb = new Scanner(System.in);

        Node start = maze.getNodes().get(0);
        Node currentPosition = start;
        String move;

        while (currentPosition.getPosition().charAt(0) != 'L'){
            System.out.println("You are in room " + currentPosition.getPosition() + "\nYou only moves are:\n " + maze.possibleMoves(currentPosition));
            System.out.print("Enter you next move (N, S, E, W)...");
            move = kb.nextLine().toLowerCase();

            if(move.charAt(0) == 'n' && currentPosition.getNorth() != null){
                currentPosition = currentPosition.getNorth();
            }if(move.charAt(0) == 's' && currentPosition.getSouth() != null){
                currentPosition = currentPosition.getSouth();
            }if(move.charAt(0) == 'e' && currentPosition.getEast() != null){
                currentPosition = currentPosition.getEast();
            }if(move.charAt(0) == 'w' && currentPosition.getWest() != null){
                currentPosition = currentPosition.getWest();
            }

            if(currentPosition.getPosition().charAt(0) == 'L'){
                System.out.println("You win!! ");
            }

        }


    }
}
