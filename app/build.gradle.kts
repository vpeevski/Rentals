@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.com.android.application)
    alias(libs.plugins.org.jetbrains.kotlin.android)
    alias(libs.plugins.kapt)
    alias(libs.plugins.hilt)
    alias(libs.plugins.kotlinxSerialization)
    alias(libs.plugins.kotlinParcelize)
}

android {
    namespace = "com.outdoorsy.interview"
    compileSdk = 34

    buildFeatures {
        compose = true
        buildConfig = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.0"
    }

    defaultConfig {
        applicationId = "com.outdoorsy.interview"
        minSdk = 26
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
//        testInstrumentationRunner = "com.outdoorsy.interview.CustomTestRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    flavorDimensions("mode")
    productFlavors {
        create("outdoorsy") {
            dimension = "mode"
            // Define specific properties for flavor1
        }
        create("dev") {
            dimension = "mode"
            // Define specific properties for flavor2
        }
    }


    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }

    packaging {
        resources {
            excludes += "META-INF/gradle/incremental.annotation.processors"
        }
    }
}

dependencies {
    implementation(libs.coreKtx)
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.bundles.hilt)
    kapt(libs.hiltCompiler)

    implementation(libs.bundles.retrofit)
    implementation(libs.kotlinxSerialization)

//okhttp3
    implementation(libs.okhttp)
    implementation(libs.logging.interceptor)

// Coroutine
    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.kotlinx.coroutines.core)

// Paging, Jetpack Compose integration
    implementation(libs.bundles.paging)
    implementation(libs.lifecycle)
    implementation("androidx.fragment:fragment-ktx:1.6.1")

    implementation(platform(libs.composeBom))
    implementation(libs.bundles.compose)
    implementation(libs.bundles.material)

// Optional - Integration with activities
    implementation(libs.activity.compose)
    implementation(libs.activity.ktx)
// Integration with ViewModels
    implementation(libs.lifecycle.viewmodel.compose)
// Image processing
    implementation(libs.coilCompose)


    // Testing dependencies
    androidTestImplementation ("androidx.arch.core:core-testing:2.2.0")

    // Compose testing dependencies
    androidTestImplementation(platform(libs.composeBom))
    androidTestImplementation ("androidx.compose.ui:ui-test-junit4")
    debugImplementation ("androidx.compose.ui:ui-test-manifest")
}

kotlin {
    jvmToolchain(17)
}

// Allow references to generated code
kapt {
    correctErrorTypes = true
}