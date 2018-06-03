package atg;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class Tests {

	private static Graph grafoTeste1;
	private static Graph grafoTeste2;
	private static Graph grafoTeste3;
	private static Graph grafoTeste4;
	private static Graph grafoTeste5;
	private static Graph grafoTeste6;
	private static Graph grafoTeste7;
	
	@Test
	public void testConnected2() throws IOException {
		grafoTeste1 = GraphControl.readGraph("graph1.txt");
		grafoTeste2 = GraphControl.readGraph("graph2.txt");
		grafoTeste3 = GraphControl.readGraph("graph3.txt");
 	    grafoTeste4 = GraphControl.readGraph("graph4.txt");
		grafoTeste5 = GraphControl.readGraph("graph5.txt");
		grafoTeste6 = GraphControl.readGraph("graph6.txt");
		grafoTeste7 = GraphControl.readGraph("graph7.txt");


		assertFalse(GraphControl.connected(grafoTeste1));
		assertTrue(GraphControl.connected(grafoTeste2));
		assertTrue(GraphControl.connected(grafoTeste3));
		assertTrue(GraphControl.connected(grafoTeste4));
		assertTrue(GraphControl.connected(grafoTeste5));
		assertTrue(GraphControl.connected(grafoTeste6));
		assertTrue(GraphControl.connected(grafoTeste7));

	}
	@Test
	public void testVertexNumber() throws IOException {
		grafoTeste7 = GraphControl.readGraph("graph7.txt");
		grafoTeste1 = GraphControl.readGraph("graph1.txt");
		grafoTeste2 = GraphControl.readGraph("graph2.txt");
		grafoTeste3 = GraphControl.readGraph("graph3.txt");
 	    grafoTeste4 = GraphControl.readGraph("graph4.txt");
		grafoTeste5 = GraphControl.readGraph("graph5.txt");
		grafoTeste6 = GraphControl.readGraph("graph6.txt");
		
		assertEquals(4, GraphControl.getVertexNumber(grafoTeste1));
		assertEquals(3, GraphControl.getVertexNumber(grafoTeste2));
		assertEquals(4, GraphControl.getVertexNumber(grafoTeste3));
		assertEquals(4, GraphControl.getVertexNumber(grafoTeste4));
		assertEquals(18, GraphControl.getVertexNumber(grafoTeste5));
		assertEquals(7, GraphControl.getVertexNumber(grafoTeste6));
		assertEquals(24, GraphControl.getVertexNumber(grafoTeste7));
		
	}
	
	@Test
	public void testEdgeNumber() throws IOException {
		grafoTeste7 = GraphControl.readGraph("graph7.txt");
		grafoTeste1 = GraphControl.readGraph("graph1.txt");
		grafoTeste2 = GraphControl.readGraph("graph2.txt");
		grafoTeste3 = GraphControl.readGraph("graph3.txt");
 	    grafoTeste4 = GraphControl.readGraph("graph4.txt");
		grafoTeste5 = GraphControl.readGraph("graph5.txt");
		grafoTeste6 = GraphControl.readGraph("graph6.txt");
		

		assertEquals(2, GraphControl.getEdgeNumber(grafoTeste1));
		assertEquals(2, GraphControl.getEdgeNumber(grafoTeste2));
		assertEquals(3, GraphControl.getEdgeNumber(grafoTeste3));
		assertEquals(4, GraphControl.getEdgeNumber(grafoTeste4));
		assertEquals(20, GraphControl.getEdgeNumber(grafoTeste5));
		assertEquals(6, GraphControl.getEdgeNumber(grafoTeste6));
		assertEquals(30, GraphControl.getEdgeNumber(grafoTeste7));
		
	}
	
	@Test
	public void testMeanEdgeNumber() throws IOException {
		grafoTeste7 = GraphControl.readGraph("graph7.txt");
		grafoTeste1 = GraphControl.readGraph("graph1.txt");
		grafoTeste2 = GraphControl.readGraph("graph2.txt");
		grafoTeste3 = GraphControl.readGraph("graph3.txt");
 	    grafoTeste4 = GraphControl.readGraph("graph4.txt");
		grafoTeste5 = GraphControl.readGraph("graph5.txt");
		grafoTeste6 = GraphControl.readGraph("graph6.txt");
		

		assertEquals(1, GraphControl.getEdgeNumber(grafoTeste1));
		assertEquals(1.3, GraphControl.getEdgeNumber(grafoTeste2));
		assertEquals(1.5, GraphControl.getEdgeNumber(grafoTeste3));
		assertEquals(2, GraphControl.getEdgeNumber(grafoTeste4));
		assertEquals(2.23, GraphControl.getEdgeNumber(grafoTeste5));
		assertEquals(1.7, GraphControl.getEdgeNumber(grafoTeste6));
		assertEquals(1.6, GraphControl.getEdgeNumber(grafoTeste7));
		
	}
	
}
