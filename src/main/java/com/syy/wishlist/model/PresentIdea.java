package com.syy.wishlist.model;

import com.syy.wishlist.model.enums.PresentCategory;
import com.syy.wishlist.model.enums.Sex;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "presents-ideas")
public class PresentIdea extends Present {
    private Sex filterSex;
    private int filterMinAge;
    private int filterMaxAge;
    private PresentCategory presentCategory;
}
