package com.example.demo.Controller;

import com.example.demo.Model.VideoGame;
import com.example.demo.Service.VideoGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
//@RequestMapping("student6/api/v1/")
public class VideoGameController {

    @Autowired
    private VideoGameService videoGameService;

    @GetMapping("list")
    String list(Model model) {
        model.addAttribute("videogames", Arrays.asList(
                new VideoGame(2L, "Hellblade: Senua's Saga", "Ninja Theory", "Mature", "Very Eerie with great combat and puzzles"),
                new VideoGame(3L, "Forza Horizon 5", "Turn 10 Studios", "Everyone", "Best Forza yet"),
                new VideoGame(4L, "Skyrim", "Bethesda", "Mature", "Easily the richest story in an RPG")
        ));
        return "list";
    }

//    @RequestMapping("videogames")
//    public List<VideoGame> getVideoGames() {
//        return videoGameService.findAll();
//    }
//
//    @PostMapping("videogames")
//    public VideoGame createVideoGame(@RequestBody VideoGame videoGame) {
//        return videoGameService.save(videoGame);
//    }
//
//    @GetMapping("videogames/{id}")
//    public ResponseEntity<VideoGame> getVideoGameById(@PathVariable Long id) {
//        VideoGame videoGame = videoGameService.findById(id);
//        return ResponseEntity.ok(videoGame);
//    }
//
//    @PutMapping("videogames/{id}")
//    public ResponseEntity<VideoGame> updateVideoGame(@PathVariable Long id, @RequestBody VideoGame videoGameDetails) {
//        VideoGame videoGame = videoGameService.findById(id);
//
//        videoGame.setName(videoGameDetails.getName());
//        videoGame.setStudio(videoGameDetails.getStudio());
//        videoGame.setRating(videoGameDetails.getRating());
//        videoGame.setReview(videoGameDetails.getReview());
//
//        VideoGame updatedVideoGame = videoGameService.save(videoGame);
//
//        return ResponseEntity.ok(videoGame);
//    }
//
//    @DeleteMapping("plants/{id}")
//    public ResponseEntity<Map<String, Boolean>> deleteVideoGame(@PathVariable Long id) {
//        VideoGame videoGame = videoGameService.findById(id);
//
//        videoGameService.delete(videoGame);
//
//        Map<String, Boolean> response = new HashMap<String, Boolean>();
//        response.put("Deleted Plant Id: " + id, Boolean.TRUE);
//
//        return ResponseEntity.ok(response);
//    }
//
//

}
