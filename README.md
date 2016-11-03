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

to switch between `JUnit` and `TestNG` uncomment uncomment proper section in `pom.xml` file (by default enabled is `JUnit`).
