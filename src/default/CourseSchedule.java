package com.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CourseSchedule {

	public static void main(String args[]) {
		int prerequisites[][] = { { 1, 0 } };
		System.out.println(canFinish(2, prerequisites));
	}

	public static boolean canFinish(int numCourses, int[][] prerequisites) {
		ArrayList<Edge> graph[] = new ArrayList[prerequisites.length];

		for (int i = 0; i < graph.length; i++) {
			graph[i] = new ArrayList<>();
		}
		int n = numCourses;
		for (int i = 0; i < prerequisites.length; i++) {
			// for(int j=0;j<prerequisites[0].length;j++){
			graph[i].add(new Edge(prerequisites[i][1], prerequisites[i][0]));
			// }
		}
		boolean visited[] = new boolean[graph.length];
		boolean rec[] = new boolean[graph.length];
		for (int i = 0; i < graph.length; i++) {
			if (!visited[i]) {
				isCyclic(graph, visited, i, rec);
			}
		}

		return false;
	}

	private static boolean isCyclic(ArrayList<Edge>[] graph, boolean visited[], int curr, boolean rec[]) {

		Queue<Integer> q = new LinkedList<>();
		//System.out.println(curr);
		visited[curr] = true;
		rec[curr]= true;

		for (int i = 0; i < graph[curr].size(); i++) {
			Edge e = graph[curr].get(i);
			if(rec[e.destination]) {
				return true;
			}
			else if (!visited[curr]) {
				isCyclic(graph, visited, e.destination,rec);
			}
		}
		rec[curr]= true;
		return false;
		

		// }

	}
}

class Edge {
	int source;
	int destination;

	public Edge(int source, int destination) {
		this.source = source;
		this.destination = destination;
	}
}