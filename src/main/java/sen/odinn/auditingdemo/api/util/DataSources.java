package sen.odinn.auditingdemo.api.util;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import sen.odinn.auditingdemo.api.entity.Book;
import sen.odinn.auditingdemo.api.repository.BookRepository;

import java.util.List;

@RequiredArgsConstructor
@Configuration
public class DataSources {
    private final BookRepository bookRepository;
    @PostConstruct
    void init(){
        Book book1 = Book.builder()
                .title("Purple Note")
                .author("Moa Raksmey")
                .build();
        Book book2 = Book.builder()
                .title("You're the last page")
                .author("Veayo")
                .build();
        bookRepository.saveAll(List.of(book1,book2));

    }
}
