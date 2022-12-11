package pl.FamilyAssistant.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HabitController {

    @Autowired
    HabitRepository habitRepository;

    @GetMapping("/test")
    public String test() {
        return "Hello World";
    }

    @GetMapping("/habits")
    public List<Habit> habits() {
        return habitRepository.getAllHabits();
    }
}
