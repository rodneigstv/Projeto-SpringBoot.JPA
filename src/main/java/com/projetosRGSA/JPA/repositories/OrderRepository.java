package com.projetosRGSA.JPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetosRGSA.JPA.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
