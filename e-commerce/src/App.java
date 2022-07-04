import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;


public class App {
    public static void main(String[] args) throws Exception {
        
        Vendedor vendedor = new Vendedor("Vendedor1");
        Cliente cliente = new Cliente("Ana");

        Produto produto = new Produto.ProdutoBuilder()
        .nomeProduto("Blusa")
        .categoria(EnumCategoria.MODA_FEMININA)
        .quantidadeProduto(10)
        .precoPorUnidade(new BigDecimal(5)).build();



        Produto produto2 = new Produto.ProdutoBuilder()
        .nomeProduto("Calça")
        .categoria(EnumCategoria.MODA_MASCULINA)
        .quantidadeProduto(100)
        .precoPorUnidade(new BigDecimal(50)).build();

    
        vendedor.adicionarProduto(produto);
        vendedor.adicionarProduto(produto2);
        // vendedor.listarProdutos(EnumCategoria.TODOS_PRODUTOS);
        // System.out.println();
        // vendedor.listarProdutos(EnumCategoria.MODA_FEMININA);
        // System.out.println();
        //vendedor.listarProdutos(EnumCategoria.MODA_MASCULINA);

      
        // cliente.listarProdutos(EnumCategoria.TODOS_PRODUTOS);
        cliente.listarProdutos(EnumCategoria.MODA_FEMININA);
    
        
        // for(Produto pt : cliente.produtos){
        //     System.out.println(pt);
        // }
        
        //Cliente comprando produto
        // cliente.comprarProduto(produto2, 2);
        //Cliente listando seus produtos do carrinho
        // System.out.println(cliente.listarMeusProdutos());


        //A lógica melhor seria primeiro o cliente adiciona no carrinho 
        // Depois compra 
        // cliente.comprarProduto(produto, 2);

         Set<Produto> produtos = new HashSet<>();
         produtos.add(produto2);

         
         System.out.println(produtos.contains(produto2));
        
    }


}
