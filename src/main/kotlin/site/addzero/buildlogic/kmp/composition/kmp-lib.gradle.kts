@file:OptIn(ExperimentalWasmDsl::class)

package site.addzero.buildlogic.kmp.composition

import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
plugins {
    //todo 暂不开发安卓
//    id("kmp-android-lib")
    id("kmp-desktop")
       //todo 暂时不开发ios应用
//    id("kmp-ios-app")
    id("kmp-wasm")
}

