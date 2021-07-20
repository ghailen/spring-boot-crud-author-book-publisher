package com.ghailene.springapplication.repositories;

import com.ghailene.springapplication.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository  extends CrudRepository<Publisher,Long> {
}
