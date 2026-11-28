package com.tarek.spring_boot_deep_drive.phase_02_data_retrieval.pagination.dto;

import java.math.BigDecimal;

public record ProductDto(
        Long id,
        String name,
        Long stock,
        String category,
        String companyName,
        BigDecimal price
) {
}
