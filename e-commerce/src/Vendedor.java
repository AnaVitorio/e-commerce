public class Vendedor extends Loja {
    // private int idVendedor;
    // private String nomeVendedor;
    // protected Set<Produto> produtos = new HashSet<>();

    public void adicionarProduto(Produto produto){
        if(produto.getCategoria().equals(EnumCategoria.ELETRONICOS)){
            super.produtoEletronicos.add(produto);
            produtoEletronicos.add(produto);
        } else if(produto.getCategoria().equals(EnumCategoria.ESPORTES)){
            super.produtoEsportes.add(produto);
        } else if(produto.getCategoria().equals(EnumCategoria.MODA_FEMININA)){
            super.produtoModaFeminina.add(produto);
        } else{
            super.produtoModaMasculina.add(produto);
        }
        super.produtos.add(produto);

    }

    public static void removeProduto(){
        
    }
}


