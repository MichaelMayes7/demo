package com.example.demo.Service;

import com.example.demo.Exception.ResourceNotFoundException;
import com.example.demo.Model.VideoGame;
import com.example.demo.Repository.VideoGameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoGameService {

    @Autowired
    private VideoGameRepository videoGameRepository;

    public List<VideoGame> findAll() {
        return videoGameRepository.findAll();
    }

    public VideoGame save(VideoGame videoGame) {
        return videoGameRepository.saveAndFlush(videoGame);
    }

    public VideoGame findById(Long id) {
        return videoGameRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Video Game not found with id: " + id));
    }

    public void delete(VideoGame videoGame) {
        videoGameRepository.delete(videoGame);
    }

    public void addVideoGame(VideoGame videoGame) {
        videoGameRepository.save(videoGame);
    }
}
