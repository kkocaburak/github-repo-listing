package com.bkarakoca.core.extension

fun Int?.toSafeInt(): Int {
    return this ?: 0
}