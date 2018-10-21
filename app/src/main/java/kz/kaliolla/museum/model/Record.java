package kz.kaliolla.museum.model;

import java.util.List;
import java.util.Objects;

public class Record {
    private long id;
    private String qr;
    private String title;
    private String shortText;
    private String content;
    private List<ImageUrl> imageUrls;

    public Record() {
    }

    public Record(long id, String qr, String title, String shortText, String content, List<ImageUrl> imageUrls) {
        this.id = id;
        this.qr = qr;
        this.title = title;
        this.shortText = shortText;
        this.content = content;
        this.imageUrls = imageUrls;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getQr() {
        return qr;
    }

    public void setQr(String qr) {
        this.qr = qr;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShortText() {
        return shortText;
    }

    public void setShortText(String shortText) {
        this.shortText = shortText;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<ImageUrl> getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(List<ImageUrl> imageUrls) {
        this.imageUrls = imageUrls;
    }
}
