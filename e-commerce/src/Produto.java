import java.math.BigDecimal;

public class Produto extends Loja{
	private int idVendedor;
    private String nomeDoProduto;
    private EnumCategoria categoria;
    private BigDecimal precoPorUnidade;

	private Produto(ProdutoBuilder builder) {
		this.nomeDoProduto = builder.nomeDoProduto;
		this.categoria = builder.categoria;
		this.precoPorUnidade = builder.precoPorUnidade;
	}


	public int getIdVendedor() {
        return idVendedor;
    }

	public void setIdVendedor(int idVendedor){
		this.idVendedor = idVendedor;
	}
    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public EnumCategoria getCategoria() {
        return categoria;
    }

    public BigDecimal getPrecoPorUnidade() {
        return precoPorUnidade;
    }


	@Override
	public String toString() {
		return "Produto: "+"Código do vendedor: "+this.idVendedor+", Nome do Produto: "+this.nomeDoProduto
		+", Categoria: "+this.categoria+", Preço por Unidade: R$ "+this.precoPorUnidade;
	}

	public static class ProdutoBuilder{
        private String nomeDoProduto;
        private EnumCategoria categoria;
        private BigDecimal precoPorUnidade;

		public ProdutoBuilder nomeProduto(String nome) {
			this.nomeDoProduto = nome;
			return this;
		}
		public ProdutoBuilder categoria(EnumCategoria categoria) {
			this.categoria = categoria;
			return this;
		}

        public ProdutoBuilder precoPorUnidade(BigDecimal precoPorUnidade) {
			this.precoPorUnidade = precoPorUnidade;
			return this;
		}

		public Produto build() {
			Produto produto =  new Produto(this);
			return produto;
		}
		
	}
}