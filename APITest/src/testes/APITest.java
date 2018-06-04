package testes;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import atg.Graph;
import atg.GraphControl;
import atg.Vertice;

public class APITest {
	
	private static Graph grafo;
	private static Graph grafo2;
	private static Graph grafo3;
	private static Graph grafo4;
	private static Graph grafoTeste1;
	private static Graph grafoTeste2;
	private static Graph grafoTeste3;
	private static Graph grafoTeste4;
	private static Graph grafoTeste5;
	private static Graph grafoTeste6;
	private static Graph grafoTeste7;
	private Graph gbfs;
	private Graph grafoVazio;
	private Graph grafoUmVertice;
	private Graph grafoComPeso;
	private Graph grafoPesoNegativo;
	
	
	@Test
	public void testReadGRaph() {
		try {
			grafoTeste1 = GraphControl.readGraph("graph1.txt");
			assertEquals(2,grafoTeste1.getVertexNumber());
			assertEquals(2,grafoTeste1.getEdgeNumber());
			assertEquals(2, grafoTeste1.getArestas().size());
			assertEquals(2, grafoTeste1.getVerticesGraph().size());
			
			assertEquals(1, grafoTeste1.getArestas().get(0).getV1().getValor());
			assertEquals(2, grafoTeste1.getArestas().get(0).getV2().getValor());
			assertEquals(null,grafoTeste1.getArestas().get(0).getPeso());
			
			assertEquals(3, grafoTeste1.getArestas().get(1).getV1().getValor());
			assertEquals(4, grafoTeste1.getArestas().get(1).getV2().getValor());
			assertEquals(null,grafoTeste1.getArestas().get(1).getPeso());
			
			
			grafoTeste2 = GraphControl.readGraph("graph6.txt");
			assertEquals(6,grafoTeste2.getVertexNumber());
			assertEquals(6,grafoTeste2.getEdgeNumber());
			assertEquals(6, grafoTeste2.getArestas().size());
			assertEquals(6, grafoTeste2.getVerticesGraph().size());
			
			assertEquals(1, grafoTeste2.getArestas().get(0).getV1().getValor());
			assertEquals(2, grafoTeste2.getArestas().get(0).getV2().getValor());
			assertEquals(null,grafoTeste2.getArestas().get(0).getPeso());
			
			assertEquals(2, grafoTeste2.getArestas().get(1).getV1().getValor());
			assertEquals(3, grafoTeste2.getArestas().get(1).getV2().getValor());
			assertEquals(null,grafoTeste2.getArestas().get(1).getPeso());
			
			assertEquals(3, grafoTeste2.getArestas().get(2).getV1().getValor());
			assertEquals(4, grafoTeste2.getArestas().get(2).getV2().getValor());
			assertEquals(null,grafoTeste2.getArestas().get(2).getPeso());
			
			assertEquals(4, grafoTeste2.getArestas().get(3).getV1().getValor());
			assertEquals(5, grafoTeste2.getArestas().get(3).getV2().getValor());
			assertEquals(null,grafoTeste2.getArestas().get(3).getPeso());
			
			assertEquals(5, grafoTeste2.getArestas().get(4).getV1().getValor());
			assertEquals(6, grafoTeste2.getArestas().get(4).getV2().getValor());
			assertEquals(null,grafoTeste2.getArestas().get(4).getPeso());
			
			assertEquals(6, grafoTeste2.getArestas().get(5).getV1().getValor());
			assertEquals(7, grafoTeste2.getArestas().get(5).getV2().getValor());
			assertEquals(null,grafoTeste2.getArestas().get(5).getPeso());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	@Test
	public void readWeightedGraph() {
		try {
			grafoTeste1 = GraphControl.readWeightedGraph("graph2.txt");
			assertEquals(2,grafoTeste1.getVertexNumber());
			assertEquals(2,grafoTeste1.getEdgeNumber());
			assertEquals(2, grafoTeste1.getArestas().size());
			assertEquals(2, grafoTeste1.getVerticesGraph().size());
			
			assertEquals(1, grafoTeste1.getArestas().get(0).getV1().getValor());
			assertEquals(3, grafoTeste1.getArestas().get(0).getV2().getValor());
			assertEquals(-0.3,grafoTeste1.getArestas().get(0).getPeso(),0);
			
			assertEquals(3, grafoTeste1.getArestas().get(1).getV1().getValor());
			assertEquals(4, grafoTeste1.getArestas().get(1).getV2().getValor());
			assertEquals(-2,grafoTeste1.getArestas().get(1).getPeso(), 0);
			
			grafoTeste2 = GraphControl.readWeightedGraph("graph5.txt");
			assertEquals(20,grafoTeste2.getVertexNumber());
			assertEquals(20,grafoTeste2.getEdgeNumber());
			assertEquals(20, grafoTeste2.getArestas().size());		
			
			assertEquals("[(vertices=[1, 2], peso = -1.2), "
					+ "(vertices=[3, 5], peso = -2.1), (vertices=[4, 3], peso = -0.1), "
					+ "(vertices=[3, 13], peso = -2.2), (vertices=[5, 18], peso = -0.3), "
					+ "(vertices=[18, 15], peso = -1.1), (vertices=[13, 10], peso = -8.1), "
					+ "(vertices=[18, 19], peso = -1.0), (vertices=[19, 20], peso = -0.2), "
					+ "(vertices=[20, 2], peso = -7.0), (vertices=[15, 17], peso = -6.1), "
					+ "(vertices=[4, 6], peso = -0.7), (vertices=[6, 7], peso = -0.1), "
					+ "(vertices=[7, 8], peso = -2.0), (vertices=[8, 9], peso = -3.3), "
					+ "(vertices=[9, 10], peso = -1.7), (vertices=[10, 13], peso = -2.3), "
					+ "(vertices=[17, 11], peso = -5.0), (vertices=[11, 20], peso = -2.1), "
					+ "(vertices=[20, 12], peso = -2.2)]", grafoTeste2.getArestas().toString());
			
			assertEquals(20, grafoTeste2.getVerticesGraph().size());	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testReadGRaphUmVertice() {
		try {
			grafo = GraphControl.readGraph("grafoUmVertice.txt");
			assertEquals(1, grafo.getVerticesGraph().size());
			assertEquals(0,grafo.getEdgeNumber());
			assertEquals(0,grafo.getArestas().size());
			assertEquals(1, grafo.getVertexNumber());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testReadGRaphVazio() {
		try {
			grafo = GraphControl.readGraph("grafoVazio.txt");
			assertEquals(0, grafo.getVertexNumber());
			assertEquals(0, grafo.getVerticesGraph().size());
			assertEquals(0,grafo.getEdgeNumber());
			assertEquals(0,grafo.getArestas().size());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	

	@Test
	public void BFSTest() throws Exception {
		gbfs = GraphControl.readGraph("grafoGrande.txt");
		String saida = " 1 - 2\n" + " 2 - 3\n" + " 3 - 4 \n" + " 4 - 5\n" + " 5 - 6\n" + " 6 - 7\n" + " 7 - 8\n"
				+ " 8 - 9\n" + " 9 - 10\n" + " 10 - 11\n" + " 11 - 12\n" + " 12 - 13\n" + " 13 - 14\n" + " 14 - 15\n"
				+ " 15 - 16\n" + " 16 - 17\n" + " 17 - 18\n" + " 18 - 19\n" + " 19 - 20\n" + " 20 - 21\n" + " 21 - 22\n"
				+ " 22 - 23\n" + " 23 - 24\n" + " 24 - 25\n" + " 25 - 26";
		System.out.println(saida);
		String bfsResult = GraphControl.BFS(gbfs, new Vertice(1));
		assertEquals(bfsResult, saida);
	}
	
	@Test
	public void BFSGrafoVazio() throws Exception {
		grafoVazio = GraphControl.readGraph("grafoVazio.txt");
		String saidaGrafoVazio = "";
		String bfsResultVazio = GraphControl.BFS(grafoVazio, null);
		assertEquals(saidaGrafoVazio, bfsResultVazio);
	}
	
	@Test
	public void BFSUmVertice() throws Exception {
		grafoUmVertice = GraphControl.readGraph("grafoUmVertice.txt");
		String saidaGrafoUmVertice = "1 - ";
		String bfsResultadoUmVertice = GraphControl.BFS(grafoUmVertice, new Vertice(1));
		assertEquals(saidaGrafoUmVertice, bfsResultadoUmVertice);
	}
	
	@Test
	public void BFSGrafoPeso() throws Exception {
		grafoComPeso = GraphControl.readWeightedGraph("grafoComPeso.txt");
		grafoPesoNegativo = GraphControl.readWeightedGraph("pesoNegativo.txt");
		String saidaComPeso = "0 - 0 - \n" + "2 - 1 0\n"+ "3 - 1 0\n";
		assertEquals(GraphControl.BFS(grafoComPeso, new Vertice(0)), saidaComPeso);
		
		String saidaPesoNegativo= "2 - 0 \n" + "1 - 1 2\n" + "5 - 1 2\n"+ "3 - 2 5\n" + "4 - 2 3\n";
		assertEquals(GraphControl.BFS(grafoPesoNegativo, new Vertice(2)), saidaPesoNegativo);

	}
	
	@Test
	public void testConnected2() throws Exception {
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
	public void testVertexNumber() throws Exception {
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
	public void testEdgeNumber() throws Exception {
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
	public void testMeanEdgeNumber() throws Exception {
		
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
