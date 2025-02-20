package com.syy.wishlist.repository;

import com.syy.wishlist.model.Present;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PresentRepository extends MongoRepository<Present, String> {
}