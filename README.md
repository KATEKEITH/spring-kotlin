# 🗺️ Kotlin

```
                                          🌟 
                                          |
                    ┌─────────────────────┼─────────────────────┐
                    |                     |                     |
            📝 간결한 문법              🏗️ 클래스               🔧 함수
                    |                     |                     |
        ┌───────────┼───────────┐        |            ┌────────┼────────┐
        |           |           |        |            |        |        |
    ⭐ 기본문법   ⭐ Null안전성  ⭐ 타입검사 |        ⭐ 기본기능 ⭐ 고급기능 ⭐ 컬렉션
        |           |           |        |            |        |        |
    • fun main()    |      • is 키워드   |        • Default    |    • listOf()
    • 세미콜론 생략  |      • Smart cast  |          Parameter |    • filter()
    • var/val      |           |        |        • Named      |    • map()
                   |           |        |          Argument  |    • 확장함수
               ⭐ Safe Call    |        |                   |
                   |           |        |               ⭐ 람다    |
              • ?. operator   |        |                   |        |
              • ?: Elvis      |        |              • 일급객체   |
              • String?       |        |              • 함수형     |
              • Non-null      |        |                프로그래밍  |
                              |        |                          |
                         ⭐ 표현식     |                          |
                              |        |                          |
                         • when식     |                          |
                         • if식       |                          |
                         • try-catch식 |                          |
                                      |                          |
                              ┌───────┼───────┐                 |
                              |       |       |                 |
                          ⭐ 기본   ⭐ 상속  ⭐ Data Class      |
                              |       |       |                 |
                         • body 생략  |  • toString() 자동생성    |
                         • 생성자+필드 |  • equals() 자동생성      |
                         • getter/setter| • hashCode() 자동생성   |
                           자동생성    |  • copy() 함수           |
                         • new 생략   |  • Lombok 대체 가능      |
                                     |                          |
                                • : 콜론으로 상속              |
                                • open 키워드                  |
                                • override 강제               |
                                                              |
                                                         • Stream 없이
                                                           함수 사용
                                                         • 읽기전용/
                                                           수정가능 분리
                                                         • [] 인덱스 접근
