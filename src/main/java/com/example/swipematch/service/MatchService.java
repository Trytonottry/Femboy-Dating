import com.example.swipematch.models.Match;
import com.example.swipematch.models.User;
import com.example.swipematch.repositories.MatchRepository;
import com.example.swipematch.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchService {
    private final MatchRepository matchRepository;
    private final UserRepository userRepository;

    @Autowired
    public MatchService(MatchRepository matchRepository, UserRepository userRepository) {
        this.matchRepository = matchRepository;
        this.userRepository = userRepository;
    }

    public Match createMatch(Match match) {
        return matchRepository.save(match);
    }

    public User getUser(Long id) {
        return userRepository.findById(id).orElse(null);
    }
}