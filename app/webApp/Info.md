### Commande dans pwf
.\gradlew :app:webApp:wasmJsBrowserDevelopmentRun



### Dans Gradle app/webApp/build.gradle.kts

```kotlin
tasks.register("runWeb") {
    dependsOn("wasmJsBrowserDevelopmentRun")
}
```
```pwf
.\gradlew :app:webApp:runWeb
```
CTRL + C

Terminer le programme de commandes (O/N) ? o

Et le terminal se libère.

.\gradlew :app:webApp:wasmJsBrowserDevelopmentRun --continuous=false


