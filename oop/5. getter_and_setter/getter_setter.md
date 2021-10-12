# getter and setter
getter는 값을 조회하는 메소드이고, setter은 값을 변경하는 메소드이다.

| 작성규칙 | getter | setter |
|:----------:|:----------:|:----------:|
| **접근제한자** | public | public|
| **반환타입** | 해당 필드의 타입 | void |
|** 메소드명** | get + 필드명 | set + 필드명 |
| **매개변수** | 없음 | 해당 필드의 타입과 같은 타입의 매개변수 |

### 예시1

```java
public class Book {
    // 멤버변수 설정
    private String title;
    private String writer;
    private int price;
    
    // 생성자 설정
    public Book() {}
    public Book(String title, String writer, int price) {
    this.title = title;
    this.writer = writer;
    this.price = price;
    }

    // getter, setter 설정
    public String getTitle() {
    	return title;
    }
    
    public void setTitle(String title) {
    	this.title = title;
    }
    
    public String getWriter() {
    	return writer;
    }
    
    public void setWriter(String writer) {
    	this.writer = writer;
    }
    
    public int getPrice() {
    	return price;
    }
    
    public void setPrice(int price) {
    	this.price = price;
    }
```
### getter와 setter 추가 방법
![image](https://user-images.githubusercontent.com/87356533/136886396-8b7cb73f-e428-436b-ab5b-27a0e13982ff.png)
- getter, setter는 마우스 오른쪽 클릭->source->generate getters and setters를 통해 자동으로 추가할 수 있다.

### getter와 setter 메소드 사용법
```java
Book book1 = new Book();

book1.setTitle("자바의 정석");

System.out.println(book1.getTitle()); // 자바의 정석 출력
```
