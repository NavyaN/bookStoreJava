package com.weCode.bookStore.controller;

import com.weCode.bookStore.DataTransferObject.BookDTO;
import com.weCode.bookStore.Service.BookService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Api(value ="Book Api", tags= "Get Books", produces = "application/json")
@RestController
@RequestMapping("api/v1")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @ApiOperation(value ="Get List Of Books", response=BookDTO[].class, produces = "application/json")
    @ApiResponses(value = {@ApiResponse(code =200 , message ="Successfully retrieved data"),
            @ApiResponse(code =400 , message ="Bad Request"),
            @ApiResponse(code =403 , message ="Forbidden")})
    @GetMapping("books")
    public ResponseEntity<List<BookDTO>> getBooks(){
       List<BookDTO> list =  bookService.getBooks();
        return ResponseEntity.ok(list);
    }
}
