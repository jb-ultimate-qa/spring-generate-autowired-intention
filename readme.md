# Test project to try beans auto-injection by generate actions, completion and quickfix.

- Now the bean can be auto-injected to the Java/Kotlin class using 3 possible methods:
  - `Generate | Autowire Bean...` action
  - beans smart completion
  - `Search And Autowire Spring Bean` quickfix (available as quickfix for the not resolved bean reference and by command completion (after `.`))
- For XML, there are 2 actions (legacy):
  - `Generate | Setter Dependency`
  - `Generate | Constructor`


## Checks for all Java/Kotlin actions:

- all available beans (both project and library) should be available
- the controllers (@Controller, @RestController) and configurations (@Configuration) should be NOT available
- the actual bean names should be shown in the dialog/suggestion and used for field/parameter generating, except the cases when bean has the complex name
    (like the @ConfigurationProperties beans, or xml beans w/o ids, or programmatic beans w/o names). In these case the
    names generated from the class short name should be used instead, like `myProps` instead of `my.props-com.example.springgenerateautowiredintention.confProperties.MyProps`
    and `xmlBean2` instead of `com.example.springgenerateautowiredintention.beans.XmlBean2#0`
- if the explicit bean names are specified (via @Bean/@Component annotation values), they should be used unless they are not valid ids
- if the `@Named` annotation is used in the bean declaration, it should be added on bean injection
- the injection style should be preserved:
   - constructor
   - field
   - setter
   - @Inject field (doesn't work)
   - special cases:
     - Lombok
     - java records (doesn't work now)
     - ctor injection in case of few constructors (the @Autowired-annotated one should be used for injections)
     -- injection inside @Bean method body (depends on `File | Settings | Languages & Frameworks | Spring | Use method parameter injection for @Bean methods`)

   - if initially nothing is injected, the default style (set in settings `File | Settings | Languages & Frameworks | Spring | Autowiring Code Style`) should be used
   - in java test classes, the field injection should be used despite the settings (with Kotlin, ctor style is used)
- injection for common class: if there are few beans of the same type, different variants should be suggested.
  For ex, consider interface with few @Component-annotated implementations: on interface name completing/interface node selecting
  you can use:
    - 'default', that should perform injection with field/param name = interface name, and suggest to add qualifier
    - specific implementation that should use the implementation name
    - 'collection' that should inject Collection<interface_type> 


## Generate | Autowire Bean... action:

- works inside the class body. 
- Suggests the list of beans that can be injected in the `Autowire Bean` dialog
The beans are grouped by definition scope (project/libraries, with the project repositories as a separate group)
and by the type (the beans of the same supertype are groped)
The filters are available

 ### Check:
- dialog filters
- invocation place:
   - inside method body
   - inside constructor body
   - outside the ctor/method
   - inside @Bean method body
   - inside the test class

## Smart beans completion:

- works inside method/constructor body
- appears only after first 3+ symbols typing
- should not appear if you start from the uppercase letter

### Check:
- invocation place:
    - inside method body
    - inside constructor body
    - inside @Bean method body
    - inside the test class
- check in the big classes (no scrolling/jumping should happen, the caret should stay after the completed name)
- check in big project: performance for the initial completion invocation, for the completion after 3+ symbols entered
- not precise name using: check that matching beans are found

## `Search And Autowire Spring Bean` quickfix:

- works as a quickfix for the unresolved reference (red bulb menu) or as postfix completion command (after the dot, like `someBean.`)
- allows to choose the existing bean from a list if few names match (not precise matching)
- allows to create the new one, if no matching beans are found, and autowire it

### Check:
- command completion:
  - different invocation places (see above)
  - performance (see above)
- either quickfix or postfix:
  - not precise name that match few variants: select from the suggested variants
  - not existing bean reference: when the suggestion to create new bean appears, try to cancel it
  - not existing bean reference: when the suggestion to create new bean appears, agree. 
    - Try all suggested kinds (component, service, ....)
    - for repositories, try the different kinds of parent class
    - for repositories, try the case when multiple entity classes exist, with different type of @Id-s
    - for repositories, try the case when no entity classes can be found
    - for all variants, try both same-file and new file options