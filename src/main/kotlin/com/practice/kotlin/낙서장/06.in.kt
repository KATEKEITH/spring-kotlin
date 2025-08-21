// Kotlin 에서는 in 키워드를 사용하여 값이 어떤 범위에 포함되는지 편리하게 검사 가능합니다.
// 항상 범위에 대한 검사를 하기 위해 >=, <= 연산자를 사용했는데, in 키워드로 한 번에 해결 가능합니다 😊

// kotlin
val num = 6
print(num in 5..10) // true

// java
int num = 6;
System.out.println(5 <= num && num <= 10); // true