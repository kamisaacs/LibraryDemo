package org.wecancodeit.library.Models;

import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

//Database model for author
@Entity
public class Author {

    @Id
    @GeneratedValue
    private long id;
    private String firstName;
    private String lastName;

    @ManyToMany(mappedBy = "authors")
    
    private Collection<Book> books;
    

    // Default constructor used by JPA
    public Author() {
    }

    // Constructor
    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Collection<Book> getBooks() {
        return books;
    }

}
