package game2k48;

import java.util.Scanner;


public class Game2k48 
{
    public static void main(String[] args) 
    {
        //declarations
        String dir;
        Direction d;
        Board board = new Board(4);
        Scanner sc = new Scanner(System.in);
        
        //game starts here
        board.generate();
        board.display();
        
        //main loop
        while (!board.gameOver())
        {
            dir = sc.next();
            try
            {
                d = Direction.valueOf(dir);
                board.move(d);
                board.generate();
            }
            catch(IllegalArgumentException e)
            {
                System.out.println("Wrong move: " + dir);
            }
            catch(IllegalMoveException e)
            {
                System.out.println("Move " + dir + " not possible!");
            }
            board.display();
        }
    }
    
}
