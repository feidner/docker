package hfe;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @GetMapping("/load")
    public List<String> load() {
        return List.of("henrik", "filippa", "mats");
    }
}
