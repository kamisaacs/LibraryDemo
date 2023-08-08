package org.wecancodeit.library.Repositories;
import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.library.Models.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{
    
}
