package io.kadmos.saving.data.entity;


import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * A balance entity.
 */
@Entity
@Table(name = BalanceEntity.TABLE)
@DiscriminatorValue(BalanceEntity.TABLE)
@Getter
@Setter
@NoArgsConstructor
public class BalanceEntity {

    public static final String TABLE = "balance";
    public static final String TYPE_NAME = "balance";

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 256, unique = true)
    private String name;

    @Column(nullable = false)
    private BigDecimal amount;

    public BalanceEntity(String name, BigDecimal amount) {
        this.name = name;
        this.amount = amount;
    }
}
