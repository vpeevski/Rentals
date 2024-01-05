import java.io.FileReader
import java.util.Properties

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

//        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        testInstrumentationRunner = "com.outdoorsy.interview.HiltAppTestRunner"
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

    testOptions {
        packaging {
            jniLibs {
                useLegacyPackaging = true
            }
        }
    }
}

dependencies {
    implementation(libs.coreKtx)
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.bundles.hilt)
    implementation(libs.runner)
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

    implementation(platform(libs.composeBom))
    implementation(libs.bundles.compose)
    implementation(libs.bundles.material)

// Optional - Integration with activities
    implementation(libs.activity.compose)
    implementation(libs.activity.ktx)
    implementation(libs.fragment.ktx)
// Integration with ViewModels
    implementation(libs.lifecycle.viewmodel.compose)
// Image processing
    implementation(libs.coilCompose)


    // Testing dependencies
    testImplementation(libs.mockk)
    androidTestImplementation(libs.mockk.android)

    androidTestImplementation(libs.arch.core.testing)
    androidTestImplementation(libs.test.core.ktx)
    androidTestImplementation(libs.navigation.testing)
    androidTestImplementation(libs.hilt.testing)
    androidTestImplementation(libs.activity.ktx)
    androidTestImplementation("app.cash.turbine:turbine:0.12.1")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.6.4")
    kaptAndroidTest(libs.hilt.android.compiler)

    // Compose testing dependencies
    androidTestImplementation(platform(libs.composeBom))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-test-manifest")

}

kotlin {
    jvmToolchain(17)
}

// Allow references to generated code
kapt {
    correctErrorTypes = true
}

val versionFileKey = "versionFile"
project.extra[versionFileKey] = file("../version.properties")
val loadVersion = task("loadVersion") {
    logger.quiet("Loading version task...")
    version = readVersion(project.extra[versionFileKey] as File)
}

val printVersionTask = task("printVersion") {
    group = "versioning"
    description = "Prints project version."
    doFirst {
        println("Printing project version...")
    }
    doLast {
        // println("Version: $version")
        logger.quiet("Version: $version")
    }
}

val finalizerTask = task("finalizer") {
    logger.quiet("FINALIZE TASK...")
}
printVersionTask.finalizedBy(finalizerTask)

fun readVersion(file: File): ProjectVersion {
    logger.quiet("Reading version file: ${file.path}")
    if (!file.exists()) throw GradleException(
        "Required version file does not exist: ${file.canonicalPath}"
    )
    val versionProps = Properties()
    FileReader(file).use { reader ->
        versionProps.load(reader)
    }

    return ProjectVersion(
        versionProps.getProperty("major").toInt(),
        versionProps.getProperty("minor").toInt(),
        versionProps.getProperty("release").toBoolean()
    )
}

data class ProjectVersion(
    val major: Int,
    val minor: Int,
    val release: Boolean = false
) {
    override fun toString(): String = "$major.$minor${if (release) "" else "-SNAPSHOT"}"
}
