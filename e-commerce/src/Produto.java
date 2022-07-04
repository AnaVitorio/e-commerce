import java.math.BigDecimal;

public class Produto extends Loja{
    private String nomeDoProduto;
    private EnumCategoria categoria;
    private int quantidadeDoProduto;
    private BigDecimal precoPorUnidade;

	private Produto(ProdutoBuilder builder) {
		this.nomeDoProduto = builder.nomeDoProduto;
		this.categoria = builder.categoria;
		this.quantidadeDoProduto = builder.quantidadeDoProduto;
		this.precoPorUnidade = builder.precoPorUnidade;
	}


    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public EnumCategoria getCategoria() {
        return categoria;
    }

    public int getQuantidadeDoProduto() {
        return quantidadeDoProduto;
    }

	public void setQuantidadeDoProduto(int quantidadeDoProduto){
		this.quantidadeDoProduto = quantidadeDoProduto;
	}

    public BigDecimal getPrecoPorUnidade() {
        return precoPorUnidade;
    }


	@Override
	public String toString() {
		return "Produto: "+this.nomeDoProduto+", "+this.categoria+", "+this.quantidadeDoProduto+", "+this.precoPorUnidade;
	}

	public static class ProdutoBuilder{
        private String nomeDoProduto;
        private EnumCategoria categoria;
        private int quantidadeDoProduto;
        private BigDecimal precoPorUnidade;

		
		public ProdutoBuilder nomeProduto(String nome) {
			this.nomeDoProduto = nome;
			return this;
		}
		public ProdutoBuilder categoria(EnumCategoria categoria) {
			this.categoria = categoria;
			return this;
		}
		public ProdutoBuilder quantidadeProduto(int quantidadeDoProduto) {
			this.quantidadeDoProduto = quantidadeDoProduto;
			return this;
		}

        public ProdutoBuilder precoPorUnidade(BigDecimal precoPorUnidade) {
			this.precoPorUnidade = precoPorUnidade;
			return this;
		}

		//Return the finally consrcuted User object
		public Produto build() {
			Produto produto =  new Produto(this);
			return produto;
		}
		
	}
}