plugins {
	java
	id("org.springframework.boot") version "3.4.5"
	id("io.spring.dependency-management") version "1.1.6"
	id("io.swagger.core.v3.swagger-gradle-plugin") version "2.2.27"
}

group = "de.allangrunert"
version = "0.0.1-SNAPSHOT"

java {
	
	toolchain {
		languageVersion = JavaLanguageVersion.of(22)
	}
}

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-web-services")

	implementation("org.springframework.boot:spring-boot-starter-mail")

	implementation("io.springfox:springfox-boot-starter:3.0.0")
	developmentOnly("org.springframework.boot:spring-boot-devtools")
	developmentOnly("org.springframework.boot:spring-boot-docker-compose")

	// Security
	implementation("org.springframework.boot:spring-boot-starter-security")
	implementation("org.springframework.session:spring-session-jdbc")
	implementation("org.springframework.boot:spring-boot-starter-data-ldap")
	implementation("org.springframework.boot:spring-boot-starter-oauth2-client")

	// JWT
	implementation("io.jsonwebtoken:jjwt-api:0.12.6")
    runtimeOnly("io.jsonwebtoken:jjwt-impl:0.12.6")
    runtimeOnly("io.jsonwebtoken:jjwt-jackson:0.12.6")
	implementation("org.apache.commons:commons-lang3")

	implementation("org.openpnp:opencv:4.9.0-0")

	// Databases
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-jdbc")
	runtimeOnly("com.microsoft.sqlserver:mssql-jdbc")
	runtimeOnly("com.mysql:mysql-connector-j")
	runtimeOnly("org.postgresql:postgresql")
	runtimeOnly("com.h2database:h2")

	// Lombock
	annotationProcessor("org.projectlombok:lombok")
	compileOnly("org.projectlombok:lombok")

	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.springframework.security:spring-security-test")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
