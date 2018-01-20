###Spring boot tomcat jsp 项目

- spring boot 集成 jsp页面
- spring boot 用tomcat 启动并访问jsp页面
- pom 文件的配置，支持jsp
- application.properties配置web项目结构
- git 地址 : https://github.com/opensourceteams/spring-boot_n_05-tomcat-jsp
- 视频地址 : https://www.youtube.com/watch?v=eUKVs1fTM8g

## pom.xml 文件配置

    <?xml version="1.0" encoding="UTF-8"?>
    <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
             xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
      <modelVersion>4.0.0</modelVersion>
    
      <groupId>org.springframework</groupId>
      <artifactId>spring-boot_n_05-tomcat-jsp</artifactId>
      <version>0.1.0</version>
    
      <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>1.5.9.RELEASE</version>
      </parent>
      <properties>
        <java.version>1.8</java.version>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
      </properties>
    
    
      <dependencies>
        <dependency>
          <groupId>org.springframework.boot</groupId>
          <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
          <groupId>org.springframework.boot</groupId>
          <artifactId>spring-boot-starter-test</artifactId>
          <scope>test</scope>
        </dependency>
    
    
    
    
        <dependency>
          <groupId>org.springframework</groupId>
          <artifactId>spring-test</artifactId>
          <version>4.3.2.RELEASE</version>
          <scope>test</scope>
        </dependency>
    
        <!-- Tomcat embedded container-->
        <dependency>
          <groupId>org.springframework.boot</groupId>
          <artifactId>spring-boot-starter-tomcat</artifactId>
          <!--  <scope>provided</scope>-->
        </dependency>
        <!-- JSTL for JSP -->
        <dependency>
          <groupId>javax.servlet</groupId>
          <artifactId>jstl</artifactId>
        </dependency>
    
        <!-- Need this to compile JSP -->
        <dependency>
          <groupId>org.apache.tomcat.embed</groupId>
          <artifactId>tomcat-embed-jasper</artifactId>
          <!-- <scope>provided</scope>-->
        </dependency>
    
    
      </dependencies>
    
    
      <build>
        <plugins>
          <plugin>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-maven-plugin</artifactId>
            <configuration>
              <executable>true</executable>
              <jvmArguments>-Dfile.encoding=UTF8</jvmArguments>
            </configuration>
    
          </plugin>
        </plugins>
      </build>
    
    </project>




## application.properties 配置

    spring.http.encoding.force=true
    spring.http.encoding.charset=UTF-8
    spring.http.encoding.enabled=true
    server.tomcat.uri-encoding=UTF-8
    
    spring.mvc.view.prefix=/WEB-INF/jsp/
    spring.mvc.view.suffix= .jsp
    application.message= Hello Phil

# Editor.md