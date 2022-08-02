import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val userNameArrays = arrayOfNulls<String>(100)
    val cardNumberArrays = arrayOfNulls<String>(100)
    val phonePaymentHistory = arrayOfNulls<String>(100)
    val moneyPhoneHistory = arrayOfNulls<Int>(100)


    println("Bone payment")


    var countArray = 0
    var countHistory = 0
    var cashback = 0

    while (true) {
        println()
        println("Cashback $cashback ")
        println("add card -> [1]")
        println("Phone payment -> [2]")
        println("Card payment->[3]")
        println("Card list->[4]")
        println("Payment history ->[5]")
        print("= ")
        val n = scanner.nextInt()

        when (n) {
            1 -> {
                print("User name write: ")
                val userName = scanner.next()
                print("Card number write: ")
                val cardNumber = scanner.next()
                if (userName.length >= 4) {
                    userNameArrays[countArray] = userName
                    cardNumberArrays[countArray] = cardNumber
                    countArray++
                    println("success ! ! !")
                } else {

                    println("name number less !!!")
                }

            }
            2 -> {

                println("Phone payment")
                print("+998 ")
                val phoneNumber = scanner.next()
                print("money : ")
                val money = scanner.nextInt()

                if (phoneNumber.length == 9 && money >= 500) {
                       cashback += money * 2 / 100

                    moneyPhoneHistory[countHistory] = money
                    phonePaymentHistory[countHistory] = phoneNumber

                    countHistory++
                    cashback++

                    println()
                    println("success ! ! !")


                } else {
                    println("phone number less or money less !!!")
                }

            }
3 ->{
    println("card  payment")
    print("8600 ")
    val CardNumber = scanner.next()
    print("money : ")
    val money = scanner.nextInt()

    if (CardNumber.length >4 && money > 500) {
        cashback += money * 2 / 100

        moneyPhoneHistory[countHistory] = money
        phonePaymentHistory[countHistory] = CardNumber

        countHistory++
        cashback++

        println()
        println("success ! ! !")


    } else {
        println("card numbers or money less`s !!!")
    }

}

        }


    }


}

