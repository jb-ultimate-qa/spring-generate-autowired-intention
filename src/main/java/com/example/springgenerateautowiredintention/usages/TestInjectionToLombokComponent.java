package com.example.springgenerateautowiredintention.usages;

import com.example.springgenerateautowiredintention.beans.Bean4;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
//@RequiredArgsConstructor
//@Accessors
@AllArgsConstructor
//@Setter
//@Getter
public class TestInjectionToLombokComponent {


    @Qualifier("third_bean4")
    private final Bean4 bean4;

    public void test(){
        // try injection by completion here
        System.out.println(bean4.getId());
    }
}
