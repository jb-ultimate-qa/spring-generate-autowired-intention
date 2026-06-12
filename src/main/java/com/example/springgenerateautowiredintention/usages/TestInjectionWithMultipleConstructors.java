package com.example.springgenerateautowiredintention.usages;

import com.example.springgenerateautowiredintention.components.unique.AbcCompo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestInjectionWithMultipleConstructors {

    private final AbcCompo abcCompo;
    String foo;

    public TestInjectionWithMultipleConstructors(AbcCompo abcCompo, String foo) {
        this.abcCompo = abcCompo;
        this.foo = foo;
    }
    @Autowired
    public TestInjectionWithMultipleConstructors(AbcCompo abcCompo) {
        this.abcCompo = abcCompo;
    }

    public void foo() {

        // test injection by completion:
        // bean
    }

    ;
}
