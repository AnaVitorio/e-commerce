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

	//NÃO ACEITA CHAVES DUPLICADAS
	// protected static Map<Integer, Produto> produtos = new HashMap<>();
    // protected static Map<Integer, Produto> produtoModaFeminina = new HashMap<>();
    // protected static Map<Integer, Produto> produtoModaMasculina = new HashMap<>();
    // protected static Map<Integer, Produto> produtoEsportes = new HashMap<>();
    // protected static Map<Integer, Produto> produtoEletronicos = new HashMap<>();
    // protected static Map<Integer, Produto> tipoProdutos = new HashMap<>();


    protected static Set<Produto> carrinhoVirtual = new HashSet<>();
    
    @Override
    public void listarProdutos(EnumCategoria tipoDeProduto){
        for( Produto produto : verificaCategoria(tipoDeProduto)){
          System.out.println(produto);
        }
        
    }

    @Override
    public void comprarProduto(Produto produto, int quantidade){
      if (produtos.contains(produto) && produto.getQuantidadeDoProduto() <= quantidade){
        //compra com sucesso.
		carrinhoVirtual.add(produto);
        produto.setQuantidadeDoProduto(produto.getQuantidadeDoProduto() - quantidade);
        
      }
    }

   @Override
   public void realizarPagamento(EnumMetodosDePagamento pagamento, int quantidadeParcelamento){
    if(pagamento.equals(EnumMetodosDePagamento.CARTAO_PARCELADO) && quantidadeParcelamento <= 3){

    } else{
      throw new RuntimeException("Para pagamentos com Cartão Parcelado, limite de parcelamento de 3X.");
    }

   }

   public void realizarPagamento(EnumMetodosDePagamento pagamento){
    if(pagamento.equals(EnumMetodosDePagamento.CARTAO_PARCELADO)){
		throw new RuntimeException("Para pagamentos com Cartão Parcelado, informe o número de parcelas");
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
