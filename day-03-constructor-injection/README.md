# Day 03 – Dependency Injection Styles

## Types of Dependency Injection in Spring

### 1. Field Injection
- Dependencies injected directly into fields
- Uses reflection
- Not recommended for production

### 2. Setter Injection
- Dependencies injected via setter methods
- Useful for optional dependencies
- Object can exist in partially initialized state

### 3. Constructor Injection (Recommended)
- Dependencies provided at object creation
- Ensures immutability
- Makes dependencies explicit
- Easier to test

---

## Why Constructor Injection is Preferred
- Fail-fast behavior
- Better readability
- Supports immutable objects
- Recommended by Spring team

---

## @Component vs @Bean

### @Component
- Used on classes
- Automatically detected by component scanning
- Best for application-level beans

### @Bean
- Used on methods in @Configuration classes
- Developer controls object creation
- Ideal for third-party libraries

---

## Key Takeaway
Constructor injection should be the default choice in Spring applications.
