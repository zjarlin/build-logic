package site.addzero.buildlogic.spring

import org.gradle.accessors.dm.LibrariesForLibs

plugins {
    id("site.addzero.buildlogic.spring.spring-common")
    kotlin("plugin.spring")
}
val libs = the<LibrariesForLibs>()
val version = libs.versions.springBoot.get()
dependencies {
    compileOnly(libs.spring.boot.starter.web)
    compileOnly(libs.spring.boot.autoconfigure)
    annotationProcessor(libs.spring.boot.configurationProcessor)

//    compileOnly("org.springframework:spring-core")
//    compileOnly("org.springframework:spring-context")


}
