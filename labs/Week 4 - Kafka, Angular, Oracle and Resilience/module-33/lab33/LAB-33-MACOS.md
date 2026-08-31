# Lab 33: Angular Component Architecture — Northstar CRM UI Shell — macOS

**OS:** macOS  
**Primary IDE:** VS Code (Angular Language Service)  
**Optional IDE:** IntelliJ IDEA Community Edition  
**Shell:** macOS Terminal (zsh)  
**Stack hint:** Node 20 LTS · npm · Angular CLI · standalone components  
**Full lab steps:** [LAB-33-GUIDE.md](LAB-33-GUIDE.md)  
**Other OS:** [Windows guide](LAB-33-WINDOWS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)

## Prerequisites (macOS)

- [Lab 0 (macOS)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-MACOS.md) complete (Git, workspace)
- Node.js **20 LTS** on PATH (`node -v`, `npm -v`)
- VS Code with Angular Language Service recommended

## Paths (macOS)

| Item | macOS |
| ---- | ------- |
| Workspace (open in IDE) | `~/java-bootcamp` |
| This lab project | `~/java-bootcamp/examples/lab33-crm-ui` |
| Evidence / screenshots | `~/java-bootcamp/notes/screenshots/lab-33` |
| Shell | macOS Terminal |
| Path style | Forward slashes |

```bash
cd ~/java-bootcamp
mkdir -p notes/screenshots/lab-33
cd examples/lab33-crm-ui
```

### Commands this lab typically uses

```bash
cd ~/java-bootcamp/examples/lab33-crm-ui
node -v
npm -v
npx ng version
npx ng serve --open
# Browser: http://localhost:4200 — CUS-1001 / CUS-1002
npx ng build
```

Verified intent: standalone smart list page + presentational list item; seeds **CUS-1001** / **CUS-1002**; `docs/component-notes.md`; no React/SOAP/Oracle path.

## Do the lab

Complete every step in **[LAB-33-GUIDE.md](LAB-33-GUIDE.md)**. GUIDE paths already use `~/java-bootcamp`.

## Evidence / screenshots

Save under `~/java-bootcamp/notes/screenshots/lab-33`. Capture VS Code + browser list. Redact secrets.

## Pass criteria

_Mark **Pass** or **Fail** in your lab notes._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Workspace `~/java-bootcamp` open; Node 20 available | Pass / Fail |
| 2 | Lab project under `examples/lab33-crm-ui` | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | `ng serve` shows CUS-1001 and CUS-1002 | Pass / Fail |
| 5 | Screenshots under `notes/screenshots/lab-33/` | Pass / Fail |
