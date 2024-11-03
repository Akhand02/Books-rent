package com.example.demo.mapper;

import com.example.demo.dto.BookDto;
import com.example.demo.dto.BookListDto;
import com.example.demo.entity.Books;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {
    public BookListDto bookToDto(Books book){
        var bookListDto = new BookListDto();
        bookListDto.setName(book.getName());
        bookListDto.setShortDesc(book.getShortDesc());
        bookListDto.setCoverImage(book.getCoverImage());
        bookListDto.setGenre(book.getGenre());
        bookListDto.setArchived(book.isArchived());
        bookListDto.setAuthorName(book.getAuthorName());

        return bookListDto;
    }

    public BookDto entityToDto(Books book){
        var bookDto = new BookDto();
        bookDto.setId(book.getId());
        bookDto.setName(book.getName());
        bookDto.setShortDesc(book.getShortDesc());
        bookDto.setLongDesc(book.getLongDesc());
        bookDto.setCoverImage(book.getCoverImage());
        bookDto.setNumberOfCopies(book.getNumberOfCopies());
        bookDto.setIsbn(book.getIsbn());
        bookDto.setGenre(book.getGenre());
        bookDto.setArchived(bookDto.isArchived());
        bookDto.setAuthorName(book.getAuthorName());

        return bookDto;
    }


    public Books dtoToEntity(BookDto book){
        var bookDto = new Books();
        bookDto.setName(book.getName());
        bookDto.setShortDesc(book.getShortDesc());
        bookDto.setLongDesc(book.getLongDesc());
        bookDto.setCoverImage(book.getCoverImage());
        bookDto.setNumberOfCopies(book.getNumberOfCopies());
        bookDto.setIsbn(book.getIsbn());
        bookDto.setGenre(book.getGenre());
        bookDto.setArchived(bookDto.isArchived());
        bookDto.setAuthorName(book.getAuthorName());

        return bookDto;
    }
}
