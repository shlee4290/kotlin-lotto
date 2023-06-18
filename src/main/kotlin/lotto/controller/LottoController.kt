package lotto.controller

import lotto.domain.LottoReturnCalculator
import lotto.domain.LottoVendingMachine
import lotto.view.InputView
import lotto.view.ResultView

fun main() {
    val purchasedLottos = LottoVendingMachine()
        .purchase(InputView.getPurchaseAmount())
    ResultView.printLotto(purchasedLottos)
    val lottoNumbersOfLastWeek = InputView.getLottoNumbersOfLastWeek()
    val lottoReturn = LottoReturnCalculator(purchasedLottos).calculate(lottoNumbersOfLastWeek)
    ResultView.printReturn(lottoReturn)
}
