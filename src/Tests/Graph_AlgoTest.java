package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import algorithms.Graph_Algo;
import dataStructure.DGraph;
import dataStructure.Node;
import utils.Point3D;

class Graph_AlgoTest {

	private Graph_Algo createAlgo() {
		Graph_Algo ga = new Graph_Algo();
		ga.g.addNode(new Node(1, new Point3D(0,0), 0, "", 0));
		ga.g.addNode(new Node(2, new Point3D(50,0), 0, "", 0));
		ga.g.addNode(new Node(3, new Point3D(0,50), 0, "", 0));
		ga.g.addNode(new Node(4, new Point3D(100,100), 0, "", 0));
			
		return ga;	
	}
	
	@Test
	void testInit() {
		Graph_Algo ga = createAlgo();
		ga.save("test1.txt");
		
		Graph_Algo in = new Graph_Algo();
		in.init("test1.txt");
		
		assertEquals(ga.equals(in), in.equals(ga));
	}

	@Test
	void testSave() {
		Graph_Algo ga = createAlgo();
		ga.save("test.txt");
	}

	@Test
	void testIsConnected() {
		Graph_Algo ga = createAlgo();
		ga.g.connect(1, 2, 1);
		ga.g.connect(2, 3, 1);
		ga.g.connect(3, 4, 1);
		ga.g.connect(4, 1, 1);
		
		assertTrue(ga.isConnected());

	}

	@Test
	void testShortestPathDist() {
		Graph_Algo ga = createAlgo();
		ga.g.connect(1, 2, 1);
		ga.g.connect(2, 3, 2);
		ga.g.connect(3, 4, 3);
		
		double weight = ga.shortestPathDist(1, 4);
		assertTrue(weight == 6);
	}

	@Test
	void testShortestPath() {
		
	}

	@Test
	void testTSP() {
		
	}

	@Test
	void testCopy() {
		
	}
}
