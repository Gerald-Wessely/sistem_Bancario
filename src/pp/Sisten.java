package pp;

public class Sisten {

	public static void main(String[] args) {
		Atributos p1 = new Atributos();
		p1.setNumConta(1111);
		p1.setDono("jubileu");
		p1.abrirConta("cc");
		
		Atributos p2 = new Atributos();
		p2.setNumConta(2222);
		p2.setDono("Creusa");
		p2.abrirConta("cp");
		
		p1.depositar(100);
		p2.depositar(500);
		
		p1.estadoAtual();
		p2.estadoAtual();
		
		p1.sacar(57);
		p2.sacar(367);
		
		p1.estadoAtual();
		p2.estadoAtual();
	
	}
	

}
