# 🦎 **Geckos — Kotlin Multiplatform Full‑Stack Project**

Geckos est un projet **Kotlin Multiplatform complet**, conçu comme un **laboratoire personnel** pour explorer :

- Compose Multiplatform (Android, Desktop, Web, WASM)
- Ktor Server
- Architecture propre (Domain / Data / UI)
- Runtime Compose (SlotTable, Recomposer, Snapshot system)
- Intégration multiplateforme (Android, JVM, JS, WASM)
- Expérimentations techniques versionnées via Git

Ce dépôt sert de base pour construire un **codex technique**, tester des idées, comparer les backends, et développer une application full‑stack moderne.

---

## 📦 **Structure du projet**

```
Geckos
  ├─ app/
  │   ├─ androidApp/      → Application Android (Compose Android)
  │   ├─ desktopApp/      → Application Desktop (Compose Desktop / Skia)
  │   └─ webApp/          → Application Web (Compose HTML / Canvas)
  │
  ├─ shared/              → Module multiplateforme (UI + business)
  │   ├─ commonMain/      → Code partagé (Compose MP, logique, modèles)
  │   ├─ androidMain/     → Spécifique Android
  │   ├─ jsMain/          → Spécifique JS
  │   ├─ jvmMain/         → Spécifique JVM
  │   ├─ wasmJsMain/      → Spécifique WASM
  │   ├─ commonTest/      → Tests communs
  │   ├─ androidHostTest/ → Tests Android
  │   └─ jvmTest/         → Tests Desktop
  │
  ├─ core/                → Module utilitaire commun (Domain / Utils)
  │   └─ commonMain/      → Extensions, helpers, modèles
  │
  ├─ server/              → Backend Ktor (API, logique serveur)
  │   ├─ Application.kt   → Entrée serveur
  │   ├─ User.kt          → Exemple de modèle
  │   └─ resources/       → Configuration Ktor
  │
  └─ kotlin-js-store/     → Runtime WASM/JS (généré)
```

---

## 🎯 **Objectifs du projet**

### ✔ Full‑stack Kotlin
Un seul langage pour :
- Android
- Desktop
- Web JS
- Web WASM
- Serveur Ktor

### ✔ UI multiplateforme
Compose Multiplatform pour partager :
- Composants
- Navigation
- State management
- Thèmes

### ✔ Architecture propre
Séparation claire :
- `core/` → Domain + Utils
- `shared/` → UI + business multiplateforme
- `server/` → Backend Ktor + Exposed (à venir)

### ✔ Laboratoire runtime
Geckos sert à analyser :
- SlotTable
- Recomposer
- Snapshot system
- Différences entre backends (Android / Skia / DOM / WASM)

### ✔ Versionnement Git avancé
Branches labo pour tester :
- Compose runtime
- Compose Web
- WASM
- Ktor + Exposed
- Architecture Domain/Data/UI
- Performance
- UI tests


## 🚀 **Build & Run**

### Android
```
./gradlew :app:androidApp:installDebug
```

### Desktop
```
./gradlew :app:desktopApp:run
```

### Web (JS)
```
./gradlew :app:webApp:jsBrowserDevelopmentRun
```

### Web (WASM)
```
./gradlew :app:webApp:wasmBrowserDevelopmentRun
```

### Serveur Ktor
```
./gradlew :server:run
```


## 🧪 **Tests**

### Tests communs
```
./gradlew :shared:commonTest
```

### Tests Android
```
./gradlew :shared:androidHostTest
```

### Tests Desktop
```
./gradlew :shared:jvmTest
```


## 🌱 **Branches Git recommandées**

### Branches principales
- `main` → stable
- `develop` → intégration

### Branches labo (exploration)
- `lab-compose-runtime`
- `lab-compose-web`
- `lab-compose-desktop`
- `lab-compose-wasm`
- `lab-ktor-server-exposed`
- `lab-shared-architecture`
- `lab-navigation`
- `test-performance`
- `test-ui`


## 🧠 **Vision du projet**

Geckos est conçu comme un **environnement d’exploration technique**, permettant :

- d’étudier les internals de Compose Multiplatform,
- de comparer les backends graphiques,
- de construire une architecture propre,
- de développer un backend Ktor moderne,
- de documenter chaque étape dans un codex Obsidian.

Ce dépôt est un **laboratoire personnel**, évolutif, versionné, et orienté maîtrise technique.


## 📜 Licence
MIT (ou celle que tu choisiras)


## 🤝 Contributions
Projet personnel — contributions externes non ouvertes pour le moment.

