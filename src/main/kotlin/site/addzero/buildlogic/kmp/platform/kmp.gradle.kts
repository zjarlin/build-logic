@file:OptIn(ExperimentalWasmDsl::class)

package site.addzero.buildlogic.kmp.platform
import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl

plugins {
    id("org.jetbrains.kotlin.multiplatform")
}
kotlin{

    sourceSets {
        commonTest {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }

}
