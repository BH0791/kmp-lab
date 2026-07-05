// shared/commonMain/fr/hamtec/geckos/services/DeviceInfoService.kt
package fr.hamtec.geckos.services

interface DeviceInfoService {
    val osName: String
    val osVersion: String
    val manufacturer: String
}

expect fun getDeviceInfoService(): DeviceInfoService
