package site.addzero.buildlogic.spring

import org.gradle.accessors.dm.LibrariesForLibs
import org.gradle.kotlin.dsl.the
import org.jetbrains.kotlin.gradle.internal.types.error.ErrorModuleDescriptor.platform

plugins {
    id("site.addzero.buildlogic.jvm.kotlin-convention")
}
val libs = the<LibrariesForLibs>()

dependencies {
    val version = libs.versions.springBoot.get()
    implementation(platform("org.springframework.boot:spring-boot-dependencies:$version"))

    testImplementation(libs.spring.boot.starter.test)
    testImplementation(libs.junit.jupiter.api)
    testImplementation(libs.h2)
    testRuntimeOnly(libs.junit.jupiter.engine)
    testImplementation(libs.spring.boot.starter.web)

}

