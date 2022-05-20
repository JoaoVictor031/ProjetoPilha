import Classes.No;
import Classes.Pilha;
public class ProjetoPilha {

	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		No no = new No(10);	
		pilha.empilhar(no);
		
		No no2 = new No(11);	
		pilha.empilhar(no2);
		
		No no3 = new No(12);	
		pilha.empilhar(no3);
		
		pilha.desempilhar();
		
		No topo = pilha.getTopo();
		
		//System.out.print(topo.getInfo());
		
		pilha.imprimirNos();
	}

}
