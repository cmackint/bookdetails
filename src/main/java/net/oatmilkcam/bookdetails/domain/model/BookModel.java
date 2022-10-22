package net.oatmilkcam.bookdetails.domain.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder(toBuilder = true)
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class BookModel {
    private String bookId;
    private String name;
    private String authorId;
    private int pageCount;
}
