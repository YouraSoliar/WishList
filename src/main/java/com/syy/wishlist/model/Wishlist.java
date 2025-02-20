package com.syy.wishlist.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "wishlists")
public class Wishlist {
    @Id
    private String id;
    private String name;
    private String description;
    private User assignedUser;
    private List<Present> presents;
}
