# ChronoLogger

[![](https://jitpack.io/v/Binary-Finery/ChronoLogger.svg)](https://jitpack.io/#Binary-Finery/ChronoLogger)

- min SDK 16 (Android Jellybean 4.1)
- written in Java

A simple utility class to log execution times, typical usage:

```java
 ChronoLogger chronoLogger = new ChronoLogger(TAG, LABEL);
        // do work 1
        chronoLogger.split("work 1");
        // do work 2
        chronoLogger.split("work 2");
        // do work 3
        chronoLogger.split("work 3");
        chronoLogger.dump();
```
