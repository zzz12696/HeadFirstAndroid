package com.zzz.starbuzz;

public class Drink {
    private String name;
    private String description;
    private int imageResourceId;

    public static final Drink[] drinks = {
            new Drink("美式咖啡（热/冷）", "简单即是美味，萃取经典浓缩咖啡，以水调和，香气浓郁蔓溢。",
                    R.drawable.caffe_americano),
            new Drink("拿铁（热/冷）", "本色的经典咖啡。新鲜萃取的浓缩咖啡中缓缓倒入蒸煮牛奶，覆上轻柔奶泡，简单的香与纯。",
                    R.drawable.caffe_latte),
            new Drink("摩卡（热/冷)", "摩卡最初是指一种带有巧克力风味的咖啡豆，现在，这份巧克力咖啡仍然带给你纯正的温暖。在浓缩咖啡中加入摩卡酱，与蒸煮牛奶一起交织出丝滑与醇厚。",
                    R.drawable.caffe_mocha)
    };

    private Drink(String name, String description, int imageResourceId){
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription(){
        return description;
    }

    public String getName(){
        return name;
    }

    public int getImageResourceId(){
        return imageResourceId;
    }

    public String toString(){
        return this.name;
    }
}
