package io.kadmos.saving.data;

import java.util.Optional;
import io.kadmos.saving.data.entity.BalanceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Access to the {@link BalanceEntity} data. JpaRepository grants us convenient access methods here.
 */
public interface BalanceRepository extends JpaRepository<BalanceEntity, Integer> {
    Optional<BalanceEntity> findBalanceEntitiesByName(String name);
}
