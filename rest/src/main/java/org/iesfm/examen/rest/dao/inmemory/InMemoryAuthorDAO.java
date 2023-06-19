package org.iesfm.examen.rest.dao.inmemory;

import org.iesfm.examen.rest.dao.AuthorDAO;
import org.iesfm.examen.rest.entity.Author;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InMemoryAuthorDAO implements AuthorDAO {
    private Map<Integer, Author> authors = new HashMap<>();

    public InMemoryAuthorDAO() {
        addAuthor(new Author(1, "Miguel", "Delibes", "España"));
        addAuthor(new Author(2, "Paul", "Auster", "USA"));
    }

    @Override
    public boolean existAuthor(int authorId) {
        return authors.containsKey(authorId);
    }

    @Override
    public List<Author> listAuthors(String country) {
        return authors
                .values()
                .stream()
                .filter(author -> country == null || author.getCountry().equals(country))
                .collect(Collectors.toList());
    }

    @Override
    public boolean addAuthor(Author author) {
        if (authors.containsKey(author.getId())) {
            return false;
        } else {
            authors.put(author.getId(), author);
            return true;
        }
    }
}
