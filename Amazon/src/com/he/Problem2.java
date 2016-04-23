package com.he;

public class Problem2 {

	public static void createGraph(int[][] graph, int i, int j, int c) {

		graph[i][j] = c;
		graph[j][i] = c;

	}

	public static int findF(int[][] graph, int x, int y) {
		int max = 0;
		int i = x, j = x + 1;
		while (j <= y) {
			if (graph[i][j] != 0) {
				max=(max>graph[i][j])?max:graph[i][j];
			}
		}

		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 5;
		int[][] graph = new int[N][N];

		System.out.println(graph[1][1]);
	}

}
