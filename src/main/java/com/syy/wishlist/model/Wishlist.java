package com.syy.wishlist.model;

import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "wishlists")
public class Wishlist {
    @Id
    private String id;
    private String name;
    private String description;
    private List<Present> presents;

    public Wishlist() {
    }

    public Wishlist(String id, String name, String description, List<Present> presents) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.presents = presents;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Present> getPresents() {
        return presents;
    }

    public void setPresents(List<Present> presents) {
        this.presents = presents;
    }
}
