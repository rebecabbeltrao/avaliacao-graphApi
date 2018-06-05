package teste;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Assert;
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
	public void testReadGRaph() throws Exception {
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
	public void testReadGRaphUmVertice() throws Exception {
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
	public void testReadGRaphVazio() throws Exception {
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
		

		assertEquals(1, GraphControl.getMeanEdge(grafoTeste1));
		assertEquals(1.3, GraphControl.getMeanEdge(grafoTeste2));
		assertEquals(1.5, GraphControl.getMeanEdge(grafoTeste3));
		assertEquals(2, GraphControl.getMeanEdge(grafoTeste4));
		assertEquals(2.23, GraphControl.getMeanEdge(grafoTeste5));
		assertEquals(1.7, GraphControl.getMeanEdge(grafoTeste6));
		assertEquals(1.6, GraphControl.getMeanEdge(grafoTeste7));
		
	}
	public void testGraphRepresentationAL() throws Exception {
		try {
			grafo = GraphControl.readGraph("teste1.txt");
			grafo3 = GraphControl.readGraph("teste3.txt");
			grafoTeste6 = GraphControl.readGraph("graph6.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String adjList, adjMatrix;
		String list = "\n";
		list += "1 - 2 5" + "\n";
		list += "2 - 1 5" + "\n";
		list += "3 - 5" + "\n";
		list += "4 - 5" + "\n";
		list += "5 - 1 2 3 4";
		adjList = GraphControl.graphRepresentation(grafo, Graph.Tipo.AL);
		assertEquals(list, adjList);
		
		
		String list2 = "\n";
		list2 += "1 - 2 5" + "\n";
		list2 += "2 - 3" + "\n";
		list2 += "3 - " + "\n";
		list2 += "4 - 3" + "\n";
		list2 += "5 - 2 4" + "\n";
		adjList = GraphControl.graphRepresentation(grafo3, Graph.Tipo.AL);
		assertEquals(list2, adjList);
		
		String list3 = "\n";
		list3 += "1 - 2" + "\n";
		list3 += "2 - 3" + "\n";
		list3 += "3 - 4" + "\n";
		list3 += "4 - 5" + "\n";
		list3 += "5 - 6" + "\n";
		list3 += "6 - 7" + "\n";
		list3 += "7 - " + "\n";
		String adjList3 = GraphControl.graphRepresentation(grafoTeste6, Graph.Tipo.AL);
		assertEquals(list3, adjList3);
		
		
	}
	
	@Test
	public void testGraphRepresentationAM() throws Exception {
		try {
			grafo = GraphControl.readGraph("teste1.txt");
			grafo3 = GraphControl.readGraph("teste3.txt");
			grafoTeste6 = GraphControl.readGraph("graph6.txt");	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String matrix = "";
		matrix += "  1 2 3 4 5" + "\n";
		matrix += "1 0 1 0 0 1" + "\n";
		matrix += "2 1 0 0 0 1" + "\n";
		matrix += "3 0 0 0 0 1" + "\n";
		matrix += "4 0 0 0 0 1" + "\n";
		matrix += "5 1 1 1 1 0";
		
		String adjMatrix = GraphControl.graphRepresentation(grafo, Graph.Tipo.AM);
		assertEquals(matrix, adjMatrix);
		String matrix2 = "";
		matrix2 += "  1 2 3 4 5" + "\n";
		matrix2 += "1 0 1 0 0 1" + "\n";
		matrix2 += "2 0 0 1 0 0" + "\n";
		matrix2 += "3 0 0 0 0 0" + "\n";
		matrix2 += "4 0 0 1 0 0" + "\n";
		matrix2 += "5 0 1 0 1 0" + "\n";
		
		String adjMatrix2 = GraphControl.graphRepresentation(grafo3, Graph.Tipo.AM);
		assertEquals(matrix2,adjMatrix2);
		
		String matrix3 = "";
		matrix3 += "  1 2 3 4 5 6 7" + "\n";
		matrix3 += "1 0 1 0 0 0 0 0" + "\n";
		matrix3 += "2 0 0 1 0 0 0 0" + "\n";
		matrix3 += "3 0 0 0 1 0 0 0" + "\n";
		matrix3 += "4 0 0 0 0 1 0 0" + "\n";
		matrix3 += "5 0 0 0 0 0 1 0" + "\n";
		matrix3 += "6 0 0 0 0 0 0 1" + "\n";
		matrix3 += "7 0 0 0 0 0 0 0" + "\n";
		
		String adjMatrix3 = GraphControl.graphRepresentation(grafoTeste6, Graph.Tipo.AM);
		assertEquals(matrix3, adjMatrix3);
 	}
	
	@Test
	public void testGraphRepresentationAMComPeso() throws Exception {
		try {
			grafo2 = GraphControl.readWeightedGraph("teste2.txt");
			grafo4 = GraphControl.readWeightedGraph("teste4.txt");
			grafoTeste5 = GraphControl.readWeightedGraph("graph5.txt");
			grafoPesoNegativo = GraphControl.readWeightedGraph("pesoNegativo.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String matrix = "";
		matrix += "  1 2 3 4 5" + "\n";
		matrix += "1 0 0.1 0 0 1" + "\n";
		matrix += "2 0.1 0 0 0 0.2" + "\n";
		matrix += "3 0 0 0 -9.5 5" + "\n";
		matrix += "4 0 0 -9.5 0 2.3" + "\n";
		matrix += "5 1 0.2 5 2.3 0";
		
		String adjMatrix = GraphControl.graphRepresentation(grafo2, Graph.Tipo.AM);
		assertEquals(matrix,adjMatrix);
		
		String matrix2 = "";
		matrix2 += "  0 1 2 3 4 5" + "\n";
		matrix2 += "0 0 0 3.0 5.0 0" + "\n";
		matrix2 += "1 0 0 0 0 0 0" + "\n";
		matrix2 += "2 2.0 0 0 0 0" + "\n";
		matrix2 += "3 0 0 0 0 0 0" + "\n";
		matrix2 += "4 0 0 0 0 0 7.0"+ "\n";
		matrix2 += "5 0 0 0 0 0 0" + "\n";
		
		String adjMatrix2 = GraphControl.graphRepresentation(grafo4, Graph.Tipo.AM);
		assertEquals(matrix2, adjMatrix2);
		
		String matrix3 = "";
		matrix3 += " 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20" + "\n";
		matrix3 += "1 -1.2 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0" + "\n";
		matrix3 += "2 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0" + "\n";
		matrix3 += "3 0 0 0 0 -2.1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0" + "\n";
		matrix3 += "4 0 0 -0.1 0 0 -0.7 0 0 0 0 0 0 0 0 0 0 0 0 0 0" + "\n";
		matrix3 += "5 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 -1.1 0 0" + "\n";
		matrix3 += "6 0 0 0 0 0 0 -0.1 0 0 0 0 0 0 0 0 0 0 0 0 0" + "\n";
		matrix3 += "7 0 0 0 0 0 0 0 -2 0 0 0 0 0 0 0 0 0 0 0 0" + "\n";
		matrix3 += "8 0 0 0 0 0 0 0 0 -3.3 0 0 0 0 0 0 0 0 0 0 0" + "\n";
		matrix3 += "9 0 0 0 0 0 0 0 0 0 -1.7 0 0 0 0 0 0 0 0 0 0" + "\n";
		matrix3 += "10 0 0 0 0 0 0 0 0 0 0 0 0 -2.3 0 0 0 0 0 0 0" + "\n";
		matrix3 += "11 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0" + "\n";
		matrix3 += "12 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0" + "\n";
		matrix3 += "13 0 0 -2.2 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0" + "\n";
		matrix3 += "14 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0" + "\n";
		matrix3 += "15 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0" + "\n";
		matrix3 += "16 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0" + "\n";
		matrix3 += "17 0 0 0 0 0 0 0 0 0 0 -5 0 0 0 0 0 0 0 0" + "\n";
		matrix3 += "18 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 -1.0 0" + "\n";
		matrix3 += "19 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 -0.2" + "\n";
		matrix3 += "20 0 -7 0 0 0 0 0 0 0 0 0 -2.2 0 0 0 0 0 0 0 0" + "\n";
		String adjMatrix3 = GraphControl.graphRepresentation(grafoTeste5, Graph.Tipo.AM);
		assertEquals(matrix3, adjMatrix3);
		
		String matrix4 = "";
		matrix4 += "  1 2 3 4 5" + "\n";
		matrix4 += "1 0 0.1 0 0 1" + "\n";
		matrix4 += "2 0 0 0 0 0.2" + "\n";
		matrix4 += "3 0 0 0 -9.5 0" + "\n";
		matrix4 += "4 0 0 0 0 2.3" + "\n";
		matrix4 += "5 0 0 5 0 0" + "\n";
		
		String adjMatrix4 = GraphControl.graphRepresentation(grafoPesoNegativo, Graph.Tipo.AM);
		assertEquals(matrix4, adjMatrix4);
 		
	}
	@Test
	public void testGraphRepresentatioALComPesos() throws Exception {
		try {
			grafo2 = GraphControl.readWeightedGraph("teste2.txt");
			grafo4 = GraphControl.readWeightedGraph("teste4.txt");
			grafoTeste5 = GraphControl.readWeightedGraph("graph5.txt");
			grafoPesoNegativo = GraphControl.readWeightedGraph("pesoNegativo.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String adjList, adjMatrix;
		
		String list = "\n";
		list += "1 - 2(0.1) 5(1)" + "\n";
		list += "2 - 1(0.1) 5(0.2)" + "\n";
		list += "3 - 4(-9.5) 5(5)" + "\n";
		list += "4 - 3(-9.5) 5(2.3)" + "\n";
		list += "5 - 1(1) 2(0.2) 3(5) 4(2.3)";
		adjList = GraphControl.graphRepresentation(grafo2, Graph.Tipo.AL);
		assertEquals(list, adjList);
		
		String list2 = "\n";
		list2 += "0 - 2(3.0) 3(5.0)" + "\n";
		list2 += "1 - " + "\n";
		list2 += "2 - 1(2.0) 3" + "\n";
		list2 += "3 - " + "\n";
		list2 += "4 - 5(7.0)" + "\n";
		list2 += "5 - " + "\n";
		adjList = GraphControl.graphRepresentation(grafo4, Graph.Tipo.AL);
		
		String list3 = "\n";
		list3 += "1 - 1(-1.2)" + "\n";
		list3 += "2 - " + "\n";
		list3 += "3 - 5(-2.1)" + "\n";
		list3 += "4 - 3(-0.1) 6(-0.7)" + "\n";
		list3 += "5 - 18(-1.1)" + "\n";
		list3 += "6 - 7(-0.1)" + "\n";
		list3 += "7 - 8(-2)" + "\n";
		list3 += "8 - 9(-3.3)" + "\n";
		list3 += "9 - 10(-1.7)" + "\n";
		list3 += "10 - 13(-2.3)" + "\n";
		list3 += "11 - " + "\n";
		list3 += "12 - " + "\n";
		list3 += "13 - 3(-2.2)" + "\n";
		list3 += "14 - " + "\n";
		list3 += "15 - " + "\n";
		list3 += "16 - " + "\n";
		list3 += "17 - 10(-5)" + "\n";
		list3 += "18 - 19(-1.0)" + "\n";
		list3 += "19 - 20(-0.2)" + "\n";
		list3 += "20 - 2(-7) 12(-2.2)" + "\n";
		
		String adjList3 = GraphControl.graphRepresentation(grafoTeste5, Graph.Tipo.AL);
		assertEquals(list3, adjList3);
		
		String list4 = "\n";
		list4 += "1 - 2(0.1) 5(1)" + "\n";
		list4 += "2 - 5(0.2)" + "\n";
		list4 += "3 - 4(-9.5)" + "\n";
		list4 += "4 - 5(2.3)" + "\n";
		list4 += "5 - 3(5)" + "\n";
	
		String adjList4 = GraphControl.graphRepresentation(grafoPesoNegativo, Graph.Tipo.AL);
		assertEquals(list4, adjList4);
	}

	@Test
	public void testShortestPath() throws Exception {
		String caminho1;
		Graph graphComPeso = GraphControl.readGraph("graph8.txt");
		caminho1 = GraphControl.shortestPath( new Vertice(1), new Vertice(5)); //nao eh possivel associar o grafo a execucao do menor caminho
		String caminho2 = GraphControl.shortestPath( new Vertice(5), new Vertice(5)); //recebe como parametros somente objetos do tipo Vertice, mas nao permite que a criacao desses objetos
		Assert.assertEquals("1 2 3 5", caminho1);
		Assert.assertEquals("5", caminho2);
		grafoVazio = GraphControl.readWeightedGraph("grafoVazio.txt");
		Assert.assertEquals(" ",  GraphControl.shortestPath( new Vertice(5), new Vertice(5)));

	}
	
	@Test
	public void testDFS() throws IOException {
		grafoVazio = GraphControl.readWeightedGraph("grafoVazio.txt");
		Assert.assertNull(GraphControl.DFS(grafoVazio, new Vertice(0)));
	}
	
	@Test
	public void testMST() throws IOException {
		grafoVazio = GraphControl.readWeightedGraph("grafoVazio.txt");
		Assert.assertNull(GraphControl.mst(grafoVazio));
		
	}


}
	

