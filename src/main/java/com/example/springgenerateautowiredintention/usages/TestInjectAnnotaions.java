package com.example.springgenerateautowiredintention.usages;

import com.example.springgenerateautowiredintention.components.unique.AbcCompo;
import jakarta.inject.Inject;
import org.springframework.stereotype.Component;

// test injection: ideally, the @Inject should be used (doesn't work now)
@Component
public class TestInjectAnnotaions {

    @Inject
    AbcCompo abcCompo;

    public void foo(){
        // test injection by completion
        // bean0
    }
}
