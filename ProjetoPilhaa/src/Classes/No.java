package Classes;

public class No {
	private int info;
	private No prox;
	
	public No(int info) {
		this.info= info;
		this.prox = null;
	}
	
	public int getInfo() {
		return this.info;
	}
	
	public void setInfo(int info){
		this.info = info;
	}
	
	public void setProx(No prox) {
		this.prox = prox;
	}
	
	public No getProx() {
		return this.prox;
	}
	
}
