package com.orchestation_order_service.service;

import com.orchestation_order_service.client.PersonClient;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final PersonClient personClient;

    public OrderService(PersonClient personClient) {
        this.personClient = personClient;
    }


    public String processOrder(Long personId) {
        var person = personClient.getPersonById(personId);
        if (person == null) throw new RuntimeException("Pessoa não encontrada");

//        var book = bookClient.getBookById(bookId);
//        if (book.getStock() < quantity) throw new RuntimeException("Estoque insuficiente");
//
//        bookClient.decreaseStock(bookId, quantity);
//
//        transactionClient.registerSale(new SaleRequest(bookId, personId, quantity));

        return "Venda realizada com sucesso!";
    }
}