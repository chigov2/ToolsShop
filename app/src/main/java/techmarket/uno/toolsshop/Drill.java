package techmarket.uno.toolsshop;

import androidx.annotation.NonNull;

public class Drill {
    private  String title;
    private  String info;
    private  int imageResourceId;
    //crate constructor = Alt + Insert

    public Drill(String title, String info, int imageResourceId) {
        this.title = title;
        this.info = info;
        this.imageResourceId = imageResourceId;
    }
    //из кода необходим доступ к полям - создаем геттеры
    public String getTitle() {
        return title;
    }

    public String getInfo() {
        return info;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    @NonNull
    @Override
    public String toString() {
        return title;
        //когда дрель преобразовывается в строку - выводится её название
    }
}
