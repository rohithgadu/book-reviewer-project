package com.example.reviewer.userbooks;

import org.springframework.data.cassandra.repository.CassandraRepository;

public interface UserBooksRepository extends CassandraRepository<UserBooks,UserBooksPrimaryKey> {
}
