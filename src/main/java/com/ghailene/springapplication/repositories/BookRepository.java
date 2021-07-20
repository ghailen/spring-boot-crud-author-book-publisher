package com.ghailene.springapplication.repositories;

import com.ghailene.springapplication.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
