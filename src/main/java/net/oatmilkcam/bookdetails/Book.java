package net.oatmilkcam.bookdetails;

import lombok.Builder;

@Builder(toBuilder = true)
public class Book {
    private String bookId;
    private String name;
    private int pageCount;
    private String authorId;
}
