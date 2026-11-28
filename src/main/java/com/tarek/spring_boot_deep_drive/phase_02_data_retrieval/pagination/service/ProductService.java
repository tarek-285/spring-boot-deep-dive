package com.tarek.spring_boot_deep_drive.phase_02_data_retrieval.pagination.service;

import com.tarek.spring_boot_deep_drive.phase_02_data_retrieval.pagination.dto.ProductDto;
import com.tarek.spring_boot_deep_drive.phase_02_data_retrieval.pagination.entity.Product;
import com.tarek.spring_boot_deep_drive.phase_02_data_retrieval.pagination.repository.ProductRepository;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

   private final ProductRepository productRepository;

   public  ProductService(ProductRepository productRepository)
   {
      this.productRepository= productRepository;
   }


   public Page<ProductDto>  getProducts(int   pageNumber , int pageSize)
   {
      Page<ProductDto> products= productRepository.findAllProjectBy(PageRequest.of(pageNumber, pageSize));

      System.out.println(products.getContent());

      return products;
   }

   public Slice<ProductDto> getProductByCategory(int pageNumber, int pageSize , String category)
   {
      Pageable pageable=PageRequest.of(pageNumber,pageSize );
      return productRepository.findByCategory(category, pageable);

   }



}