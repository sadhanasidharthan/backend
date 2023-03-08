package com.example.demo.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Models.Book;

@Repository
public interface BookRepo extends CrudRepository<Book,Integer>{

}