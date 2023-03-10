package principal;

public class Perecivel  extends Produto{
	
	private String dataValidade;
	private String cidadeOrigem;
	
	public Perecivel() {
		super();
	}

	public Perecivel(int codigo, String descricao, double valorUnit, String dataValidade, String cidadeOrigem) {
		super(codigo, descricao, valorUnit);
		this.dataValidade = dataValidade;
		this.cidadeOrigem = cidadeOrigem;
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}

	public String getCidadeOrigem() {
		return cidadeOrigem;
	}

	public void setCidadeOrigem(String cidadeOrigem) {
		this.cidadeOrigem = cidadeOrigem;
	}
	
	@Override
	public double calcValorTotal(int quantidade) {
		return this.getValorUnit()*quantidade;
	}
	
	
	


}
