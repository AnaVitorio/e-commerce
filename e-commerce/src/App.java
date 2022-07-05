import java.math.BigDecimal;

public class App {
    public static void main(String[] args) throws Exception {
        
        Vendedor vendedor = new Vendedor("Vendedor1");
        Cliente cliente = new Cliente("Ana");

        Produto produto = new Produto.ProdutoBuilder()
        .nomeProduto("Blusa")
        .categoria(EnumCategoria.MODA_FEMININA)
        .precoPorUnidade(new BigDecimal(5)).build();



        Produto produto2 = new Produto.ProdutoBuilder()
        .nomeProduto("Calça")
        .categoria(EnumCategoria.MODA_MASCULINA)
        .precoPorUnidade(new BigDecimal(50)).build();

        Produto produto3 = new Produto.ProdutoBuilder()
        .nomeProduto("Fone")
        .categoria(EnumCategoria.ELETRONICOS)
        .precoPorUnidade(new BigDecimal(150)).build();

        Produto produto4 = new Produto.ProdutoBuilder()
        .nomeProduto("Bola de Futebol")
        .categoria(EnumCategoria.ESPORTES)
        .precoPorUnidade(new BigDecimal(50)).build();

    
        vendedor.adicionarProduto(produto);
        vendedor.adicionarProduto(produto2);
        vendedor.adicionarProduto(produto3);
        vendedor.adicionarProduto(produto4);
        // vendedor.listarProdutos(EnumCategoria.TODOS_PRODUTOS);
        // System.out.println();
        // vendedor.listarProdutos(EnumCategoria.MODA_FEMININA);
        // System.out.println();
        // vendedor.listarProdutos(EnumCategoria.MODA_MASCULINA);

      
        // cliente.listarProdutos(EnumCategoria.TODOS_PRODUTOS);
        // cliente.listarProdutos(EnumCategoria.ELETRONICOS);
        // cliente.listarProdutos(EnumCategoria.ESPORTES);


        cliente.comprarProduto(produto, 2);
        cliente.comprarProduto(produto2, 1);
        cliente.listarMeusProdutos();
        
        
    }


}
