package principal;

public class Permanente extends Produto{
	private double percDesvalorizacao;
	private boolean escritorio;
	
	public Permanente() {
		super();
	}

	public Permanente(int codigo, String descricao, double valorUnit, double percDesvalorizacao, boolean escritorio) {
		super(codigo, descricao, valorUnit);
		this.percDesvalorizacao = percDesvalorizacao;
		this.escritorio = escritorio;
	}

	public double getPercDesvalorizacao() {
		return percDesvalorizacao;
	}

	public void setPercDesvalorizacao(double percDesvalorizacao) {
		this.percDesvalorizacao = percDesvalorizacao;
	}

	public boolean isEscritorio() {
		return escritorio;
	}

	public void setEscritorio(boolean escritorio) {
		this.escritorio = escritorio;
	}
	
	@Override
	public double calcValorTotal(int quantidade) {
		return this.getValorUnit()*quantidade*this.getPercDesvalorizacao();
	}
	
	

}
