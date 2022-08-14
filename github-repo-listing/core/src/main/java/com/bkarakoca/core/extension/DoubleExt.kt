package com.bkarakoca.core.extension

fun Double?.toSafeDouble(): Double {
    return this ?: 0.0
}