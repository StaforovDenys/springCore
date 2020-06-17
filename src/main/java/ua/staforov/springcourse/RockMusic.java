package ua.staforov.springcourse;

import org.springframework.stereotype.Component;


@Component//("musicBean")
public class RockMusic implements Music {

    @Override
    public String getSong() {
        return "Paint it black";
    }
}
