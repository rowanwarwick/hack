package com.example.kazan.enums

import com.example.kazan.R
import com.example.kazan.data.Event

enum class FormaEvent(event: Event) {
    A(
        Event(
            R.drawable.event1,
            "Kazan Digital Week 2023",
            "22 сентября 2023 в 8:00",
            "с. Большие кабаны, \n" +
                    "ул.Выставочная 1, МВЦ Казань Экспо",
            listOf<Int>(R.drawable.speaker1, R.drawable.speaker3),
            TypeEvent.D,
            "Миссия KAZAN DIGITAL WEEK – содействие в обмене научнотехнической информацией, консолидации научно-технологических активов, способных эффективно решить задачи импортозамещения и импортоопережения, обеспечить технологический суверенитет и суверенитет данных как основу лидерства РФ в международном сотрудничестве.",
            "https://kazandigitalweek.com/ru/site",
            true
        )
    )
}