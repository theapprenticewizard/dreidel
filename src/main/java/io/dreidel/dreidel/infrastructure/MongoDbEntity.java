package io.dreidel.dreidel.infrastructure;

import lombok.Data;

@Data
public class MongoDbEntity {
    private String id;
    private Long timeCreated;
}
