package org.rehkalainin;

import org.springframework.stereotype.Component;

@Component
public class ClassicMusic implements Music {

    public String getSong() {
        return "Beethoven symphony 5";
    }

}
