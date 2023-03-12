package com.bharathkalyans.multipledb.db.postgres.entities;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    private String userName;
    private String address;
    private String phoneNumber;
}
