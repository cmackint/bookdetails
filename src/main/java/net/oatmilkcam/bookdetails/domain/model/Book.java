package net.oatmilkcam.bookdetails.domain.model;

import lombok.Builder;
import lombok.Getter;

@Builder(toBuilder = true)
@Getter
public class Book {
    private String bookId;
    private String name;
    private String authorId;
    private int pageCount;
}
