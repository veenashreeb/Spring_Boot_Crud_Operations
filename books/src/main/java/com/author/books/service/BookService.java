package com.author.books.service;

import com.author.books.dto.BookDto;
import com.author.books.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookService {
    @Autowired
    public BookRepository bookRepository;

    public List<BookDto> getAllBookDto(){
        List<BookDto> list = (List<BookDto>)this.bookRepository.findAll();
        return list;
    }

    public BookDto getBookDtoById(int id){
        BookDto book=null;
        try {
            book =this.bookRepository.findById(id);

        }catch (Exception e){
            System.out.println(e);

        }
        return book;
    }

    public BookDto addBook(BookDto b){
        BookDto result = this.bookRepository.save(b);
        return result;
    }

    //delete book
    public void deleteBook(int id) {
        bookRepository.deleteById(id);
    }


    //update
    public BookDto updateBookDto(BookDto bookDto, int id){
        bookDto.setBookId(id);
        bookRepository.save(bookDto);
        return bookDto;
    }
}
