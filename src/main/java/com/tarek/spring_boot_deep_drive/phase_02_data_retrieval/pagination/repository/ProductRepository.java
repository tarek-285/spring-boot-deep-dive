package com.tarek.spring_boot_deep_drive.phase_02_data_retrieval.pagination.repository;

import com.tarek.spring_boot_deep_drive.phase_02_data_retrieval.pagination.dto.ProductDto;
import com.tarek.spring_boot_deep_drive.phase_02_data_retrieval.pagination.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {
    @Query("""
Select new com.tarek.spring_boot_deep_drive.phase_02_data_retrieval.pagination.dto.ProductDto(
u.id,
u.name,
u.stock,
u.category,
u.companyName,
u.price
)
from Product u
"""
    )
    Page<ProductDto> findAllOnlyProduct(Pageable pageable);

   Page<ProductDto> findAllProjectBy(Pageable pageable);
   Slice<ProductDto> findByCategory(String category , Pageable pageable);

}
