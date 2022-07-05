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
        
        System.out.println("Produtos Disponíveis na Loja:\n");
        cliente.listarProdutos(EnumCategoria.TODOS_PRODUTOS);
       
        System.out.println();

        cliente.comprarProduto(produto, 2);
        cliente.comprarProduto(produto4, 1);

        System.out.println("Produtos Comprados\n");
    
        cliente.listarMeusProdutos();

        System.out.println();
        cliente.realizarPagamento(EnumMetodosDePagamento.CARTAO_A_VISTA);

        Cliente joao = new Cliente("João");
        joao.comprarProduto(produto3, 1);
        joao.comprarProduto(produto2, 2);

        System.out.println();
        joao.realizarPagamento(EnumMetodosDePagamento.CARTAO_PARCELADO, 4);
        
        
    }


}
