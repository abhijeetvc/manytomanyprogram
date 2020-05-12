package com.springmanytomany.manytomanyprogram.repository;

import com.springmanytomany.manytomanyprogram.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
