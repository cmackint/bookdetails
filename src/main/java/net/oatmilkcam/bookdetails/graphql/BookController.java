package net.oatmilkcam.bookdetails.graphql;

import net.oatmilkcam.bookdetails.domain.dao.AuthorDao;
import net.oatmilkcam.bookdetails.domain.dao.BookDao;
import net.oatmilkcam.bookdetails.domain.model.AuthorModel;
import net.oatmilkcam.bookdetails.domain.model.BookModel;
import net.oatmilkcam.bookdetails.domain.model.mappers.AuthorMapper;
import net.oatmilkcam.bookdetails.domain.model.mappers.BookMapper;
import net.oatmilkcam.bookdetails.graphql.types.Author;
import net.oatmilkcam.bookdetails.graphql.types.Book;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {
    @QueryMapping
    public Book getBookById(@Argument final String bookId) {
        final BookModel bookModel = BookDao.getBookById(bookId).orElse(null);
        return BookMapper.INSTANCE.toBook(bookModel);
    }

    @SchemaMapping
    public Author author(final Book book) {
        final AuthorModel authorModel = AuthorDao.getById(book.getAuthorId()).orElse(null);
        return AuthorMapper.INSTANCE.toAuthor(authorModel);
    }
}
