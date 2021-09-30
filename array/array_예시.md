# Array (배열)
## 배열

- 자바에서 배열은
`int[] a;
Strint[] a;`
이렇게 표현한다.
- 정수 10개를 저장할 수 있는 배열을 생성해 a에 대입한다. 
- `a = new int[10];` or `a = new int{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};`
- 배열의 인덱스 번호는 0번부터 시작한다.

### 배열 예시1
```java
int[] numbers = new int[5];
double[] numbers2 = new double[5];
String[] names = new String[5];
```

### 배열 예시2
```java
// 새 배열 생성하기
int[] scores;

// 정수 5개를 저장하는 배열 객체를 생성하고, 그 객체의 주소값을 scores에 대입하기
scores = new int[5];

// 배열의 각 요소에 인덱스를 사용해서 값을 저장하기
scores[0] = 70; // scores 변수가 참조하는 배열객체의 0번째 요소에 70 대입
scores[1] = 65;	
scores[2] = 90;		
scores[3] = 60;		
scores[4] = 80;	

// 배열의 크기 조회하기
int size = scores.length;
System.out.println("배열 크기: " +size); // 5 출력

// 배열의 각 요소에 저장된 값을 반복문을 사용해서 조회하기
for (int i = 0; i < size; i++) {
  System.out.println(scores[i]);
}

// 향상된 for문을 사용해서 값을 조회하기
for (int score : scores) {
  System.out.println(score)
}
```

### 배열 예시3
```java
int[] scores = {60, 75, 55, 80, 100, 50, 95};
		
for (int score : scores) {
  System.out.println(score);
}
		
// 학생 이름을 포함하고 있는 배열객체 생성하기
String[] names = {"홍길동", "김유신", "강감찬", "이순신"};
		
for (String name : names) {
  System.out.println(name);
}
```

### 배열 예시4
```java
// 학생들의 성적 배열을 생성하고 전체 학생의 평균을 계산해서 출력학
int[] scores = {60, 70, 40, 70, 85, 90, 40, 100, 75, 50, 35, 90, 100, 60, 70};

// 총점, 학생수, 평균을 저장할 변수를 선언하고 초기화하기
int total = 0;
int studentCount = scores.length;
int average = 0;

for (int score : scores) {
  total += score;
}

average = total / studentCount;
```

### 배열 예시5
```java
// Scanner을 사용해서 성적을 10번 입력받아 배열에 순서대로 저장 후 총점, 평균 출력하기
import java.util.Scanner;
int[] scores = new int[5];
Scanner scan = new Scanner(System.in);
int average = 0;
int total = 0;

// 반복문을 사용해서 학생의 성적을 입력받기
for (int i = 0; i < scores.length; i++) {
  System.out.print("점수 입력: ");
  scores[i] = scan.nextInt();
}

for (int score : scores) {
  total += score;
  average = total / scores.length;
}

System.out.println("총점: " +total);
System.out.println("평균: " +average);
```

### 배열 예시6
```java
// 학생 이름, 국어, 영어, 수학 점수를 입력받아 배열에 저장하고 학생별 총점과 평균 계산하기
import java.util.Scanner;

Scanner scan = new Scanner(System.in);

// 학생 이름, 국어, 영어, 수학 점수를 저장하는 배열 생성
String[] names = new String[5];
int[] korScores = new int[5];
int[] engScores = new int[5];
int[] matScores = new int[5];

// 점수를 각각 입력받아 해당 배열에 순서대로 저장하기
for (int i = 0; i < names.length; i++) {
  System.out.print("학생 이름을 입력하세요: ");
  names[i] = scan.next();
			
  System.out.print("국어점수를 입력하세요: ");
  korScores[i] = scan.nextInt();
			
  System.out.print("영어점수를 입력하세요: ");
  engScores[i] = scan.nextInt();
			
  System.out.print("수학점수를 입력하세요: ");
  mathScores[i] = scan.nextInt();
}

// 각각 정보를 출력하기
for (int i = 0; i < names.length; i++) {
  int totalScore = korScores[i] + engScores[i] + mathScores[i];
  int average = totalScore / 3;
  System.out.println(names[i]+"\t"+korScores[i]+"\t"+engScores[i]+"\t"+mathScores[i]+"\t"+totalScore+"\t"+average);
}
```
