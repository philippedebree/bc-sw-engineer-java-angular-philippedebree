# Lab 36: Secure Frontend Communication — macOS

**OS:** macOS  
**Primary IDE:** VS Code  
**Optional IDE:** IntelliJ IDEA Community Edition  
**Shell:** macOS Terminal (zsh)  
**Stack hint:** Angular auth interceptor · route guards · JWT memory / httpOnly discipline · REST  
**Full lab steps:** [LAB-36-GUIDE.md](LAB-36-GUIDE.md)  
**Other OS:** [Windows guide](LAB-36-WINDOWS.md)

## Prerequisites (macOS)

- Lab 35 preferred, or the course `starter/` + `crm-api/`
- Node 20 LTS; Boot API on `:8080` (`Authorization: Bearer lab-demo-token`)

## Paths (macOS)

| Item | macOS |
| ---- | ------- |
| Workspace | `~/java-bootcamp` |
| This lab project | `~/java-bootcamp/examples/lab36-crm-ui` |
| Boot API | `~/java-bootcamp/examples/lab36-crm-api` |
| Evidence | `~/java-bootcamp/notes/screenshots/lab-36` |

Prefer the course `starter/` and `crm-api/` (see [starter/README.md](starter/README.md)). If you already finished Lab 35:

```bash
cd ~/java-bootcamp
mkdir -p notes/screenshots/lab-36
cp -R examples/lab35-crm-ui examples/lab36-crm-ui
cd examples/lab36-crm-ui
```

### Commands this lab typically uses

```bash
cd ~/java-bootcamp/examples/lab36-crm-api
mvn -B spring-boot:run
cd ~/java-bootcamp/examples/lab36-crm-ui
npx ng serve --open
npx ng build
```

## Do the lab

Complete **[LAB-36-GUIDE.md](LAB-36-GUIDE.md)**.

## Evidence / screenshots

Save under `~/java-bootcamp/notes/screenshots/lab-36`. Redact token values in shared notes.

## Pass criteria

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Memory (or httpOnly) session — not localStorage-as-best-practice | Pass / Fail |
| 2 | Interceptor sends Authorization | Pass / Fail |
| 3 | Guard blocks unauthenticated `/customers` | Pass / Fail |
| 4 | `docs/security-notes.md` complete | Pass / Fail |
| 5 | Screenshots under `notes/screenshots/lab-36/` | Pass / Fail |
