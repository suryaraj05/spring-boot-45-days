# Day 04 – Bean Scopes in Spring

## Bean Scopes in Spring

### Core Scopes
- **Singleton**: One bean instance per Spring IoC container (default)
- **Prototype**: A new bean instance is created every time it is requested

### Web-Aware Scopes (Only for Web Applications)
- **Request**: One instance per HTTP request
- **Session**: One instance per HTTP session
- **Application**: One instance per web application lifecycle
- **WebSocket**: One instance per WebSocket session

---

## Spring Singleton vs Java Singleton (GOF)

| Spring Singleton | Java Singleton (GOF) |
|-----------------|---------------------|
| One instance per Spring IoC container | One instance per JVM |
| Managed by Spring | Managed by Java code |
| Can have multiple instances across containers | Strict single instance |

---

## Prototype vs Singleton Comparison

| Feature | Singleton | Prototype |
|-------|----------|-----------|
| Instances | One per IoC container | Many per IoC container |
| Creation | Created at startup (default) | Created on demand |
| Default | Yes | No |
| Annotation | Default / `@Scope("singleton")` | `@Scope("prototype")` |
| Usage | Very common | Rare |
| Recommended for | Stateless beans | Stateful beans (with care) |

---

## Important Notes
- Singleton beans are fully managed by Spring
- Prototype beans are created by Spring but **not destroyed by Spring**
- Web scopes are available only in web-aware application contexts
