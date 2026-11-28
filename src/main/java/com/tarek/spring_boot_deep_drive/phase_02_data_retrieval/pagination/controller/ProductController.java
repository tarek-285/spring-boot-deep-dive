package com.tarek.spring_boot_deep_drive.phase_02_data_retrieval.pagination.controller;

import com.tarek.spring_boot_deep_drive.phase_02_data_retrieval.pagination.dto.ProductDto;
import com.tarek.spring_boot_deep_drive.phase_02_data_retrieval.pagination.entity.Product;
import com.tarek.spring_boot_deep_drive.phase_02_data_retrieval.pagination.service.ProductService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Slice;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;
    public ProductController(ProductService productService)
    {
        this.productService=productService;
    }

    @GetMapping
    public ResponseEntity<Page<ProductDto>> getAllProduct(
            @RequestParam(defaultValue = "0") int pageNumber ,
            @RequestParam(defaultValue = "10") int pageSize
    ){
        Page<ProductDto> products = productService.getProducts(pageNumber, pageSize);
        return ResponseEntity.ok(products);
    }
    @GetMapping("/category")
    public ResponseEntity<Slice<ProductDto>> getProductsByCategory(
            @RequestParam(defaultValue = "0") int pageNumber,
            @RequestParam(defaultValue = "1") int pageSize,
            @RequestParam(defaultValue = "Fruit")String category
    )
    {
        Slice<ProductDto> product = productService.getProductByCategory(pageNumber, pageSize, category);
        return ResponseEntity.ok(product);

    }



}
