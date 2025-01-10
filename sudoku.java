// for solving sudoku using backtracking



public class sudoku {


    static boolean isSafe(int[][] board,int row,int col,int num)
    {
        for(int i=0;i<board.length;i++)
        {
            if(board[row][i]==num)
                return false;
        }

        for(int i=0;i<board.length;i++)
        {
            if(board[i][col]==num)
                return false;
        }

        int startRow = row - row%3;
        int startCol = col - col%3;

        for(int i=startRow;i<startRow+3;i++)
        {
            for(int j=startCol;j<startCol+3;j++)
            {
                if(board[i][j]==num)
                    return false;
            }
        }

        return true;
    }
    
    static boolean solveSuduku(int[][] board,int row,int col)
    {
        int nrow=0;
        int ncol=0;

        if(col!=board.length-1)
        {
             nrow=row;
            ncol=col+1;   
        }
        else
        {
            nrow=row+1;
            ncol=0;   
        }

        if(board[row][col]!=0)
        {
         if(solveSuduku(board,nrow,ncol))
                return true;
        }
         else 
         {
            for(int i=1;i<=9;i++)
            {
                if(isSafe(board,row,col,i))
                {
                    board[row][col]=i;
                    if(solveSuduku(board,nrow,ncol))
                        return true;
                    else
                    board[row][col]=0;
                }
            }
         }
         return false;
    }

    public static void main(String[] args)
    {
        int[][] board = {
            {3, 0, 6, 5, 0, 8, 4, 0, 0},
            {5, 2, 0, 0, 0, 0, 0, 0, 0},
            {0, 8, 7, 0, 0, 0, 0, 3, 1},
            {0, 0, 3, 0, 0, 0, 0, 6, 8},
            {0, 0, 0, 8, 0, 6, 0, 0, 3},
            {9, 0, 0, 3, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
         solveSuduku(board,0,0);
    }
}
