package com.example.springgenerateautowiredintention.usages;

import com.example.springgenerateautowiredintention.beans.Bean6;
import org.springframework.stereotype.Component;

@Component
public record TestInjectionIntoRecord(Bean6 bean6) {

    public void display() {
        System.out.println(bean6);
        // check quickfix:
        //System.out.println(personAlice.);
        // check completion:

    }


}
