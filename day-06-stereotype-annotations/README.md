# 📘 Day 06 – Spring Stereotype & Core Annotations

Spring provides stereotype annotations to clearly define the role
of a class in an application. These annotations help Spring apply
additional behavior and improve code readability and structure.

---

## 🔹 @Component

* Generic stereotype annotation
* Applicable to any Spring-managed class
* Base annotation for all other stereotype annotations

```java
@Component
public class MyComponent {
}
```

---

## 🔹 Specializations of @Component

### @Service

* Indicates business logic layer
* Improves readability and intent
* Preferred for service classes

```java
@Service
public class PaymentService {
}
```

---

### @Controller

* Indicates web controller
* Used in Spring MVC and REST APIs
* Handles HTTP requests

```java
@Controller
public class UserController {
}
```

---

### @Repository

* Indicates data access layer
* Used for database interaction
* Enables **exception translation**
  (DB exceptions → Spring exceptions)

```java
@Repository
public class UserRepository {
}
```

---

## 🧠 Why Not Use @Component Everywhere?

You *can*, but you **should not**.

| Annotation  | Extra Behavior         |
| ----------- | ---------------------- |
| @Repository | Exception translation  |
| @Controller | Web & request handling |
| @Service    | Semantic clarity       |
| @Component  | No extra behavior      |

---

## 📌 Core Spring Annotations Summary

| Annotation     | Description                                   |
| -------------- | --------------------------------------------- |
| @Configuration | Defines Spring configuration class            |
| @ComponentScan | Defines packages to scan for components       |
| @Bean          | Declares a bean from a method                 |
| @Component     | Generic Spring-managed component              |
| @Service       | Business logic layer                          |
| @Controller    | Web / REST controller                         |
| @Repository    | Data access layer with exception handling     |
| @Primary       | Preferred bean when multiple candidates exist |
| @Qualifier     | Explicitly select a specific bean             |
| @Lazy          | Enables lazy initialization                   |
| @Scope         | Defines bean scope (singleton / prototype)    |
| @PostConstruct | Executes after dependency injection           |
| @PreDestroy    | Executes before bean destruction              |
| @Named         | CDI alternative to @Component                 |
| @Inject        | CDI alternative to @Autowired                 |

---

## 🧩 Bean Scopes Reminder

```java
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
```

* Prototype → new instance every time
* Singleton (default) → one instance per IoC container

---

## 🧠 Key Takeaways

* Stereotype annotations define **layer responsibilities**
* They improve structure, readability, and tooling support
* Spring applies behavior based on stereotype usage
* Proper layering is essential for real-world applications

---

## ✅ Summary

Spring stereotype annotations:

* Help structure applications
* Enable framework-level optimizations
* Improve maintainability and clarity

Understanding stereotypes is a **core Spring skill**.
