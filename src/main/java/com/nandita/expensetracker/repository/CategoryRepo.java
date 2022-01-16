package com.nandita.expensetracker.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nandita.expensetracker.model.Categories;

@Repository
public interface CategoryRepo extends CrudRepository<Categories, Integer>{

}
