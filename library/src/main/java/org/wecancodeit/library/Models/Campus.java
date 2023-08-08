package org.wecancodeit.library.Models;

import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

//Campus database model
@Entity
public class Campus {


// a unique id for a row
    @Id
    @GeneratedValue
    private long id;

    private String location;

    @OneToMany(mappedBy = "campus")
    private Collection<Book> books;

    // Default constructor used by JPA
    protected Campus() {
    }

    // Constructor
    public Campus(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public long getId() {
        return id;
    }

    public Collection<Book> getBooks() {
        return books;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((location == null) ? 0 : location.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Campus other = (Campus) obj;
        if (location == null) {
            if (other.location != null)
                return false;
        } else if (!location.equals(other.location))
            return false;
        return true;
    }

    
    
}
