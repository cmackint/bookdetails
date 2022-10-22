package net.oatmilkcam.bookdetails;

import java.util.Arrays;
import java.util.List;

public class Book {
    private String bookId;
    private String name;
    private int pageCount;
    private String authorId;

    public Book(final String bookId,
                final String name,
                final int pageCount,
                final String authorId) {
        this.bookId = bookId;
        this.name = name;
        this.pageCount = pageCount;
        this.authorId = authorId;
    }
}
