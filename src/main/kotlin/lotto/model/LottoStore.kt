package lotto.model

class LottoStore(private val price: Money = Money(1000)) {
    fun buy(money: Money): LottoTickets {
        val ticketCount = money.dividedBy(price).toInt()

        return LottoTickets.issue(ticketCount)
    }
}