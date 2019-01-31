# ChronoLogger

[![](https://jitpack.io/v/Binary-Finery/ChronoLogger.svg)](https://jitpack.io/#Binary-Finery/ChronoLogger)

- min SDK 16 (Android Jellybean 4.1)
- written in Java

A simple utility class to log execution times, typical usage:

```java
 ChronoLogger chronoLogger = new ChronoLogger(TAG);
 // do work 1
 chronoLogger.split("work 1");
 // do work 2
 chronoLogger.split("work 2");
 // do work 3
 chronoLogger.split("work 3");
 chronoLogger.dump();
```

## Installation

Add this into your root build.gradle file:

```java
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

Add the dependency to your module build.gradle:

```java
dependencies {
	implementation 'com.github.Binary-Finery:ChronoLogger:v1.0.1'
}
```
