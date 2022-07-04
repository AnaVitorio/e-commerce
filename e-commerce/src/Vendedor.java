import java.util.Random;

public class Vendedor extends Loja {
    private String nomeVendedor;
    Random r = new Random();
    private final int idVendedor = r.nextInt(10001); 

    public Vendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public void adicionarProduto(Produto produto){
        if(produto.getCategoria().equals(EnumCategoria.ELETRONICOS)){
            Loja.produtoEletronicos.add(produto);
        } else if(produto.getCategoria().equals(EnumCategoria.ESPORTES)){
            Loja.produtoEsportes.add(produto);
        } else if(produto.getCategoria().equals(EnumCategoria.MODA_FEMININA)){
            Loja.produtoModaFeminina.add(produto);
        } else{
            Loja.produtoModaMasculina.add( produto);
        }
        Loja.produtos.add(produto);
        produto.setIdVendedor(idVendedor);

    }

    public static void removeProduto(){
        
    }
}


