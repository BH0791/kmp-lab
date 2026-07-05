// shared/androidMain/fr/hamtec/geckos/services/DeviceInfoService.android.kt
package fr.hamtec.geckos.services

import android.os.Build

class AndroidDeviceInfoService : DeviceInfoService {
    override val osName: String = "Android"
    override val osVersion: String = Build.VERSION.SDK_INT.toString()
    override val manufacturer: String = Build.MANUFACTURER
}

actual fun getDeviceInfoService(): DeviceInfoService =
    AndroidDeviceInfoService()
