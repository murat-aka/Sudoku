/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

/**
 *
 * @author murat
 */
public class Sudoku {
 static int userGrid[][]=new int[][]
           {{1,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0}};//[horizontal][vertical]
        static int grid[][]=new int[9][9];//the grid that the program experiments on
        //static String pgrid[][]=new String[9][9];//the posibilities grid
    public static void main(String[] args) {
        for (int i=0;i<9;i++) {
            for (int j=0;j<9;j++) {
                grid[i][j]=userGrid[i][j];
            }
        }
        System.out.println(validity(0, 0, grid));
        print(grid);
    }
    public static int[][] loop(int y, int x, int[][] grid) {
        return grid;
    }
    public static boolean validity(int x, int y, int[][] grid) {
        String temp="";
        for (int i=0;i<9;i++) {
            temp+=Integer.toString(grid[i][y]);//horizontal
            temp+=Integer.toString(grid[x][i]);//verical
            temp+=Integer.toString(grid[(x/3)*3+i/3][(y/3)*3+i%3]);//square
        }
        int count=0, idx=0;
        while ((idx=temp.indexOf(Integer.toString(grid[x][y]), idx))!=-1)
        {idx++; count++;}
        return count==3;
    }
    public static void print(int[][] grid) {
        System.out.println();
        for (int i=0;i<9;i++) {
            for (int j=0;j<9;j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }
    
}
