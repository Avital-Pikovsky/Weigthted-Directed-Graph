package algorithms;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

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

	private void DFS(int key, int counter) {
		if(counter==0 || g.getNode(key)==null)
			return;
		else {
			g.getNode(key).setTag(1);
			counter--;
			Collection<edge_data> edgeCol = g.getE(key);
			for(edge_data edge : edgeCol) {
				DFS(edge.getDest(),counter);		
			}
		}
	}

	private void reverse() {

		for(node_data a: g.nodes.values()) {
			Node n = (Node)a;
			for(Object e: n.neighbours.values().toArray()) {

				Edge ed = (Edge)e;
				if(ed.getTag() == 0) {
					g.connect(ed.getDest(), ed.getSrc(), ed.getWeight());
					Edge ed1 = (Edge)g.getEdge(ed.getDest(), ed.getSrc());
					ed1.setTag(1);
					g.removeEdge(ed.getSrc(), ed.getDest());					
				}
			}
		}
	}

	@Override
	public boolean isConnected() {
		Collection<node_data> vCol = g.getV();
		for(node_data node : vCol) {
			node.setTag(0);
		}

		DFS(vCol.iterator().next().getKey(), g.nodeSize());
		for(node_data node : vCol) {
			if(node.getTag() != 1) 
				return false;
		}
		reverse();

		for(node_data node : vCol) {
			node.setTag(0);
		}

		DFS(vCol.iterator().next().getKey(), g.nodeSize());
		for(node_data node : vCol) {
			if(node.getTag() != 1) 
				return false;
		}
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
