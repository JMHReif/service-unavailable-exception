package com.jmhreif.serviceunavailableexception;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;

@Data
@Node
class Author {
    @Id
    private String name;

    @JsonIgnoreProperties("authors")
    @Relationship(value = "AUTHORED", direction = Relationship.Direction.OUTGOING)
    private List<Book> books;
}
