package algorithms;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

import dataStructure.edge_data;
import dataStructure.graph;
import dataStructure.node_data;
import dataStructure.DGraph;
import dataStructure.Edge;
import dataStructure.Node;
/**
 * This empty class represents the set of graph-theory algorithms
 * which should be implemented as part of Ex2 - Do edit this class.
 * @author Avital Pikovsky, Omer Katz
 *
 */
public class Graph_Algo implements graph_algorithms, Serializable{

	public DGraph g;

	@Override
	public void init(graph g) {
		this.g = (DGraph) g;
	}

	@Override
	public void init(String file_name) {

		try
		{    
			FileInputStream file = new FileInputStream(file_name); 
			ObjectInputStream in = new ObjectInputStream(file); 

			g = (DGraph) in.readObject(); 

			in.close(); 
			file.close(); 

			System.out.println("Object has been deserialized"); 
		} 

		catch(IOException ex) 
		{ 
			System.out.println("IOException is caught"); 
		} 

		catch(ClassNotFoundException ex) 
		{ 
			System.out.println("ClassNotFoundException is caught"); 
		}
	}


	@Override
	public void save(String file_name) {

		try
		{    
			FileOutputStream file = new FileOutputStream(file_name); 
			ObjectOutputStream out = new ObjectOutputStream(file); 

			out.writeObject(g); 

			out.close(); 
			file.close(); 

			System.out.println("Object has been serialized"); 
		}   
		catch(IOException ex) 
		{ 
			System.out.println("IOException is caught"); 
		} 
	}
	public void setTag() {
		for (node_data nodes : g.getV()) {
			nodes.setTag(0);
		}
	}

	@Override
	public boolean isConnected() {
		if(g.nodeSize()==1) {
			return true;
		}

		Queue<Node> q=new ArrayBlockingQueue<Node>(g.nodeSize());
		setTag();

		for (node_data node : g.getV() ) {
			Node n=(Node) node;
			if (n.neighbours.values()== null) return false;
			q.add(n);
			n.setTag(1);
			while (!q.isEmpty()) {
				for (edge_data edge : q.peek().neighbours.values()) {
					Node dest=(Node) g.getNode(edge.getDest());
					if(dest.getTag()==0) {
						dest.setTag(1);
						q.add(dest);}
				}
				q.remove();
			}
			for (node_data nodes : g.getV()) {
				if (nodes.getTag()==0) return false;
				else nodes.setTag(0);
			}
		}
		setTag();
		return true;
	}


	@Override
	public double shortestPathDist(int src, int dest) {
		return 0;
	}

	@Override
	public List<node_data> shortestPath(int src, int dest) {
		return null;
	}

	@Override
	public List<node_data> TSP(List<Integer> targets) {
		return null;
	}

	@Override
	public graph copy() {
		return null;
	}

}
