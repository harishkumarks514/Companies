package Depth_First_Search;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSExample {
	public static void bfs(int start, List<List<Integer>>graph)
	{
		boolean[] visited = new boolean[graph.size()];
		Queue<Integer> queue = new LinkedList<>();
		visited[start] = true;
		queue.add(start);
		while(!queue.isEmpty())
		{
			int node = queue.poll();
			System.out.print(node + " ");
			for(int neighbor : graph.get(node))
			{
				if(!visited[neighbor])
				{
					visited[neighbor] = true;
					queue.add(neighbor);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int vertices = 5;
		List<List<Integer>> graph = new ArrayList<>();
		
		for(int i=0;i<vertices;i++)
		{
			graph.add(new ArrayList<>());
		}
		
		//Adding edgs
		graph.get(0).add(1);
		graph.get(0).add(3);
		graph.get(1).add(2);
		graph.get(1).add(4);
		graph.get(3).add(4);
		
		System.out.println("BFS Traversal starting from node 0:" );
		bfs(0,graph);
	}
	
}
