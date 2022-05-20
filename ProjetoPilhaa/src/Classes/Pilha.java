package Classes;

public class Pilha {
	private No topo;
	
	public Pilha() {
		this.topo = null;
	}
	
	public void empilhar(No novo) {
		novo.setProx(this.topo);
		this.topo = novo;
		
	}
	public void desempilhar(){
		this.topo = this.topo.getProx();
		
	}
	public No getTopo(){
		return this.topo;
	}
}
