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
@Table(name = "consumable")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Consumable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "consumable_status_id")
    private Long consumableStatusId;

    @Column(name = "auto_id")
    private Long autoId;

    @Column(name = "replacement_date")
    private ZonedDateTime replacementDate ;

    @Column(name = "replacement_date_fact")
    private ZonedDateTime replacementDateFact;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "price_fact")
    private BigDecimal priceFact;

    @Column(name = "replacement_period")
    private Long replacementPeriod;

    @Column(name = "mileage")
    private Long mileage;

    @Column(name = "mileage_fact")
    private Long mileageFact;

    @Column(name = "mileage_period")
    private Long mileagePeriod;
}