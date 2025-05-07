package com.etecc.journalApp.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.cglib.core.Local;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
@Getter
@Setter
public class JournalEntry {
    @Id
    private Long id;
    private String title;
    private String content;
    private LocalDateTime date;


}
