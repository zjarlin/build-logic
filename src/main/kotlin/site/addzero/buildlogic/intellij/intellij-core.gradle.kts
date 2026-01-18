package site.addzero.buildlogic.intellij

import org.gradle.kotlin.dsl.dependencies
import org.jetbrains.intellij.platform.gradle.extensions.intellijPlatform
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("site.addzero.buildlogic.intellij.intellij-base")
    id("org.jetbrains.intellij.platform.module")
}

dependencies {
    intellijPlatform {
        bundledPlugins(
            "com.intellij.java",
            "org.jetbrains.kotlin",
        )
    }
}












