# Maven project template

Basic template with attached test libraries and java execution task.

To compile code:
```
mvn compile
```
to run sample code from main class:
```
 mvn compile exec:java
 ```
to run tests:
```
mvn test
```

## Libraries attached to build

Some potentially usefull libraries are attached to project. You can (but you don't have to) use them:
* Javaslang
* RxJava
* Guava
* Lombok
* Apache Commons Lang
* JUnit
* Spock Framework
* TestNg

to switch between `JUnit` and `TestNG` uncomment proper section in `pom.xml` file (by default`JUnit`is enabled).
