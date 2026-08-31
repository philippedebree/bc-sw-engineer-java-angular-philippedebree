# Lab 35: Frontend to API Integration — macOS

**OS:** macOS  
**Primary IDE:** VS Code (Angular) + IntelliJ (Spring Boot)  
**Shell:** macOS Terminal (zsh)  
**Stack hint:** Angular HttpClient · Spring Boot REST · PostgreSQL (or mock) · CORS  
**Full lab steps:** [LAB-35-GUIDE.md](LAB-35-GUIDE.md)  
**Other OS:** [Windows guide](LAB-35-WINDOWS.md)

## Prerequisites (macOS)

- JDK 21 + Maven; Node 20 LTS
- A Customer REST API on `http://localhost:8080`

## Paths (macOS)

| Item | macOS |
| ---- | ------- |
| Workspace | `~/java-bootcamp` |
| Angular UI | `~/java-bootcamp/examples/lab35-crm-ui` |
| Optional Boot API | `~/java-bootcamp/examples/lab35-crm-api` |
| Evidence | `~/java-bootcamp/notes/screenshots/lab-35` |

Prefer the course `starter/` and `crm-api/` (see [starter/README.md](starter/README.md)). If you already finished Lab 34:

```bash
cd ~/java-bootcamp
mkdir -p notes/screenshots/lab-35
cp -R examples/lab34-crm-ui examples/lab35-crm-ui 2>/dev/null || true
cd examples/lab35-crm-ui
```

### Commands this lab typically uses

```bash
# API
cd ~/java-bootcamp/examples/lab35-crm-api
mvn -B spring-boot:run
curl -s http://localhost:8080/api/customers/CUS-1001
# UI
cd ~/java-bootcamp/examples/lab35-crm-ui
npx ng serve --open
```

## Do the lab

Complete **[LAB-35-GUIDE.md](LAB-35-GUIDE.md)**.

## Evidence / screenshots

Save under `~/java-bootcamp/notes/screenshots/lab-35`. Include Network JSON for CUS-1001/CUS-1002. Redact secrets.

## Pass criteria

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Boot GET CUS-1001 works | Pass / Fail |
| 2 | Angular list loads from HttpClient | Pass / Fail |
| 3 | CORS fixed for localhost:4200 | Pass / Fail |
| 4 | `docs/integration-notes.md` present | Pass / Fail |
| 5 | Screenshots under `notes/screenshots/lab-35/` | Pass / Fail |
