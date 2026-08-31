# Lab 36: Secure Frontend Communication — Windows

**OS:** Windows  
**Primary IDE:** VS Code  
**Optional IDE:** IntelliJ IDEA Community Edition  
**Shell:** Windows PowerShell  
**Stack hint:** Angular auth interceptor · route guards · JWT memory / httpOnly discipline · REST  
**Full lab steps:** [LAB-36-GUIDE.md](LAB-36-GUIDE.md)  
**Other OS:** [macOS guide](LAB-36-MACOS.md)

## Prerequisites (Windows)

- Lab 35 preferred, or the course `starter/` + `crm-api/`
- Node 20 LTS; Boot API on `:8080` (`Authorization: Bearer lab-demo-token`)

## Paths (Windows)

| Item | Windows |
| ---- | ------- |
| Workspace | `%USERPROFILE%\java-bootcamp` |
| This lab project | `%USERPROFILE%\java-bootcamp\examples\lab36-crm-ui` |
| Boot API | `%USERPROFILE%\java-bootcamp\examples\lab36-crm-api` |
| Evidence | `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-36` |

Prefer the course `starter/` and `crm-api/` (see [starter/README.md](starter/README.md)). If you already finished Lab 35:

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path notes\screenshots\lab-36 | Out-Null
Copy-Item -Recurse -Force examples\lab35-crm-ui examples\lab36-crm-ui
cd examples\lab36-crm-ui
```

### Commands this lab typically uses

```powershell
# Terminal 1 — API
cd $env:USERPROFILE\java-bootcamp\examples\lab36-crm-api
mvn -B spring-boot:run
# Terminal 2 — UI
cd $env:USERPROFILE\java-bootcamp\examples\lab36-crm-ui
npx ng serve --open
# /customers → redirect to login → mock login → list CUS-1001 / CUS-1002 with Authorization header
npx ng build
```

## Do the lab

Complete **[LAB-36-GUIDE.md](LAB-36-GUIDE.md)** using `%USERPROFILE%\java-bootcamp`.

## Evidence / screenshots

Save under `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-36`. Redact token values in shared notes.

## Pass criteria

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Memory (or httpOnly) session — not localStorage-as-best-practice | Pass / Fail |
| 2 | Interceptor sends Authorization | Pass / Fail |
| 3 | Guard blocks unauthenticated `/customers` | Pass / Fail |
| 4 | `docs/security-notes.md` complete | Pass / Fail |
| 5 | Screenshots under `notes/screenshots/lab-36/` | Pass / Fail |
