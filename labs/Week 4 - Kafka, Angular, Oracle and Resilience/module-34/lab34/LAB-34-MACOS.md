# Lab 34: State and Event Management in Angular — macOS

**OS:** macOS  
**Primary IDE:** VS Code  
**Optional IDE:** IntelliJ IDEA Community Edition  
**Shell:** macOS Terminal (zsh)  
**Stack hint:** Node 20 · Angular Signals · Reactive Forms · RxJS contrast  
**Full lab steps:** [LAB-34-GUIDE.md](LAB-34-GUIDE.md)  
**Other OS:** [Windows guide](LAB-34-WINDOWS.md)

## Prerequisites (macOS)

- Lab 33 preferred (`lab33-crm-ui`) or fresh CLI app
- Node.js **20 LTS** on PATH

## Paths (macOS)

| Item | macOS |
| ---- | ------- |
| Workspace | `~/java-bootcamp` |
| This lab project | `~/java-bootcamp/examples/lab34-crm-ui` |
| Evidence | `~/java-bootcamp/notes/screenshots/lab-34` |

```bash
cd ~/java-bootcamp
mkdir -p notes/screenshots/lab-34
cp -R examples/lab33-crm-ui examples/lab34-crm-ui 2>/dev/null || true
cd examples/lab34-crm-ui
```

### Commands this lab typically uses

```bash
cd ~/java-bootcamp/examples/lab34-crm-ui
npx ng serve --open
npx ng build
```

## Do the lab

Complete **[LAB-34-GUIDE.md](LAB-34-GUIDE.md)**.

## Evidence / screenshots

Save under `~/java-bootcamp/notes/screenshots/lab-34`. Capture filter + empty/error. Redact secrets.

## Pass criteria

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | `examples/lab34-crm-ui` exists | Pass / Fail |
| 2 | Signals + computed filter show CUS-1001 / CUS-1002 correctly | Pass / Fail |
| 3 | Loading and empty or error UI proven | Pass / Fail |
| 4 | `docs/state-notes.md` present | Pass / Fail |
| 5 | Screenshots under `notes/screenshots/lab-34/` | Pass / Fail |
