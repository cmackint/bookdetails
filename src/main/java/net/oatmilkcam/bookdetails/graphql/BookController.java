package net.oatmilkcam.bookdetails.graphql;

import net.oatmilkcam.bookdetails.domain.dao.AuthorDao;
import net.oatmilkcam.bookdetails.domain.dao.BookDao;
import net.oatmilkcam.bookdetails.domain.model.Author;
import net.oatmilkcam.bookdetails.domain.model.Book;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {
    @QueryMapping
    public Book getBookById(@Argument final String bookId) {
        return BookDao.getBookById(bookId).orElse(null);
    }

    @SchemaMapping
    public Author author(final Book book) {
        return AuthorDao.getById(book.getAuthorId()).orElse(null);
    }
}
