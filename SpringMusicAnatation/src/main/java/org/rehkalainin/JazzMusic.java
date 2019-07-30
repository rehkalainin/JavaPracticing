package org.rehkalainin;

import org.springframework.stereotype.Component;

@Component
public class JazzMusic implements Music{
    public String getSong() {
        return "Jazzz and saxxx";
    }
}
