# Lab 35: Frontend to API Integration — Windows

**OS:** Windows  
**Primary IDE:** VS Code (Angular) + IntelliJ (Spring Boot)  
**Shell:** Windows PowerShell  
**Stack hint:** Angular HttpClient · Spring Boot REST · PostgreSQL (or mock) · CORS  
**Full lab steps:** [LAB-35-GUIDE.md](LAB-35-GUIDE.md)  
**Other OS:** [macOS guide](LAB-35-MACOS.md)

## Prerequisites (Windows)

- JDK 21 + Maven; Node 20 LTS
- A Customer REST API on `http://localhost:8080` (instructor stub, prior Boot lab, or `lab35-crm-api`)

## Paths (Windows)

| Item | Windows |
| ---- | ------- |
| Workspace | `%USERPROFILE%\java-bootcamp` |
| Angular UI | `%USERPROFILE%\java-bootcamp\examples\lab35-crm-ui` |
| Optional Boot API | `%USERPROFILE%\java-bootcamp\examples\lab35-crm-api` |
| Evidence | `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-35` |

Prefer the course `starter/` and `crm-api/` (see [starter/README.md](starter/README.md)). If you already finished Lab 34:

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path notes\screenshots\lab-35 | Out-Null
Copy-Item -Recurse -Force examples\lab34-crm-ui examples\lab35-crm-ui -ErrorAction SilentlyContinue
cd examples\lab35-crm-ui
```

### Commands this lab typically uses

```powershell
# Terminal 1 — API
cd $env:USERPROFILE\java-bootcamp\examples\lab35-crm-api
mvn -B spring-boot:run
# Terminal 2 — verify
Invoke-WebRequest http://localhost:8080/api/customers/CUS-1001 -UseBasicParsing
# Terminal 3 — UI
cd $env:USERPROFILE\java-bootcamp\examples\lab35-crm-ui
npx ng serve --open
```

## Do the lab

Complete **[LAB-35-GUIDE.md](LAB-35-GUIDE.md)** using `%USERPROFILE%\java-bootcamp`.

## Evidence / screenshots

Save under `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-35`. Include Network JSON for CUS-1001/CUS-1002. Redact secrets.

## Pass criteria

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Boot GET CUS-1001 works | Pass / Fail |
| 2 | Angular list loads from HttpClient | Pass / Fail |
| 3 | CORS fixed for localhost:4200 | Pass / Fail |
| 4 | `docs/integration-notes.md` present | Pass / Fail |
| 5 | Screenshots under `notes/screenshots/lab-35/` | Pass / Fail |
