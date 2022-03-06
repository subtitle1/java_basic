## Stream
- stream이란 자바 8 버전부터 등장한 api로, 배열이나 콜렉션에 저장된 데이터를 처리하기 위해 도입되었다. 
- 다양한 데이터를 처리하기 위한 공통된 처리 방법을 제공한다.

## Stream Api의 특징
- 내부반복을 통해 작업을 수행한다
- 스트림은 일회성
- 원본 데이터를 변경하지 않는다 (stream()을 사용하면 원본데이터의 복사본을 사용하는 것이다)
- 쉽게 병렬처리를 지원한다

## 순서
- Stream의 생성
- 중간 연산(Stream 변환)
- 최종 연산(Stream 사용)

```java
  List<Job> jobs = jobService.getAllJobs();
  
  jobs.stream() // 스트림 생성
  .map(job -> job.getMinSalary()) // 중간 연산, job 리스트에서 최저 급여만 뽑아낸 Stream<Integer 반환
  .distinct() // 중간 연산, 중복된 정수를 제거한 Stream<Integer> 반환
  .sorted() // 중간 연산, 정렬된 Stream<Integer> 반환
  .collect(Collectors.toList()); // 최종 연산, List<Integer> 반환
```
