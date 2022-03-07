package io.kadmos.saving.rest.request;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UpdateBalanceRequest {
    private BigDecimal amount;
}
