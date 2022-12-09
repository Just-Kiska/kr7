package Task_2;

public enum MarkAndColor {
    Orange("Ораньжевый"),
    Yellow("Желтый"),
    DarkBlue("Темно-синий"),
    Blue("Синий"),
    White("Белый"),
    Burgundi("Вишнёвый"),
    Toyota("Тойота"),
    Nissan("Ниссан"),
    BMW("БМВ"),
    Ford("Форд"),
    Honda("Хонда"),
    VAZ("ВАЗ");
public String name;

    public String getName() {
        return name;
    }

    MarkAndColor(String name) {
        this.name = name;
    }
}
