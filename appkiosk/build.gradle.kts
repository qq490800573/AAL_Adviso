plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
    id("androidx.navigation.safeargs.kotlin")
    id ("kotlin-android-extensions")


}

android {
    signingConfigs {
        create("release") {

            storeFile = file("$rootDir${File.separator}CCL")
            storePassword = "ccl2017"
            keyAlias = "ITRC"
            keyPassword = "ccl2017"
        }
    }
    compileSdk = 30

    defaultConfig {
        applicationId = "com.iitp.signagekiosk"
        minSdk = 27
        targetSdk = 30
        versionCode = 1
        versionName = "0.1"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        signingConfig = signingConfigs.getByName("release")
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
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
    implementation(Libs.LIFECYCLE_JAVA8)

    // navigation
    implementation(Libs.NAVIGATION_FRAGMENT_KTX)
    implementation(Libs.NAVIGATION_UI_KTX)

    // hilt
    implementation(Libs.HILT_ANDROID)
    kapt(Libs.HILT_COMPILER)

    // gson
    implementation(Libs.GSON)

    // MpAndroidChart
    implementation(Libs.MPANDROIDCHART)

    // test
    testImplementation(Libs.JUNIT)
    androidTestImplementation(Libs.ANDROID_TEST_JUNIT)
    androidTestImplementation(Libs.ESPRESSO_CORE)
}