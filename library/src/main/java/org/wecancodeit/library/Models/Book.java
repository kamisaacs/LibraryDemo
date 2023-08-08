package org.wecancodeit.library.Models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;


//Database model
@Entity
public class Book {


    @Id
    @GeneratedValue
    private long id;
    private String title;
    private String description;

    @ManyToOne
    private Campus campus;

    @ManyToMany
    private Collection<Author> authors;

    
    //Default Constructor used by JPA
    protected Book() {
    }



    //Constructor
    public Book(String title, String description, Campus campus, Author...authors) {
        this.title = title;
        this.description = description;
        this.campus = campus;
        this.authors = new ArrayList<Author>(Arrays.asList(authors));
    }


    

    public long getId() {
        return id;
    }



    public String getTitle() {
        return title;
    }



    public String getDescription() {
        return description;
    }



    public Campus getCampus() {
        return campus;
    }



    public Collection<Author> getAuthors() {
        return authors;
    }


    
    
}
