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
@Table(name = "auto_history")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class AutoHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "auto_id")
    private Long autoId;

    @NotNull
    @Column(name = "status_auto_id")
    private Long statusAutoId;

    @NotNull
    @Column(name = "date_history")
    private ZonedDateTime dateHistory;
}