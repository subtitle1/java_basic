# DTO와 VO
## VO (Value Object)
- VO는 value object로, Database와 밀접한 관계를 가진다.
- 값 자체를 표현하는 객체이다.
- 아래와 같은 테이블이 있다고 가정하자.

| column_name | data_type |
| --- | --- |
| BOARD_NO | NUMBER |
| BOARD_TITLE | VARCHAR2 |
| WRITER_NO | NUMBER |
| BOARD_CONTENT | VARCHAR2 |
| BOARD_DELETED | CHAR |
| BOARD_UPDATED_DATE | DATE |
| BOARD_DELETED_DATE | DATE |

```java
  public class Board {
    private int no;
    private String title;
    private int writerNo;
    private String content;
    private String deleted;
    private Date updatedDate;
    private Date deletedDate;
  }
```
- vo는 위와 같은 형태로 만들 수 있다. (DB와 같은 형태)

## DTO (Data Transfer Object)
- DTO는 data transfer object로, 데이터 교환을 위해 사용하는 객체이다.
- 데이터 교환만을 위해 사용하므로 로직을 갖지 않고, getter/setter 메소드만 갖는다.
- 특정 화면에 특화되어 있는 객체이다. (화면에 뿌리고 싶은 데이터만 객체에 저장한다)

```java
  public class BoardDto {
    private int no;
    private String title;
    private String content;
  }
```
