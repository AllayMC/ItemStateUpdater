plugins {
    id("java-library")
    id("maven-publish")
}

version = "1.21.0-SNAPSHOT"
group = "org.allaymc"
description = "Updates Minecraft: Bedrock Edition item states to the latest revision"

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

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
            pom {
                name.set("item-state-updater")
                packaging = "jar"
                description.set("Updates Minecraft: Bedrock Edition item states to the latest revision")
                url.set("https://github.com/AllayMC/NBT")

                scm {
                    connection.set("scm:git:git://github.com/AllayMC/ItemStateUpdater.git")
                    developerConnection.set("scm:git:ssh:/github.com/AllayMC/ItemStateUpdater.git")
                    url.set("https://github.com/AllayMC/NBT")
                }

                licenses {
                    license {
                        name.set("GNU GENERAL PUBLIC LICENSE, Version 3, 29 June 2007")
                        url.set("https://www.gnu.org/licenses/gpl-3.0.en.html#license-text")
                    }
                }

                developers {
                    developer {
                        name.set("CloudburstMC Team")
                        organization.set("CloudburstMC")
                        organizationUrl.set("https://github.com/CloudburstMC")
                    }
                    developer {
                        name.set("AllayMC Team")
                        organization.set("AllayMC")
                        organizationUrl.set("https://github.com/AllayMC")
                    }
                }
            }
        }
    }
}

tasks {
    compileJava {
        options.encoding = Charsets.UTF_8.name()
    }
    test {
        useJUnitPlatform()
    }
}