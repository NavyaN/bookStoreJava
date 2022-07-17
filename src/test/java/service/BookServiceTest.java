package service;

import com.weCode.bookStore.DataTransferObject.BookDTO;
import com.weCode.bookStore.Service.BookService;
import com.weCode.bookStore.model.Book;
import com.weCode.bookStore.respository.BookRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class BookServiceTest {

    @InjectMocks // real instance
    private BookService bookService;

    @Mock // proxy instance
    private BookRepository bookRepository;

    @Mock
    private ModelMapper mapper;

    @Test
    void shouldReturnListOfBookDTO(){
        List<Book> books = new ArrayList<Book>();
        Book book = new Book();
        books.add(getBook());
        BookDTO bookdto = getBookDTO();
        when(bookRepository.findAll()).thenReturn(books);
        when(mapper.map(book, BookDTO.class)).thenReturn(bookdto);
        List<BookDTO> bookDTOS = bookService.getBooks();
        Assertions.assertEquals(1, bookDTOS.size());
       // Assertions.assertEquals(bookDTOS.get(0).getTitle(), "First Book");
    }

    private BookDTO getBookDTO() {
        return BookDTO.builder().id(2).description("Test Book").title("First Book").releaseYear(2022).build();
    }

    private Book getBook(){
        return Book.builder().id(2).title("First Book").descp("Test Book").release_year(2022).build();
    }

}
