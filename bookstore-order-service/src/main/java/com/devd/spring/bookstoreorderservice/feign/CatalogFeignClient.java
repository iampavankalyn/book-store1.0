package com.devd.spring.bookstoreorderservice.feign;

import com.devd.spring.bookstoreorderservice.web.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author: Devaraj Reddy,
 * Date : 2019-06-03
 */
@FeignClient("bookstore-catalog-service")
public interface CatalogFeignClient {

    @GetMapping("/product/{productId}")
    Product getProduct(@PathVariable("productId") String productId);

}