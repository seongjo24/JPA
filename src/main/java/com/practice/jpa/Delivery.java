package com.practice.jpa;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;

@Entity
public class Delivery {
    @Id
    @GeneratedValue
    private Long id;
    @Embedded
    private Address address;
    private DeliveryStatus deliveryStatus;
    @OneToOne(mappedBy = "delivery", fetch = LAZY)
    private Order order;
}
