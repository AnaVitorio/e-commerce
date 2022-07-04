import java.util.Random;

public class Vendedor extends Loja {
    Random r = new Random();
    private final int idVendedor = r.nextInt(10001); 
    private String nomeVendedor;
    // protected Set<Produto> produtos = new HashSet<>();

    public Vendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    public void adicionarProduto(Produto produto){
        if(produto.getCategoria().equals(EnumCategoria.ELETRONICOS)){
            Loja.produtoEletronicos.add(produto);
            produtoEletronicos.add(produto);
        } else if(produto.getCategoria().equals(EnumCategoria.ESPORTES)){
            Loja.produtoEsportes.add(produto);
        } else if(produto.getCategoria().equals(EnumCategoria.MODA_FEMININA)){
            Loja.produtoModaFeminina.add(produto);
        } else{
            Loja.produtoModaMasculina.add(produto);
        }
        Loja.produtos.add(produto);

    }

    public static void removeProduto(){
        
    }
}


