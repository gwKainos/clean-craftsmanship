# clean-craftsmanship

## 구동 오류 수정 (Java 17 이상 필요)
Setting -> Build, Execution, Deployment -> Build Tools -> Gradle
Gradle JVM : corretto-17
```text
A problem occurred configuring root project 'clean-craftsmanship'.
> Could not resolve all artifacts for configuration ':classpath'.
> Could not resolve org.springframework.boot:spring-boot-gradle-plugin:3.4.0.
Required by:
root project : > org.springframework.boot:org.springframework.boot.gradle.plugin:3.4.0
> Dependency requires at least JVM runtime version 17. This build uses a Java 11 JVM.

* Try:
> Run this build using a Java 17 or newer JVM.
> Run with --stacktrace option to get the stack trace.
> Run with --info or --debug option to get more log output.
> Run with --scan to get full insights.
> Get more help at https://help.gradle.org.
Deprecated Gradle features were used in this build, making it incompatible with Gradle 9.0.
You can use '--warning-mode all' to show the individual deprecation warnings and determine if they come from your own scripts or plugins.
For more on this, please refer to https://docs.gradle.org/8.10/userguide/command_line_interface.html#sec:command_line_warnings in the Gradle documentation.
BUILD FAILED in 86ms
```
