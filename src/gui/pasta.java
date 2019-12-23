package gui;

import algorithms.Graph_Algo;
import algorithms.graph_algorithms;
import dataStructure.DGraph;
import dataStructure.Node;
import dataStructure.graph;
import utils.Point3D;

public class pasta {

	public static void main(String[] args) {
		DGraph gg = new DGraph();
		DGraph con = new DGraph();

		Point3D p1=new Point3D(0,0);
		Point3D p2=new Point3D(61,1);
		Point3D p3=new Point3D(-5,-80);
		Point3D p4=new Point3D(17,5);
		Point3D p5=new Point3D(50,-20);
		Point3D p6=new Point3D(4,50);
		Point3D p7=new Point3D(-96,14);
		Point3D p8=new Point3D(11,-3);
		Point3D p9=new Point3D(-72,4);

		Node a=new Node(0, p1, 4.4, "dai", 0);
		Node b=new Node(1, p2, 2.3, "dai", 0);
		Node c=new Node(2, p3, 1.2, "dai", 0);
		Node d=new Node(3, p4, 2.0, "dai", 0);	
		//		Node e=new Node(4, p5, 0.0, "dai", 0);
		//		Node f=new Node(5, p6, 0.0, "dai", 0);
		//		Node j=new Node(6, p7, 0.0, "dai", 0);
		//		Node h=new Node(7, p8, 0.0, "dai", 0);
		//		Node i=new Node(8, p9, 0.0, "dai", 0);

		((graph) gg).addNode(a);
		((graph) gg).addNode(b);
		((graph) gg).addNode(c);
		//		((graph) gg).addNode(d);
		//		((graph) gg).addNode(e);
		//		((graph) gg).addNode(f);
		//		((graph) gg).addNode(j);
		//		((graph) gg).addNode(h);
		//		((graph) gg).addNode(i);


		//		((graph) gg).connect(a.getKey(),b.getKey(),4);
		//		((graph) gg).connect(b.getKey(),c.getKey(), 2);
		//		((graph) gg).connect(c.getKey(),a.getKey(),4);
		//		((graph) gg).connect(d.getKey(),e.getKey(), 2);
		//		((graph) gg).connect(e.getKey(),f.getKey(),4);
		//		((graph) gg).connect(f.getKey(),j.getKey(), 2);
		//		((graph) gg).connect(j.getKey(),h.getKey(),4);
		//		((graph) gg).connect(h.getKey(),i.getKey(), 2);

		con.addNode(a);
		con.addNode(b);
		con.addNode(c);
		con.addNode(d);
		con.connect(a.getKey(),b.getKey(),4);
		con.connect(b.getKey(),c.getKey(),2);
		con.connect(c.getKey(),d.getKey(),3);
		con.connect(a.getKey(),d.getKey(),1);
		con.connect(d.getKey(),b.getKey(),1);


		Graph_Algo don = new Graph_Algo();
		don.init(con);
		System.out.println(don.isConnected());
		
	double u;
	u=	don.shortestPathDist(0,1);
	System.out.println(u);



//		Graph_GUI bro = new Graph_GUI(gg);
	Graph_GUI turtle = new Graph_GUI(con);
//		bro.drawAll();
	 	turtle.drawAll();




	}	
}
