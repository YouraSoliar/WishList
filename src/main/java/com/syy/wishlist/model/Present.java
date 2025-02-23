package com.syy.wishlist.model;

import com.syy.wishlist.model.enums.PresentPriority;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "presents")
public class Present {
    @Id
    private String id;
    private String name;
    private String description;
    private List<String> urls;
    private PresentPriority priority;
    private boolean booked = false;
    private boolean archived = false;
    byte[] imageBytes;

    public Present() {
    }

    public Present(String id, String name, String description, List<String> urls,
                   PresentPriority priority, boolean booked, boolean archived, byte[] imageBytes) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.urls = urls;
        this.priority = priority;
        this.booked = booked;
        this.archived = archived;
        this.imageBytes = imageBytes;
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

    public List<String> getUrls() {
        return urls;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }

    public PresentPriority getPriority() {
        return priority;
    }

    public void setPriority(PresentPriority priority) {
        this.priority = priority;
    }

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    public boolean isArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public byte[] getImageBytes() {
        return imageBytes;
    }

    public void setImageBytes(byte[] imageBytes) {
        this.imageBytes = imageBytes;
    }
}
