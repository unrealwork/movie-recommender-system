
/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * Learn more about Gradle by exploring our samples at https://docs.gradle.org/6.8/samples
 */

plugins {
    java
    checkstyle
    jacoco
    id("org.sonarqube") version "3.4.0.2513"
    id("org.springframework.boot") version "2.7.1"
    id("io.spring.dependency-management") version "1.0.12.RELEASE"
}

object Versions {
    const val JUNIT = "5.8.2"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.jacocoTestReport {
    reports {
        xml.required.set(true)
        xml.outputLocation
            .set(File("$buildDir/reports/jacoco/test/jacoco.xml"))
    }
}

tasks.test {
    useJUnitPlatform()
}

sonarqube {
    properties {
        property("sonar.host.url", "https://sonarcloud.io")
        property("sonar.projectKey", "unrealwork_movie-recommender-system")
        property("sonar.organization", "unrealwork-github")
        property("sonar.coverage.jacoco.xmlReportPaths", "$buildDir/reports/jacoco/test/jacoco.xml")
        property("sonar.coverage.exclusions", "**/MovieRecommenderSystemApplication*")
    }
}


java {
    version = 17

}

group = "io.datajek.spring.basics"
version = "0.0.1-SNAPSHOT"
