package ConversorDeMoedasAlysonRodrigo;

public record TaxaCambio(String base_code,
                         String target_code,
                         String time_last_update_utc,
                         String conversion_rate,
                         String conversion_result) {
}
