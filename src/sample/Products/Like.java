package sample.Products;

import sample.Rate;

public class Like extends Product {
    Rate rate;
    Video video;

    public Rate getRate()
    {
        return rate;
    }

    public Video getVideo()
    {
        return video;
    }

    Like(Rate rate, Video video)
    {
        this.rate=rate;
        this.video=video;
    }
}
