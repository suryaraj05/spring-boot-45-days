
# 📘 Day 05 – Spring Bean Lifecycle

Spring manages the complete lifecycle of a bean, from its creation
to its destruction. Spring provides lifecycle callback annotations
to execute custom logic at specific points in this lifecycle.

Understanding the bean lifecycle is critical for writing
**stable, predictable, and production-safe applications**.

---

## 🌱 What Is a Spring Bean Lifecycle?

For a **singleton bean**, Spring performs the following steps:

1. Bean instantiation
2. Dependency injection
3. Initialization callbacks
4. Bean is ready for use
5. Destruction callbacks (on shutdown)

This lifecycle is managed entirely by the **Spring IoC Container**.

---

## 🔁 Lifecycle Flow (Singleton Bean)

```
Constructor
   ↓
Dependency Injection
   ↓
@PostConstruct
   ↓
Bean Ready for Use
   ↓
@PreDestroy (on application shutdown)
```

---

## 🧩 @PostConstruct

### Purpose

`@PostConstruct` is used to execute logic **after all dependencies
have been injected but before the bean is used**.

### Characteristics

* Executed once per bean
* Called automatically by Spring
* Runs after constructor execution
* Runs after dependency injection

### Common Use Cases

* Validating injected dependencies
* Loading initial configuration
* Preparing resources
* Performing startup checks

### Example

```java
@PostConstruct
public void init() {
    // initialization logic
}
```

---

## 🧹 @PreDestroy

### Purpose

`@PreDestroy` is used to execute cleanup logic **just before the bean
is destroyed** by the Spring container.

### Characteristics

* Executed once per bean
* Triggered when the Spring context shuts down
* Runs while the bean is still valid

### Common Use Cases

* Closing database connections
* Releasing resources
* Graceful shutdown logic
* Logging cleanup operations

### Example

```java
@PreDestroy
public void cleanup() {
    // cleanup logic
}
```

---

## ⚠️ Important Limitations

### Singleton vs Prototype

* Lifecycle callbacks apply **only to singleton beans**
* Spring does **NOT manage destruction of prototype beans**
* `@PreDestroy` will **NOT be called** for prototype-scoped beans

This is a **common interview question** and a frequent production mistake.

---

## 🆚 Java Object Lifecycle vs Spring Bean Lifecycle

| Aspect               | Java Object       | Spring Bean                  |
| -------------------- | ----------------- | ---------------------------- |
| Creation             | `new` keyword     | Spring IoC Container         |
| Dependency Injection | Manual            | Automatic                    |
| Initialization       | Constructor only  | Constructor + @PostConstruct |
| Destruction          | Garbage Collector | @PreDestroy (managed)        |

---

## 🧠 Key Takeaways

* Spring controls the complete lifecycle of a bean
* `@PostConstruct` is used for initialization logic
* `@PreDestroy` is used for cleanup logic
* Lifecycle callbacks are managed only for singleton beans
* Proper lifecycle handling improves application stability

---

## 🎯 Why This Matters in Real Applications

In real systems:

* Incorrect initialization leads to startup failures
* Missing cleanup leads to memory leaks
* Improper lifecycle handling causes unpredictable behavior

Understanding lifecycle callbacks helps build:

* Reliable microservices
* Safe shutdown processes
* Maintainable enterprise applications

---

## ✅ Summary

Spring Bean Lifecycle provides structured control over:

* Bean creation
* Initialization
* Runtime usage
* Graceful shutdown

Correct usage of lifecycle annotations is a **fundamental Spring skill**.

---