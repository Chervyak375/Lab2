package sample.Products;

public class Comment extends Product {
    String id;
    String text;

    public String getId()
    {
        return id;
    }

    public String getText()
    {
        return text;
    }


    Comment(String id, String text)
    {
        this.id=id;
        this.text=text;
    }
}
