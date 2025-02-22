package lotto.domain

class LottoVendingMachine {

    private val billSlot: BillSlot = BillSlot(LOTTO_PRICE)

    fun purchase(money: Int): List<LottoNumbers> {
        return List(billSlot.insertMoney(money)) {
            LottoNumbers.generate()
        }
    }

    companion object {
        const val LOTTO_PRICE = 1000
    }
}
