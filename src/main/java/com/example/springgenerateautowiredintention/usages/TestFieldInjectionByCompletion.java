package com.example.springgenerateautowiredintention.usages;

import com.example.springgenerateautowiredintention.beans.Bean0;
import com.example.springgenerateautowiredintention.beans.Bean4;
import com.example.springgenerateautowiredintention.components.animals.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class TestFieldInjectionByCompletion {

    @Autowired
    private Bean0 bean0;


   private void someDummyMethodWithLongBody(){
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();

   }

    // try beans injections by completion inside the method: the field injection style should be preserved

    public void display(){
        System.out.println(bean0.id());
       // try completion:
        System.out.println(animal);

    }
}
