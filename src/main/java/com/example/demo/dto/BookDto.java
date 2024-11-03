package com.example.demo.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class BookDto {
    private int id;
    private String name;
    private String shortDesc;
    private String longDesc;
    private String coverImage;
    private int numberOfCopies;
    private String isbn;
    private String genre;
    private boolean archived;
    private String authorName;
    private LocalDateTime createdDate;
    private LocalDateTime lastModifiedDate;
}
