package io.kadmos.saving.config;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import io.kadmos.saving.data.BalanceRepository;
import io.kadmos.saving.data.entity.BalanceEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.Transactional;

@Configuration
@RequiredArgsConstructor
public class InitConfig {
    private final BalanceRepository balanceRepository;

    @Value("${io.kadmos.saving.name}")
    private String serviceName;

    @PostConstruct
    @Transactional
    public void init() {
        if (balanceRepository.findBalanceEntitiesByName(serviceName).isEmpty()) {
            balanceRepository.save(new BalanceEntity(serviceName, BigDecimal.ZERO));
        }
    }
}
