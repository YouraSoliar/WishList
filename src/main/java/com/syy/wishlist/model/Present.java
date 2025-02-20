package com.syy.wishlist.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "presents")
public class Present {
    @Id
    private String id;
    private String name;
    private String description;
    private boolean archived = false;
    byte[] imageBytes;
}
