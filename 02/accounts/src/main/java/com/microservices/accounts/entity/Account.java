package com.microservices.accounts.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Account extends BaseEntity{
    @Id
    @Column
    private long accountNumber;
    @Column
    private long customerId;
    @Column
    private String accountType;
    @Column
    private String branchAddress;
}
