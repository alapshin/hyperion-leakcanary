# Hyperion LeakCanary

[Hyperion-Android][1] plugin that allows to toggle [LeakCanary][2] in runtime

[1]: https://github.com/willowtreeapps/Hyperion-Android
[2]: https://github.com/square/leakcanary/

## Usage
Add Jitpack maven repository
```
allprojects {
    repositories {
        ...
        maven { url "https://jitpack.io" }
    }
}
```

Add plugin dependency in build.gradle
```
dependencies {
    debugImplementation "com.github.alapshin:hyperion-leakcanary:$plugin_version"
    debugImplementation "com.willowtreeapps.hyperion:hyperion-core:$hyperion_version"
}
```
