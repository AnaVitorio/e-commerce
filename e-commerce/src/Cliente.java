import java.util.HashMap;
import java.util.Map;

public class Cliente extends Loja{
    private String nomeCliente;
    private Map<Integer, String> carrinhoVirtual = new HashMap<>(); 
    

    public Cliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }


    public static void comprarProduto(){
        
    }
}
