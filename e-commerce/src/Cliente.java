import java.math.BigDecimal;

public class Cliente extends Loja{
    private String nomeCliente;
   
    public Cliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void listarMeusProdutos(){
        BigDecimal valorDoCarrinho = new BigDecimal(0);
        for(Produto produto : carrinhoVirtual){
            System.out.print(produto);
            System.out.print(", Quantidade Adicionada: "+produto.getQuantidadeDoProduto());
            System.out.println();

            valorDoCarrinho = (produto.getPrecoPorUnidade()).multiply(new BigDecimal(produto.getQuantidadeDoProduto())).add(valorDoCarrinho);
        }

        System.out.println("Valor Total a pagar: R$ "+valorDoCarrinho);
       
    }

}
