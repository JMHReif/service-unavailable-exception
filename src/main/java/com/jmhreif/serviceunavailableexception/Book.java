package com.jmhreif.serviceunavailableexception;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;

@Data
@Node
class Book {
    @Id
    private String title;

    @JsonIgnoreProperties("books")
    @Relationship(value = "AUTHORED", direction = Relationship.Direction.INCOMING)
    private List<Author> authors;
}
