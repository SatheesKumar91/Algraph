package graph;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
import java.util.Set;
import java.io.*;

public class random2 {

	public static void main(String[] args) {
		Graph<String> randomGraph2 = new Graph<String>();
        
		int nNodi;
		
		System.out.println("ciao");

/*		Scanner keyboard = new Scanner(System.in);
		System.out.println("selezionare il numero di nodi del grafo");
		nNodi = keyboard.nextInt();
*/
		nNodi = ThreadLocalRandom.current().nextInt(2, 6 + 1);
		
		Node<String> nodo;
		
		int end = nNodi; //uso una varibile uguale  nNodi perche nNodi mi serve dopo
		int count = 1;
		
		while(end > 0){
		    nodo = new Node<String>(String.valueOf(count));
			randomGraph2.insertNode(nodo);
			 end = end - 1;
			 count = count + 1;

		}		 
		
		count = 1;
		end = nNodi;
		int create = ThreadLocalRandom.current().nextInt(0, 1 + 1);


		for (Node node : randomGraph2.V()) {


		}







	    //System.out.println(String.valueOf(create));

//		while(end > 1){
//			if (create &&)






//		}
	 





	/*	Node<String> a = new Node<String>("A", 1., 2.);
		Node<String> b = new Node<String>("B", 3., 4.);
		Node<String> c = new Node<String>("C", 5., 6.);
		Node<String> d = new Node<String>("D", 7., 8.);
		Node<String> e = new Node<String>("E", 9., 10.);
		Node<String> f = new Node<String>("F", 11., 12.);
		Node<String> g = new Node<String>("G", 13., 14.);
		
		g1.insertNode(a);
		g1.insertNode(b);
		g1.insertNode(c);
		g1.insertNode(d);
		g1.insertNode(e);
		g1.insertNode(f);
		g1.insertNode(g);
		
		g1.insertEdge(a, b, 1);
		g1.insertEdge(a, c, 2);
		g1.insertEdge(b, e, 3);
		g1.insertEdge(b, g, 4);
		g1.insertEdge(d, g, 5);
		g1.insertEdge(e, d, 6);
		g1.insertEdge(g, c, 7);
		g1.insertEdge(c, f, 8);
		
		//arco che rompe il vincolo 2-colorabile
		g1.insertEdge(b, c, 9);
*/		
		randomGraph2.print();

//		int nNodi = ThreadLocalRandom.current().nextInt(2, 6 + 1);

//		System.out.println(nNodi);



	}

}

