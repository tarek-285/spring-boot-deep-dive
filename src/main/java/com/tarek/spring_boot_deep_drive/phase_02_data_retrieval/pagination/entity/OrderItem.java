package com.tarek.spring_boot_deep_drive.phase_02_data_retrieval.pagination.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "order_items")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch= FetchType.LAZY)
    private Order order ;
    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;
    private Long Quantity ;
    private BigDecimal unitePrice;

}
