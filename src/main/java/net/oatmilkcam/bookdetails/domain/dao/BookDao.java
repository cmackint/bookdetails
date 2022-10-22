package net.oatmilkcam.bookdetails.domain.dao;

import net.oatmilkcam.bookdetails.domain.model.Book;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class BookDao {
    private static List<Book> books = Arrays.asList(
            Book.builder()
                    .bookId("book-1")
                    .name("The Long Way to a Small, Angry PLanet")
                    .authorId("author-1")
                    .pageCount(464)
                    .build(),
            Book.builder()
                    .bookId("book-2")
                    .name("The Plague")
                    .authorId("author-2")
                    .pageCount(320)
                    .build(),
            Book.builder()
                    .bookId("book-2")
                    .name("White Noise")
                    .authorId("author-3")
                    .pageCount(326)
                    .build()
    );

    public static Optional<Book> getBookById(final String bookId) {
        return books.stream()
                .filter(book -> book.getBookId().equals(bookId))
                .findFirst();
    }
}
