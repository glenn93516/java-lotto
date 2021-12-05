# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

# 문자열 덧셈 계산기
## 요구 사항
* 쉼표(,), 또는 콜론(:)을 구분자로 갖는 문자열을 전달하는 경우 구분자 기준으로 분리한 각 숫자의 합을 반환한다
* 쉼표, 콜론 외에 커스텀 구분자를 지정할 수 있다.
  * 커스텀 구분자는 문자열 앞부분 `//`와 `\n` 사이에 위치하는 문자를 사용한다
* 숫자 이외의 값이나 음수를 전달하는 경우 `RuntimeException`을 throw한다

# 로또 (자동)
## 요구 사항
* 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급해야 한다.
  * 로또 1장의 가격은 1000원이다.
  * 발급한 로또의 번호를 콘솔에 출력한다.
  * 로또 번호는 중복되지 않아야 한다.
* 당첨 번호를 입력받을 수 있다.
* 당첨 통계를 확인할 수 있다.
  * 두 로또를 비교할 때 몇 개의 숫자가 일치하는지 비교한다
  * 3개 일치한 경우 : 5,000원 당첨
  * 4개 일치한 경우 : 50,000원 당첨
  * 5개 일치한 경우 : 1,500,000원 당첨
  * 6개 일치한 경우 : 2,000,000,000원 당첨
* 최종 수익률을 확인할 수 있다. (기준 1)
  * (총 당첨금 / 로또 구매 금액) * 100
  * 소수점 두 자리 이하는 버린다