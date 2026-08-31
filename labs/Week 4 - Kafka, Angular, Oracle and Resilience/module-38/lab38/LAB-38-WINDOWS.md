# Lab 38: SQL and Query Performance with PostgreSQL — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** JDK 21 · Docker · PostgreSQL 16 · IntelliJ  
**Full lab steps:** [LAB-38-GUIDE.md](LAB-38-GUIDE.md)  
**Other OS:** [macOS guide](LAB-38-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)

## Prerequisites (Windows)

- Lab 37 schema available; Docker Desktop running
- IntelliJ SDK **21**

## Paths (Windows)

| Item | Windows |
| ---- | ------- |
| Workspace | `%USERPROFILE%\java-bootcamp` |
| This lab project | `%USERPROFILE%\java-bootcamp\examples\lab38-crm` |
| Evidence | `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-38` |

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path notes\screenshots\lab-38 | Out-Null
cd examples\lab38-crm
```

### Commands this lab typically uses

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\lab38-crm
Copy-Item .env.example .env -ErrorAction SilentlyContinue
docker compose up -d
Get-Content .\database\ddl\01_create_user.sql -Raw | docker exec -i crm-postgres psql -U crm -d crm -v ON_ERROR_STOP=1
Get-Content .\database\ddl\02_schema.sql -Raw | docker exec -i crm-postgres psql -U crm -d crm -v ON_ERROR_STOP=1
Get-Content .\database\ddl\03_seed.sql -Raw | docker exec -i crm-postgres psql -U crm -d crm -v ON_ERROR_STOP=1
Get-Content .\database\performance\01_generate_data.sql -Raw |
  docker exec -i crm-postgres psql -U crm -d crm -v ON_ERROR_STOP=1
Get-Content .\database\performance\02_baseline.sql -Raw |
  docker exec -i crm-postgres psql -U crm -d crm -v ON_ERROR_STOP=1
# then 03_indexes.sql → 04_optimized.sql; paste EXPLAIN into report.md
```

## Do the lab

Complete **[LAB-38-GUIDE.md](LAB-38-GUIDE.md)**. Use `%USERPROFILE%\java-bootcamp` for `~/java-bootcamp`.

## Evidence / screenshots

Save under `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-38`. Prefer plan excerpts over row dumps.

## Pass criteria

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Project under `examples\lab38-crm` | Pass / Fail |
| 2 | Baseline + after-index EXPLAIN captured | Pass / Fail |
| 3 | Keyset vs OFFSET noted in report | Pass / Fail |
| 4 | GUIDE checkpoints complete | Pass / Fail |
| 5 | Screenshots under `notes\screenshots\lab-38\` | Pass / Fail |
