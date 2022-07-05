import java.util.HashSet;
import java.util.Set;

public abstract class Loja implements ServicosDaLoja {
    //Acessivel para a classe e subclasses de Loja
    protected static Set<Produto> produtos = new HashSet<>();
    protected static Set<Produto> produtoModaFeminina = new HashSet<>();
    protected static Set<Produto> produtoModaMasculina = new HashSet<>();
    protected static Set<Produto> produtoEsportes = new HashSet<>();
    protected static Set<Produto> produtoEletronicos = new HashSet<>();
    protected static Set<Produto> tipoProdutos = new HashSet<>();


    protected static Set<Produto> carrinhoVirtual = new HashSet<>();
    
    @Override
    public void listarProdutos(EnumCategoria tipoDeProduto){
        for( Produto produto : verificaCategoria(tipoDeProduto)){
          System.out.println(produto.getNomeDoProduto());
        }
        
    }

    @Override
    public void comprarProduto(Produto produto, int quantidade){
      if (produtos.contains(produto)){
        produto.setQuantidadeDoProduto(quantidade);
		carrinhoVirtual.add(produto);
        
      }
    }

   @Override
   public void realizarPagamento(EnumMetodosDePagamento pagamento, int quantidadeParcelamento){
	ValidaPagamentoCartao validacaoCartao = new ValidaPagamentoCartao();
	if(validacaoCartao.validar(pagamento, quantidadeParcelamento)){
		System.out.println("Pagamento Aprovado!");
	} 

   }

   public void realizarPagamento(EnumMetodosDePagamento pagamento){
	ValidaOutrosPagamentos validaOutrosPagamentos = new ValidaOutrosPagamentos();
	if(validaOutrosPagamentos.validar(pagamento)){
		System.out.println("Pagamento Aprovado!");
	}
     
   }


  public  Set<Produto> verificaCategoria(EnumCategoria tipoDeProduto){
    if(tipoDeProduto == EnumCategoria.TODOS_PRODUTOS){
		Set<Produto> tipoProdutos = produtos;
      return tipoProdutos;
    } else if(tipoDeProduto == EnumCategoria.ELETRONICOS){
		Set<Produto> tipoProdutos = produtoEletronicos;
      return tipoProdutos;
    } else if(tipoDeProduto == EnumCategoria.ESPORTES){
		Set<Produto> tipoProdutos = produtoEsportes;
      return tipoProdutos;
    } else if(tipoDeProduto == EnumCategoria.MODA_FEMININA){
		Set<Produto> tipoProdutos = produtoModaFeminina;
      return tipoProdutos;
    } else{
		Set<Produto> tipoProdutos = produtoModaMasculina;
      return tipoProdutos;
    }

  }

    
}
