package org.starsyndrome.service;

import org.starsyndrome.model.Order;

import java.util.List;

public interface OrderService {
    Integer totalPayment(List<Order> orders);
    Integer totalQuantity(List<Order> orders);
}