public interface ValidaPagamentoCartaoInterface {
    boolean validar(EnumMetodosDePagamento pagamento, int quantidadeParcelas);
    
}
