# kotlin-lotto

## step1 - 문자열 덧셈 계산기
### TO DO
- [X] 입력된 문자열에서 구분자 parsing
- [X] 주어진 구분자로 숫자 parsing
- [X] 합 구하기

### 기능 요구 사항
* 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우 구분자를 기준으로 분리한 각 숫자의 합을 반환
* 앞의 기본 구분자(쉼표, 콜론) 외에 커스텀 구분자를 지정할 수 있다. 문자열 앞부분 “//”와 “\n” 사이 위치 문자를 커스텀 구분자로 사용. (ex. “//;\n1;2;3”인 경우 구분자는 ';')
* 문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException throw

## step2 - 로또(자동)
### TO DO
- [X] 구입 금액 입력받기
- [X] 구입할 로또 개수 구하기
- [ ] 로또 발급하기
- [ ] 로또 발급 결과 출력하기
- [ ] 로또 번호 입력받기
- [ ] 당첨 통계 계산하기
  - [ ] 일치하는 숫자 개수 구하기
  - [ ] 수익률 구하기
- [ ] 결과 출력하기

### 기능 요구 사항
* 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급해야 한다.
* 로또 1장의 가격은 1000원이다.
