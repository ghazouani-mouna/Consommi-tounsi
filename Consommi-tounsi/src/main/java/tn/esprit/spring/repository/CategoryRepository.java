package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.entity.Category;;

public interface CategoryRepository extends CrudRepository <Category,Integer> {

}
