#include <iostream>
#include <cstdlib>

using namespace std;

int board[5][5];
    
void display()
{
    for (int i=1; i<=4; i++)
    { 
       for (int j=1; j<=4; j++)
       {
          cout << board[i][j];
       }
       cout << "\n";
    }
    cout << "\n";
}

void niu()
{
    int x, y;
    do
    {
        x = rand() % 4 + 1;
        y = rand() % 4 + 1;
    }
    while (board[x][y]);
    board[x][y]+=2;
}

void move()
{
    char m;
    cin >> m;
    //if (m=="u")
    
}

int main()
{
    for(int i=0;i <16; i++)
    {
        niu();
        display();
    } 
    return 0;
}