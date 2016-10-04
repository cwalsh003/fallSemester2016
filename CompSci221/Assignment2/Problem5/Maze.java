package Problem5;

import java.util.ArrayList;

/**
 * Created by cwalsh on 9/30/16.
 */
public class Maze {

    public ArrayList<Node> getNodes() {
        return nodes;
    }

    private ArrayList<Node> nodes = new ArrayList<>();
    
    public Maze() {
        for (int i = 0; i < 12; i++) {
            char[] letter = Character.toChars(i + 65);
            Character letterc = letter[0];
            nodes.add(new Node(null, null, null, null, letterc.toString()));
        }
        this.programMaze();
    }

    public void programMaze(){
        //A east  to B and south to E
        nodes.get(0).setEast(nodes.get(1));
        nodes.get(0).setSouth(nodes.get(4));
        //B west A and south F
        nodes.get(1).setSouth(nodes.get(5));
        nodes.get(1).setWest(nodes.get(0));
        //C set south to G and east D
        nodes.get(2).setSouth(nodes.get(6));
        nodes.get(2).setEast(nodes.get(3));
        //D set west C
        nodes.get(3).setWest(nodes.get(2));
        //E north to A and south to I
        nodes.get(4).setNorth(nodes.get(0));
        nodes.get(4).setSouth(nodes.get(8));
        //F north to B and F to G
        nodes.get(5).setNorth(nodes.get(1));
        nodes.get(5).setEast(nodes.get(6));
        //G north to C south to K
        nodes.get(6).setNorth(nodes.get(2));
        nodes.get(6).setSouth(nodes.get(10));
        nodes.get(6).setEast(nodes.get(7));
        //H west to G south to L
        nodes.get(7).setSouth(nodes.get(11));
        nodes.get(7).setWest(nodes.get(6));
        //I north to E and east to J
        nodes.get(8).setNorth(nodes.get(4));
        nodes.get(8).setEast(nodes.get(9));
        //J east to I
        nodes.get(9).setWest(nodes.get(8));
        //K north to G
        nodes.get(10).setNorth(nodes.get(6));
        //L north to H
        nodes.get(11).setNorth(nodes.get(7));
    }

    public String possibleMoves(Node node) {
        String moves = "";
        if (node.getEast() != null) {
            moves += "\tYou can go East\n";
        }
        if (node.getNorth() != null) {
            moves += "\tYou can go North\n";
        }
        if (node.getSouth() != null) {
            moves += "\tYou can go South\n";
        }
        if (node.getWest() != null) {
            moves += "\tYou can go West\n";
        }
        return moves;
    }

}
