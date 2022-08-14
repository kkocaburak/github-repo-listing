package com.bkarakoca.core.extension

fun Any?.toSafeString(): String {
    return this?.toString() ?: ""
}