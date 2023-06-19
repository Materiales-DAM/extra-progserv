package org.iesfm.examen.rest.dao.inmemory;

import org.iesfm.examen.rest.dao.BookDAO;
import org.iesfm.examen.rest.entity.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryBookDAO implements BookDAO {
    private Map<Integer, Map<String, Book>> booksPerAuthor = new HashMap<>();

    public InMemoryBookDAO() {
        addBook(new Book("00001X", "El camino", 1));
        addBook(new Book("00002X", "La trilogía de Nueva York", 2));

    }

    @Override
    public List<Book> listAuthorBooks(int authorId) {
        return new ArrayList<>(getAuthorBooks(authorId).values());
    }


    @Override
    public boolean authorHasWrittenBook(int authorId, String isbn) {
        return getAuthorBooks(authorId).containsKey(isbn);
    }

    @Override
    public boolean deleteAuthorBook(int authorId, String isbn) {
        return getAuthorBooks(authorId).remove(isbn) != null;
    }


    @Override
    public boolean addBook(Book book) {
        if (authorHasWrittenBook(book.getAuthorId(), book.getIsbn())) {
            return false;
        } else {
            getAuthorBooks(book.getAuthorId()).put(book.getIsbn(), book);
            return true;
        }
    }

    private Map<String, Book> getAuthorBooks(int authorId) {
        booksPerAuthor.putIfAbsent(authorId, new HashMap<>());
        return booksPerAuthor.get(authorId);
    }
}
