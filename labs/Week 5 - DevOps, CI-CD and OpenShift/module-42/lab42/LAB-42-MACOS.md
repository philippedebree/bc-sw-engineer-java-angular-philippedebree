# Lab 42: Kubernetes and OpenShift Architecture — macOS

**OS:** macOS  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code · OpenShift Console  
**Shell:** macOS Terminal (zsh)  
**Stack hint:** JDK 21 · Docker image from Lab 41 · `oc` CLI · OpenShift · GitHub Actions context · IntelliJ  
**Full lab steps:** [LAB-42-GUIDE.md](LAB-42-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [Windows guide](LAB-42-WINDOWS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)

## Prerequisites (macOS)

- [Lab 0 (macOS)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-MACOS.md) complete
- Lab 41 image identity notes available
- `oc` on PATH (or Console-only path approved by instructor)
- IntelliJ with **Project SDK 21**

## Paths (macOS)

| Item | macOS |
| ---- | ------- |
| Workspace | `~/java-bootcamp` |
| This lab project | `~/java-bootcamp/examples/lab42-crm` |
| Evidence / screenshots | `~/java-bootcamp/notes/screenshots/lab-42` |
| Shell | macOS Terminal inside IntelliJ |

```bash
cd ~/java-bootcamp
mkdir -p notes/screenshots/lab-42
cd examples/lab42-crm
```

### Commands this lab typically uses

```bash
oc version
oc login --server="$OPENSHIFT_API"
oc project
oc apply -f openshift/ --dry-run=client
oc apply -f openshift/
oc get pods,svc,route
curl -fsS "https://<route-host>/actuator/health/readiness"
```

## Do the lab

Complete every step in **[LAB-42-GUIDE.md](LAB-42-GUIDE.md)**. GUIDE paths already use `~/java-bootcamp`.

## Evidence / screenshots

Save under `~/java-bootcamp/notes/screenshots/lab-42`. Redact tokens.

## Pass criteria

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Workspace `~/java-bootcamp` open; project under `examples/lab42-crm` | Pass / Fail |
| 2 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 3 | Screenshots under `notes/screenshots/lab-42/` | Pass / Fail |
