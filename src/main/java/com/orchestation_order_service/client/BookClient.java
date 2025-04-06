package com.orchestation_order_service.client;

import com.orchestation_order_service.dto.PersonResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "books-service", url = "${books-service.url}")
public interface BookClient {

    @GetMapping("/books/{id}")
    PersonResponse getPersonByIdBooks(@PathVariable("id") Long id);
}
