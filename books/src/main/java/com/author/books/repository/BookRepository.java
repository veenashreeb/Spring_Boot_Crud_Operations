package com.author.books.repository;

import com.author.books.dto.BookDto;
import org.springframework.data.repository.CrudRepository;

    public interface BookRepository extends CrudRepository<BookDto,Integer> {

        public BookDto findById(int BookId);

    }

