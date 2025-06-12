package com.ekades.cmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform