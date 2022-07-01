import java.math.BigDecimal;

public class Vendedor extends Loja {
    private int idVendedor;
    private String nomeVendedor;

    public void adicionarProduto(){
        Produto produto = new Produto("Camisa", EnumCategoria.MODA_MASCULINA, 10, new BigDecimal(10));
        this.produtos.add(produto);

    }

    public static void removeProduto(){
        
    }
}
