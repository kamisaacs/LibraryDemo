package org.wecancodeit.library.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.library.Models.Campus;


public interface CampusRepository extends CrudRepository<Campus, Long> {
    Campus  findCampusByLocation(String location);
    
}
