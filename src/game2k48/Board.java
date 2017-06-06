package game2k48;

import java.util.Random;

public class Board 
{
    int size;
    int[][] board;
    
    public Board(int size)
    {
        this.size = size;
        this.board = new int[size][size];
    }
    
    public void display()
    {
        for (int x=0; x<size; x++)
        {
            for (int y=0; y<size; y++)
            {
                System.out.print(board[x][y]);
            }
            System.out.println();
        }
        System.out.println("################");
    }
    
    public void generate()
    {
        boolean generated = false;
        Random r = new Random();
        while (!generated && !isFull())
        {
            int xrand = r.nextInt(size);
            int yrand = r.nextInt(size);
            if (board[xrand][yrand]==0)
            {
                board[xrand][yrand] = 2;
                generated = true;
            }
        }
    }
    
    public boolean isFull()
    {
        for (int x=0; x<size; x++)
        {
            for (int y=0; y<size; y++)
            {
                if(board[x][y]==0)
                    return false;
            }
        }
        return true;
    }
    
    public boolean move(Direction d) throws IllegalMoveException
    {
        System.out.println("Moved " + d);
        return true;
    }
    
    public boolean gameOver()
    {
        return false;
    }
    
}
