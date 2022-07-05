
import java.util.Random;


public class Cliente extends Loja{
    Random r = new Random();
    private final int idCliente =  r.nextInt(10001); 
    private String nomeCliente;
   
    public Cliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void listarMeusProdutos(){
        for(Produto produto : carrinhoVirtual){
            System.out.println(produto);
            System.out.println(produto.getQuantidadeDoProduto());
        }
       
       
    }

    @Override
    public void comprarProduto(Produto produto, int quantidade){
        Loja.carrinhoVirtual.add(produto);
        
    }
}
