package com.example.kazan.hardcode

import com.example.kazan.R
import com.example.kazan.data.Event
import com.example.kazan.data.Man
import com.example.kazan.data.Startup
import com.example.kazan.enums.FormaEvent
import com.example.kazan.enums.IndustryInvestor
import com.example.kazan.enums.StageInvestor
import com.example.kazan.enums.SumInvestor
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
    Man(
        "Алексей Пронягин",
        R.drawable.man1,
        listOf("Биоинженерия", "AR/VR", "Ed-Tech"),
        "Инвестор",
        "Очень богатый человек, люблю делиться деньгами с другими людьми, чтобы они развивали свои проекты и все в мире стали богачами.",
        "до 1 млн рублей",
        listOf("Pre-seed", "Seed", "Раунд А"),
        false,
        true
    ),
    Man(
        "Дарья Алексеева",
        R.drawable.man5,
        IndustryInvestor.values().map { it.industry }.shuffled().take(4),
        "Инвестор",
        "Очень богатый человек, люблю делиться деньгами с другими людьми, чтобы они развивали свои проекты и все в мире стали богачами.",
        "до 1 млн рублей",
        listOf(StageInvestor.A.stage, StageInvestor.B.stage, StageInvestor.C.stage),
        false,
        true
    ),
    Man(
        "Петр Севергин",
        R.drawable.man3,
        IndustryInvestor.values().map { it.industry }.shuffled().take(4),
        "Инвестор",
        "Очень богатый человек, люблю делиться деньгами с другими людьми, чтобы они развивали свои проекты и все в мире стали богачами.",
        "до 1 млн рублей",
        listOf(StageInvestor.A.stage, StageInvestor.B.stage, StageInvestor.C.stage),
        false,
        true
    ),
    Man(
        "Сергей Лапкис",
        R.drawable.man4,
        IndustryInvestor.values().map { it.industry }.shuffled().take(4),
        "Специалист",
        "Очень профессиональный специалист. Люблю свое дело и хочу делать мир лучше!",
        "до 1 млн рублей",
        listOf(StageInvestor.A.stage, StageInvestor.B.stage, StageInvestor.C.stage),
        false,
        isInvestor = false
    ),
    Man(
        "Александр Ивлеев",
        R.drawable.man2,
        IndustryInvestor.values().map { it.industry }.shuffled().take(4),
        "Специалист",
        "Очень профессиональный специалист. Люблю свое дело и хочу делать мир лучше!",
        "до 1 млн рублей",
        listOf(StageInvestor.A.stage, StageInvestor.B.stage, StageInvestor.C.stage),
        false,
        isInvestor = false
    ),
    Man(
        "Виталий Олешко",
        R.drawable.man1,
        IndustryInvestor.values().map { it.industry }.shuffled().take(4),
        "Специалист",
        "Очень профессиональный специалист. Люблю свое дело и хочу делать мир лучше!",
        SumInvestor.values().random().sum,
        listOf(StageInvestor.A.stage, StageInvestor.B.stage, StageInvestor.C.stage),
        false,
        isInvestor = false
    ),
    Man(
        "Иван Артемов",
        R.drawable.man1,
        IndustryInvestor.values().map { it.industry }.shuffled().take(4),
        "Инвестор",
        "Очень богатый человек, люблю делиться деньгами с другими людьми, чтобы они развивали свои проекты и все в мире стали богачами.",
        "до 1 млн рублей",
        listOf("Pre-seed", "Seed", "Раунд А"),
        false,
        true
    ),
    Man(
        "Оксана Иванова",
        R.drawable.man5,
        IndustryInvestor.values().map { it.industry }.shuffled().take(4),
        "Инвестор",
        "Очень богатый человек, люблю делиться деньгами с другими людьми, чтобы они развивали свои проекты и все в мире стали богачами.",
        "до 1 млн рублей",
        listOf(StageInvestor.A.stage, StageInvestor.B.stage, StageInvestor.C.stage),
        false,
        true
    ),
    Man(
        "Петр Горбачев",
        R.drawable.man1,
        IndustryInvestor.values().map { it.industry }.shuffled().take(4),
        "Специалист",
        "Очень профессиональный специалист. Люблю свое дело и хочу делать мир лучше!",
        SumInvestor.values().random().sum,
        listOf(StageInvestor.A.stage, StageInvestor.B.stage, StageInvestor.C.stage),
        false,
        isInvestor = false
    ),
    Man(
        "Константин Олешко",
        R.drawable.man4,
        IndustryInvestor.values().map { it.industry }.shuffled().take(4),
        "Специалист",
        "Очень профессиональный специалист. Люблю свое дело и хочу делать мир лучше!",
        SumInvestor.values().random().sum,
        listOf(StageInvestor.A.stage, StageInvestor.B.stage, StageInvestor.C.stage),
        false,
        isInvestor = false
    ),
//    Man("Человек №9", "1", listOf("room", "dram", "babababam"), "Специалист"),
//    Man("Человек №10", "1", listOf("room", "dram", "babababam"), "Специалист"),
//    Man("Человек №11", "1", listOf("room", "dram", "babababam"), "Специалист"),
//    Man("Человек №12", "1", listOf("room", "dram", "babababam"), "Инвестор"),
//    Man("Человек №13", "1", listOf("room", "dram", "babababam"), "Инвестор"),
)

