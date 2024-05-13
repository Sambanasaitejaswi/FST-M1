package activities;

public class Activity5 {
    public static void main(String[] args){
        MyBook newNovel = new MyBook();
        String title = "Hover Car Racer";
        newNovel.setTitle(title);
        System.out.println("Title of Car is::::"+newNovel.getTitle());
    }
}

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

class MyBook extends Book{
    public void setTitle(String s) {
        title = s;
    }
}