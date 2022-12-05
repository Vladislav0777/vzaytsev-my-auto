package ru.vzaytsev.auto.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.ZonedDateTime;

@Getter
@Setter
@ToString
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "consumable_status")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ConsumableStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "consumable_code")
    private Long consumableCode;

    @Column(name = "consumable_name")
    private Long consumableName;
}