# Lab 38: SQL and Query Performance with PostgreSQL — macOS

**OS:** macOS  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** macOS Terminal (zsh)  
**Stack hint:** JDK 21 · Docker · PostgreSQL 16 · IntelliJ  
**Full lab steps:** [LAB-38-GUIDE.md](LAB-38-GUIDE.md)  
**Other OS:** [Windows guide](LAB-38-WINDOWS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)

## Prerequisites (macOS)

- Lab 37 schema available; Docker running
- IntelliJ SDK **21**

## Paths (macOS)

| Item | macOS |
| ---- | ----- |
| Workspace | `~/java-bootcamp` |
| This lab project | `~/java-bootcamp/examples/lab38-crm` |
| Evidence | `~/java-bootcamp/notes/screenshots/lab-38` |

```bash
cd ~/java-bootcamp
mkdir -p notes/screenshots/lab-38
cd examples/lab38-crm
```

### Commands this lab typically uses

```bash
cd ~/java-bootcamp/examples/lab38-crm
cp -n .env.example .env 2>/dev/null || true
docker compose up -d
docker exec -i crm-postgres psql -U crm -d crm -v ON_ERROR_STOP=1 < database/ddl/01_create_user.sql
docker exec -i crm-postgres psql -U crm -d crm -v ON_ERROR_STOP=1 < database/ddl/02_schema.sql
docker exec -i crm-postgres psql -U crm -d crm -v ON_ERROR_STOP=1 < database/ddl/03_seed.sql
docker exec -i crm-postgres psql -U crm -d crm -v ON_ERROR_STOP=1 \
  < database/performance/01_generate_data.sql
docker exec -i crm-postgres psql -U crm -d crm -v ON_ERROR_STOP=1 \
  < database/performance/02_baseline.sql
# then 03_indexes.sql → 04_optimized.sql; paste EXPLAIN into report.md
```

## Do the lab

Complete **[LAB-38-GUIDE.md](LAB-38-GUIDE.md)**.

## Evidence / screenshots

Save under `~/java-bootcamp/notes/screenshots/lab-38`. Prefer plan excerpts over row dumps.

## Pass criteria

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Project under `examples/lab38-crm` | Pass / Fail |
| 2 | Baseline + after-index EXPLAIN captured | Pass / Fail |
| 3 | Keyset vs OFFSET noted in report | Pass / Fail |
| 4 | GUIDE checkpoints complete | Pass / Fail |
| 5 | Screenshots under `notes/screenshots/lab-38/` | Pass / Fail |
