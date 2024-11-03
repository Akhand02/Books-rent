package com.example.demo.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookListDto {
    private String name;
    private String shortDesc;
    private String coverImage;
    private String genre;
    private boolean archived;
    private String authorName;
}
