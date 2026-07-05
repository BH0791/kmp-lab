// shared/jvmMain/fr/hamtec/geckos/services/DeviceInfoService.jvm.kt
package fr.hamtec.geckos.services

class JvmDeviceInfoService : DeviceInfoService {
    override val osName: String = System.getProperty("os.name")
    override val osVersion: String = System.getProperty("os.version")
    override val manufacturer: String = "Unknown JVM"
}

actual fun getDeviceInfoService(): DeviceInfoService =
    JvmDeviceInfoService()


