import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public abstract class Loja {
    //Acessivel para a classe e subclasses de Loja
    protected Set<Produto> produtos = new HashSet<Produto>();

   
    public Set<Produto> getProdutos() {
        return Collections.unmodifiableSet(produtos);

    }


    public void listarProdutos(){
      for(Produto produto : produtos){
        System.out.println(produto);
      }
    }

    
}
