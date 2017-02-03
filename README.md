## Adding dependency of Espresso in the build.gradle file
1. Go to app -> build.gradle file
2. Add the following dependencies for Espresso :
 androidTestCompile 'com.android.support.test.espresso:espresso-core:2.0'
 androidTestCompile 'com.android.support.test:testing-support-lib:0.1'

## Adding dependency for Cucumber in the build.gradle file
1. Go to app -> build.gradle file
2. Add the following dependencies for Cucumber :
 androidTestCompile 'info.cukes:cucumber-android:1.2.0@jar'
 androidTestCompile 'info.cukes:cucumber-picocontainer:1.2.0'

## Adding dependency for Spoon in the build.gradle file
1. Go to app -> build.gradle file
2. Add the following dependencies for Spoon :
androidTestCompile 'com.squareup.spoon:spoon-client:1.2.0'

## For running the project JUnit runner should be added, for that in defaultConfig add :
 defaultConfig {
      testInstrumentationRunner "android.support.test.runner.AndroidJUnitRunner"
 }
