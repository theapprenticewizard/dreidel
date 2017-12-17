package io.dreidel.dreidel.model;

import io.dreidel.dreidel.infrastructure.MongoDbEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Getter
@NoArgsConstructor
public class Player extends MongoDbEntity {

    @NotNull(message = "a name must be provided")
    private String name;

    @Min(value = 0, message = "you must have a positive amount of gelt")
    private int geltCount;
}