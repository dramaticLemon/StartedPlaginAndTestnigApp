
# Cоздал проект архетип maven-archetype-quickstart:
# Added path to exetuted main Class

``` xml
<plugin>
  <artifactId>maven-jar-plugin</artifactId>
  <version>3.3.0</version>
  <configuration>
    <archive>
      <manifest>
        <mainClass>INPUT YOUR CLASS</mainClass>
      </manifest>
    </archive>
  </configuration>
</plugin>
```
```
cd target
java -jar first_testing_app-1.0-SNAPSHOT.jar
```

# Minimal pack maven plagin
``` xml
<project xmlns="http://maven.apache.org/POM/4.0.0"  
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"  
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 
         http://maven.apache.org/xsd/maven-4.0.0.xsd">  

  <modelVersion>4.0.0</modelVersion>  

  <groupId>com.example</groupId>  
  <artifactId>my-app</artifactId>  
  <version>1.0-SNAPSHOT</version>  

  <properties>
    <maven.compiler.source>17</maven.compiler.source>
    <maven.compiler.target>17</maven.compiler.target>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <junit.jupiter.version>5.13.1</junit.jupiter.version>
  </properties>

  <dependencies>
    <!-- JUnit 5 (API + Engine) -->
    <dependency>
      <groupId>org.junit.jupiter</groupId>
      <artifactId>junit-jupiter</artifactId>
      <version>${junit.jupiter.version}</version>
      <scope>test</scope>
    </dependency>
  </dependencies>

  <build>
    <plugins>
      <!-- Компилятор -->
      <plugin>
        <artifactId>maven-compiler-plugin</artifactId>
        <version>3.11.0</version>
        <configuration>
          <release>17</release>
        </configuration>
      </plugin>

      <!-- Запуск юнит-тестов -->
      <plugin>
        <artifactId>maven-surefire-plugin</artifactId>
        <version>3.2.5</version>
      </plugin>

      <!-- Сборка JAR -->
      <plugin>
        <artifactId>maven-jar-plugin</artifactId>
        <version>3.3.0</version>
      </plugin>

      <!-- Очистка (mvn clean) -->
      <plugin>
        <artifactId>maven-clean-plugin</artifactId>
        <version>3.3.1</version>
      </plugin>
    </plugins>
  </build>

</project>


```
# Для удобного запуска  mvn compile exec:java 
``` xml
<plugin>
  <groupId>org.codehaus.mojo</groupId>
  <artifactId>exec-maven-plugin</artifactId>
  <version>3.1.0</version>
  <configuration>
    <mainClass>com.example.App</mainClass>
                <arguments>
                    <argument>аргумент1</argument>
                    <argument>аргумент2</argument>
                </arguments>
    </configuration>
</plugin>
```
