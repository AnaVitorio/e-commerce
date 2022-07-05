public class ValidaOutrosPagamentos implements ValidaOutrosPagamentosInterface {

    @Override
    public boolean validar(EnumMetodosDePagamento pagamento) {
        if(pagamento.equals(EnumMetodosDePagamento.CARTAO_PARCELADO)){
            throw new RuntimeException("Para pagamentos com Cartão Parcelado, informe o número de parcelas");
        }else{
            return true;
        }
        
    }
    
}
