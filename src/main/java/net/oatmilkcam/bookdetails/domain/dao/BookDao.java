package net.oatmilkcam.bookdetails.domain.dao;

import net.oatmilkcam.bookdetails.domain.model.BookModel;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class BookDao {
    private static List<BookModel> books = Arrays.asList(
            BookModel.builder()
                    .bookId("book-1")
                    .name("The Long Way to a Small, Angry Planet")
                    .authorId("author-1")
                    .pageCount(464)
                    .build(),
            BookModel.builder()
                    .bookId("book-2")
                    .name("The Plague")
                    .authorId("author-2")
                    .pageCount(320)
                    .build(),
            BookModel.builder()
                    .bookId("book-2")
                    .name("White Noise")
                    .authorId("author-3")
                    .pageCount(326)
                    .build()
    );

    public static Optional<BookModel> getBookById(final String bookId) {
        return books.stream()
                .filter(book -> book.getBookId().equals(bookId))
                .findFirst();
    }
}
