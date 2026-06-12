package com.example.springgenerateautowiredintention.usages;

import com.example.springgenerateautowiredintention.beans.Bean3;
import jakarta.inject.Named;
import org.springframework.stereotype.Component;


@Component
public class TestDefaultInjectionByCompletion {
   private final Bean3 bean3Named;
   private final Bean3 bean34;

   public TestDefaultInjectionByCompletion(Bean3 bean3Named, @Named("bean3Named") Bean3 bean34) {
      // try beans injections by completion inside the method: the constructor injection should be used
      this.bean3Named = bean3Named;
      this.bean34 = bean34;
   }

   private void someDummyMethodWithLongBody() {
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

   // try beans injections by completion inside the method: the constructor injection should be used

   public void display() {

      // try completion to inject any bean



      // XML beans:
      // complete some bean from xml: only xmlBean1, xmlBean2, myXmlList (not xmlBean3) sh be suggested
      // xml

      // check also Generate action and quickfix for these beans;
      // note: attempt to inject the xml beans from non-beans schemas, like util:list or mvc:view0controller beans causes exception:
      //myXmlList


      // check also that:
      // controllers (like `testController` bean) are not suggested by any action (Generate, quickfix, completion;
      // same for configuration beans (`beansConfig` etc)

      // note: xml mvc:view-controller is now available for injection (As `fooController`)
   }

}