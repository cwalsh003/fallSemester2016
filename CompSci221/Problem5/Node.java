package Problem5;

/**
 * Created by cwalsh on 9/30/16.
 */
public class Node {
  private Node north;
  private Node south;
  private Node east;
  private Node west;

  private String position;

  public Node(Node north, Node south, Node east, Node west, String position) {
    this.north = north;
    this.south = south;
    this.east = east;
    this.west = west;
    this.position = position;
  }

    public Node getNorth() {
        return north;
    }

    public void setNorth(Node north) {
        this.north = north;
    }

    public Node getSouth() {
        return south;
    }

    public void setSouth(Node south) {
        this.south = south;
    }

    public Node getEast() {
        return east;
    }

    public void setEast(Node east) {
        this.east = east;
    }

    public Node getWest() {
        return west;
    }

    public void setWest(Node west) {
        this.west = west;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


}
