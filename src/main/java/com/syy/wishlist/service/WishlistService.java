package com.syy.wishlist.service;

import com.syy.wishlist.model.Wishlist;
import java.util.List;
import java.util.Optional;

public interface WishlistService {
    List<Wishlist> getAllWishlists();
    Optional<Wishlist> getWishlistById(String id);
    Wishlist createWishlist(Wishlist wishlist);
    Wishlist updateWishlist(String id, Wishlist updatedWishlist);
    void deleteWishlist(String id);
}
