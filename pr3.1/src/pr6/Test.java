package pr6;
import pr6.builder.Song;
import pr6.builder.SongBuilder;
import pr6.abstractFactory.ConcreteFactory;
import pr6.factoryMethod.ConcreteCreator;
import pr6.factoryMethod.ConcreteProduct;

public class Test {
    public static void main(String[] args){
        //factoryMethod
        ConcreteCreator Pyro = new ConcreteCreator("pyrokinesis");
        ConcreteProduct five = Pyro.factoryMethod("5", "И нам бы покорить это небо\nМы отправим корабли на планеты\nЗа прозрачной надеждой на завтра\nНыряем в квазар и никак не вернуться назад нам\nИ нам бы покорить это небо\nМы отправим корабли на планеты\nЗа прозрачной надеждой на завтра\nНыряем в квазар и никак не вернуться назад нам", 279);
        Pyro.anOperation(five);

        System.out.println();

        //abstractFactory
        ConcreteFactory Porn = new ConcreteFactory("Порнофильмы");
        pr6.abstractFactory.ConcreteProduct imSoAfraid = Porn.createProduct("Я так боюсь", "Знаешь, я так боюсь\nЧто мы просто больше не встретимся\nВытру с лица солёную грусть и притворюсь\nЧто мне просто так весело\nЗнаешь, я так боюсь\nЧто наши руки просто расцепятся\nЗнаешь, я так боюсь\nЧто мы изменимся, но по отдельности", 259);
        imSoAfraid.view();

        System.out.println();

        //builder
        SongBuilder Aff = new SongBuilder("Аффинаж");
        Aff.writeTitle("Котик");
        Aff.writeText("Мечусь по набережной\nВетер небрежный\nИзмеряешь шагами комнату\nГлазами в темноту\nТелом в холод кромешный\nМежду нами реки неспешные\nЧаяния и надежды\nОтверженные, укутанные в тщету\nВлюбленные без одежды\n\nЗемля из-под ног уходит\nВспоминай меня, котик\nЗемля из-под ног уходит\nВспоминай меня");
        Aff.recordSong(241);
        Song kotit =  Aff.getResult();
        kotit.view();

        /*
        Мои перчатки пришиты к резинке\nНародный лайфхак, чтобы не потерял\nЗаметает овраг, по прогнозу тепло, и снег липкий —\nЧудесный строительный материал!\nЯ суп не доел. Извини, спешу\nУ меня много дел, пойми\nЯ весел и смел, об одном прошу —\nПодбородок не прищеми
        */

        System.out.println();

        //prototype
        pr6.prototype.Song malenkii = new pr6.prototype.Song("Маленький", "Мои перчатки пришиты к резинке\nНародный лайфхак, чтобы не потерял\nЗаметает овраг, по прогнозу тепло, и снег липкий —\nЧудесный строительный материал!\nЯ суп не доел. Извини, спешу\nУ меня много дел, пойми\nЯ весел и смел, об одном прошу —\nПодбородок не прищеми", 244, "Дайте танк (!)");
        pr6.prototype.Prototype malenkii2 = malenkii.clone();
        malenkii2.view();
    }
}
