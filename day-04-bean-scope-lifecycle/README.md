## Bean Initialization: Lazy vs Eager

### Eager Initialization (Default)
- Beans are created at application startup
- Dependencies are validated early
- Application fails fast if configuration is wrong

### Lazy Initialization
- Bean is created only when it is first requested
- Startup time may improve
- Errors appear at runtime when the bean is used

---

## When to Use Lazy Initialization
- Heavy or resource-intensive beans
- Optional features
- Rarely used components

## When to Avoid Lazy Initialization
- Core business services
- Security components
- Critical infrastructure beans

---

## Comparison

| Feature | Lazy | Eager |
|------|------|------|
| Initialization time | On first use | Application startup |
| Default | No | Yes |
| Annotation | `@Lazy` | No annotation |
| Error detection | Runtime | Startup |
| Usage | Rare | Common |
| Startup memory | Lower | Higher |

---

## Key Insight
Eager initialization is preferred in production systems because it ensures early failure and system stability.
