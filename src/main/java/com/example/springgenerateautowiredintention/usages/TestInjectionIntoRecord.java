package com.example.springgenerateautowiredintention.usages;

import com.example.springgenerateautowiredintention.beans.Bean6;
import org.springframework.stereotype.Component;

@Component
public record TestInjectionIntoRecord(Bean6 bean6) {
    // test Generate | AutowireBean... - doesn't work now
    public void display() {
        System.out.println(bean6);
        // check quickfix - doesn't work now:
       // System.out.println(animal.);
        // check completion - doesn't work now:
        // bean
    }


}
