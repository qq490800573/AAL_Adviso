plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
    id("androidx.navigation.safeargs.kotlin")
}

android {
    signingConfigs {
        create("release") {

            storeFile = file("$rootDir${File.separator}signage")
            storePassword = "tvstorm"
            keyAlias = "signage"
            keyPassword = "tvstorm"
        }
    }
    compileSdk = 30

    defaultConfig {
        applicationId = "com.iitp.signage"
        minSdk = 24
        targetSdk = 30
        versionCode = 1
        versionName = "0.0.1"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        signingConfig = signingConfigs.getByName("release")
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            signingConfig = signingConfigs.getByName("release")
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
        freeCompilerArgs =
            freeCompilerArgs + "-Xuse-experimental=kotlinx.coroutines.ExperimentalCoroutinesApi"
    }
    buildFeatures.dataBinding = true

    flavorDimensions.add("mode")
    productFlavors {
        create("full") {
            dimension = "mode"
        }
        create("demo") {
            dimension = "mode"
            applicationIdSuffix = ".demo"
        }
    }
}

dependencies {

    // submodules
    implementation(project(":saltlux-talkbot"))

    // coroutines
    implementation(Libs.COROUTINES_ANDROID)

    /*
     * Lifecycle.repeatOnLifecycle available in the lifecycle-runtime-ktx library.
     * Note: These APIs are available in the lifecycle:lifecycle-runtime-ktx:2.4.0-alpha01 library or later.
     */
    implementation(Libs.LIFECYCLE_RUNTIME_KTX)
    implementation(Libs.LIFECYCLE_VIEWMODEL_KTX)

    // navigation
    implementation(Libs.NAVIGATION_FRAGMENT_KTX)
    implementation(Libs.NAVIGATION_UI_KTX)

    // hilt
    implementation(Libs.HILT_ANDROID)
    kapt(Libs.HILT_COMPILER)

    // test
    testImplementation(Libs.JUNIT)
    androidTestImplementation(Libs.ANDROID_TEST_JUNIT)
    androidTestImplementation(Libs.ESPRESSO_CORE)
}