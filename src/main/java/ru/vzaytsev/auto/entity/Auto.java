package ru.vzaytsev.auto.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Setter
@ToString
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "auto")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Auto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "name")
    private String name;

    @NotNull
    @Column(name = "mileage")
    private BigDecimal mileage;

    @NotNull
    @Column(name = "status_auto_id")
    private Long statusAutoId;

    @NotNull
    @Column(name = "client_id")
    private Long clientId;
}