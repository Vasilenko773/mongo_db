package ru.ivvasilen.moongo_db.dictionary;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "dictionary")
@RequiredArgsConstructor
@Getter
@Setter
public class Dictionary {

    @Id
    private String id;
    private String name;
    private Detail detail;

    public record Detail(String shortDescription, String description, Double version) {
    }
}
