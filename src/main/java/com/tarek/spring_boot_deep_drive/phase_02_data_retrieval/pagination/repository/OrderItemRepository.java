package com.tarek.spring_boot_deep_drive.phase_02_data_retrieval.pagination.repository;

import com.tarek.spring_boot_deep_drive.phase_02_data_retrieval.pagination.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
