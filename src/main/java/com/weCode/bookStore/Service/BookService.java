package com.weCode.bookStore.Service;

import com.weCode.bookStore.DataTransferObject.BookDTO;
import com.weCode.bookStore.model.Book;
import com.weCode.bookStore.respository.BookRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class BookService {

    private final BookRepository bookRepository;
    private final ModelMapper modelMapper;
    public BookService(BookRepository bookRepository, ModelMapper modelMapper){
        this.bookRepository = bookRepository;
        this.modelMapper = modelMapper;
    }
    public List<BookDTO> getBooks(){
        List<Book> bookList = (List<Book>) bookRepository.findAll();
       // List<BookDTO> books = StreamSupport.stream(bookList.spliterator(), false)
                                        //   .map(book -> modelMapper.map(book, BookDTO.class)).collect(Collectors.toList());
       // List<Book> books = (List<Book>) bookRepository.findAll();
        List<BookDTO> books =  bookList.stream().map(book-> new BookDTO(book.getTitle(), book.getDescp(),book.getPagecount(),book.getRelease_year())).collect(Collectors.toList());
        return books;
    }

}
