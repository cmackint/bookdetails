package net.oatmilkcam.bookdetails.graphql.types;

import lombok.*;

@Value
@Builder(toBuilder = true)
public class Author {
    String authorId;
    String firstName;
    String lastName;
}
