package gui;


import java.util.List;

import algorithms.Graph_Algo;
import dataStructure.DGraph;
import dataStructure.Node;
import dataStructure.graph;
import dataStructure.node_data;
import utils.Point3D;

public class pasta {

	public static void main(String[] args) {
		DGraph gg = new DGraph();
		DGraph temp = new DGraph();

		Point3D p1=new Point3D(0,0);
		Point3D p2=new Point3D(61,1);
		Point3D p3=new Point3D(-5,-80);
		Point3D p4=new Point3D(30,70);
		Point3D p5=new Point3D(50,-20);
		Point3D p6=new Point3D(4,50);
		Point3D p7=new Point3D(-96,14);
		Point3D p8=new Point3D(11,-3);
		Point3D p9=new Point3D(-72,4);

		Node a=new Node(0, p1, 4.4, "", 0);
		Node b=new Node(1, p2, 2.3, "", 0);
		Node c=new Node(2, p3, 1.2, "", 0);
		Node d=new Node(3, p4, 2.0, "", 0);	
		Node e=new Node(4, p5, 0.0, "", 0);
		//		Node f=new Node(5, p6, 0.0, "dai", 0);
		//		Node j=new Node(6, p7, 0.0, "dai", 0);
		//		Node h=new Node(7, p8, 0.0, "dai", 0);
		//		Node i=new Node(8, p9, 0.0, "dai", 0);

		//		((graph) gg).addNode(a);
		//		((graph) gg).addNode(b);
		//		((graph) gg).addNode(c);
		//		((graph) gg).addNode(d);
		//		((graph) gg).addNode(e);
		//		((graph) gg).addNode(f);
		//		((graph) gg).addNode(j);
		//		((graph) gg).addNode(h);
		//		((graph) gg).addNode(i);


		//		((graph) gg).conect(a.getKey(),b.getKey(),4);
		//		((graph) gg).conect(b.getKey(),c.getKey(), 2);
		//		((graph) gg).conect(c.getKey(),a.getKey(),4);
		//		((graph) gg).conect(d.getKey(),e.getKey(), 2);
		//		((graph) gg).conect(e.getKey(),f.getKey(),4);
		//		((graph) gg).conect(f.getKey(),j.getKey(), 2);
		//		((graph) gg).conect(j.getKey(),h.getKey(),4);
		//		((graph) gg).conect(h.getKey(),i.getKey(), 2);

		temp.addNode(a);
		temp.addNode(b);
		temp.addNode(c);
		temp.addNode(d);
		temp.addNode(e);
		temp.connect(a.getKey(),b.getKey(),4);
		temp.connect(b.getKey(),c.getKey(),2);
		temp.connect(c.getKey(),d.getKey(),3);
		temp.connect(a.getKey(),d.getKey(),1);
		temp.connect(d.getKey(),b.getKey(),1);
		temp.connect(a.getKey(),e.getKey(),1);
		temp.connect(e.getKey(),a.getKey(),10);



		Graph_GUI temp1 = new Graph_GUI(temp);
		temp1.drawAll();
		//Graph_Algo don = new Graph_Algo();
		//don.init(temp);
		//System.out.println(don.isconected());

		//double u;
	//	u =	don.shortestPathDist(0,2);
		//System.out.println(u);

	//	List<node_data> lista = don.shortestPath(0,2);




//
//		Graph_GUI bro = new Graph_GUI();
//		bro.g.addNode(a);
//		bro.drawAll();
//		bro.gra.save("tst.txt");
//		Graph_Algo al = new Graph_Algo();
//		al.init("tst.txt");
//
//		Graph_GUI turtle = new Graph_GUI();	
//		turtle.g.addNode(a);
//		turtle.g.addNode(b);
//		turtle.g.addNode(c);
//		turtle.g.addNode(d);
//
//		turtle.drawAll();

		//	Graph_Algo al=new Graph_Algo();
//		al.init(turtle.g);
//		Graph_GUI gg2 = new Graph_GUI();
//		gg2.g = (DGraph) al.copy();
//		gg2.drawAll();
	}	
}