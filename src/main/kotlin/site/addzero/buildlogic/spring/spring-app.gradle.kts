package site.addzero.buildlogic.spring

import org.gradle.accessors.dm.LibrariesForLibs

plugins {
    id("site.addzero.buildlogic.spring.spring-common")
    kotlin("plugin.spring")
    id("io.spring.dependency-management")
}
val libs = the<LibrariesForLibs>()

dependencies {
    implementation(libs.spring.boot.starter.web)
//    developmentOnly("org.springframework.boot:spring-boot-devtools")
}

