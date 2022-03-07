package io.kadmos.saving.service;

import java.math.BigDecimal;
import io.kadmos.saving.service.dto.BalanceDTO;

public interface BalanceService {

    BalanceDTO fetchBalance();

    BalanceDTO updateBalance(BigDecimal amount);
}
