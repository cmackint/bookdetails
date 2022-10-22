package net.oatmilkcam.bookdetails.domain.dao;

import net.oatmilkcam.bookdetails.domain.model.AuthorModel;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class AuthorDao {
    private static List<AuthorModel> authors = Arrays.asList(
            AuthorModel.builder()
                    .authorId("author-1")
                    .firstName("Becky")
                    .lastName("Chambers")
                    .build(),
            AuthorModel.builder()
                    .authorId("author-2")
                    .firstName("Albert")
                    .lastName("Camus")
                    .build(),
            AuthorModel.builder()
                    .authorId("author-3")
                    .firstName("Don")
                    .lastName("DeLillo")
                    .build()
    );

    public static Optional<AuthorModel> getById(final String id) {
        return authors.stream()
                .filter(author -> author.getAuthorId().equals(id))
                .findFirst();
    }
}
