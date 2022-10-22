package net.oatmilkcam.bookdetails.domain.model;

import lombok.Builder;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@Builder(toBuilder = true)
@Getter
public class BookModel {
    private String bookId;
    private String name;
    private String authorId;
    private int pageCount;
}
