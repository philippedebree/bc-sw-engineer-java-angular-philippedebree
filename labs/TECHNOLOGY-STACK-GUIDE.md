# Technology stack — Java & Angular Fullstack

What you learn, why it is here, and where it shows up. Follow **[README.deck-production.md](../README.deck-production.md)** as the teaching contract.

**Back to:** [Lab Index](LABS-INDEX.md) · **Setup:** [SETUP-INSTRUCTIONS.md](SETUP-INSTRUCTIONS.md)

## Learning path

```text
Week 1   Java + JVM                       Write and understand core code
Week 2   Maven + REST + Tests             Structure, integrate, verify
Week 3   Spring Boot + REST MVC           Enterprise backend
Week 4   Kafka + Angular + PostgreSQL     Full-stack, event-driven, persistent
Week 5   DevOps + Actions + OpenShift     Secure, containerise, deploy
Week 6   Capstone                         Deliver a production-style CRM
```

## Stack at a glance

| Area | Technology |
| ---- | ---------- |
| Language / runtime | Java 21, JVM |
| Build | Maven 3.9.x · npm / Angular CLI |
| Backend | Spring Boot 3.x, Spring MVC REST, Spring Security, Spring Data JPA |
| API contract | OpenAPI (not SOAP/WSDL) |
| Frontend | Angular, TypeScript, Signals, RxJS, HttpClient |
| Messaging | Apache Kafka, Spring Kafka, Resilience4j |
| Database | **PostgreSQL** |
| Containers | Docker images, GHCR |
| Orchestration | **OpenShift** (Projects, Routes, `oc`) |
| CI/CD | **GitHub Actions** + code scanning (not Bitbucket) |
| IaC | Ansible, Terraform |
| Tests | JUnit, Mockito, Selenium (Angular UI) |
| AI | GitHub Copilot + weekly AI Threads |

## What is different from the Java Software Engineer course

| JSE (source course) | This Angular course |
| ------------------- | ------------------- |
| SOAP / Spring-WS | REST / Spring MVC / OpenAPI |
| React | Angular |
| Oracle (JSE outline) | **PostgreSQL** (labs and deck target) |
| Bitbucket Pipelines | **GitHub Actions** |
| k3s (in some JSE lab wording) | **OpenShift** |

## Lab reuse vs new

| Action | Labs |
| ------ | ---- |
| Reuse (common) | 0–12, 14–18, 20–23, 25–32, 40–41, 43–47, 49, 52 |
| Authored for this course | 13, 19, 24, 33–39, 42, 48, 50, 51 |

## Acronyms (course-specific)

| Acronym | Full form | Used in |
| ------- | --------- | ------- |
| REST | Representational State Transfer | Labs 13, 24, 35 |
| OpenAPI | OpenAPI Specification | Lab 13 |
| JWT | JSON Web Token | Labs 28, 36 |
| JPA | Jakarta Persistence API | Lab 39 |
| CLI | Command-Line Interface (`ng`, `oc`) | Labs 33, 42 |
| SAST / DAST | Static / Dynamic Application Security Testing | Labs 40, 51 |
| GHCR | GitHub Container Registry | Labs 41, 43, 51 |
| IaC | Infrastructure as Code | Lab 45 |
