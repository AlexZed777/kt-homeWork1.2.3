fun main() {
    val standDiscont = 100.00
    val extendDiscont = 0.05
    val regularUserDiscont = 0.01

    val regularUser = true
    val previousAmount = 11_111.00

    val amount = 100.00
    val discontSum = if (previousAmount >= 1001.00 && previousAmount <= 10_000.00) {
        standDiscont
    } else if (previousAmount > 10_000.00) {
        amount * extendDiscont
    } else {
        0.00
    }
    val regularUserDiscontSum = if (regularUser) {
        (amount - discontSum) * regularUserDiscont
    } else {
        0.00
    }
    val totalSum = amount - discontSum - regularUserDiscontSum
    println("Сумма покупок с учетом скидок: $totalSum")
    println("Сумма скидки: ${discontSum + regularUserDiscontSum}")

}