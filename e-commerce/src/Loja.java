import java.util.HashSet;
import java.util.Set;

public abstract class Loja {
    //Acessivel para a classe e subclasses de Loja
    protected static Set<Produto> produtos = new HashSet<>();
    protected static Set<Produto> produtoModaFeminina = new HashSet<>();
    protected static Set<Produto> produtoModaMasculina = new HashSet<>();
    protected static Set<Produto> produtoEsportes = new HashSet<>();
    protected static Set<Produto> produtoEletronicos = new HashSet<>();
    protected static Set<Produto> tipoProdutos = new HashSet<>();
    
    public void listarProdutos(EnumCategoria tipoDeProduto){
        for(Produto produto : verificaCategoria(tipoDeProduto)){
          System.out.println(produto);
        }
        
    }

    public Set<Produto> verificaCategoria(EnumCategoria tipoDeProduto){
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
