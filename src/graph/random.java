package graph;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;



public class random {
  
	public static void main(String[] args) {

		Graph<String> randomGraph = new Graph<String>();
  int nNodi;

 /*  System.out.println("premi s se vuoi dare un numero di nodi, un qualsiasi altro valore altrimenti");

    Scanner reader = new Scanner(System.in);
    char s = reader.next().trim().charAt(0);

    if(s == 's'){
          
        
      // scan
      Scanner keyboard = new Scanner(System.in);
      System.out.println("selezionare il numero di nodi del grafo");
      nNodi = keyboard.nextInt();

    
      int randomNum = ThreadLocalRandom.current().nextInt(0, 1 + 1);



    }
    else{

      nNodi = ThreadLocalRandom.current().nextInt(2, 6 + 1);
    }
*/
//nNodi = ThreadLocalRandom.current().nextInt(2, 6 + 1);

//Node<String> nodo;
//int end = nNodi; //uso una varibile uguale  nNodi perche nNodi mi serve dopo

/*while(end > 0){
  nodo = new Node<String>("a");

  randomGraph.insertNode(nodo);

  end = end - 1;

}
*/

randomGraph.print();




}

}