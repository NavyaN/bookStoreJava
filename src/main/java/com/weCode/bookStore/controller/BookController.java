package com.weCode.bookStore.controller;

import com.weCode.bookStore.model.BookDTO;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1")
public class BookController {

    @GetMapping("books")
    public ResponseEntity<List<BookDTO>> getBooks(){
        BookDTO book = BookDTO.builder().title("MyBook").description("MyStory").build();
        List<BookDTO> returnList = new ArrayList<>();
        returnList.add(book);
        return ResponseEntity.ok(returnList);
    }

}
