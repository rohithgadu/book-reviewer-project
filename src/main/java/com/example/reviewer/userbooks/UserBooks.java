package com.example.reviewer.userbooks;


import lombok.Data;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.time.LocalDate;

@Table(value = "book_by_user_and_bookid")
@Data
public class UserBooks {
    @PrimaryKey
    private UserBooksPrimaryKey key;

    @Column("started_date")
    @CassandraType(type = CassandraType.Name.DATE)
    private LocalDate startedDate;

    @Column("completed_date")
    @CassandraType(type = CassandraType.Name.DATE)
    private LocalDate completedDate;

    @Column("reading_status")
    @CassandraType(type = CassandraType.Name.TEXT)
    private String readingStatus;

    @Column("rating")
    @CassandraType(type = CassandraType.Name.INT)
    private int rating;
}
