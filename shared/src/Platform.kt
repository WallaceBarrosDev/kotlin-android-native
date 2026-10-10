package org.example.kotlinandroidtest

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
