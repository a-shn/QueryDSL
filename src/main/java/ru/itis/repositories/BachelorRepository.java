package ru.itis.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;
import ru.itis.models.Bachelor;

@Repository
public interface BachelorRepository extends MongoRepository<Bachelor, String>, QuerydslPredicateExecutor<Bachelor> {
}
