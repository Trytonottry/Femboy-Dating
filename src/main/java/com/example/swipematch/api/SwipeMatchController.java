import com.example.swipematch.models.Match;
import com.example.swipematch.models.User;
import com.example.swipematch.service.MatchService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class SwipeMatchController {

    private final MatchService matchService;

    public SwipeMatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    @PostMapping("/match")
    public Match createMatch(@RequestBody Match match) {
        return matchService.createMatch(match);
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable("id") Long id) {
        return matchService.getUser(id);
    }
}