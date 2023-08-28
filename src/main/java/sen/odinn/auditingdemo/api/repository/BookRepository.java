package sen.odinn.auditingdemo.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sen.odinn.auditingdemo.api.entity.Book;

public interface BookRepository extends JpaRepository<Book,Long> {
}
