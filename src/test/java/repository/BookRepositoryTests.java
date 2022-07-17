//package repository;
//
//import com.weCode.bookStore.model.Book;
//import com.weCode.bookStore.respository.BookRepository;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.jdbc.Sql;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//
//import java.util.stream.StreamSupport;
//
////@ExtendWith(SpringExtension.class)
//@DataJpaTest
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//public class BookRepositoryTests {
//
//   // @Autowired
//    private BookRepository bookRepository;
//
//    @Test
//    @Sql(scripts= {"classpath:dataTest.sql"})
//    void shouldAbleToFetchAllBooksInDB(){
//       Iterable<Book>  all = bookRepository.findAll();
//       Long totalBookCount = StreamSupport.stream(all.spliterator(), false).count();
//        Assertions.assertEquals(totalBookCount, 2);
//    }
//}
