package net.oatmilkcam.bookdetails.domain.dao;

import net.oatmilkcam.bookdetails.domain.model.Author;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class AuthorDao {
    private static List<Author> authors = Arrays.asList(
            Author.builder()
                    .authorId("author-1")
                    .firstName("Becky")
                    .lastName("Chambers")
                    .build(),
            Author.builder()
                    .authorId("author-2")
                    .firstName("Albert")
                    .lastName("Camus")
                    .build(),
            Author.builder()
                    .authorId("author-3")
                    .firstName("Don")
                    .lastName("DeLillo")
                    .build()
    );

    public static Optional<Author> getById(final String id) {
        return authors.stream()
                .filter(author -> author.getAuthorId().equals(id))
                .findFirst();
    }
}
