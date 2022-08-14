package com.bkarakoca.githubrepolisting.internal.extension

fun Any?.toSafeString(): String {
    return this?.toString() ?: ""
}