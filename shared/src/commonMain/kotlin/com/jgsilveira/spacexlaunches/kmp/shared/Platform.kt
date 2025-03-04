package com.jgsilveira.spacexlaunches.kmp.shared

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform