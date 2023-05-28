package com.example.kazan.hardcode

import com.example.kazan.R
import com.example.kazan.data.Event
import com.example.kazan.data.Man
import com.example.kazan.data.Startup
import com.example.kazan.enums.FormaEvent
import com.example.kazan.enums.TypeEvent

val eventList = listOf(
    Event(
        R.drawable.event1,
        "KAZAN DIGITAL TRANSFORMATION",
        "27 мая 2023 в 9:30",
        "Технопарк в сфере высоких технологий «ИТ-парк»",
        listOf<Int>(
            R.drawable.speaker1,
            R.drawable.speaker2,
            R.drawable.speaker3,
            R.drawable.speaker4,
            R.drawable.speaker5
        ),
        TypeEvent.D.type,
        "Миссия KAZAN DIGITAL WEEK – содействие в обмене научнотехнической информацией, консолидации научно-технологических активов, способных эффективно решить задачи импортозамещения и импортоопережения, обеспечить технологический суверенитет и суверенитет данных как основу лидерства РФ в международном сотрудничестве.",
        "https://kazandigitalweek.com/ru/site",
        true
    ),
    Event(
        R.drawable.event2,
        "Kazan Digital Week 2023",
        "22 сентября 2023 в 8:00",
        "с. Большие кабаны, \n" +
                "ул.Выставочная 1, МВЦ Казань Экспо",
        listOf<Int>(
            R.drawable.speaker1,
            R.drawable.speaker2,
            R.drawable.speaker3,
            R.drawable.speaker4,
            R.drawable.speaker5
        ),
        TypeEvent.C.type,
        "Миссия KAZAN DIGITAL WEEK – содействие в обмене научнотехнической информацией, консолидации научно-технологических активов, способных эффективно решить задачи импортозамещения и импортоопережения, обеспечить технологический суверенитет и суверенитет данных как основу лидерства РФ в международном сотрудничестве.",
        "https://kazandigitalweek.com/ru/site",
        true
    ),
    Event(
        R.drawable.event1,
        "KAZAN DIGITAL TRANSFORMATION",
        "27 мая 2023 в 9:30",
        "Технопарк в сфере высоких технологий «ИТ-парк»",
        listOf<Int>(
            R.drawable.speaker1,
            R.drawable.speaker2,
            R.drawable.speaker3,
            R.drawable.speaker4,
            R.drawable.speaker5
        ),
        TypeEvent.D.type,
        "Миссия KAZAN DIGITAL WEEK – содействие в обмене научнотехнической информацией, консолидации научно-технологических активов, способных эффективно решить задачи импортозамещения и импортоопережения, обеспечить технологический суверенитет и суверенитет данных как основу лидерства РФ в международном сотрудничестве.",
        "https://kazandigitalweek.com/ru/site",
        true
    ),
    Event(
        R.drawable.event2,
        "Kazan Digital Week 2023",
        "22 сентября 2023 в 8:00",
        "с. Большие кабаны, \n" +
                "ул.Выставочная 1, МВЦ Казань Экспо",
        listOf<Int>(
            R.drawable.speaker1,
            R.drawable.speaker2,
            R.drawable.speaker3,
            R.drawable.speaker4,
            R.drawable.speaker5
        ),
        TypeEvent.C.type,
        "Миссия KAZAN DIGITAL WEEK – содействие в обмене научнотехнической информацией, консолидации научно-технологических активов, способных эффективно решить задачи импортозамещения и импортоопережения, обеспечить технологический суверенитет и суверенитет данных как основу лидерства РФ в международном сотрудничестве.",
        "https://kazandigitalweek.com/ru/site",
        true
    ), Event(
        R.drawable.event1,
        "KAZAN DIGITAL TRANSFORMATION",
        "27 мая 2023 в 9:30",
        "Технопарк в сфере высоких технологий «ИТ-парк»",
        listOf<Int>(
            R.drawable.speaker1,
            R.drawable.speaker2,
            R.drawable.speaker3,
            R.drawable.speaker4,
            R.drawable.speaker5
        ),
        TypeEvent.D.type,
        "Миссия KAZAN DIGITAL WEEK – содействие в обмене научнотехнической информацией, консолидации научно-технологических активов, способных эффективно решить задачи импортозамещения и импортоопережения, обеспечить технологический суверенитет и суверенитет данных как основу лидерства РФ в международном сотрудничестве.",
        "https://kazandigitalweek.com/ru/site",
        true
    ),
    Event(
        R.drawable.event2,
        "Kazan Digital Week 2023",
        "22 сентября 2023 в 8:00",
        "с. Большие кабаны, \n" +
                "ул.Выставочная 1, МВЦ Казань Экспо",
        listOf<Int>(
            R.drawable.speaker1,
            R.drawable.speaker2,
            R.drawable.speaker3,
            R.drawable.speaker4,
            R.drawable.speaker5
        ),
        TypeEvent.C.type,
        "Миссия KAZAN DIGITAL WEEK – содействие в обмене научнотехнической информацией, консолидации научно-технологических активов, способных эффективно решить задачи импортозамещения и импортоопережения, обеспечить технологический суверенитет и суверенитет данных как основу лидерства РФ в международном сотрудничестве.",
        "https://kazandigitalweek.com/ru/site",
        true
    )
)

val startupList = listOf(
    Startup("1", "startup 1", "anything1", "website"),
    Startup("1", "startup 2", "anything2", "website"),
    Startup("1", "startup 3", "anything3", "website"),
    Startup("1", "startup 4", "anything4", "website"),
    Startup("1", "startup 5", "anything5", "website"),
)

val manList = listOf(
    Man("Человек №1", "1", listOf("room", "dram", "babababam"), "Инвестор"),
    Man("Человек №2", "1", listOf("room", "dram", "babababam"), "Инвестор"),
    Man("Человек №3", "1", listOf("room", "dram", "babababam"), "Инвестор"),
    Man("Человек №4", "1", listOf("room", "dram", "babababam"), "Специалист"),
    Man("Человек №5", "1", listOf("room", "dram", "babababam"), "Специалист"),
    Man("Человек №6", "1", listOf("room", "dram", "babababam"), "Специалист"),
    Man("Человек №7", "1", listOf("room", "dram", "babababam"), "Инвестор"),
    Man("Человек №8", "1", listOf("room", "dram", "babababam"), "Инвестор"),
    Man("Человек №9", "1", listOf("room", "dram", "babababam"), "Специалист"),
    Man("Человек №10", "1", listOf("room", "dram", "babababam"), "Специалист"),
    Man("Человек №11", "1", listOf("room", "dram", "babababam"), "Специалист"),
    Man("Человек №12", "1", listOf("room", "dram", "babababam"), "Инвестор"),
    Man("Человек №13", "1", listOf("room", "dram", "babababam"), "Инвестор"),
)

