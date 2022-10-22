package net.oatmilkcam.bookdetails.domain.model.mappers;

import net.oatmilkcam.bookdetails.domain.model.AuthorModel;
import net.oatmilkcam.bookdetails.graphql.types.Author;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AuthorMapper {
    AuthorMapper INSTANCE = Mappers.getMapper(AuthorMapper.class);

    Author toAuthor(AuthorModel authorModel);
}
