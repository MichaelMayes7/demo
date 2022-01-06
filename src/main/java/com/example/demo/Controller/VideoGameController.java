package com.example.demo.Controller;

import com.example.demo.Model.VideoGame;
import com.example.demo.Service.VideoGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("student6/api/v1/")
public class VideoGameController {

    @Autowired
    private VideoGameService videoGameService;

    @RequestMapping("videogames")
    public List<VideoGame> getVideoGames() {
        return videoGameService.findAll();
    }

    @PostMapping("videogames")
    public VideoGame createVideoGame(@RequestBody VideoGame videoGame) {
        return videoGameService.save(videoGame);
    }

    @GetMapping("videogames/{id}")
    public ResponseEntity<VideoGame> getVideoGameById(@PathVariable Long id) {
        VideoGame videoGame = videoGameService.findById(id);
        return ResponseEntity.ok(videoGame);
    }

    @PutMapping("videogames/{id}")
    public ResponseEntity<VideoGame> updateVideoGame(@PathVariable Long id, @RequestBody VideoGame videoGameDetails) {
        VideoGame videoGame = videoGameService.findById(id);

        videoGame.setName(videoGameDetails.getName());
        videoGame.setStudio(videoGameDetails.getStudio());
        videoGame.setRating(videoGameDetails.getRating());
        videoGame.setReview(videoGameDetails.getReview());

        VideoGame updatedVideoGame = videoGameService.save(videoGame);

        return ResponseEntity.ok(videoGame);
    }

    @DeleteMapping("plants/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteVideoGame(@PathVariable Long id) {
        VideoGame videoGame = videoGameService.findById(id);

        videoGameService.delete(videoGame);

        Map<String, Boolean> response = new HashMap<String, Boolean>();
        response.put("Deleted Plant Id: " + id, Boolean.TRUE);

        return ResponseEntity.ok(response);
    }



}
