package com.etecc.journalApp.repository;

import com.etecc.journalApp.entity.JournalEntry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepo extends MongoRepository<JournalEntry, Long> {
}
