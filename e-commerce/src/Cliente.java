
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

    public Produto listarMeusProdutos(){
        return this.carrinhoVirtual.get(this.idCliente);
    }

    @Override
    public void comprarProduto(Produto produto, int quantidade){
        this.carrinhoVirtual.put(idCliente, produto);
        
    }
}
