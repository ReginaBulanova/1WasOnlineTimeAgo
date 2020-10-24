package ru.netology

var rightWordFormHours: String = ""

fun rightWordFormHours(): String {
    when {
        hours == 11 || hours == 12 || hours == 13 || hours == 14 -> rightWordFormHours = "часов назад"
        hours == 1 || hours % 10 == 1 -> rightWordFormHours = "час назад"
        hours == 2 || hours % 10 == 2 || hours % 10 == 3 || hours == 3 -> rightWordFormHours = "часа назад"
        hours == 4 -> rightWordFormHours = "часа назад"
        else -> rightWordFormHours = "часов назад"
    }
    return rightWordFormHours
}
