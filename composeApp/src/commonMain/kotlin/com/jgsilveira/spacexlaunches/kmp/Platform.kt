package com.jgsilveira.spacexlaunches.kmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform