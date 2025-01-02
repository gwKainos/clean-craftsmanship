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

### 스텁(Stub) 객체란?
- 스텁(Stub)은 특정한 입력에 대해 미리 정해진 값(고정된 응답)을 반환하는 객체입니다.
- 실제로 기능을 수행하지 않고, 테스트에서 예측 가능한 결과를 제공하는 것이 목적입니다.
- 스텁은 더미 객체와 달리 미리 정의된 로직이 있으며, 특정 메서드가 호출되면 고정된 값을 반환하도록 설정됩니다.

### 스파이(Spy) 객체란?
- 스파이 객체는 실제로 동작하는 객체로, 메서드가 호출되면 기록(Tracking)을 남깁니다.
- 실제 동작과 호출 정보 추적이 결합된 형태로, 특정 메서드가 얼마나 호출되었는지, 어떤 인자로 호출되었는지를 검사할 수 있습니다.
- 스파이는 실제 구현체를 사용하지만, 테스트 시 호출된 이력을 기록하는 기능이 추가됩니다.

