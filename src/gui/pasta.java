package gui;


import java.util.ArrayList;
import java.util.List;

import algorithms.Graph_Algo;
import dataStructure.DGraph;
import dataStructure.Node;
import dataStructure.graph;
import dataStructure.node_data;
import utils.Point3D;

public class pasta {

	public static void main(String[] args) {
		DGraph g = new DGraph();
		//*************graph 1*******************************
		Graph_Algo gg = new Graph_Algo();
		Graph_Algo gg2 = new Graph_Algo();

		Point3D p1 = new Point3D(50,-30);
		Point3D p2 = new Point3D(12,-16);
		Point3D p3 = new Point3D(-130,-7);
		Point3D p4 = new Point3D(64,22);
		Point3D p5 = new Point3D(10,-52);
		Point3D p6 = new Point3D(55,-2);
		Point3D p7 = new Point3D(50.2,-70);


		Node n1 = new Node(1, p1, 0.0, "", 0);
		Node n2 = new Node(2, p2, 0.0, "", 0);
		Node n3 = new Node(3, p3, 0.0, "", 0);		
		Node n4 = new Node(4, p4, 0.0, "", 0);		
		Node n5 = new Node(5, p5, 0.0, "", 0);
		Node n6 = new Node(6, p6, 0.0, "", 0);
		Node n7 = new Node(7, p7, 0.0, "", 0);


		n1.setLocation(p1);
		n2.setLocation(p2);
		n3.setLocation(p3);
		n4.setLocation(p4);
		n5.setLocation(p5);
		n6.setLocation(p6);
		n7.setLocation(p7);


		g.addNode(n1);
		g.addNode(n2);
		g.addNode(n3);
		g.addNode(n4);
		g.addNode(n5);
		g.addNode(n6);
		g.addNode(n7);


		g.connect(n1.getKey(), n2.getKey(), 10);
		g.connect(n2.getKey(), n4.getKey(), 15);
		g.connect(n2.getKey(), n3.getKey(), 12);
		g.connect(n3.getKey(), n4.getKey(), 1);
		g.connect(n3.getKey(), n5.getKey(), 2);
		g.connect(n4.getKey(), n5.getKey(), 5);
		g.connect(n1.getKey(), n6.getKey(), 15);
		g.connect(n5.getKey(), n6.getKey(), 10);

		
		//*************graph 2*******************************


		gg.init(g);
		gg.save("hey.txt");
		gg2.init("hey.txt");

		Graph_GUI temp1 = new Graph_GUI();
		temp1.init(gg2.g);
		//		temp1.g = temp1.gra.g;//nati
		//temp1.drawAll();

		//gg.shortestPathDist(2,7);
		//gg.shortestPath(5,2);
		
		//System.out.println(gg.shortestPath(2,6));
		
		DGraph gg3 = new DGraph();

		Point3D p = new Point3D(50,-30);
		Node n = new Node(1, p, 0.0, "", 0);
		gg3.addNode(n);
		Graph_Algo mau = new Graph_Algo();
		mau.init(gg3);
		mau.save("saved graphs/test.txt");
	

//***********************************************graph 3-snir
		Point3D pp1 = new Point3D(50,0);
		Point3D pp2 = new Point3D(0,50);
		Point3D pp3 = new Point3D(50,50);
		Point3D pp4 = new Point3D(0,0);
		
		Node nn3 = new Node(3, pp3, 0.0, "", 0);
		Node nn2 = new Node(0, pp2, 0.0, "", 0);
		Node nn4 = new Node(2, pp4, 0.0, "", 0);		
		Node nn1 = new Node(1, pp1, 0.0, "", 0);	
		
		nn1.setLocation(pp3);
		nn2.setLocation(pp2);
		nn3.setLocation(pp4);
		nn4.setLocation(pp1);
		
		DGraph f = new DGraph();

		
		f.addNode(nn1);
		f.addNode(nn2);
		f.addNode(nn3);
		f.addNode(nn4);
		
		f.connect(nn1.getKey(), nn2.getKey(), 4);
		f.connect(nn2.getKey(), nn3.getKey(), 2);
		f.connect(nn3.getKey(), nn4.getKey(), 2);
		f.connect(nn4.getKey(), nn1.getKey(), 1);
		f.connect(nn2.getKey(), nn1.getKey(), 4);
		f.connect(nn3.getKey(), nn2.getKey(), 2);
		f.connect(nn4.getKey(), nn3.getKey(), 2);
		f.connect(nn1.getKey(), nn4.getKey(), 1);
		//Graph_Algo gg5 = new Graph_Algo();

		Graph_GUI temp2 = new Graph_GUI();
		temp2.init(f);
		temp2.drawAll();
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(0);
		list.add(2);
		List<node_data> result = temp2.getAlgo().TSP(list);
		System.out.println("result:"+result.toString());
	
	}

}