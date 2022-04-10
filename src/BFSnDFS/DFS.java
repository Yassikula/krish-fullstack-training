package BFSnDFS;

import java.io.*;
import java.util.*;
 

class DFS {
    private int ver; // No. of vertices
 
   
    // Adjacency List 
    private LinkedList<Integer> adjacencyList[];
 

     
    DFS(int v)
    {
    	ver = v;
    	adjacencyList = new LinkedList[v];
        for (int i = 0; i < v; ++i)
        	adjacencyList[i] = new LinkedList();
    }
 
    // Function to add an edge to graph
    void insertEdge(int v, int w)
    {
    	adjacencyList[v].add(w); // Add w to v's list.
    }
 
    // A function used by DFS
    void DFSUtil(int v, boolean visited[])
    {
        visited[v] = true;
        System.out.print(v + " ");
 
        
        Iterator<Integer> i = adjacencyList[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }
 

    void DFS(int v)
    { 

        boolean visited[] = new boolean[ver];
 
        // function to print DFS
        DFSUtil(v, visited);
    }
 
    // main
    public static void main(String args[])
    {
    	DFS dfs = new DFS(8);
 
    	dfs.insertEdge(0, 3);
    	dfs.insertEdge(3, 5);
    	dfs.insertEdge(3, 7);
	dfs.insertEdge(5, 6);
	dfs.insertEdge(6, 2);
	dfs.insertEdge(2, 1);
	dfs.insertEdge(7, 4);
		
        System.out.println(
            "Depth First Traversal "
            + "(this start from vertex 0)");
 
        dfs.DFS(0);
    }
}
