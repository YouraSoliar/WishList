package com.syy.wishlist.service.impl;

import com.syy.wishlist.model.Present;
import com.syy.wishlist.repository.PresentRepository;
import com.syy.wishlist.service.PresentService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PresentServiceImpl implements PresentService {
    @Autowired
    private PresentRepository presentRepository;

    @Override
    public List<Present> getAllPresents() {
        return presentRepository.findAll();
    }

    @Override
    public Optional<Present> getPresentById(String id) {
        return presentRepository.findById(id);
    }

    @Override
    public Present createPresent(Present present) {
        return presentRepository.save(present);
    }

    @Override
    public Present updatePresent(String id, Present updatedPresent) {
        return presentRepository.findById(id)
                .map(present -> {
                    present.setName(updatedPresent.getName());
                    present.setDescription(updatedPresent.getDescription());
                    present.setUrls(updatedPresent.getUrls());
                    present.setPriority(updatedPresent.getPriority());
                    present.setBooked(updatedPresent.isBooked());
                    present.setArchived(updatedPresent.isArchived());
                    present.setImageBytes(updatedPresent.getImageBytes());
                    return presentRepository.save(present);
                }).orElseThrow(() -> new RuntimeException("Present not found"));
    }

    @Override
    public void deletePresent(String id) {
        presentRepository.deleteById(id);
    }
}
