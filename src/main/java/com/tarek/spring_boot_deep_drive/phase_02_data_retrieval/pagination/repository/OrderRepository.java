package com.tarek.spring_boot_deep_drive.phase_02_data_retrieval.pagination.repository;

import com.tarek.spring_boot_deep_drive.phase_02_data_retrieval.pagination.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order ,Long> {

}
