/*----------------------------------------------------------------------------------------------------------------------
    Yukarıdaki iki fonksiyonun basit bir karşılaştırması
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app

fun main()
{

}

fun isPrime(a: Long) : Boolean
{
    if (a <= 1)
        return false

    if (a % 2 == 0L)
        return a == 2L

    if (a % 3 == 0L)
        return a == 3L

    if (a % 5 == 0L)
        return a == 5L

    if (a % 7 == 0L)
        return a == 7L

    var i = 11L

    var count = 0L

    while (i * i <= a) {
        ++count
        if (a % i == 0L)
            return false

    }


    return true
}

fun getPrime(a: Int) : Int
{
    while (true) {



    }

}