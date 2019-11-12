package com.example.pset2a;

import java.util.ArrayList;

public class GetPath {
    static int i = 0;
    static int j = 0;
    public GetPath(){
        i=0;
        j=0;
    }

    //Fill in your answer for this method
    public static boolean getPath(int r, int c, ArrayList<Point> path, final int[][] grid) {
        path.add(new Point(i,j));
        System.out.println(path);
        if(i==r || j==c){
            if (i==r && j==c){
                return true;
            }
            else if (j==c && grid[i+1][j]==0) {
                i += 1;
                return getPath(r, c, path, grid);
            }
            else if(i==r && grid[i][j+1]==0){
                j+=1;
                return getPath(r, c, path, grid);
            }
            else{

                return false;
            }
        }
        else if (grid[i][j+1]==1&& grid[i+1][j]==0) {
            System.out.println(path);
            i += 1;
            return getPath(r, c, path, grid);
        }
        else if ((grid[i+1][j]==1 || i==c) && grid[i][j+1]==0) {
            j += 1;
            return getPath(r, c, path, grid);
        }
        else if(grid[i+1][j]==0 && grid[i][j+1]==0){
            j+=1;
            if(getPath(r, c, path, grid)==false){
                j-=1;
                i+=1;
                if(getPath(r, c, path, grid)==false){
                    return false;
                }
            }
            return getPath(r, c, path, grid);
        }
        else{

            return false;
        }
    }
}
