package org.rehkalainin;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    public String getSong() {
        return "Show must go on!";
    }
}
