package pp;

public class Atributos {
	public int numConta;
	private String dono;
	private float saldo;
	private boolean status;
	protected String tipo;
	public void estadoAtual() {
		System.out.println("-------------------------------");
		System.out.println("Conta:" + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo:" + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
	}
	
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if(t == "cc") {
			this.setSaldo(50);
		} else if (t == "cp") {
			this.setSaldo(150);
		}
			System.out.println("Conta aberta com sucesso +_+");
	}
	
	public void fecharconta() {
		if  (this.getSaldo() > 0) {
			System.out.println("Conta nao pode ser fechada porque ainda tem saldo");
			} else if (this.getSaldo() < 0) {
				System.out.println("Conta não pode ser fechada pois tem debitos");
				} else {
					this.setStatus(false);
					System.out.println("Conta fechada com Sucesso -_-");
				}
	}
	
	public void depositar(float v) {
		if (this.getStatus()) {
		this.setSaldo(this.getSaldo() + v);	
		System.out.println("Deposito realizado na conta" + this.getDono());
		}else {
			System.out.println("Imposssivel depositar em conta fechada!");
		}
	}
	
	public void sacar(float v) {
		if (this.getStatus()) {
			if (this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque realizado na conta de " + this.getDono());
			} else {
			System.out.println("Saldo insuficiente para para saque");
			}
		}else {
			System.out.println("Impossivel sacar de uma conta fechada");
		}
	}
	
	public void pagarMensalidade() {
		int v = 0;
		if (this.getTipo() == "cc") {
			v =12;
		}else if (this.getTipo() == "cp"){
			v = 20;
		}if (this.getStatus()) {
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Mensalidade paga com sucesso por " + this.getDono());
		}else {
			System.out.println("Impossivel pagar uma conta fechada");
		}
		
	}

	public Atributos() {
		this.setSaldo(0);
		this.setStatus(false);
		
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


}
