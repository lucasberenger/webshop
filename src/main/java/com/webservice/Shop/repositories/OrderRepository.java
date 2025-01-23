package com.webservice.Shop.repositories;

import com.webservice.Shop.entities.Order;
import com.webservice.Shop.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
