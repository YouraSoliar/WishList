package com.syy.wishlist.service.impl;

import com.syy.wishlist.model.Wishlist;
import com.syy.wishlist.repository.WishlistRepository;
import com.syy.wishlist.service.WishlistService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WishlistServiceImpl implements WishlistService {
    @Autowired
    private WishlistRepository wishlistRepository;

    public List<Wishlist> getAllWishlists() {
        return wishlistRepository.findAll();
    }

    public Optional<Wishlist> getWishlistById(String id) {
        return wishlistRepository.findById(id);
    }

    public Wishlist createWishlist(Wishlist wishlist) {
        return wishlistRepository.save(wishlist);
    }

    public Wishlist updateWishlist(String id, Wishlist updatedWishlist) {
        return wishlistRepository.findById(id)
                .map(wishlist -> {
                    wishlist.setName(updatedWishlist.getName());
                    wishlist.setDescription(updatedWishlist.getDescription());
                    wishlist.setPresents(updatedWishlist.getPresents());
                    return wishlistRepository.save(wishlist);
                }).orElseThrow(() -> new RuntimeException("Wishlist not found"));
    }

    public void deleteWishlist(String id) {
        wishlistRepository.deleteById(id);
    }
}
