package com.jgsilveira.spacexlaunches.kmp

import com.jgsilveira.spacexlaunches.kmp.shared.getPlatform

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}