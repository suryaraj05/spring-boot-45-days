# Day 02 – @Primary and @Qualifier

## What I Learned
- Multiple beans of the same type cause ambiguity
- @Primary defines a default bean
- @Qualifier explicitly selects a bean
- @Qualifier overrides @Primary

## Implementation
- GreetingService interface
- CasualGreetingService marked as @Primary
- FormalGreetingService marked with @Qualifier("formal")
- Constructor injection used in controller

## Key Rule
Qualifier > Primary
