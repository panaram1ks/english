package com.english.core.services;

import com.english.core.model.Image;
import com.english.core.repository.ImageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ImageServiceImpl implements ImageService{

    private final ImageRepository imageRepository;

    @Override
    public Image getImage(Long id) {
        return imageRepository.getById(id);
    }

    @Override
    public Image saveImage(Image image) {
        return imageRepository.save(image);
    }
}
