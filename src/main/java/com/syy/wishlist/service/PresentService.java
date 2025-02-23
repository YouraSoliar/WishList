package com.syy.wishlist.service;

import com.syy.wishlist.model.Present;
import java.util.List;
import java.util.Optional;

public interface PresentService {
    List<Present> getAllPresents();
    Optional<Present> getPresentById(String id);
    Present createPresent(Present present);
    Present updatePresent(String id, Present updatedPresent);
    void deletePresent(String id);
}
