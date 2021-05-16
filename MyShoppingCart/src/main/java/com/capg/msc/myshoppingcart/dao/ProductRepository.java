package com.capg.msc.myshoppingcart.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.capg.msc.myshoppingcart.bean.Product;

public interface ProductRepository  extends JpaRepository<Product,Integer>, CustomProductRepository{


}
