//val eventList = listOf(
//    Event("1", "Событие 1", "22-03-2023 08:00", "Адрес 1Адрес 1Адрес 1Адрес 1Адрес 1Адрес 1Адрес 1Адрес 1Адрес 1Адрес 1Адрес 1Адрес 1Адрес 1Адрес 1"),
//    Event("1", "Событие 2", "22-03-2023 08:00", "Адрес 2"),
//    Event("1", "Событие 3", "22-03-2023 08:00", "Адрес 3"),
//    Event("1", "Событие 4", "22-03-2023 08:00", "Адрес 4Адрес 4Адрес 4Адрес 4Адрес 4Адрес 4Адрес 4Адрес 4Адрес 4Адрес 4Адрес 4Адрес 4Адрес 4Адрес 4Адрес 4"),
//    Event("1", "Событие 5", "22-03-2023 08:00", "Адрес 5"),
//    Event("1", "Событие 6", "22-03-2023 08:00", "Адрес 6")
//)
//
//val startupList = listOf(
//    Startup("1", "startup 1", "anything1", "website"),
//    Startup("1", "startup 2", "anything2", "website"),
//    Startup("1", "startup 3", "anything3", "website"),
//    Startup("1", "startup 4", "anything4", "website"),
//    Startup("1", "startup 5", "anything5", "website"),
//)
//
//val manList = listOf(
//    Man("Человек №1", "1", listOf("room", "dram", "babababam"), "Инвестор"),
//    Man("Человек №2", "1", listOf("room", "dram", "babababam"), "Инвестор"),
//    Man("Человек №3", "1", listOf("room", "dram", "babababam"), "Инвестор"),
//    Man("Человек №4", "1", listOf("room", "dram", "babababam"), "Специалист"),
//    Man("Человек №5", "1", listOf("room", "dram", "babababam"), "Специалист"),
//    Man("Человек №6", "1", listOf("room", "dram", "babababam"), "Специалист"),
//    Man("Человек №7", "1", listOf("room", "dram", "babababam"), "Инвестор"),
//    Man("Человек №8", "1", listOf("room", "dram", "babababam"), "Инвестор"),
//    Man("Человек №9", "1", listOf("room", "dram", "babababam"), "Специалист"),
//    Man("Человек №10", "1", listOf("room", "dram", "babababam"), "Специалист"),
//    Man("Человек №11", "1", listOf("room", "dram", "babababam"), "Специалист"),
//    Man("Человек №12", "1", listOf("room", "dram", "babababam"), "Инвестор"),
//    Man("Человек №13", "1", listOf("room", "dram", "babababam"), "Инвестор"),
//)

package com.example.kazan.hardcode

import com.example.kazan.R
import com.example.kazan.data.Articles
import com.example.kazan.data.Courses
import com.example.kazan.data.Event
import com.example.kazan.data.Man
import com.example.kazan.data.Chat
import com.example.kazan.data.Startup
import com.example.kazan.data.SupportMeasures
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
val supportMeasuresList = listOf(
    SupportMeasures(
        R.drawable.rectangle_4236__4_,
        "Конкурс",
        "Лучший молодой преподаватель Казани 2023",
        "https://entepreneur.ru"
    ),
    SupportMeasures(
        R.drawable.rectangle_4236__5_,
        "Грант",
        "Программа “Старт”\n" +
                "Этап “Старт - 1”",
        "https://entepreneur.ru"
    ),
    SupportMeasures(
        R.drawable.rectangle_4236__4_,
        "Конкурс",
        "Лучший молодой преподаватель Казани 2023",
        "https://entepreneur.ru"
    ),
    SupportMeasures(
        R.drawable.rectangle_4236__5_,
        "Грант",
        "Программа “Старт”\n" +
                "Этап “Старт - 1”",
        "https://entepreneur.ru"
    )
)
val coursesList = listOf(
    Courses(
        R.drawable.group_33829,
        "22 сентября 2023",
        "Лучший молодой предприниматель Казани 2023",
        listOf(
            R.drawable.speaker1,
            R.drawable.speaker2
        ),
        "https://theBEstEntrepreneur.ru/ru/site"
    ), Courses(
        R.drawable.rectangle_4236,
        "22 сентября 2023",
        "\"ИП, ООО, самозанятый - кем стать?\"",
        listOf(
            R.drawable.speaker1,
            R.drawable.speaker2
        ),
        "https://theBEstEntrepreneur.ru/ru/site"
    ), Courses(
        R.drawable.group_33829,
        "22 сентября 2023",
        "\"ИП, ООО, самозанятый - кем стать?\"",
        listOf(
            R.drawable.speaker1,
            R.drawable.speaker2
        ),
        "https://theBEstEntrepreneur.ru/ru/site"
    ), Courses(
        R.drawable.group_33829,
        "22 сентября 2023",
        "\"ИП, ООО, самозанятый - кем стать?\"",
        listOf(
            R.drawable.speaker1,
            R.drawable.speaker2
        ),
        "https://theBEstEntrepreneur.ru/ru/site"
    ), Courses(
        R.drawable.group_33829,
        "22 сентября 2023",
        "\"ИП, ООО, самозанятый - кем стать?\"",
        listOf(
            R.drawable.speaker1,
            R.drawable.speaker2
        ),
        "https://theBEstEntrepreneur.ru/ru/site"
    )
)

val articlesList = listOf(
    Articles(
        R.drawable.group_33829,
        "22 сентября 2023 в 8:00",
        "ИП, ООО, самозанятый - кем стать?",
        listOf(
            R.drawable.speaker1,
            R.drawable.speaker2
        ),
        "https://kazandigitalweek.com/ru/site"
    ),
    Articles(
        R.drawable.group_33851,
        "22 сентября 2023 в 8:00",
        "ИП, ООО, самозанятый - кем стать?",
        listOf(
            R.drawable.speaker1,
            R.drawable.speaker2
        ),
        "https://kazandigitalweek.com/ru/site"
    ),
    Articles(
        R.drawable.group_33829,
        "22 сентября 2023 в 8:00",
        "ИП, ООО, самозанятый - кем стать?",
        listOf(
            R.drawable.speaker1,
            R.drawable.speaker2
        ),
        "https://kazandigitalweek.com/ru/site"
    ),
    Articles(
        R.drawable.group_33851,
        "22 сентября 2023 в 8:00",
        "ИП, ООО, самозанятый - кем стать?",
        listOf(
            R.drawable.speaker1,
            R.drawable.speaker2
        ),
        "https://kazandigitalweek.com/ru/site"
    ),
    Articles(
        R.drawable.group_33851,
        "22 сентября 2023 в 8:00",
        "ИП, ООО, самозанятый - кем стать?",
        listOf(
            R.drawable.speaker1,
            R.drawable.speaker2
        ),
        "https://kazandigitalweek.com/ru/site"
    )
)

val messageList = listOf(
    Chat(
        R.drawable.rectangle_4234__1_,
        "Александр Петров",
        mutableListOf(
            Triple(
                "21:50",
                "Привет) Будешь на хакатоне в этом году?",
                true
            )
        ),
        true
    ),
    Chat(
        R.drawable.rectangle_4234__2_,
        "Сергей Прутько",
        mutableListOf(
            Triple(
                "11:50",
                "Хотел задать вопрос, это..",
                false
            )
        ),
        false
    ),
    Chat(
        R.drawable.rectangle_4234__3_,
        "Марианна Иванова",
        mutableListOf(
            Triple(
                "14:50",
                "Привет. Ты с нами в коман...",
                true
            )
        ),
        false
    ),
)

val startupList = listOf(
    Startup(
        R.drawable.group_33904,
        "IQ.Academy",
        "Владимир Морозов",
        "https://iq.academy",
        "Образование",
        "О проекте",
        "Очень перспективный проект, " +
                "даем очень хорошие знания." +
                " Вкладывайте в нас деньги и вы не пожалеете!",
        "Seed",
        "56556",

        listOf(
            R.drawable.speaker1,
            R.drawable.speaker2
        ),
        true
    ),
    Startup(
        R.drawable.group_33904,
        "IQ.Academy",
        "Владимир Морозов",
        "https://iq.academy",
        "Образование",
        "О проекте",
        "Очень перспективный проект, " +
                "даем очень хорошие знания." +
                " Вкладывайте в нас деньги и вы не пожалеете!",
        "Seed",
        "56556",

        listOf(
            R.drawable.speaker1,
            R.drawable.speaker2
        ),
        true
    ),
    Startup(
        R.drawable.group_33904,
        "IQ.Academy",
        "Владимир Морозов",
        "https://iq.academy",
        "Образование",
        "О проекте",
        "Очень перспективный проект, " +
                "даем очень хорошие знания." +
                " Вкладывайте в нас деньги и вы не пожалеете!",
        "Seed",
        "56556",

        listOf(
            R.drawable.speaker1,
            R.drawable.speaker2
        ),
        true
    ),
    Startup(
        R.drawable.group_33905,
        "Карманный пароль",
        "ООО Карманные пароли",
        "https://password.ru",
        "Безопасность",
        "О проекте",
        "Очень перспективный проект, " +
                "очень надежно храним пароли." +
                " Вкладывайте в нас деньги и вы не пожалеете!",
        "Seed",
        "10000",

        listOf(
            R.drawable.speaker1,
            R.drawable.speaker2
        ),
        true
    ),
    Startup(
        R.drawable.group_33904,
        "IQ.Academy",
        "Владимир Морозов",
        "https://iq.academy",
        "Образование",
        "О проекте",
        "Очень перспективный проект, " +
                "даем очень хорошие знания." +
                " Вкладывайте в нас деньги и вы не пожалеете!",
        "Seed",
        "56556",

        listOf(
            R.drawable.speaker1,
            R.drawable.speaker2
        ),
        true
    )
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
        R.drawable.man5, IndustryInvestor.values().map { it.industry }.shuffled().take(4),
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
)
