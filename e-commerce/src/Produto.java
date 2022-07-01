import java.math.BigDecimal;

public class Produto extends Loja {
    private String nomeDoProduto;
    private EnumCategoria categoria;
    private int quantidadeDoProduto;
    private BigDecimal precoPorUnidade;


    public Produto(String nomeDoProduto, EnumCategoria categoria, int quantidadeDoProduto, BigDecimal precoPorUnidade) {
        this.nomeDoProduto = nomeDoProduto;
        this.categoria = categoria;
        this.quantidadeDoProduto = quantidadeDoProduto;
        this.precoPorUnidade = precoPorUnidade;
    }

    //Criar um builder de Produtos.
    
}
