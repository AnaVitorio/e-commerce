public class Cliente extends Loja{
    private String nomeCliente;
   
    public Cliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void listarMeusProdutos(){
        for(Produto produto : carrinhoVirtual){
            System.out.println(produto);
            System.out.print(", Quantidade Adicionada: "+produto.getQuantidadeDoProduto());
            System.out.println();
        }
       
       
    }

}
