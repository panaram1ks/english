package com.english.core.services;

import com.english.core.model.Image;
import com.english.core.repository.ImageRepository;

public interface ImageService {

    Image getImage(Long id);
    Image saveImage(Image image);
}
