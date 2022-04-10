package BFSnDFS;

import java.util.Iterator;
import java.util.LinkedList;

public class BFS {

	private int ver;   
    private LinkedList<Integer> adjacencyList[]; //Adjacency Lists
    
	public BFS(int v) {
		super();
		
		 ver = v;
		 adjacencyList = new LinkedList[v];
	     for (int i=0; i<v; ++i)
	    	 adjacencyList[i] = new LinkedList();
	}
    
	 // Function to insert an edge into the graph
	void insertEdge(int v,int w)
    {
		adjacencyList[v].add(w);
    }
	
	void BFS(int n)    
    {    
        boolean visitednodes[] = new boolean[ver]; 
        LinkedList<Integer> queue = new LinkedList<Integer>();
        int a = 0; 
        
     // Mark the current node as visited
        visitednodes[n]=true;                      
        queue.add(n); 
        
        while (queue.size() != 0)
        {
        	// Dequeue a vertex from queue and print it
        	n = queue.poll();
            System.out.print(n+" ");
            
            Iterator<Integer> i = adjacencyList[n].listIterator();
            while (i.hasNext())
            {
            	
            	int s = i.next();
                if (!visitednodes[s]) //only insert nodes into queue
                {
                	visitednodes[s] = true;
                    queue.add(s);
                }
            }
        }
    }

	public static void main(String args[])
    {
		BFS bfs = new BFS(8);
 
		bfs.insertEdge(0, 3);
		bfs.insertEdge(3, 5);
		bfs.insertEdge(3, 7);
		bfs.insertEdge(5, 6);
		bfs.insertEdge(6, 2);
		bfs.insertEdge(2, 1);
		bfs.insertEdge(7, 4);
		
 
        System.out.println("Breadth First Search "+
                           "(this start from vertex 0)");
 
        bfs.BFS(0);
    }
}