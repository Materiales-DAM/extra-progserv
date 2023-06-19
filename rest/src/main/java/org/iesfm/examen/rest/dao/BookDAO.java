package org.iesfm.examen.rest.dao;

import org.iesfm.examen.rest.entity.Book;

import java.util.List;

public interface BookDAO {

    List<Book> listAuthorBooks(int authorId);

    boolean authorHasWrittenBook(int authorId, String isbn);

    boolean deleteAuthorBook(int authorId, String isbn);

    boolean addBook(Book book);

}
