package com.example.scBackend.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "slot")
public class Slot {
    @Id
    @NonNull
    @Column(name = "sellerId")
    private Long id;

    @Column(name = "dateTime")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime dateTime;

    @Column(name = "approvalStatus")
    private String approvalStatus;

    @Column(name = "gmv")
    private Long gmv;

}
