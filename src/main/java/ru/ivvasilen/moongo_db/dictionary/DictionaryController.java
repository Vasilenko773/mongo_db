package ru.ivvasilen.moongo_db.dictionary;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dictionary")
@RequiredArgsConstructor
public class DictionaryController {

    private final DictionaryMongoRepository dictionaryRepository;

    @PostMapping("")
    public void save(@RequestBody Dictionary dictionary) {
        dictionaryRepository.save(dictionary);
    }

    @GetMapping
    public List<Dictionary> getDictionaries() {
        return dictionaryRepository.findAll();
    }

    @DeleteMapping
    public void delete(@RequestParam String id) {
        dictionaryRepository.deleteById(id);
    }

    @GetMapping("/{name}")
    public Dictionary getDictionaryByNameContainingWith(@PathVariable String name) {
         return dictionaryRepository.findByNameContaining(name);
    }


}
