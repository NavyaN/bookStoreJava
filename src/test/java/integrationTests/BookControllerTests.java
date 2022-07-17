//package integrationTests;
//
//
//import com.weCode.bookStore.BookStoreApplication;
//import com.weCode.bookStore.DataTransferObject.BookDTO;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.boot.test.web.server.LocalServerPort;
//import org.springframework.test.context.jdbc.Sql;
//
//
//@SpringBootTest(classes = BookStoreApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//public class BookControllerTests {
//
//    @LocalServerPort
//    private int port;
//
//    @Autowired
//    private TestRestTemplate testRestTemplate;
//
//    @Test
//    @Sql(scripts= {"classpath:dataTest.sql"})
//    void shouldReturnBooksWhenBookApiCalled(){
//      BookDTO[] books =  testRestTemplate.getForObject("http://localhost:"+port+"/api/v1/books", BookDTO[].class);
//        Assertions.assertEquals(2, books.length);
//    }
//}
