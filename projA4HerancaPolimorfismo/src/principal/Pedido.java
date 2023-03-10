package principal;

public class Pedido {
	private int codigo;
	private String dataPedido;
	private int quantidade;
	private Produto produto;
	
	public Pedido(int codigo, String dataPedido, int quantidade) {
		this.codigo = codigo;
		this.dataPedido = dataPedido;
		this.quantidade = quantidade;
	}
	public Pedido() {
	}
	
	public Produto getProduto() {
		return produto;
	}
	
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDataPedido() {
		return dataPedido;
	}
	public void setDataPedido(String dataPedido) {
		this.dataPedido = dataPedido;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
