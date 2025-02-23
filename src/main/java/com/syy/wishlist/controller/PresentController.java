package com.syy.wishlist.controller;

import com.syy.wishlist.model.Present;
import com.syy.wishlist.service.PresentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/presents")
public class PresentController {
    @Autowired
    private PresentService presentService;

    @GetMapping
    public List<Present> getAllPresents() {
        return presentService.getAllPresents();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Present> getPresentById(@PathVariable String id) {
        return presentService.getPresentById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Present createPresent(@RequestBody Present present) {
        return presentService.createPresent(present);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Present> updatePresent(@PathVariable String id, @RequestBody Present updatedPresent) {
        return ResponseEntity.ok(presentService.updatePresent(id, updatedPresent));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePresent(@PathVariable String id) {
        presentService.deletePresent(id);
        return ResponseEntity.noContent().build();
    }
}
