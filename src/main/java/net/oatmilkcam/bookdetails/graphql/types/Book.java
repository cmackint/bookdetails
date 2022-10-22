package net.oatmilkcam.bookdetails.graphql.types;

import lombok.*;

@Value
@Builder(toBuilder = true)
public class Book {
    String bookId;
    String name;
    String authorId;
    int pageCount;
}
