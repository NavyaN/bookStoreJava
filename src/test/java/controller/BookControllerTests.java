package controller;

import com.weCode.bookStore.DataTransferObject.BookDTO;
import com.weCode.bookStore.Service.BookService;
import com.weCode.bookStore.controller.BookController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class BookControllerTests {

    @InjectMocks
    private BookController bookController;

    @Mock
    private BookService bookService;

    @Test
    public void WhenGetBooksConstructorIsCalledReturnList(){
        List<BookDTO> bookDTOList = new ArrayList<BookDTO>();
        bookDTOList.add(getBookDTO());
        when(bookService.getBooks()).thenReturn(bookDTOList);
        ResponseEntity<List<BookDTO>> responseEntity = bookController.getBooks();
        Assertions.assertEquals(responseEntity.getStatusCode(), HttpStatus.OK);
        Assertions.assertEquals(responseEntity.getBody().get(0).getId(), 2);
    }
    private BookDTO getBookDTO() {
        return BookDTO.builder().id(2).description("Test Book").title("First Book").releaseYear(2022).build();
    }
}
