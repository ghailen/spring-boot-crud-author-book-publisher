package com.ghailene.springapplication.repositories;

import com.ghailene.springapplication.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {


}
