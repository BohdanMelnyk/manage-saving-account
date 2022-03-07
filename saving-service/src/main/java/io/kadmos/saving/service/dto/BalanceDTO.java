package io.kadmos.saving.service.dto;

import java.math.BigDecimal;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BalanceDTO {
    private String name;
    private BigDecimal amount;

    public BalanceDTO(String name, BigDecimal amount) {
        this.name = name;
        this.amount = amount;
    }
}
