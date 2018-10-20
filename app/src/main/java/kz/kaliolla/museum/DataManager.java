package kz.kaliolla.museum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kz.kaliolla.museum.model.Record;

public class DataManager {
    private static Map<String, Record> store = new HashMap<>();
    private static List<Record> history = new ArrayList<>();

    static {
        initStore();
    }

    public static Record getRecored(String qr){
        return store.get(qr);
    }

    public static void addToHistory(Record record){
        history.add(record);
    }

    public static List<Record> getHistory(){
        return new ArrayList<>(history);
    }

    private static void initStore() {
        store.put("https://museum.kz/id=1", new Record(1, "https://museum.kz/id=1",
                        "Мамонт",
                        "Ма́монты — вымерший род млекопитающих, живших в четвертичном периоде, из семейства слоновых. Достигали высоты 5,5 метров и массы тела 10—12 тонн. ",
                        "Ма́монты (лат. Mammuthus) — вымерший род млекопитающих, живших в четвертичном периоде, из семейства слоновых. Достигали высоты 5,5 метров и массы тела 10—12 тонн. Таким образом, мамонты были в два раза тяжелее самых крупных современных наземных млекопитающих — африканских слонов.\n"+
                                "Фенотип\n" +
                                "Мамонты появились ок.1,6 млн лет назад (в плейстоцене) и вымерли примерно 10 тысяч лет назад; обитали в Европе, Азии, Африке и Северной Америке[1]. Найдены многочисленные кости мамонтов в стоянках древнего человека каменного века; обнаружены также рисунки и скульптуры мамонтов, сделанные доисторическим человеком. В Сибири и на Аляске известны случаи нахождения трупов мамонтов, сохранившихся благодаря пребыванию их в толще многолетней мерзлоты. Основные виды мамонтов по размерам не превосходили современных слонов, но при этом североамериканский подвид Mammuthus imperator достигал высоты 5 метров и массы 12 тонн, а карликовые виды Mammuthus exilis и Mammuthus lamarmorae не превышали 2 метра в высоту и были массой до 900 кг.\n" +
                                "\n" +
                                "Мамонты были отлично приспособлены к жизни в суровых условиях холодного климата.\n" +
                                "\n" +
                                "В сравнении с современными слонами, обладали более массивным туловищем (см. Правило Бергмана), более короткими ногами, длинной шерстью, меньшего размера ушами (см. Правило Аллена) и длинными изогнутыми бивнями; последние могли служить мамонту для добывания пищи в зимнее время из-под снега. Коренные зубы мамонта с многочисленными тонкими дентино-эмалевыми пластинами были хорошо приспособлены для пережёвывания грубого растительного корма.\n" +
                                "\n" +
                                "Хобот на конце имел поперечное расширение, которое, предположительно, служило для разгребания снега, предотвращения обморожения хобота, а также для употребления снега для утоления жажды[2]. Кончик хобота у мамонтов был безволосый, что говорит о его использовании в добыче пищи.\n" +
                                "\n" +
                                "На спине наиболее северных видов располагался горб, который, как считалось ранее, образовывался удлинёнными остистыми отростками позвонков. Более поздние находки, однако, показали, что в горбу мамонта нет больших отростков. Зато, подобно верблюдам, там мамонты накапливали мощные запасы жира\n",
                        Arrays.asList(
                                "https://www.google.ru/imgres?imgurl=http%3A%2F%2Fimage.subscribe.ru%2Flist%2Fdigest%2Fanimals%2Fim_20131018164933_20512.jpg&imgrefurl=https%3A%2F%2Fsubscribe.ru%2Fdigest%2Fanimals%2Fexotic%2Fn899352.html&docid=o_OL4pSLII-dFM&tbnid=7L9eMl7JRa2o6M%3A&vet=10ahUKEwiT_M2_-pTeAhUOxIsKHd2lBqsQMwiRASgBMAE..i&w=300&h=150&itg=1&bih=929&biw=1920&q=%D0%9C%D0%B0%D0%BC%D0%BE%D0%BD%D1%82&ved=0ahUKEwiT_M2_-pTeAhUOxIsKHd2lBqsQMwiRASgBMAE&iact=mrc&uact=8",
                                "https://www.google.ru/imgres?imgurl=https%3A%2F%2Fdiscover24.ru%2Fwp-content%2Fuploads%2F2016%2F09%2FWoolly_mammoth-300x150.jpg&imgrefurl=https%3A%2F%2Fdiscover24.ru%2F2016%2F09%2Fvechnaya-merzlota-zapolyarnoj-tundry-xranit-bolee-150-millionov-mertvyx-tush-mamontov%2F&docid=qsEOQIhM8VvclM&tbnid=gEOUBroL825cIM%3A&vet=10ahUKEwiT_M2_-pTeAhUOxIsKHd2lBqsQMwiTASgDMAM..i&w=300&h=150&itg=1&bih=929&biw=1920&q=%D0%9C%D0%B0%D0%BC%D0%BE%D0%BD%D1%82&ved=0ahUKEwiT_M2_-pTeAhUOxIsKHd2lBqsQMwiTASgDMAM&iact=mrc&uact=8",
                                "https://www.google.ru/imgres?imgurl=http%3A%2F%2Fimage.subscribe.ru%2Flist%2Fdigest%2Fwoman%2F12av31.jpg&imgrefurl=http%3A%2F%2Ffunjoke.ru%2F2014%2F01%2F21%2Fmest-mamontov%2F&docid=jRgW_cMMTVwUtM&tbnid=4kec73SbeFNzYM%3A&vet=10ahUKEwiT_M2_-pTeAhUOxIsKHd2lBqsQMwiUASgEMAQ..i&w=300&h=150&itg=1&bih=929&biw=1920&q=%D0%9C%D0%B0%D0%BC%D0%BE%D0%BD%D1%82&ved=0ahUKEwiT_M2_-pTeAhUOxIsKHd2lBqsQMwiUASgEMAQ&iact=mrc&uact=8",
                                "https://www.google.ru/imgres?imgurl=http%3A%2F%2Fi.family.booknik.ru%2F_img%2F263-258.jpg&imgrefurl=http%3A%2F%2Ffamily.booknik.ru%2Farticles%2Fafisha%2Fbudet-den-budet-belka%2F&docid=741-PDFS5PVFFM&tbnid=Sm26zNdN4hDE_M%3A&vet=10ahUKEwiT_M2_-pTeAhUOxIsKHd2lBqsQMwiVASgFMAU..i&w=300&h=150&bih=929&biw=1920&q=%D0%9C%D0%B0%D0%BC%D0%BE%D0%BD%D1%82&ved=0ahUKEwiT_M2_-pTeAhUOxIsKHd2lBqsQMwiVASgFMAU&iact=mrc&uact=8"
                        )
                )
        );

        store.put("https://museum.kz/id=2", new Record(2, "https://museum.kz/id=2",
                        "Тираннозавр",
                        "Тиранноза́вр — монотипический род плотоядных динозавров из группы целурозавров подотряда тероподов, включающий единственный валидный вид — Tyrannosaurus rex.",
                        "Тиранноза́вр[2] (лат. Tyrannosaurus — «ящер-тиран», от др.-греч. τύραννος [tyrannos] — «тиран» и σαῦρος [sauros] — «ящер, ящерица»[3], также встречается неправильное написание тираноза́вр[4]) — монотипический род плотоядных динозавров из группы целурозавров подотряда тероподов, включающий единственный валидный вид — Tyrannosaurus rex (лат. rex — «царь»). Обитал в западной части Северной Америки, которая в те времена представляла собой остров Ларамидию, и был наиболее распространённым из тираннозавридов. Окаменелые останки тираннозавров находят в различных геологических формациях, датирующихся маастрихтским веком мелового периода, около 67—65,5 миллионов лет назад[5]. Был одним из последних ящеротазовых динозавров, существовавших перед катаклизмом, положившим конец эре динозавров (мел-палеогеновым вымиранием).\n" +
                                "\n" +
                                "Как и другие представители своего семейства, тираннозавр был двуногим хищником с массивным черепом, который уравновешивался длинным, тяжёлым и жёстким хвостом. По сравнению с большими и мощными задними конечностями этого ящера его передние лапы были совсем небольшими, но необыкновенно могучими для своего размера, и имели два когтистых пальца. Является крупнейшим видом своего семейства, одним из самых больших представителей тероподов и одним из самых крупных наземных хищников за всю историю Земли. Крупнейший из известных полных скелетов этого динозавра имеет длину 12,3 метра[6], высоту до бедра — 4 метра[7], а масса этой особи по оценкам экспертов при жизни достигала примерно 9,5 тонн[6]. Как самое большое плотоядное в своей экосистеме, тираннозавр, скорее всего, был сверххищником и охотился на гадрозавров, цератопсов и, возможно, даже на зауроподов[8], хотя некоторые исследователи предполагают, что питался он преимущественно падалью. Более того, спор о том, являлся ли тираннозавр полноценным охотником и сверххищником либо падальщиком, был одним из самых напряжённых и затяжных в истории палеонтологии. Сейчас большинство специалистов считает, что тираннозавр был хищником-оппортунистом — мог как охотиться, так и питаться падалью[9].\n" +
                                "\n" +
                                "В общей сложности было идентифицировано более 30 скелетов тираннозавров, некоторые из них сохранились почти полностью. Изобилие материала позволило провести углублённые исследования многих аспектов биологии этого животного, включая жизненную историю и даже биомеханику. Особенности питания, физиология и скорость движения — это только немногие из предметов научных споров. Таксономия этого рода также является предметом дискуссий — к примеру, некоторые специалисты относят к нему только один вид (T. rex), а некоторые включают в этот род и тарбозавра, известного из меловых отложений Монголии. Иногда с тираннозавром синонимизируют и некоторые роды североамериканских тираннозавридов. Тираннозавр обрёл большую известность в популярной культуре в качестве свирепого хищника после успеха фильма «Парк юрского периода».",
                        Arrays.asList(
                                "https://www.google.ru/imgres?imgurl=https%3A%2F%2Fwww.ammonit.ru%2Fupload%2Fnews%2F70.jpg&imgrefurl=https%3A%2F%2Fwww.ammonit.ru%2Fnew%2F70.htm&docid=338T8XuGTo34hM&tbnid=K67_uozilw_O-M%3A&vet=10ahUKEwiimOfO-ZTeAhWRlosKHZF9AmEQMwgtKAAwAA..i&w=300&h=150&bih=929&biw=1920&q=%D0%A2%D0%B8%D1%80%D0%B0%D0%BD%D0%BD%D0%BE%D0%B7%D0%B0%D0%B2%D1%80&ved=0ahUKEwiimOfO-ZTeAhWRlosKHZF9AmEQMwgtKAAwAA&iact=mrc&uact=8",
                                "https://www.google.ru/imgres?imgurl=http%3A%2F%2Fdinozavry.tcoa.ru%2Fsrc%2Fimages%2Ftriasovyi_period%2Fmuszavr.GIF&imgrefurl=http%3A%2F%2Fdinozavry.tcoa.ru%2Ftriasovyi_period%2Fmuszavr.html&docid=aZj1VmIivsBBLM&tbnid=qdr-WWAL_n_I9M%3A&vet=10ahUKEwiimOfO-ZTeAhWRlosKHZF9AmEQMwguKAEwAQ..i&w=300&h=150&bih=929&biw=1920&q=%D0%A2%D0%B8%D1%80%D0%B0%D0%BD%D0%BD%D0%BE%D0%B7%D0%B0%D0%B2%D1%80&ved=0ahUKEwiimOfO-ZTeAhWRlosKHZF9AmEQMwguKAEwAQ&iact=mrc&uact=8",
                                "https://www.google.ru/imgres?imgurl=http%3A%2F%2Fplaygame24.com%2Fui%2Fcss%2Fimages%2Fmmorpg%2F393.jpg&imgrefurl=http%3A%2F%2Fplaygame24.com%2Fonline-primalcarnage%2F&docid=bQAdPw808v2M9M&tbnid=F5m1PgrEIo2L7M%3A&vet=10ahUKEwiimOfO-ZTeAhWRlosKHZF9AmEQMwgxKAQwBA..i&w=300&h=150&bih=929&biw=1920&q=%D0%A2%D0%B8%D1%80%D0%B0%D0%BD%D0%BD%D0%BE%D0%B7%D0%B0%D0%B2%D1%80&ved=0ahUKEwiimOfO-ZTeAhWRlosKHZF9AmEQMwgxKAQwBA&iact=mrc&uact=8",
                                "https://www.google.ru/imgres?imgurl=http%3A%2F%2Fs1.1zoom.me%2Fprev2%2F498%2F497854.jpg&imgrefurl=http%3A%2F%2Fwww.1zoom.me%2Fru%2Fwallpaper%2F502783%2Fz3019.2%2F&docid=ZyHpl-qkGMl92M&tbnid=eWbXHbwEueaqmM%3A&vet=10ahUKEwiimOfO-ZTeAhWRlosKHZF9AmEQMwgwKAMwAw..i&w=300&h=150&bih=929&biw=1920&q=%D0%A2%D0%B8%D1%80%D0%B0%D0%BD%D0%BD%D0%BE%D0%B7%D0%B0%D0%B2%D1%80&ved=0ahUKEwiimOfO-ZTeAhWRlosKHZF9AmEQMwgwKAMwAw&iact=mrc&uact=8"
                        )
                )
        );

        store.put("https://museum.kz/id=3", new Record(1, "https://museum.kz/id=3",
                        "Годзилла",
                        "Годзи́лла — гигантский монстр-мутант, кайдзю, персонаж комиксов, мультфильмов и кинофильмов. ",
                        "Годзи́лла (яп. ゴジラ Годзира) — гигантский монстр-мутант, кайдзю, персонаж комиксов, мультфильмов и кинофильмов. Это вымышленный доисторический гигантский ящер-самец, проснувшийся из анабиоза после испытаний водородной бомбы и вследствие этого мутировавший. Ростом от 50 до 160 метров, обладает способностью извергать синий (в некоторых фильмах жёлтый или красный) тепловой луч (плазма), очень хорошо плавает.\n" +
                                "\n" +
                                "Название — Gojira — происходит от японских «горилла» (яп. ゴリラ горира) и «кит» (яп. 鯨 кудзира)[1] и было дано чудовищу в честь клички одного из работников японской студии Toho, на которой снимались фильмы про Годзиллу. В 1953 году продюсер японской кинокомпании Toho Томоюки Танака посмотрел фильм «Чудовище с глубины 20 000 саженей» о динозавре, пробудившемся в результате испытаний атомной бомбы, и решил, что Годзилла будет динозавром[2][3].\n" +
                                "\n" +
                                "За шестьдесят лет Годзилла стал невероятно популярным персонажем, оттеснив на второй план Кинг-Конга, Мотру, Гамеру и других киномонстров. Всего о Годзилле было снято 30 фильмов, не считая сериалов.\n" +
                                "\n" +
                                "Жанры фильмов с Годзиллой очень разнообразны: от комедий («Кинг-Конг против Годзиллы»), детских («Атака Годзиллы») и приключенческих фильмов («Годзилла против морского монстра») до фантастики («Годзилла против Космического Годзиллы», «Годзилла против Кинга Гидоры», «Годзилла: Финальные войны», «Годзилла против Монстра Зеро»), мистики («Годзилла, Мотра, Кинг Гидора: Монстры атакуют»), криминал («Годзилла против Биолланте»), триллеров («Годзилла против Мегагируса», «Годзилла: Миллениум») и ужасов («Возвращение Годзиллы»). Выпускаются игрушечные модели Годзиллы и его врагов-монстров.",
                        Arrays.asList(
                                "https://www.google.ru/imgres?imgurl=https%3A%2F%2Fsuperheroesandscholars.com%2Fwp-content%2Fuploads%2F2016%2F05%2FGodzilla-3-300x150.jpg&imgrefurl=https%3A%2F%2Fsuperheroesandscholars.com%2Fcategory%2Fgodzilla%2F&docid=vwrZeSxY_Py31M&tbnid=bzstx4V5A_bFcM%3A&vet=10ahUKEwi0w-_v-JTeAhWuposKHRInASIQMwg3KAswCw..i&w=300&h=150&itg=1&hl=ru-KZ&bih=929&biw=1920&q=%D0%B3%D0%BE%D0%B4%D0%B7%D0%B8%D0%BB%D0%BB%D0%B0%20%D0%B2%D0%B8%D0%BA%D0%B8%D0%BF%D0%B5%D0%B4%D0%B8%D1%8F&ved=0ahUKEwi0w-_v-JTeAhWuposKHRInASIQMwg3KAswCw&iact=mrc&uact=8",
                                "https://www.google.ru/imgres?imgurl=https%3A%2F%2Fvignette.wikia.nocookie.net%2Fevil%2Fimages%2F9%2F9c%2FComindominuspng.jpg%2Frevision%2Flatest%2Fscale-to-width-down%2F300%3Fcb%3D20180110041335&imgrefurl=http%3A%2F%2Fevil.wikia.com%2Fwiki%2FRaids_and_Sieges&docid=1V0YAEz9KqSqBM&tbnid=BrI-WJBZMY-YPM%3A&vet=10ahUKEwi0w-_v-JTeAhWuposKHRInASIQMwhyKDkwOQ..i&w=300&h=150&hl=ru-KZ&bih=929&biw=1920&q=%D0%B3%D0%BE%D0%B4%D0%B7%D0%B8%D0%BB%D0%BB%D0%B0%20%D0%B2%D0%B8%D0%BA%D0%B8%D0%BF%D0%B5%D0%B4%D0%B8%D1%8F&ved=0ahUKEwi0w-_v-JTeAhWuposKHRInASIQMwhyKDkwOQ&iact=mrc&uact=8",
                                "https://www.google.ru/imgres?imgurl=https%3A%2F%2Fvignette.wikia.nocookie.net%2Fheroism%2Fimages%2Fa%2Fae%2FJurassic-world-movie-screencaps.com-13229.jpg%2Frevision%2Flatest%2Fscale-to-width-down%2F300%3Fcb%3D20180221162124&imgrefurl=http%3A%2F%2Fheroism.wikia.com%2Fwiki%2FGood_Defeats_Evil%2FGallery&docid=cUwO7pcZiBhhoM&tbnid=Ez4OZ-9v9tUF4M%3A&vet=10ahUKEwi0w-_v-JTeAhWuposKHRInASIQMwh0KDswOw..i&w=300&h=150&hl=ru-KZ&bih=929&biw=1920&q=%D0%B3%D0%BE%D0%B4%D0%B7%D0%B8%D0%BB%D0%BB%D0%B0%20%D0%B2%D0%B8%D0%BA%D0%B8%D0%BF%D0%B5%D0%B4%D0%B8%D1%8F&ved=0ahUKEwi0w-_v-JTeAhWuposKHRInASIQMwh0KDswOw&iact=mrc&uact=8",
                                "https://www.google.ru/imgres?imgurl=https%3A%2F%2Frr.img.naver.jp%2Fmig%3Fsrc%3Dhttp%253A%252F%252Fimgcc.naver.jp%252Fkaze%252Fmission%252FUSER%252F20140520%252F24%252F2929604%252F10%252F640x320xe0c9c545d546e6d0cf5eab50.jpg%252F300%252F600%26twidth%3D300%26theight%3D600%26qlt%3D80%26res_format%3Djpg%26op%3Dr&imgrefurl=https%3A%2F%2Fmatome.naver.jp%2Fodai%2F2137668772870107401%3Fpage%3D4&docid=zHhb4oKtGoMOtM&tbnid=hzxURAjbum5gzM%3A&vet=12ahUKEwih6MeW-ZTeAhWJiIsKHYIDB-c4ZBAzKAEwAXoECAEQAg..i&w=300&h=150&itg=1&hl=ru-KZ&bih=929&biw=1920&q=%D0%B3%D0%BE%D0%B4%D0%B7%D0%B8%D0%BB%D0%BB%D0%B0%20%D0%B2%D0%B8%D0%BA%D0%B8%D0%BF%D0%B5%D0%B4%D0%B8%D1%8F&ved=2ahUKEwih6MeW-ZTeAhWJiIsKHYIDB-c4ZBAzKAEwAXoECAEQAg&iact=mrc&uact=8"
                        )
                )
        );

        store.put("https://museum.kz/id=4", new Record(1, "https://museum.kz/id=4",
                        "Макака",
                        "Мака́ки — род приматов из семейства мартышковых, состоящий из 21 вида, большинство из которых обитают в Азии. Появились примерно 5,1 млн. лет назад",
                        "Распространение\n" +
                                "Ареал макак простирается от Афганистана до Юго-Восточной Азии, а также до Японии. Особенным разнообразием видов отличается остров Сулавеси, где проживают шесть эндемичных видов макак. Единственным представителем семейства, встречающимся за пределами Азии, является магот, живущий в Северной Африке и в Гибралтаре.\n" +
                                "\n" +
                                "Макаки встречаются в разнообразных местообитаниях — от тропических лесов до горных местностей. Японская макака живёт в заснеженных горах Японии и за исключением человека является наиболее северным приматом. Некоторые виды, например макаки-резусы, в большом количестве живут даже в городах. \n" +
                                "Описание\n" +
                                "Макаки — приматы средней величины с крепким туловищем и сильными конечностями. Их густая шерсть окрашена в серо-коричневый цвет, однако порою бывает и чёрной. На продолговатой морде волосяной покров отсутствует. У некоторых видов на голове имеются заметные «шапки» либо своеобразные бороды. Важным отличительным признаком является длина хвоста: у маготов он полностью отсутствует, у некоторых видов он куцый, а у остальных почти такой же длинный, как всё туловище. Величина тела у макак достигает 80 см, а вес колеблется от 6 до 15 кг. Самцы в среднем в два раза тяжелее самок. \n" +
                        "Поведение\n" +
                                "\n" +
                                "Автопортрет макаки-хохлатого павиана\n" +
                                "Макаки активны в дневное время. Они хорошо умеют лазить по деревьям и скалам, но проводят значительную часть своей жизни на земле. Макаки живут в группах от 10 до 100 особей. В группах, как правило, в три-четыре раза больше самок, чем самцов. Существуют и группы, состоящие исключительно из самцов-холостяков, которые по разным причинам не в состоянии составить конкуренцию вожакам групп самок. Внутри группы существуют строгие иерархии, как среди самцов, так и среди самок. Молодые самцы после вступления в половозрелый возраст обязаны покинуть группу, в то время как молодые самки в ней остаются. Территориальное поведение выражено не особенно сильно, иногда представители разных групп ищут пищу вблизи друг друга. Многочисленные звуки и крики, а также взаимный уход за шерстью служат общению и социальному взаимодействию.",
                        Arrays.asList(
                                "https://www.google.ru/imgres?imgurl=http%3A%2F%2Fsrc.pros0n.ru%2Fobezyana-1-jpg-8d47be.jpg&imgrefurl=http%3A%2F%2Fpros0n.ru%2Fo%2Fk-chemu-snitsja-obezjana-zhenshhine.html&docid=nlai6Oo7shFllM&tbnid=O3lLbm36DZQReM%3A&vet=10ahUKEwiK3seL-JTeAhVNpIsKHQWBCrEQMwgxKAAwAA..i&w=300&h=150&hl=ru-KZ&bih=929&biw=1920&q=%D0%BC%D0%B0%D0%BA%D0%B0%D0%BA%D0%B0&ved=0ahUKEwiK3seL-JTeAhVNpIsKHQWBCrEQMwgxKAAwAA&iact=mrc&uact=8",
                                "https://www.google.ru/imgres?imgurl=http%3A%2F%2Fimage.subscribe.ru%2Flist%2Fdigest%2Fanimals%2F30b06.jpg&imgrefurl=https%3A%2F%2Fsubscribe.ru%2Fdigest%2Fanimals%2Fexotic%2Fn167027.html&docid=C_trFtBazap8HM&tbnid=cK856al4M3vSRM%3A&vet=10ahUKEwiK3seL-JTeAhVNpIsKHQWBCrEQMwgyKAEwAQ..i&w=300&h=150&hl=ru-KZ&bih=929&biw=1920&q=%D0%BC%D0%B0%D0%BA%D0%B0%D0%BA%D0%B0&ved=0ahUKEwiK3seL-JTeAhVNpIsKHQWBCrEQMwgyKAEwAQ&iact=mrc&uact=8",
                                "https://www.google.ru/imgres?imgurl=https%3A%2F%2Fs.mediasole.ru%2Fcache%2Fpreview%2Fdata%2Fimages%2F370%2F370617%2FPrmt-1.jpg&imgrefurl=https%3A%2F%2Fmirputeshestvij.mediasole.ru%2Fuvlekatelnye_primaty&docid=oaK78RoLVZhUwM&tbnid=7TN6lHpOrvZCHM%3A&vet=10ahUKEwiK3seL-JTeAhVNpIsKHQWBCrEQMwg3KAYwBg..i&w=300&h=150&hl=ru-KZ&bih=929&biw=1920&q=%D0%BC%D0%B0%D0%BA%D0%B0%D0%BA%D0%B0&ved=0ahUKEwiK3seL-JTeAhVNpIsKHQWBCrEQMwg3KAYwBg&iact=mrc&uact=8",
                                "https://www.google.ru/imgres?imgurl=https%3A%2F%2Favatars.mds.yandex.net%2Fget-pdb%2F368827%2F7f83d91b-c70a-4071-95e6-3b290e0cb1d6%2Fh150&imgrefurl=https%3A%2F%2Fyandex.com%2Fcollections%2Fuser%2Fe-mryas%2Fobeziany%2F&docid=KFl45nK5mcm6zM&tbnid=mLIKjit4HNykmM%3A&vet=10ahUKEwiK3seL-JTeAhVNpIsKHQWBCrEQMwg8KAswCw..i&w=300&h=150&hl=ru-KZ&bih=929&biw=1920&q=%D0%BC%D0%B0%D0%BA%D0%B0%D0%BA%D0%B0&ved=0ahUKEwiK3seL-JTeAhVNpIsKHQWBCrEQMwg8KAswCw&iact=mrc&uact=8"
                        )
                )
        );
    }


}
