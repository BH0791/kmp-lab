// shared/wasmJsMain/fr/hamtec/geckos/services/DeviceInfoService.wasm.kt
package fr.hamtec.geckos.services

class WasmDeviceInfoService : DeviceInfoService {
    override val osName: String = "WASM"
    override val osVersion: String = "N/A"
    override val manufacturer: String = "WebAssembly"
}

actual fun getDeviceInfoService(): DeviceInfoService =
    WasmDeviceInfoService()


