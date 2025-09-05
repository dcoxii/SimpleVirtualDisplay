plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.dcoxii.virtualdisplay"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.kangrio.virtualdisplay"
        minSdk = 28
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        signingConfig = signingConfigs.getByName("debug")
    }

        buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
        }
    }
    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_9_0
        targetCompatibility JavaVersion.VERSION_1_9_0
    }
    kotlinOptions {
        jvmTarget = '1.9.0'
    }

    viewBinding {
        enabled = true
    }
}

dependencies {
    implementation 'androidx.core:core-ktx:1.9.0'
    implementation 'androidx.appcompat:appcompat:1.6.0'
    implementation 'com.google.android.material:material:1.8.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.4'

    // Kotlin Coroutine
    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.1'
    implementation 'androidx.core:core-ktx:+'

    def lifecycle_version = "2.5.1"
    implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version"
    implementation "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version"
}
