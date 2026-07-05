// shared/jsMain/fr/hamtec/geckos/services/DeviceInfoService.js.kt
package fr.hamtec.geckos.services

import kotlin.js.*

class JsDeviceInfoService : DeviceInfoService {
    override val osName: String = js("navigator.platform") as String
    override val osVersion: String = js("navigator.userAgent") as String
    override val manufacturer: String = "Browser"
}

actual fun getDeviceInfoService(): DeviceInfoService =
    JsDeviceInfoService()


