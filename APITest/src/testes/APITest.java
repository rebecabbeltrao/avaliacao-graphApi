package testes;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import atg.Graph;
import atg.GraphControl;
import atg.Vertice;

public class APITest {
	
	private static Graph grafo1;
	private static Graph grafo2;
	private static Graph grafo3;
	private static Graph grafo4;
	private Graph gbfs;
	private Graph grafoVazio;
	private Graph grafoUmVertice;
	private Graph grafoComPeso;
	private Graph grafoPesoNegativo;


	//esse aqui é só um exemplo de teste, pode comecar após esse
	@Test
	public void test() {
		try {
			grafo1 = GraphControl.readGraph("teste1.txt");
			grafo2 = GraphControl.readWeightedGraph("teste2.txt");
			grafo3 = GraphControl.readGraph("teste3.txt");
			grafo4 = GraphControl.readWeightedGraph("teste4.txt");
		} catch (Exception e) {
			e.printStackTrace();
//			fail();
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

}
