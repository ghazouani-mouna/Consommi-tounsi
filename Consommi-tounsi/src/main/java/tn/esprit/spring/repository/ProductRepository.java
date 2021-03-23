package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.entity.Product;


public interface ProductRepository extends CrudRepository <Product,Integer>{

}
