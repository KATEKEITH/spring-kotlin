package com.practice.kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinApplication

// # 프로그램 진입점 ⭐️⭐️⭐️
// Java 에서는 public static void main(String[] args) 메서드를 사용하여 프로그램을 실행
// Kotlin 에서는 fun main() 함수를 사용하여 프로그램을 실행
fun main(args: Array<String>) {
	runApplication<KotlinApplication>(*args)
}
