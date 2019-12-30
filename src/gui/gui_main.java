package gui;


import java.util.ArrayList;
import java.util.List;

import algorithms.Graph_Algo;
import dataStructure.DGraph;
import dataStructure.Node;
import dataStructure.graph;
import dataStructure.node_data;
import utils.Point3D;

public class gui_main {

	public static void main(String[] args) {

		//*********not connected graph************
		Graph_GUI fox = new Graph_GUI();
		DGraph foxes = new DGraph();
		Node n1 = new Node(1, new Point3D(0,0), 0.0, "", 0);
		Node n2 = new Node(2, new Point3D(0,0), 0.0, "", 0);
		Node n3 = new Node(3, new Point3D(0,0), 0.0, "", 0);		
		Node n4 = new Node(4, new Point3D(0,0), 0.0, "", 0);		
		Node n5 = new Node(5, new Point3D(0,0), 0.0, "", 0);
		Node n6 = new Node(6, new Point3D(0,0), 0.0, "", 0);
		Node n7 = new Node(7, new Point3D(0,0), 0.0, "", 0);
		Node n8 = new Node(8, new Point3D(0,0), 0.0, "", 0);
		Node n9 = new Node(9, new Point3D(0,0), 0.0, "", 0);
		Node n10 = new Node(10, new Point3D(0,0), 0.0, "", 0);
		Node n11 = new Node(11, new Point3D(0,0), 0.0, "", 0);
		Node n12 = new Node(12, new Point3D(0,0), 0.0, "", 0);
		Node n13 = new Node(13, new Point3D(0,0), 0.0, "", 0);
		Node n14 = new Node(14, new Point3D(0,0), 0.0, "", 0);
		Node n15 = new Node(15, new Point3D(0,0), 0.0, "", 0);

		Point3D pp1 = new Point3D(-80,150);
		Point3D pp2 = new Point3D(-50,100);
		Point3D pp3 = new Point3D(0,100);
		Point3D pp4 = new Point3D(50,100);
		Point3D pp5 = new Point3D(80,150);
		Point3D pp6 = new Point3D(-70,70);
		Point3D pp7 = new Point3D(-40,30);
		Point3D pp8 = new Point3D(0,-20);
		Point3D pp9 = new Point3D(40,30);
		Point3D pp10 = new Point3D(70,70);
		Point3D pp11 = new Point3D(0,-150);
		Point3D pp12 = new Point3D(110,-60);
		Point3D pp13 = new Point3D(60,-150);
		Point3D pp14 = new Point3D(33,-200);
		Point3D pp15 = new Point3D(100,-150);

		n1.setLocation(pp1);
		n2.setLocation(pp2);
		n3.setLocation(pp3);
		n4.setLocation(pp4);
		n5.setLocation(pp5);
		n6.setLocation(pp6);
		n7.setLocation(pp7);
		n8.setLocation(pp8);
		n9.setLocation(pp9);
		n10.setLocation(pp10);
		n11.setLocation(pp11);
		n12.setLocation(pp12);
		n13.setLocation(pp13);
		n14.setLocation(pp14);
		n15.setLocation(pp15);

		foxes.addNode(n1);
		foxes.addNode(n2);
		foxes.addNode(n3);
		foxes.addNode(n4);
		foxes.addNode(n5);
		foxes.addNode(n6);
		foxes.addNode(n7);
		foxes.addNode(n8);
		foxes.addNode(n9);
		foxes.addNode(n10);
		foxes.addNode(n11);
		foxes.addNode(n12);
		foxes.addNode(n13);
		foxes.addNode(n14);
		foxes.addNode(n15);

		foxes.connect(1, 2, 1);
		foxes.connect(2, 3, 1);
		foxes.connect(2, 6, 1);
		foxes.connect(3, 4, 1);
		foxes.connect(3, 8, 1);
		foxes.connect(4, 5, 1);
		foxes.connect(4, 10, 1);
		foxes.connect(10, 8, 1);
		foxes.connect(6, 8, 1);
		foxes.connect(7, 11, 1);
		foxes.connect(9, 12, 1);
		foxes.connect(12, 13, 1);
		foxes.connect(12, 15, 1);
		foxes.connect(13, 14, 1);
		foxes.connect(14, 15, 1);
		foxes.connect(9, 11, 1);
		foxes.connect(11, 13, 1);
		foxes.connect(5, 10, 1);
		foxes.connect(1, 6, 1);

		fox.init(foxes);
		//fox.drawAll();

		//****************NOT connected graph******************
		Graph_GUI notCon = new Graph_GUI();
		DGraph g = new DGraph();

		Node n16 = new Node(16, new Point3D(0,0), 0.0, "", 0);
		Node n17 = new Node(17, new Point3D(0,0), 0.0, "", 0);
		Node n18 = new Node(18, new Point3D(0,0), 0.0, "", 0);
		Node n19 = new Node(19, new Point3D(0,0), 0.0, "", 0);
		Node n20 = new Node(20, new Point3D(0,0), 0.0, "", 0);
		Node n21 = new Node(21, new Point3D(0,0), 0.0, "", 0);
		Node n22 = new Node(22, new Point3D(0,0), 0.0, "", 0);
		Node n23 = new Node(23, new Point3D(0,0), 0.0, "", 0);


		Point3D p8 = new Point3D(50,-30);
		Point3D p9 = new Point3D(12,-16);
		Point3D p10 = new Point3D(-130,-7);
		Point3D p11 = new Point3D(64,22);
		Point3D p12 = new Point3D(10,-52);
		Point3D p13 = new Point3D(55,-2);
		Point3D p14 = new Point3D(50.2,-70);

		n16.setLocation(p8);
		n17.setLocation(p9);
		n18.setLocation(p10);
		n19.setLocation(p11);
		n20.setLocation(p12);
		n21.setLocation(p13);
		n22.setLocation(p14);

		g.addNode(n16);
		g.addNode(n17);
		g.addNode(n18);
		g.addNode(n19);
		g.addNode(n20);
		g.addNode(n21);
		g.addNode(n22);

		g.connect(16, 17, 10);
		g.connect(17, 19, 15);
		g.connect(17, 18, 12);
		g.connect(18, 19, 1);
		g.connect(18, 20, 2);
		g.connect(19, 20, 5);
		g.connect(16, 21, 15);
		g.connect(20, 21, 10);

		notCon.init(g);
		//notCon.drawAll();

		//**********Diamond graph*******************
		Graph_GUI diamond = new Graph_GUI();
		DGraph d = new DGraph();

		Node n24 = new Node(24, new Point3D(0,0), 0.0, "", 0);
		Node n25 = new Node(25, new Point3D(0,0), 0.0, "", 0);
		Node n26 = new Node(26, new Point3D(0,0), 0.0, "", 0);
		Node n27 = new Node(27, new Point3D(0,0), 0.0, "", 0);

		Point3D p15 = new Point3D(75,25);
		Point3D p16 = new Point3D(25,75);
		Point3D p17 = new Point3D(100,100);
		Point3D p18 = new Point3D(0,0);

		n24.setLocation(p17);
		n25.setLocation(p16);
		n26.setLocation(p18);
		n27.setLocation(p15);

		d.addNode(n24);
		d.addNode(n25);
		d.addNode(n26);
		d.addNode(n27);

		d.connect(24, 25, 4);
		d.connect(25, 26, 2);
		d.connect(26, 27, 2);
		d.connect(27, 24, 1);
		d.connect(25, 24, 4);
		d.connect(26, 25, 2);
		d.connect(27, 26, 2);
		d.connect(24, 27, 1);

		diamond.init(d);
		//diamond.drawAll();

		//***********************Star graph*************************
		
		Graph_GUI star = new Graph_GUI();
		DGraph s = new DGraph();
		Node n28 = new Node(28, new Point3D(0,0), 0.0, "", 0);
		Node n29 = new Node(29, new Point3D(0,0), 0.0, "", 0);
		Node n30 = new Node(30, new Point3D(0,0), 0.0, "", 0);
		Node n31 = new Node(31, new Point3D(0,0), 0.0, "", 0);
		Node n32 = new Node(32, new Point3D(0,0), 0.0, "", 0);
		
		Point3D p19 = new Point3D(-125,50);//28
		Point3D p20 = new Point3D(0,120);//29
		Point3D p21 = new Point3D(125,50);//30
		Point3D p22 = new Point3D(-95,-100);//31
		Point3D p23 = new Point3D(95,-100);//32
		
		n28.setLocation(p19);
		n29.setLocation(p20);
		n30.setLocation(p21);
		n31.setLocation(p22);
		n32.setLocation(p23);
		
		s.addNode(n28);
		s.addNode(n29);
		s.addNode(n30);
		s.addNode(n31);
		s.addNode(n32);
		
		s.connect(28,32,1);
		s.connect(32,29,1);
		s.connect(29,31,1);
		s.connect(31,30,1);
		s.connect(30,28,1);
	
		star.init(s);
		star.drawAll();
	}
}