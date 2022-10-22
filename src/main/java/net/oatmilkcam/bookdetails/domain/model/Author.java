package net.oatmilkcam.bookdetails.domain.model;


import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Author {
    private String authorId;
    private String firstName;
    private String lastName;
}
