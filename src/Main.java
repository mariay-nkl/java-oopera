 class Theatre {
    public static void main(String[] args) {
        System.out.println("ДОБРО ПОЖАЛОВАТЬ В ТЕАТР! \n");

        Actor actor1 = new Actor("Елизавета", "Белова", Gender.FEMALE, 1.65);
        Actor actor2 = new Actor("Петр", "Кудрявцев", Gender.MALE, 1.80);
        Actor actor3 =  new Actor("Светлана", "Иванова", Gender.FEMALE, 1.73);

        System.out.println("Актеры: ");
        System.out.println("1. " + actor1);
        System.out.println("2. " + actor2);
        System.out.println("3. " + actor3);
        System.out.println();

        Director director1 = new Director("Евгений", "Шляпин", Gender.MALE);
        Director director2 = new Director("Юлия", "Светлякова", Gender.FEMALE);

        System.out.println("Режиссеры: ");
        System.out.println("1. " + director1);
        System.out.println("2. " + director2);

        String musicAuthor = "Петр Чайковский";
        String choreographer = "Майя Плисецкая";
        System.out.println();

        Show regularShow = new Show("Гамлет", 180, director1);

        Opera opera = new Opera(
                "Пиковая Дама",
                240,
                director2,
                musicAuthor,
                "повествует о молодом офицере Германе, одержимом идеей выиграть в карты," +
                "который выведывает тайну" +
                "трех выигрышных карт у старой графини, но из-за своей жадности и " +
                "одержимости теряет рассудок и жизнь, " +
                "а его возлюбленная Лиза трагически погибает в канавке. ",
                30
        );

        Ballet ballet = new Ballet(
                "Лебединое озеро",
                135,
                director1,
                musicAuthor,
                "Волшебная история о принце Зигфриде и заколдованной принцессе Одетте, " +
                        "превращённой в лебедя злым волшебником.",
                choreographer
        );

        System.out.println("Спектакли: ");
        System.out.println("1. " + regularShow);
        System.out.println("2. " + opera);
        System.out.println("3. " + ballet);
        System.out.println();

        System.out.println("~РАСПРЕДЕЛЕНИЕ АКТЕРОВ~");

        regularShow.addActor(actor1);
        regularShow.addActor(actor2);

        opera.addActor(actor2);
        opera.addActor(actor3);

        ballet.addActor(actor1);
        ballet.addActor(actor3);

        System.out.println("\nПопытка добавить дубликата актёра: ");
        ballet.addActor(actor3);

        System.out.println();

        System.out.println("~СПИСКИ АКТЕРОВ~");
        regularShow.printActorsList();
        System.out.println();
        opera.printActorsList();
        System.out.println();
        ballet.printActorsList();
        System.out.println();

        System.out.println("~ЗАМЕНА АКТЕРА~");
        System.out.println("Заменяем актёра с фамилией 'Кудрявцев' на 'Петрова' в обычном спектакле:");
        regularShow.replaceActor(actor3, "Кудрявцев");
        regularShow.printActorsList();
        System.out.println();

        System.out.println("Попытка заменить несуществующего актёра:");
        opera.replaceActor(actor1, "Несуществующий");
        System.out.println();

        System.out.println("~ИНФОРМАЦИЯ О РЕЖИССЕРАХ~");
        regularShow.printDirectorInfo();
        opera.printDirectorInfo();
        ballet.printDirectorInfo();
        System.out.println();

        System.out.println("~ЛИБРЕТТО МУЗЫКАЛЬНЫХ СПЕКТАКЛЕЙ~");

        System.out.println("\nОПЕРА:");
        opera.printLibretto();

        System.out.println("\nБАЛЕТ:");
        ballet.printLibretto();

        System.out.println("~ПРИЯТНОГО ПРОСМОТРА!~");
    }
}