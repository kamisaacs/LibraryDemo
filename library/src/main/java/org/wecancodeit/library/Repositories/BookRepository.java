package org.wecancodeit.library.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.library.Models.Book;

public interface BookRepository extends CrudRepository<Book, Long>{
    
}
