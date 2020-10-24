package ru.netology

fun agoToText(lastSeenActive: Int) {
    when (lastSeenActive) {
        in 1..60 -> print("был в сети только что")
        in 61..60 * 60 -> print("был(a) в сети $minutes " + rightWordForm())
        in 60 * 60 + 1..24 * 60 * 60 -> print("был(a) в сети $hours " + rightWordFormHours())
        in 24 * 60 * 60..2 * (24 * 60 * 60) -> print("был(a) в сети сегодня")
        in 2 * (24 * 60 * 60)..3 * (24 * 60 * 60) -> print("был(a) в сети вчера")
        else -> print("Был(a) в сети давно")
    }
}


