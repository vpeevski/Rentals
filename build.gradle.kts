// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.1" apply false
    id("org.jetbrains.kotlin.android") version "1.8.0" apply false
    id("com.google.dagger.hilt.android") version "2.44" apply false
}
val retrofitVersion by extra("2.9.0")
val pagingVersion by extra { "3.2.1" }
val lifecycleVersion by extra { "2.6.2" }
val composeVersion by extra { "1.8.0" }
buildscript {
    repositories {
        google()
        mavenCentral()
    }
}