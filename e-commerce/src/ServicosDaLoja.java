public interface ServicosDaLoja {
    void listarProdutos(EnumCategoria categoria);
    void comprarProduto(Produto produto, int quantidade);
    void realizarPagamento(EnumMetodosDePagamento pagamento, int quantidadeParcelamento);
    
}
