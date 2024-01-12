package ru.ivvasilen.moongo_db.dictionary;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface DictionaryMongoRepository extends MongoRepository<Dictionary, String> {

    List<Dictionary> findAll();

    void deleteDictionaryByDetail_Version(Double version);

    Dictionary findByNameContaining(String name);


}