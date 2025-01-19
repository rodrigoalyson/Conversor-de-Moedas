package ConversorDeMoedasAlysonRodrigo;

public class ConversorApiJava {
    String paisOrigem;
    String paisDestino;
    float taxaConversao;
    float valorConvertido;
    String atualizacao;
    float valorPaisdeOrigem;

    public ConversorApiJava(TaxaCambio novaConsultaTaxa) {
        this.paisOrigem = novaConsultaTaxa.base_code();
        this.paisDestino = novaConsultaTaxa.target_code();
        this.taxaConversao = Float.valueOf(novaConsultaTaxa.conversion_rate());
        this.valorConvertido = Float.valueOf(novaConsultaTaxa.conversion_result());
        this.atualizacao = novaConsultaTaxa.time_last_update_utc();
    }

    @Override
    public String toString() {
        this.valorPaisdeOrigem = valorConvertido/taxaConversao;
        return  "Os seus " + valorPaisdeOrigem + " no pais " + paisOrigem +
                " vale " + valorConvertido + " no pais " + paisDestino +
                ". A taxa de cambio atual é " + taxaConversao +
                ". A ultima atualização foi " + atualizacao;
    }
}
