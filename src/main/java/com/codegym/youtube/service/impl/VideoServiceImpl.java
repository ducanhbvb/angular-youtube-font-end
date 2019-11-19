package com.codegym.youtube.service.impl;

import com.codegym.youtube.model.Video;
import com.codegym.youtube.repository.VideoRepository;
import com.codegym.youtube.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class VideoServiceImpl implements VideoService {
    @Autowired
    private VideoRepository videoRepository;

    @Override
    public List<Video> findAllHaveBusiness() {
        return videoRepository.findAll();
    }

    @Override
    public Video findByIdHaveBusiness(Long id) {
        return videoRepository.findById(id);
    }

    @Override
    public void saveHaveBusiness(Video video) {
        Video video1=new Video(video.getIdName(),video.getTitle());
        videoRepository.save(video1);
    }

    @Override
    public void removeHaveBusiness(Long id) {
        videoRepository.remove(id);
    }
}
