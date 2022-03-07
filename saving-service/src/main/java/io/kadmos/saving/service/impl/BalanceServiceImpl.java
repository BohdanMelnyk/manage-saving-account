package io.kadmos.saving.service.impl;

import java.math.BigDecimal;
import java.util.Objects;
import io.kadmos.saving.data.BalanceRepository;
import io.kadmos.saving.data.entity.BalanceEntity;
import io.kadmos.saving.service.BalanceService;
import io.kadmos.saving.service.dto.BalanceDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class BalanceServiceImpl implements BalanceService {

    @Value("${io.kadmos.saving.name}")
    private String serviceName;

    private final BalanceRepository balanceRepository;

    @Override
    public BalanceDTO fetchBalance() {
        return balanceRepository.findBalanceEntitiesByName(serviceName).map(this::mapToDTO)
                .orElseThrow(() ->
                        new IllegalArgumentException(String.format("Could not find balance for name %s", serviceName)));
    }

    @Override
    @Transactional
    public BalanceDTO updateBalance(BigDecimal amount) {
        BalanceEntity balance = balanceRepository.findBalanceEntitiesByName(serviceName)
                .orElseThrow(() ->
                        new IllegalArgumentException(String.format("Could not find balance for name %s", serviceName)));

        BigDecimal newAmount = balance.getAmount().add(amount);
        balance.setAmount(newAmount);

        balanceRepository.save(balance);

        return mapToDTO(balance);
    }

    private BalanceDTO mapToDTO(BalanceEntity entity) {
        if (Objects.isNull(entity)) {
            return null;
        }
        return new BalanceDTO(entity.getName(), entity.getAmount());
    }
}
