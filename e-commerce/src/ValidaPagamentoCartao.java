public class ValidaPagamentoCartao implements ValidaPagamentoCartaoInterface {

    @Override
    public boolean validar(EnumMetodosDePagamento pagamento, int quantidadeParcelas){
        if(!pagamento.equals(EnumMetodosDePagamento.CARTAO_PARCELADO)){
            throw new RuntimeException("Parcelamento disponivel somente para cartão parcelado.");
        }

        if(pagamento.equals(EnumMetodosDePagamento.CARTAO_PARCELADO) && quantidadeParcelas <= 3){
            return true;
        } else{
          throw new RuntimeException("Para pagamentos com Cartão Parcelado, limite de parcelamento de 3X.");
        }

    }

    
}
