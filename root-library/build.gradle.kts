androidLibrary(
    packageName = "com.stepango.myapplication",
    dependencies = transitiveDeps(
        "androidx.core:core-ktx:1.3.1",
        "androidx.appcompat:appcompat:1.2.0",
        "com.google.android.material:material:1.2.0",
        "androidx.constraintlayout:constraintlayout:2.0.0"
    ),
    testDependencies = transitiveDeps(
        "junit:junit:4.13"
    ),
    androidTestDependencies = transitiveDeps(
        "androidx.test.ext:junit:1.1.1",
        "androidx.test.espresso:espresso-core:3.2.0"
    )
)