# 📒javaStudy with 남궁성의 자바의 정석
이 저장소는 자바의 정석 기초편을 학습하고 기록하며 공부한 자료를 정리하는 공간입니다. 

국비 교육 수료 후 추가 학습을 목적으로 각 챕터를 복습하였으며, 자세한 내용은 제 블로그에서 확인하실 수 있습니다.
 ✔️(https://velog.io/@soso)https://velog.io/@soso

아래 각 챕터별 소개와 간략한 설명을 적어두었습니다

----
### Chapter 1: 자바를 시작하기 전
이 장에서는 자바 프로그래밍을 시작하기 전에 필요한 기초적인 내용.

#### 자바 소개:
- 자바 언어의 역사와 특징에 대한 개요를 제공.
- 왜 자바가 널리 사용되고 있는지에 대한 이유를 설명.

#### 개발 환경 설정:
- 자바 개발을 위한 환경을 구축하는 방법을 안내.
- JDK(Java Development Kit)와 JRE(Java Runtime Environment) 설치 방법을 다룸.

🔷 자바개발도구(JDK8) 설치

[Windows] https://github.com/ojdkbuild/ojdkbuild/releases/download/java-1.8.0-openjdk-1.8.0.292-1.b10/java-1.8.0-openjdk-1.8.0.292-1.b10.ojdkbuild.windows.x86_64.zip
[Mac] SDKMAN을 이용해서 openJDK설치

SDKMAN 설치 - https://sdkman.io/install
 $ curl -s "https://get.sdkman.io" | bash
 $ source "$HOME/.sdkman/bin/sdkman-init.sh"    
SDKMAN 명령어
 $ sdk version  <--- sdkman 버전출력  
 $ sdk list java  <-- 설치 가능 & 설치된 JDK목록  
 $ sdk install java 8.0.292-zulu <--- 지정된 JDK설치(원하는 종류와 버전 지정)  
 $ sdk default java 8.0.292-zulu <--- 사용할 java버전을 변경(모든 쉘에 적용)
 $ sdk use java 8.0.292-zulu <--- 사용할 java버전을 변경(현재 쉘에만 적용)  
 $ sdk current java <--- 현재 사용중인 java버전 출력  
 $ echo $JAVA_HOME  <--- JAVA_HOME으로 지정된 경로 출력
[참고] openJDK버전별 다운로드 - https://jdk.java.net/archive/

#### 이클립스 설치 및 사용법:
- 이클립스(Java IDE)를 설치하는 방법과 설정을 안내.
- 이클립스를 사용하여 자바 프로젝트를 생성하고 관리하는 방법을 설명.

🔷 통합 개발 환경(eclipse) 설치

[Windows] https://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/2019-09/R/eclipse-jee-2019-09-R-win32-x86_64.zip
[Mac] https://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/2019-09/R/eclipse-java-2019-09-R-macosx-cocoa-x86_64.dmg&mirror_id=1273

[eclipse.ini]
-startup
../Eclipse/plugins/org.eclipse.equinox.launcher_1.5.500.v20190715-1310.jar
--launcher.library
../Eclipse/plugins/org.eclipse.equinox.launcher.cocoa.macosx.x86_64_1.1.1100.v20190907-0426
-product
org.eclipse.epp.package.java.product
-showsplash
org.eclipse.epp.package.common
--launcher.defaultAction
openFile
--launcher.defaultAction
openFile
--launcher.appendVmargs
-vm
/Users/seongnamkung/.sdkman/candidates/java/8.0.292-zulu/bin
-vmargs
-Dosgi.requiredJavaVersion=1.8
-Dosgi.instance.area.default=@user.home/eclipse-workspace
-XX:+UseG1GC
-XX:+UseStringDeduplication
--add-modules=ALL-SYSTEM
-XstartOnFirstThread
-Dorg.eclipse.swt.internal.carbon.smallFonts
-Dosgi.requiredJavaVersion=1.8
-Dosgi.dataAreaRequiresExplicitInit=true
-Xms256m
-Xmx1024m
--add-modules=ALL-SYSTEM
-Xdock:icon=../Resources/Eclipse.icns
-XstartOnFirstThread
-Dorg.eclipse.swt.internal.carbon.smallFonts

### Chapter 2: 변수
Chapter 2에서는 프로그래밍에서 가장 기본적인 요소 중 하나인 변수와 관련된 주제 설명.

#### 화면에 글자 출력:
- 자바로 화면에 텍스트를 출력하는 방법. 

#### 변수의 선언과 저장:
- 변수를 선언하고 값을 저장하는 방법.
- 다양한 데이터 유형(정수, 실수, 문자열 등)을 다루며, 변수의 사용법과 규칙을 설명.

#### 데이터 타입:
- 자바에서 사용되는 주요 데이터 타입(**int**, **double**, **String** 등)에 대해 자세히 설명 및 각 데이터 타입의 특징과 사용 사례를 다룸.

#### 변수 범위와 수명:
- 변수의 범위와 수명에 대한 개념을 소개.
- 블록 범위 변수, 전역 변수 등의 차이를 설명하고, 변수의 수명이 어떻게 관리되는지 설명.

#### 상수:
- 상수(constant)를 정의하고 사용하는 방법.
- 상수를 사용하여 값이 변경되지 않아야 하는 경우를 처리하는 방법을 설명.

#### 변수 초기화:
- 변수를 초기화하는 방법과 초기화하지 않았을 때의 동작을 설명.
- 초기화되지 않은 변수 사용에 따른 오류를 방지하기 위한 안내를 제공.
  
### Chapter 3: 연산자
Chapter 3에서는 자바 프로그래밍에서 핵심 요소 중 하나인 연산자와 연산자의 종류, 그리고 연산자의 우선순위에 대한 내용.
연산자의 중요성을 강조하며, 연산자를 올바르게 이해하고 활용하는 데 도움을 주는 내용을 다룸.

#### 연산자의 종류:
- **산술 연산자:** 덧셈, 뺄셈, 곱셈, 나눗셈 등과 같이 수학적인 계산에 사용되는 연산자를 설명.
- **비교 연산자:** 값들을 비교하고 관계를 확인하는 연산자를 다룸.
- **논리 연산자:** 논리적 조건을 평가하고 복합 조건을 만들기 위한 연산자를 설명.
- **대입 연산자:** 변수에 값을 할당하거나 수정하는 데 사용되는 연산자를 다룸.
- **기타 연산자:** 비트 연산자, 삼항 연산자 등 다양한 연산자 유형을 설명.

#### 연산자의 우선순위:
- 연산자들 간의 우선순위 규칙을 설명하고, 연산자 우선순위를 변경하기 위한 괄호 사용법을 안내.
- 우선순위에 따라 연산이 어떻게 수행되는지를 설명.
- 
### Chapter 4: 조건문과 반복문

Chapter 4에서는 프로그램의 흐름을 제어하기 위한 조건문과 반복문에 대한 내용.

#### if문:
- if문을 사용하여 조건을 검사하고, 조건이 참인 경우 특정 코드 블록을 실행하는 방법을 설명.

### if-else문:
- if-else문을 사용하여 조건에 따라 서로 다른 코드 블록을 실행하는 방법.

#### 스위치문:
- switch문을 사용하여 다중 조건 분기를 처리하는 방법을 설명.

#### 반복문 (for문, while문):
- for문을 사용하여 반복 작업을 수행하는 방법을 설명. 카운터 제어 루프와 함께 사용되며, 반복 횟수를 지정할 때 유용.
- while문을 사용하여 조건에 따라 반복 작업을 수행하는 방법. 조건을 만족하는 동안 반복하는 것.

#### break와 continue:
- break와 continue 문을 사용하여 반복문의 흐름을 제어하는 방법을 설명.

### Chapter 5: 배열

#### 배열의 선언과 생성:
배열을 선언하고 생성하는 방법을 설명. 
- 배열은 여러 데이터를 하나의 변수로 다룰 때 유용.
- 배열의 데이터 유형, 이름, 크기를 지정하는 방법.

#### 배열의 길이:
배열의 길이를 확인하는 방법을 설명.
- 배열의 길이는 배열에 포함된 요소의 개수를 나타냄.
- 배열 길이를 활용하여 반복문과 조건문에서 배열을 다루는 방법 설명.

#### 스트링 배열의 선언과 생성:
문자열 배열을 선언하고 생성하는 방법. 
- 문자열 배열은 여러 문자열을 저장하는 데 사용.
- 문자열 배열을 다루기 위한 예제 코드를 제공.

#### 2차원 배열:
2차원 배열을 선언하고 생성하는 방법을 설명. 
- 2차원 배열은 행과 열로 구성된 데이터 구조.
- 2차원 배열의 요소에 접근하고 조작하는 방법.

### Chapter 6: 객체지향 프로그래밍Ⅰ
Chapter 6에서는 객체지향 프로그래밍의 기초 개념과 객체지향 언어에서 객체의 구성요소, 객체 생성과 사용, 클래스의 정의, 클래스 변수와 인스턴스 변수에 대한 내용.
#### 객체지향 언어 소개:
- 객체지향 프로그래밍(OOP)의 개념을 소개, 객체지향 언어의 장점에대한 설명.
- OOP의 주요 특징 중 상속, 캡슐화, 다형성을 간략하게 설명.

#### 객체의 구성요소:
- 객체는 상태(속성)와 동작(메서드)으로 구성, 이 두 가지 구성요소에 대한 설명을 제공.
- 객체는 어떻게 데이터와 기능을 함께 묶어 표현하는지를 설명.

#### 객체 생성과 사용:
객체를 생성하고 사용하는 방법. 
- 클래스를 기반으로 객체를 인스턴스화하는 과정을 설명.
- 객체의 메서드를 호출하여 동작을 수행하는 방법을 제시.
- 
#### 클래스의 정의:
클래스의 정의와 클래스가 무엇인지를 설명. 
- 클래스는 객체의 템플릿 또는 청사진 역할을 함.
- 클래스의 구조와 멤버(변수와 메서드)를 정의하는 방법.

#### 클래스 변수와 인스턴스 변수:
- 클래스 변수와 인스턴스 변수에 대한 개념을 소개하고, 각각의 특징을 설명.
- 클래스 변수는 클래스 전체에서 공유되고, 인스턴스 변수는 각 객체(인스턴스)마다 별도로 존재.

#### 메서드와 메서드 호출:
- 메서드는 클래스에 정의된 동작을 나타내며, 다른 곳에서 재사용 가능한 코드 조각. 
- 메서드 호출은 해당 동작을 실행하는 프로세스.

####  생성자와 객체 초기화:
- 생성자는 객체를 만들 때 호출되며, 초기값을 설정. 
- 객체를 생성하면 해당 클래스의 생성자가 자동으로 호출되어 초기화 작업을 수행.

### Chapter 7: 객체지향 프로그래밍Ⅱ
Chapter 7에서는 객체지향 프로그래밍의 고급 주제를 다루는 내용.
#### 상속(Inheritance):

- 상속 개념 소개: 하위 클래스가 상위 클래스의 특성과 동작을 상속받는 것.
- 상속을 통해 코드 재사용과 계층적 구조를 만드는 방법을 설명.
#### 오버라이딩(Overriding):
- 메서드 오버라이딩 개념 소개: 하위 클래스에서 상위 클래스의 메서드를 재정의하는 것.
- 다형성을 구현하고 하위 클래스에서 부모 클래스의 메서드를 수정하는 방법을 다룸.

#### 패키지(Packages):
- 패키지의 개념과 사용법을 설명: 관련된 클래스들을 그룹화하는 방법.
- 클래스 관리와 이름 충돌 방지를 위해 패키지를 활용하는 방법을 다룸.
- 
#### 접근 제어자(Access Modifiers):

- 접근 제어자의 역할과 종류 소개: public, private, protected 등.
- 클래스 내부와 외부에서의 접근 권한을 제어하는 방법을 설명.
#### 추상 클래스(Abstract Classes):

- 추상 클래스 개념과 활용법을 다룸: 추상 메서드를 포함한 클래스.
- 추상 클래스를 상속하고 구체적인 동작을 구현하는 방법을 설명.
 
#### 인터페이스(Interfaces):
- 인터페이스의 역할과 구현 방법 소개: 다중 상속을 지원하는 추상 형식.
- 인터페이스를 구현하고 클래스에서 인터페이스 메서드를 정의하는 방법을 다룸.
 
#### 내부 클래스(Inner Classes):

- 내부 클래스의 개념과 종류 소개: 클래스 내부에 정의된 클래스.
- 내부 클래스를 사용하여 캡슐화와 구현 세부 사항을 숨기는 방법을 다룸.
  
### Chapter 8: 예외처리
Chapter 8에서는 예외처리와 관련된 주제 다룸.
#### 예외처리 (Exception Handling):
- 예외처리의 개념과 중요성 소개.
- 프로그램 실행 중에 발생할 수 있는 예외 상황에 대한 대비 방법 설명.
#### try-catch문:
- try와 catch 블록을 사용하여 예외 처리 방법을 다룸.
- 예외가 발생할 경우 어떻게 대응해야 하는지 설명.
#### 예외 발생시키기:
- 개발자가 직접 예외를 발생시키는 방법을 소개.
- 사용자 정의 예외 클래스를 생성하고 예외를 발생시키는 방법 설명.

#### 메서드 예외 선언:
- 메서드가 어떤 예외를 던질 수 있는지 선언하는 방법을 다룸.
- 메서드에서 예외 처리를 하지 않고 호출한 곳으로 예외를 전파하는 방법 설명.

#### finally 블록:
- try-catch 블록 다음에 finally 블록을 사용하여 특정 코드를 항상 실행하는 방법을 설명. 
- 이는 예외가 발생하든 발생하지 않든 실행되어야 하는 코드를 작성할 때 유용.

### Chapter 9: java.lang패키지와 유용한 클래스
Chapter 9에서는 자바의 java.lang 패키지와 몇 가지 유용한 클래스에 대한 핵심 내용을 다룸.

#### Object 클래스:
- 모든 클래스의 부모인 Object 클래스에 대한 개념 소개.
- Object 클래스의 기본 메서드(equals(), hashCode(), toString())의 역할과 사용법 설명.
#### String 클래스:
- 문자열을 다루는데 사용되는 String 클래스에 대한 소개.
- 문자열 생성, 연결, 비교, 검색 등의 작업을 수행하는 방법과 주요 메서드 설명.

#### Wrapper 클래스: 
- 기본 데이터 타입(int, double 등)을 객체로 래핑한 Wrapper 클래스에 대한 설명.
- 예를 들어, Integer, Double, Boolean 등.

#### 날짜와 시간 처리: 
- 날짜와 시간을 다루는 Date 클래스와 SimpleDateFormat 클래스에 대한 소개.
- 날짜 형식 지정과 파싱, 시간 계산 등을 다룸.

#### Collections Framework: 
- java.util 패키지에서 제공하는 컬렉션 프레임워크에 대한 개요.
- 리스트, 세트, 맵 등의 자료구조를 사용하는 방법 설명.

#### 예외 클래스: 
- 자주 사용되는 예외 클래스인 NullPointerException, IllegalArgumentException, NumberFormatException 등을 다루며, 예외 처리 방법 설명.
  
### Chapter 10: 날짜와 시간 & 형식화
Chapter 10에서는 날짜와 시간 처리, Calendar 클래스, 그리고 형식화와 관련된 주요 주제를 다룸.

#### 날짜와 시간 (Date and Time):
- 자바에서 날짜와 시간을 다루는 중요성에 대한 개념 소개.
- **java.util.Date** 클래스와 **java.sql.Date** 클래스를 사용하여 날짜와 시간을 다루는 방법 설명.
#### Calendar 클래스:
- Calendar 클래스를 사용하여 날짜와 시간을 계산하고 조작하는 방법을 다룹니다. 예를 들어, 년, 월, 일 등을 조작하는 방법을 설명.
#### 형식화 클래스 (Formatting Classes):
- 날짜와 숫자를 형식화하고 파싱하는 클래스에 대한 개념 소개.

### Chapter 11: 컬렉션 프레임워크
Chapter 11에서는 Java의 컬렉션 프레임워크에 대한 핵심 내용.

#### 컬렉션 프레임워크 (Collection Framework):
- 컬렉션 프레임워크의 개념 소개와 중요성에 대한 이해.
- 컬렉션 프레임워크의 목적과 공통 인터페이스를 설명합니다.
#### 컬렉션 프레임워크의 핵심 인터페이스:
- **List**, **Set**, **Map** 등의 주요 인터페이스에 대한 설명.
- 각 인터페이스의 특징과 사용 사례를 다룸.
  
#### ArrayList와 LinkedList:
- ArrayList와 LinkedList 클래스를 사용하여 목록을 다루는 방법을 설명.
- 목록에 요소 추가, 제거, 검색, 반복 등을 수행하는 방법을 다룸.
  
#### Stack과 Queue:
- Stack과 Queue 인터페이스와 구현체에 대한 소개.
- 스택과 큐 자료구조의 사용 사례와 기본 동작 방법을 다룹니다.

#### Map과 Iterator:
- Map 인터페이스와 Iterator 인터페이스에 대한 개념 소개.
- 키-값 쌍을 사용하는 맵과 반복자를 사용하여 컬렉션 요소를 순회하는 방법 설명.

#### HashSet와 TreeSet:
- HashSet와 TreeSet 클래스를 사용하여 집합을 다루는 방법을 설명.
- 중복 요소를 허용하지 않는 집합 자료구조의 사용 사례와 동작 방법을 다룸.

#### 이진 탐색 트리:
- 이진 탐색 트리(Binary Search Tree, BST)에 대한 소개.
- BST의 개념과 특징, 데이터 삽입 및 검색 방법을 다룸.

### Chapter 12: 지네릭스, 열거형, 애너테이션

Chapter 12에서는 지네릭스(Generics), 열거형(Enum), 그리고 애너테이션(Annotation)에 대한 주요 내용.
 이러한 기능들은 자바 프로그래밍을 보다 효율적이고 안전하게 만들어주고, 코드 문서화와 관련된 정보를 추가하는 데 유용 함.

#### 지네릭스 (Generics):
- 지네릭스의 개념 소개: 제네릭 프로그래밍을 통해 타입 안전성을 확보하는 방법을 설명.
- 제네릭 클래스와 메서드 작성, 타입 파라미터의 활용, 와일드카드와 상한/하한 제한 등을 다룸.

#### 열거형 (Enum):
- 열거형(Enumeration)의 개념 소개: 열거형 상수와 열거형 클래스의 생성 방법을 설명.
- 열거형을 사용하여 제한된 값 집합을 나타내고 다루는 방법을 다룸.

#### 애너테이션 (Annotation):
- 애너테이션의 개념 소개: 애너테이션의 역할과 사용 사례에 대한 이해를 제공.
- 빌트인 애너테이션(@Override, @Deprecated 등)과 사용자 정의 애너테이션 작성 방법을 다룸.

### Chapter 13: 쓰레드

Chapter 13에서는 프로세스와 쓰레드, 멀티쓰레딩의 장단점, 쓰레드의 생명주기와 주요 메서드, 그리고 쓰레드의 동기화에 대한 주요 내용을 다룸.

#### 프로세스와 쓰레드:
- 프로세스와 쓰레드의 개념과 차이점에 대한 소개.
- 멀티쓰레딩을 사용하여 여러 작업을 동시에 처리하는 이점과 한계 설명.
#### 멀티쓰레딩의 장단점:
- 멀티쓰레딩의 장점과 단점에 대한 논의.
- 병렬 처리, 빠른 응답 시간, 자원 공유, 동기화 문제 등을 다루며, 언제 멀티쓰레딩을 사용해야 하는지 설명.

#### 쓰레드의 생명주기와 주요 메서드:
- 쓰레드의 생명주기(생성, 실행, 대기, 종료)와 각 단계에서 사용되는 주요 메서드 설명.
- **start()**, **run()**, **sleep()**, **interrupt()**, **suspend()**, **resume()**, **stop()**, **join()**, **yield()** 등의 메서드와 사용 사례 다룸.
 
#### 쓰레드의 우선순위:
- 쓰레드 우선순위 개념 소개: 쓰레드 스케줄링과 우선순위 부여 방법 설명.

#### 쓰레드의 동기화:
- 쓰레드 간의 공유 데이터와 동기화의 필요성에 대한 이해.
- 동기화 메커니즘과 synchronized 키워드를 사용하여 쓰레드 간의 경쟁 상황을 제어하는 방법을 다룸.
 
### Chapter 14: 람다와 스트림
Chapter 14에서는 람다식(Lambda Expression), 스트림(Stream), 그리고 스트림의 특징, 연산, 그리고 Optional<T> 클래스, collect() 메서드와 Collectors 클래스에 대한 핵심 내용을 다룸.

#### 람다식 (Lambda Expression):
- 람다식의 개념과 장점에 대한 소개.
- 람다식을 사용하여 익명 함수를 정의하고 전달하는 방법 설명.

#### 스트림 (Stream):
- 스트림의 개념과 사용 사례 소개.
- 스트림을 사용하여 데이터 컬렉션을 처리하고 변환하는 방법을 다룸.

#### 스트림의 특징:
- 스트림의 특성(커달리어서 실행, 한 번 소비, 중간 및 최종 연산 등) 설명.
- 병렬 처리를 통한 성능 향상을 위한 스트림 활용 방법을 다룸.

#### 스트림의 연산:
- 스트림 연산(필터링, 매핑, 정렬, 그룹화 등)과 각 연산의 역할 및 사용법 설명.

#### Optional<T>:
- Optional<T> 클래스를 사용하여 값의 존재 여부를 다루는 방법과 null을 피하는 방법 설명.

#### collect()와 Collectors:
- collect() 메서드와 Collectors 클래스를 사용하여 스트림 요소를 수집하고 그룹화하는 방법을 다룸.

### Chapter 15: 입출력 I/O
Chapter 15에서는 입출력(I/O)과 스트림(Stream)에 관한 주요 내용.
입출력 처리와 스트림, 바이트 및 문자 기반 입출력, 표준 입출력, 직렬화 등 입출력에 관련된 중요한 개념과 기능을 다룸.

#### 입출력(I/O)과 스트림:
- 입출력(I/O)의 개념과 중요성에 대한 소개.
- 스트림을 통한 데이터의 입출력 처리 방법 설명.

#### InputStream과 OutputStream:
- **InputStream**과 **OutputStream** 클래스를 사용하여 바이트 기반 입출력을 다룸.
- 데이터를 바이트 단위로 읽고 쓰는 방법을 설명.

#### PrintStream:
- **PrintStream** 클래스를 사용하여 텍스트 출력을 다룸.
- 표준 출력, 파일 출력, 문자열 출력 등을 다루며, 포맷팅과 함께 사용하는 방법을 설명.

#### 문자 기반 스트림 - Reader와 Writer:
- **Reader**와 **Writer** 클래스를 사용하여 문자 기반 입출력을 다룸.
- 문자 데이터를 문자 단위로 읽고 쓰는 방법을 설명.

#### StringReader와 StringWriter:
- **StringReader**와 **StringWriter** 클래스를 사용하여 문자열을 스트림으로 처리하는 방법을 다룸.

#### BufferedReader와 BufferedWriter:
- **BufferedReader**와 **BufferedWriter** 클래스를 사용하여 버퍼를 활용하여 효율적인 입출력을 다룸.

#### 표준 입출력(Standard I/O):
- 표준 입력과 표준 출력을 다루며, 키보드로부터 입력을 받고 화면에 출력하는 방법을 설명.

#### 직렬화(Serialization)와 ObjectInputStream, ObjectOutputStream:
- 객체 직렬화와 역직렬화의 개념과 사용법에 대한 소개.
- **ObjectInputStream**과 **ObjectOutputStream** 클래스를 사용하여 객체를 파일로 저장하고 읽는 방법을 다룸.

### 📌 자세한 내용은 남궁성 저자님의 깃허브 페이지를 참조해주세요 https://github.com/castello/javajungsuk_basic

