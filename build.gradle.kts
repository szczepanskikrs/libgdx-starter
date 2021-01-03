group = App.groupId
version = App.version

buildscript {
    repositories {
        maven("https://plugins.gradle.org/m2/")
    }
    dependencies {
        classpath(Dependencies.Classpath.ktLint)
    }
}

plugins {
    java
    kotlin(Plugins.kotlinJvm) version Versions.kotlin
    id(Plugins.ktLint) version Versions.ktLint
}

repositories {
    mavenCentral()
}

subprojects {
    apply(plugin = Plugins.ktLint)

    ktlint {
        verbose.set(true)
    }
}
