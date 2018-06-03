package testes;

import org.junit.Test;

import atg.Graph;
import atg.GraphControl;

public class APITest {
	
	private static Graph grafo1;
	private static Graph grafo2;
	private static Graph grafo3;
	private static Graph grafo4;

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

}
