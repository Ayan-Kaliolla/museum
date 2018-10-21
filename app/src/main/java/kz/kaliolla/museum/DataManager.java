package kz.kaliolla.museum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kz.kaliolla.museum.model.ImageUrl;
import kz.kaliolla.museum.model.Record;

public class DataManager {
    private static Map<String, Record> store = new HashMap<>();
    private static List<Record> history = new ArrayList<>();

    static {
        initStore();
    }

    public static Record getRecored(String qr) {
        return store.get(qr);
    }

    public static void addToHistory(Record record) {
        if (!history.contains(record)) {
            history.add(record);
        }
    }

    public static List<Record> getHistory() {
        return new ArrayList<>(history);
    }

    public static void deleteFromHistory(int adapterPosition) {
        history.remove(adapterPosition);
    }

    private static void initStore() {
        store.put("https://museum.kz/id=1", new Record(1, "https://museum.kz/id=1",
                        "Мамонт",
                        "Ма́монты — вымерший род млекопитающих, живших в четвертичном периоде, из семейства слоновых. Достигали высоты 5,5 метров и массы тела 10—12 тонн. ",
                        "Ма́монты (лат. Mammuthus) — вымерший род млекопитающих, живших в четвертичном периоде, из семейства слоновых. Достигали высоты 5,5 метров и массы тела 10—12 тонн. Таким образом, мамонты были в два раза тяжелее самых крупных современных наземных млекопитающих — африканских слонов.\n" +
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
                                new ImageUrl("Мамонт", "http://image.subscribe.ru/list/digest/animals/im_20131018164933_20512.jpg"),
                                new ImageUrl("Мамонт", "https://discover24.ru/wp-content/uploads/2016/09/Woolly_mammoth-300x150.jpg"),
                                new ImageUrl("Мамонт", "http://image.subscribe.ru/list/digest/woman/12av31.jpg"),
                                new ImageUrl("Мамонт", "http://i.family.booknik.ru/_img/263-258.jpg")
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
                                new ImageUrl("Тираннозавр", "https://www.ammonit.ru/upload/news/70.jpg"),
                                new ImageUrl("Тираннозавр", "http://dinozavry.tcoa.ru/src/images/triasovyi_period/muszavr.GIF"),
                                new ImageUrl("Тираннозавр", "http://playgame24.com/ui/css/images/mmorpg/393.jpg"),
                                new ImageUrl("Тираннозавр", "http://s1.1zoom.me/prev2/498/497854.jpg")
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
                                new ImageUrl("Годзилла", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTisN0ARMx4Reqcg4rlaIGi8jXSelUr7jaxoH5NiE0t3DpTDPJl"),
                                new ImageUrl("Годзилла", "https://vignette.wikia.nocookie.net/evil/images/9/9c/Comindominuspng.jpg/revision/latest/scale-to-width-down/300?cb=20180110041335"),
                                new ImageUrl("Годзилла", "https://vignette.wikia.nocookie.net/heroism/images/a/ae/Jurassic-world-movie-screencaps.com-13229.jpg/revision/latest/scale-to-width-down/300?cb=20180221162124"),
                                new ImageUrl("Годзилла", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS04mYuANCpaKOMK7AyDM6I3Sy2A53mzIYb6psfgz_qpYk4N6qXNw")
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
                                new ImageUrl("Макака", "http://src.pros0n.ru/obezyana-1-jpg-8d47be.jpg"),
                                new ImageUrl("Макака", "http://image.subscribe.ru/list/digest/animals/30b06.jpg"),
                                new ImageUrl("Макака", "https://s.mediasole.ru/cache/preview/data/images/370/370617/Prmt-1.jpg"),
                                new ImageUrl("Макака", "https://avatars.mds.yandex.net/get-pdb/368827/7f83d91b-c70a-4071-95e6-3b290e0cb1d6/h150")
                        )
                )
        );
    }

}
