package com.alura.challenge.modelos;

public record TipoDeCambio(String time_last_update_utc,
                           String base_code,
                           String target_code,
                           double conversion_rate,
                           double conversion_result) {
}
