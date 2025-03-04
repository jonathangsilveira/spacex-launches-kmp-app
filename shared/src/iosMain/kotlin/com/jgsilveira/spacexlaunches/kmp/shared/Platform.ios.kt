package com.jgsilveira.spacexlaunches.kmp.shared

import platform.UIKit.UIDevice

class IOSPlatform: Platform {
    override val name: String = with(UIDevice.currentDevice) {
        "${systemName()} $systemVersion"
    }
}

actual fun getPlatform(): Platform = IOSPlatform()