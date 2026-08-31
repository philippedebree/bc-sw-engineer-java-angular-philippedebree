# Lab 39: Spring Data JPA and PostgreSQL Integration — macOS

**OS:** macOS  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** macOS Terminal (zsh)  
**Stack hint:** JDK 21 · Maven 3.9+ · Spring Boot 3.x · PostgreSQL 16 · IntelliJ  
**Full lab steps:** [LAB-39-GUIDE.md](LAB-39-GUIDE.md)  
**Other OS:** [Windows guide](LAB-39-WINDOWS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)

## Prerequisites (macOS)

- Labs 37–38 concepts; Docker; IntelliJ SDK **21**
- Copy `.env.example` → `.env` (never commit `.env`)

## Paths (macOS)

| Item | macOS |
| ---- | ----- |
| Workspace | `~/java-bootcamp` |
| This lab project | `~/java-bootcamp/examples/lab39-crm` |
| Evidence | `~/java-bootcamp/notes/screenshots/lab-39` |

```bash
cd ~/java-bootcamp
mkdir -p notes/screenshots/lab-39
cd examples/lab39-crm
```

### Commands this lab typically uses

```bash
cd ~/java-bootcamp/examples/lab39-crm
cp -n .env.example .env
docker compose up -d
mvn -B test
mvn -B spring-boot:run
curl -s -H "X-Correlation-Id: lab-request-001" \
  http://localhost:8080/api/customers/CUS-1001
```

## Do the lab

Complete **[LAB-39-GUIDE.md](LAB-39-GUIDE.md)**.

## Evidence / screenshots

Save under `~/java-bootcamp/notes/screenshots/lab-39`. Redact credentials.

## Pass criteria

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Project under `examples/lab39-crm` | Pass / Fail |
| 2 | Flyway V1 + `ddl-auto=validate` | Pass / Fail |
| 3 | `mvn -B test` IT green on PostgreSQL | Pass / Fail |
| 4 | GUIDE checkpoints complete | Pass / Fail |
| 5 | Screenshots under `notes/screenshots/lab-39/` | Pass / Fail |
