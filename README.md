# Android App com Kotlin Toolchain + XML Nativo

Projeto Android minimalista usando **Kotlin Toolchain** (sem Gradle) com interface em **XML tradicional** e `Activity` nativa.

## Estrutura

```
androidApp/                    # Módulo único - aplicação Android
├── src/
│   ├── MainActivity.kt        # Activity principal (herda de android.app.Activity)
│   └── AndroidManifest.xml    # Manifest com theme Material Light NoActionBar
├── res/
│   ├── layout/main.xml        # LinearLayout com TextView + Button
│   ├── values/strings.xml     # Nome do app
│   └── mipmap-*/              # Ícones padrão
├── module.yaml                # namespace: org.example.kotlinandroidtest
└── proguard-rules.pro
```

## Configuração raiz

| Arquivo | Função |
|---------|--------|
| `kotlin` / `kotlin.bat` | Wrappers auto-bootstrap do Kotlin Toolchain (baixa toolchain na 1ª execução) |
| `project.yaml` | Define módulos ativos (`androidApp` apenas) |
| `libs.versions.toml` | Catálogo de versões (mantido para referência futura, não consumido pelo build atual) |
| `Makefile` | Atalho: `make run` → `./kotlin clean && kotlin run -m androidApp -d 192.168.1.247:43513` |

## Comandos

```bash
# Build completo
./kotlin build

# Run no device configurado (IP:porta no Makefile)
./kotlin run -m androidApp
# ou
make run

# Testes
./kotlin test
./kotlin test -m androidApp
```

## Estado atual

- ✅ **Android-only** — sem KMP, sem módulo `shared`
- ✅ **XML nativo** — `setContentView(R.layout.main)`, sem Compose
- ✅ **Activity nativa** — `android.app.Activity`, não `AppCompatActivity`
- ✅ **Kotlin Toolchain** — build sem Gradle, sem IDE obrigatória
- 📦 `libs.versions.toml` mantido como referência (contém `logback`, `kotlinx-coroutines` órfãos)

## Referências

- [Kotlin Toolchain](https://kotlin-toolchain.org/latest/) — build system usado
- [Android Activity](https://developer.android.com/reference/android/app/Activity) — classe base
- [Layout XML](https://developer.android.com/develop/ui/views/layout) — guias de layout nativo