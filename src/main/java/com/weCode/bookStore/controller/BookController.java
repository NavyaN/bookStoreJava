package com.weCode.bookStore.controller;

import com.weCode.bookStore.DataTransferObject.BookDTO;
import com.weCode.bookStore.Service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1")
public class BookController {

   private final BookService bookService;

    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @GetMapping("books")
    public ResponseEntity<List<BookDTO>> getBooks(){
       List<BookDTO> list =  bookService.getBooks();
        return ResponseEntity.ok(list);
    }
}
