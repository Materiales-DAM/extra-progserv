package org.iesfm.examen.rest.dao;

import org.iesfm.examen.rest.entity.Author;

import java.util.List;

public interface AuthorDAO {

    boolean existAuthor(int authorId);
    List<Author> listAuthors(String country);
    boolean addAuthor(Author author);

}
