package com.weCode.bookStore.respository;

import com.weCode.bookStore.model.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface BookRepository extends CrudRepository<Book, UUID>{

}

