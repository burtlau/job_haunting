package readingList.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import readingList.Entity.Book;

import java.util.List;

public interface ReadingListRepository extends JpaRepository<Book, Long> {
    List<Book> findByReader(String reader);
}
