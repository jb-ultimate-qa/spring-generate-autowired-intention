package com.example.springgenerateautowiredintention.usages;

import org.springframework.stereotype.Component;

@Component
public class TestBeanNames {




    // check the bean names: use all kinds of generation
    // `bean3Special` should be used instead of `bean33`
    // `xmlBean2` should be used instead of `com.example.springgenerateautowiredintention.beans.XmlBean2#0`
    // `myProps` should be used instead of `my.props-com.example.springgenerateautowiredintention.confProperties.MyProps`
    // `alice-person-compo` should be displayed instead of `personAlice`, but the correct field/param name should be generated
    // `@Named` annotation should be used for `bean3Named` autowiring (works for Generate, but not for completion)
    public void foo() {
        // this completion should insert personJohn: PersonJohn
        //personJohn
        // john

        // use quickfix: john: PersonJohn should be generated
        // john.
    }
}
