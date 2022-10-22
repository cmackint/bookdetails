package net.oatmilkcam.bookdetails.domain.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class AuthorModel {
    private String authorId;
    private String firstName;
    private String lastName;
}
