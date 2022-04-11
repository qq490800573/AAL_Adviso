plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
}

android {
    compileSdk = 30

    defaultConfig {
        minSdk = 24
        targetSdk = 30

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
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

    // coroutines
    implementation(Libs.COROUTINES_ANDROID)

    // constraint layout
    implementation(Libs.CONSTRAINT_LAYOUT)

    // test
    testImplementation(Libs.JUNIT)
    androidTestImplementation(Libs.ANDROID_TEST_JUNIT)
    androidTestImplementation(Libs.ESPRESSO_CORE)

    // network
    implementation(Libs.OKHTTP)
    implementation(Libs.RETROFIT)
    implementation(Libs.RETROFIT_CONVERTER_GSON)
    implementation(Libs.GSON)
    implementation(Libs.LOGGING_INTERCEPTOR)
}