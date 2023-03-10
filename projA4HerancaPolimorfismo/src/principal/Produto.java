package principal;

public abstract class Produto {
	protected int codigo;
	protected String descricao;
	protected double valorUnit;
	public Produto(int codigo, String descricao, double valorUnit) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.valorUnit = valorUnit;
	}
	public Produto() {
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValorUnit() {
		return valorUnit;
	}
	public void setValorUnit(double valorUnit) {
		this.valorUnit = valorUnit;
	}
	public abstract double calcValorTotal(int quantidade);

}
