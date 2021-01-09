package ru.itis.controllers;

import com.querydsl.core.types.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.itis.models.Bachelor;
import ru.itis.repositories.BachelorRepository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
public class SearchController {

    @Autowired
    private BachelorRepository bachelorRepository;

    @GetMapping("/bachelors/search")
    public ResponseEntity<List<Bachelor>> searchByPredicate(@QuerydslPredicate(root = Bachelor.class) Predicate predicate) {
        return ResponseEntity.ok(StreamSupport.stream(bachelorRepository.findAll(predicate).spliterator(), false).collect(Collectors.toList()));
    }
}