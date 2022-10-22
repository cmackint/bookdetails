package net.oatmilkcam.bookdetails.domain.model.mappers;

import net.oatmilkcam.bookdetails.domain.model.BookModel;
import net.oatmilkcam.bookdetails.graphql.types.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookMapper {
    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    Book toBook(BookModel bookModel);
}
