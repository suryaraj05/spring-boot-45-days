
## 🧠 STEP 3 — DAY 1 NOTES (THE IMPORTANT PART)

Create this file:

```
spring-boot-45-days/day-01-dependency-injection/README.md
```

### 📘 **Day 01 – Dependency Injection & Spring Beans**

````markdown
# Day 01 – Dependency Injection & Spring Beans

## 📌 Topics Covered
- Dependency Injection (DI)
- Bean creation using `@Bean`
- Method-based vs Parameter-based injection
- Spring IOC Container
- BeanFactory vs ApplicationContext
- Java Bean vs Spring Bean vs POJO
- @Primary and @Qualifier
- @Component & @ComponentScan

---

## 🔗 Dependency Injection in Spring

Spring provides **Dependency Injection** to remove tight coupling between classes.

Instead of objects creating their own dependencies, the **Spring IOC container** creates and injects them.

---

## 🧩 Bean Wiring Approaches

### 1️⃣ Dependency Injection via `@Bean` Method Calls

```java
@Bean
public String name() {
    return "Surya";
}

@Bean
public int age() {
    return 20;
}

@Bean
public Address address2() {
    return new Address("Bhagyanagar Colony", "Ichoda");
}

@Bean
public Person personMethodCall() {
    return new Person(name(), age(), address2());
}
````

✔ Works because Spring intercepts these calls
❌ Less preferred for complex applications

---

### 2️⃣ Dependency Injection via Method Parameters (Recommended)

```java
@Bean
public Address address3() {
    return new Address("Dilsukhnagar", "Hyderabad");
}

@Bean
public Person personParameterInjection(
        String name,
        int age,
        Address address3) {
    return new Person(name, age, address3);
}
```

✔ Spring resolves dependencies automatically
✔ Cleaner, testable, preferred in modern Spring

---

## 🧠 Bean Resolution Rules

Spring resolves dependencies in this order:

1. `@Qualifier`
2. `@Primary`
3. Bean Type
4. Bean Name
5. ❌ Exception if ambiguous

---

## 🧱 Spring IOC Container

The IOC container:

* Creates beans
* Manages lifecycle
* Injects dependencies

### Types of Containers

| Container          | Description                          |
| ------------------ | ------------------------------------ |
| BeanFactory        | Basic, lazy initialization           |
| ApplicationContext | Advanced, eager loading, events, AOP |

✔ `ApplicationContext` is preferred in real-world apps.

---

## 🫘 Bean Terminology

### Java Bean

* Private fields
* Public getters/setters
* No-arg constructor (recommended)
* Serializable (optional)

### Spring Bean

* Any object managed by Spring IOC container

### POJO

* Plain Old Java Object
* No restrictions

---

## 🔍 Listing Beans

```java
Arrays.stream(context.getBeanDefinitionNames())
      .forEach(System.out::println);
```

---

## 🧩 Component Scanning & Auto Detection

```java
@Configuration
@ComponentScan("com.in28minutes.learn_spring_framework.game")
public class GamingAppLauncherApplication {
}
```

```java
@Component
public class PacManGame implements GamingConsole {
}
```

Spring automatically:

* Detects components
* Creates beans
* Injects dependencies

---

## 🎯 @Primary vs @Qualifier

### @Primary

Used when multiple beans exist and one should be default.

```java
@Primary
@Component
public class MarioGame implements GamingConsole {
}
```

### @Qualifier

Used to explicitly select a specific bean.

```java
public GameRunner(@Qualifier("pacManGame") GamingConsole game) {
    this.game = game;
}
```

📌 Rule:

> `@Qualifier` overrides `@Primary`

---

## 🧠 3–3–1 Summary

### 3 Key Ideas

* Dependency Injection removes tight coupling
* Parameter-based injection is preferred
* Spring resolves beans using qualifiers and primary

### 3 Use Cases

* Multiple payment gateways
* Multiple notification services
* Multiple game implementations

### 1 Tiny Example

Constructor injection using `@Qualifier`.

---

## ✅ Day 01 Status

**Completed successfully.**

Next up:
➡️ Constructor Injection Best Practices
➡️ Avoiding Field Injection
➡️ Cleaner DI patterns
