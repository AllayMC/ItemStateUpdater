plugins {
    id("java")
}

group = "org.allaymc.itemstateupdater"
version = "1.0.0"

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    implementation("com.fasterxml.jackson.core:jackson-databind:2.17.2")
    implementation("com.github.AllayMC:NBT:3.0.9")

    compileOnly("org.projectlombok:lombok:1.18.34")
    annotationProcessor("org.projectlombok:lombok:1.18.34")

    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}