# test project to try beans auto-injection by generate actions, intention, postfix templates or completions


### Generate | Autowire Bean... action:

- works inside the class body. 
- Suggests the list of beans that can be injected, 
grouped by definition scope (project/libraries, with the project repositories as a separate group)
and by the type (the beans of the same supertype are groped)
- The controllers (@Controller, @RestController) and configurations (@Configuration) are filtered out.

As a result, the selected bean should be injected to the current class.
1. The injection style should be preserved:
  - constructor
  - field
  - setter
  - @Inject field (doesn't work)
  - special cases:
    -- Lombok
    -- java records
    -- ctor injection in case of few constructors
    -- injection inside @Bean method body
    
  - if initially nothing is injected, the default style (set in settings File | Settings | Languages & Frameworks | Spring) should be used
  - in tests, the field injection should be used despite settings (with Kotlin, ctor style is used)

2. Test generation invocation:
   - inside method body
   - inside constructor body
   - outside the ctor/method
3. Check the focus behavior (it should not jump to the injection point)
4. Check injection for super class: for ex, consider interface with few @Component-annotated implementations
   Select the interface node in AutowireBean... dialog and try all options