package org.wecancoeit.reviews;

public class Review {

    private long id;
    private String title;
    private String date;
    private String category;
    private String img;
    private String content;

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public String getCategory() {
        return category;
    }
    public String getContent() {
        return content;
    }

    public String getImg() {
        return img;
    }

    public Review(long id, String title, String date, String category,String img, String content) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.category = category;
        this.img = img;
        this.content = content;
    }
}
