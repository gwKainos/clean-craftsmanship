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

## 모의 객체
모의 객체 -> 스파이 -> 스텁 -> 더미 -> 테스트 대역
가짜 -> 테스트 대역

모의 객체, 스파이, 스텁, 더미, 가짜를 묶어서 테스트 대역이라고 한다.

### 더미 객체(Dummy Object)란?
- 더미 객체는 인터페이스를 구현하지만 아무 일도 하지 않는 객체입니다.
- 메서드는 null, 0, false와 같은 기본값을 반환하며, 실제 로직은 수행하지 않습니다.
- 목적: 테스트에서 특정 의존성이 필요하지만 실제로 호출되지 않는 경우 사용됩니다.
