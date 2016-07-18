import java.util.ArrayList;
import java.util.List;
import static java.util.Arrays.asList;
import java.util.Arrays;
/**
 * The class that represents the board.
 * This class takes care of moving, and checking if moves are valid.
 * As well, this class checks if the game has been won.
 * 
 * @author Daniel Wong
 * @version 1.1
 */
public class Board
{
    /**
     * Inner class that represents a node..
     * This node is a rock that holds the information of the direction.
     * It also holds a link to the next rock to the next.
     */
    public class Node
    {
        public int info;
        public Node next;
        /**
         * Constructor method for the node
         */
        public Node(int info, Node next)
        {
            this.info = info;
            this.next = next;
        }
    }
    
    private Node head;
    private Node tail;
    private Node rock1;
    private Node rock2;
    private Node rock3;
    private Node rock4;
    private Node rock5;
    private Node rock6;
    private Node rock7;
    private Node rock8;
    private Node rock9;
    private Node rock10;
    private Node rock11;
    
    private List<Integer> winningState;
    private ArrayList<Integer> currentState;
    
    /**
     * Constructor method for the Board
     */
    public Board()
    {
        
        initializeBoard();
        this.winningState = new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,0,1,1,1,1,1,1));
        

    }
    
    /**
     * Method that initializes all values for the board.
     */
    public void initializeBoard()
    {
        this.rock1 = new Node(1, null);
        this.rock2 = new Node(1, null);
        this.rock3 = new Node(1, null);
        this.rock4 = new Node(1, null);
        this.rock5 = new Node(1, null);
        this.rock6 = new Node(0, null);
        this.rock7 = new Node(-1, null);
        this.rock8 = new Node(-1, null);
        this.rock9 = new Node(-1, null);
        this.rock10 = new Node(-1, null);
        this.rock11 = new Node(-1, null);
        this.head = rock1;
        this.tail = null; // signifies the end of the linked list
        rock1.next = rock2;
        rock2.next = rock3;
        rock3.next = rock4;
        rock4.next = rock5;
        rock5.next = rock6;
        rock6.next = rock7;
        rock7.next = rock8;
        rock8.next = rock9;
        rock9.next = rock10;
        rock10.next = rock11;
        rock11.next = tail;
    }
    
    /**
     * A method that checks if the board's current state is equivalent to that of a winning one.
     * @param true if won
     */
    public boolean isWon()
    {
        Node tempNode;
        tempNode = head;
        for (int element = 0; element < 11; element ++)
        {
            int direction = this.winningState.get(element);
            if (tempNode.info != direction)
            {
                return false;             
            }
            tempNode = tempNode.next;
        }
        return true;
    }
    
    /**
     * This method is an accessor method to check the orientation of the rock that the user wants to move.
     * @param move the rock the user wants to move.
     * @return the orientation of the rock 1 for right, 0 for empty, -1 for left
     */
    public Node getRock(int move)
    {
        Node tempNode = null;
        tempNode = head;
        int count = 1;
        while (tempNode != null)
        {
            if (count == move)
            {
                return tempNode;
            }
            tempNode = tempNode.next;
            count ++;
        }
        return tempNode;
    }
    
    /**
     * a method that lets you update what the new rock vlaue should be.
     * @param rock the rock to be altered
     * @param move the new updated spot
     */
    public void moveRock(int rock, int move)
    {
        if (rock == 1)
        {
            rock1.info = move;
        }
        else if (rock == 2)
        {
            rock2.info = move;
        }
        else if (rock == 3)
        {
            rock3.info = move;
        }
        else if (rock == 4)
        {
            rock4.info = move;
        }
        else if (rock == 5)
        {
            rock5.info = move;
        }
        else if (rock == 6)
        {
            rock6.info = move;
        }
        else if (rock == 7)
        {
            rock7.info = move;
        }
        else if (rock == 8)
        {
            rock8.info = move;
        }
        else if (rock == 9)
        {
            rock9.info = move;
        }
        else if (rock == 10)
        {
            rock10.info = move;
        }
        else if (rock == 11)
        {
            rock11.info = move;
        }
        
    }
    
    /**
     * This method checks & moves the rock by checking the rock to the right and seeing if it is empty or needs
     * to be hopped*.
     * @param move the rock that is to be moved.
     *
     */
    public void moveValidRight(int move)
    {
        Node adjacent;
        Node hop;
        Node rock;
        Node tempNode;
        tempNode = head;
        int count = 1;
        // if the rock is facing at right and 11, do nothing..
        if (move == 11)
        {
            // do nothing.
        }
        // if moving the 10th block 
        else if (move == 10)
        {
            // if the move is valid
            if (this.rock11.info == 0)
            {
                rock10.info = 0;
                rock11.info = 1;
            }
        }
        // if move is right and less than 10, you can get adjacent and hop.
        else if (move < 10)
        {
            
            rock = getRock(move);
            adjacent = rock.next;
            hop = rock.next.next;
            // if the spot to the right is empty
            if (adjacent.info == 0)
            {

                moveRock(move, 0);
                moveRock(move+1, 1);              
            }
            // if the one next to it is facing opposite and the hop is valid
            else if (adjacent.info == -1 && hop.info == 0)
            {
                moveRock(move, 0);
                moveRock(move + 2, 1);
                
            }
        }
        
        
    }
    
    /**
     * This method checks and mvoes the rock to the left it is valid and will check if the adjacent is empty or needs
     * to be hopped*
     * @param move the rock that is to be moved.
     * @param nodeLeft the node 2 to the left unless the position is at 1.
     * @pre moves greater than 11 should already be ignored through the io or main.
     * If rock is at 2, the node provided will be 1.
     * If rock is at 3, the node provided will be 1 and then nodeLeft.next.next = the actual node.
     */
    public void moveValidLeft(int move)
    {
        Node adjacentNode; // to the left 1
        Node hopNode; // to the left 2
        Node rockNode;
        // if the furthest rock to the left and left move.
        if (move == 1)
        {
            // do nothing
        }
        // if at 2, there is only one more node left.
        else if (move == 2)
        {
            // if the move is 2 and empty to the left
            if (this.rock1.info == 0)
            {
                this.rock1.info = -1;
                this.rock2.info = 0;
            }
            
        }
        // any other move
        else if (move > 2)
        {
            hopNode = getRock(move-2);
            adjacentNode = getRock(move-1);
            rockNode = getRock(move);
            // if the move to the left is empty
            if (adjacentNode.info == 0)
            {
                moveRock(move, 0);
                moveRock(move-1, -1);
                
            }
            // if the move to the left is facing and hop is valid
            else if (adjacentNode.info == 1 && hopNode.info == 0)
            {
                moveRock(move, 0);
                moveRock(move-2, -1); 
            }
        }
    }
    
    /**
     * This method returns the text representation of the board.
     * @return the output for how the board will look.
     */
    public String printBoard()
    {
        StringBuilder result = new StringBuilder();
        Node tempNode = null;
        tempNode = head;
        while (tempNode != null)
        {
            // if facing right
            if (tempNode.info == 1)
            {
                result.append(" > ");
            }
            // if facing left
            else if (tempNode.info == -1)
            {
                result.append(" < ");
            }
            // if empty
            else 
            {
                result.append("   ");
            }
            tempNode = tempNode.next;
        }
        result.append("\n -  -  -  -  -  -  -  -  -  -  - ");
        result.append("\n 1  2  3  4  5  6  7  8  9  10 11");
        System.out.println(result.toString());
        return result.toString();
    }
    
    /**
     * A method that calls intialize board which restarts the entirity of the game.
     */
    public void restartGame()
    {
        initializeBoard();
    }
    
    
    
}
