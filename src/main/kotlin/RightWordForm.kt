package ru.netology

var rightWordForm: String = ""

fun rightWordForm(): String {
    when {
        minutes == 11 || minutes == 12 || minutes == 13 || minutes == 14 -> rightWordForm = "минут назад"
        minutes == 1 || minutes % 10 == 1 -> rightWordForm = "минуту назад"
        minutes == 2 || minutes % 10 == 2 || minutes % 10 == 3 || minutes == 3 -> rightWordForm = "минуты назад"
        minutes % 10 == 4 || minutes == 4 -> rightWordForm = "минуты назад"
        else -> rightWordForm = "минут назад"
    }
    return rightWordForm
}
