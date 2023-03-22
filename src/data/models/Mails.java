package data.models;

public class Mails {
    private int mailsId;
    private String title;
    private String body;

    public int getMailsId() {
        return mailsId;
    }

    public void setMailsId(int id) {
        this.mailsId = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

}