package com.jmhreif.serviceunavailableexception;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

import java.util.List;

interface BookRepository extends Neo4jRepository<Book, String> {
    //Works
    @Query("MATCH (b:Book)<-[r:AUTHORED]-(a:Author) RETURN b, collect(r), collect(a);")
    List<Book> findAllBooks();
}
