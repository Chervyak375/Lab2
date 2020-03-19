package sample.Products;

public class Video extends Product {
    String title;
    String id;

    public String getTitle()
    {
        return title;
    }

    public String getId()
    {
        return id;
    }

    Video(String title, String id)
    {
        this.title=title;
        this.id=id;
    }
}
