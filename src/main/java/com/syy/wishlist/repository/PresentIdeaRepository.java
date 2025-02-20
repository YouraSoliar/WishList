package com.syy.wishlist.repository;

import com.syy.wishlist.model.PresentIdea;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PresentIdeaRepository extends MongoRepository<PresentIdea, String> {
}
