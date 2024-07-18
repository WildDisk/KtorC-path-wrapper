plugins {
    kotlin("jvm")
    id("maven-publish")
}

group = "ru.wilddisk"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}