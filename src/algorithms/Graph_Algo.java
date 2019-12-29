package algorithms;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

import dataStructure.edge_data;
import dataStructure.graph;
import dataStructure.node_data;
import dataStructure.DGraph;
import dataStructure.Node;
/**
 * This empty class represents the set of graph-theory algorithms
 * which should be implemented as part of Ex2 - Do edit this class.
 * @author Avital Pikovsky, Omer Katz
 *
 */
public class Graph_Algo implements graph_algorithms,Serializable{

	public graph g;

	@Override
	public void init(graph ga) {
		this.g = (DGraph)ga;
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
						q.add(dest);
					}
				}
				q.remove();
			} 
			for (node_data nodes : g.getV()) {
				if (nodes.getTag()==0) return false;
				else nodes.setTag(0);
			}
		}
		return true;
	}


	@Override
	public double shortestPathDist(int src, int dest) {
		if(src==dest)
			return 0;
		String info = "";

		for (node_data nodes : g.getV()) {
			nodes.setWeight(Double.POSITIVE_INFINITY);
			nodes.setTag(0);
		}
		g.getNode(src).setWeight(0);

		STPD(src, dest, info);
		//System.out.println("diatance: " + g.getNode(dest).getWeight());
		return g.getNode(dest).getWeight();

	}
	private void STPD(int src, int dest, String info) {
		if(g.getNode(src).getTag() == 1 && g.getNode(src) == g.getNode(dest)) {
			return;
		}
		for (edge_data edge : g.getE(src)) {

			double neWeight = edge.getWeight() + g.getNode(edge.getSrc()).getWeight();
			double oldWeight = g.getNode(edge.getDest()).getWeight();
			if(neWeight < oldWeight) {
				g.getNode(edge.getDest()).setWeight(neWeight);
				g.getNode(edge.getDest()).setInfo(info + "->" + src);

				g.getNode(edge.getSrc()).setTag(1);

				//System.out.println("info: "+info + " ->" + src);

				STPD(edge.getDest(), dest, info + "->" + src);
			}	

		}
	}

	@Override
	public List<node_data> shortestPath(int src, int dest) {
		if(shortestPathDist(src, dest) == Double.POSITIVE_INFINITY)
			return null;

		List<node_data> list = new ArrayList<>();

		String s = g.getNode(dest).getInfo();
		s = s.substring(2);
		String[] arr =s.split("->");
		for (int i = 0; i < arr.length; i++) {
			list.add(g.getNode(Integer.parseInt(arr[i])));
		}
		list.add(g.getNode(dest));
		return list;
	}

	@Override
	public List<node_data> TSP(List<Integer> targets) {
		if(!isConnected() || targets.isEmpty()) return null;

		List<node_data> targetsToNode = new ArrayList<>();
		for(Integer tar : targets) {
			targetsToNode.add(g.getNode(tar));
		}
		List<node_data> finaList = new ArrayList<>();
		while(targetsToNode.size()>1) {
			int src =targetsToNode.get(0).getKey();
			int dest = targetsToNode.get(1).getKey();
			List<node_data> list = shortestPath(src, dest);
			System.out.println(list.toString()+"mama");
			for(node_data node : list) {
				if(targetsToNode.contains(node)) {
					if(node!=targetsToNode.get(1)) {
						System.out.println("\ntargets"+targetsToNode);
						System.out.println("list"+list.toString());

						targetsToNode.remove(node);
						System.out.println("size: "+targetsToNode.size());
					}
					System.out.println("afterTarget"+targetsToNode);
				}
			}
			//list.remove(list.get(list.size()-1));
			finaList.addAll(list);
		}
		finaList.add(targetsToNode.get(targetsToNode.size()-1));
		return finaList;
	}

	@Override
	public graph copy() {
		String file="copy.txt";
		save(file);
		Graph_Algo newGraph =new Graph_Algo();
		newGraph.init(file);
		return newGraph.g;
	}

}
