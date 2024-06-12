plugins {
    alias(libs.plugins.androidLibrary)
}

android {
    namespace = "com.example.hero"
    compileSdk = 34

    defaultConfig {
        minSdk = 33

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation(project(":detailhero"))

    implementation(libs.recyclerview)
    implementation(libs.navigationFragment)
    implementation(libs.navigationUI)
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(project(":network"))
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    // retrofit
    implementation(libs.retrofit)
    implementation(libs.retrofitGson)
    // okhttp and logging interceptor
    implementation(libs.okhttp)
    implementation(libs.loggingInterceptor)
    // gson
    implementation(libs.gson)
}