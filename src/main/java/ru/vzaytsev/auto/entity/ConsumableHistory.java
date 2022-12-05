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
@Table(name = "consumable_history")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ConsumableHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "consumable_id")
    private Long consumableId;

    @Column(name = "name")
    private String name ;

    @Column(name = "auto_id")
    private Long autoId;

    @Column(name = "date_history")
    private ZonedDateTime dateHistory ;

    @Column(name = "consumable_status_id")
    private Long consumableStatusId;
}