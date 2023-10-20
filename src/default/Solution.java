package com.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
	public static void main(String args[]) {
		//2,1,1
		//1,1,0
		//0,1,1
		int grid[][]= {{2,1,1},{1,1,0},{0,1,1}};
		orangesRotting(grid);
	}
    public static int orangesRotting(int[][] grid) {
       int m= grid.length;
        int n= grid[0].length;
     return   findrotten(grid,m,n);

    }
    public static int findrotten(int[][] grid, int m, int n){
    	int total=0,rotten = 0,time = 0;
    	Queue<Pair> queue= new LinkedList<>();
    	for(int i=0;i<m;i++) {
    		for(int j=0 ;j<n;j++) {
    			if(grid[i][j]== 2 || grid[i][j] ==1) total++;
    			if(grid[i][j] ==2)	queue.offer(new Pair(i,j));
    		}
    	}
    	if(total==0) {
    		System.out.println(0);
    		return 0;}
    	while(!queue.isEmpty()) {
    		int size=queue.size();
    		
    		rotten= rotten + size;
    		if(rotten == total) {
    			System.out.println(time);
    			return time;
    		}
    		time++;
    		for(int i=0;i<size;i++) {
    			Pair p=queue.peek();
    			if(p.x+1<m && grid[p.x+1][p.y] ==1) {
    				grid[p.x+1][p.y]=2;
    				queue.offer(new Pair(p.x+1,p.y));
    			}
    			if(p.x-1>=0 && grid[p.x-1][p.y] ==1) {
    				grid[p.x-1][p.y]=2;
    				queue.offer(new Pair(p.x-1,p.y));
    			}
    			if(p.y+1<n && grid[p.x][p.y+1] ==1) {
    				grid[p.x][p.y+1]=2;
    				queue.offer(new Pair(p.x,p.y+1));
    			}
    			if(p.y-1>=0 && grid[p.x][p.y-1] ==1) {
    				grid[p.x][p.y-1]=2;
    				queue.offer(new Pair(p.x,p.y-1));
    			}
    			queue.poll();
    		}
    	}
    	System.out.println(-1);
    	return -1;
    }
   
}