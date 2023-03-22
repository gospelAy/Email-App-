package dtos.response;

public class MailRegisterResponse {
    private int mailsId;
    private String title;
    private String body;

    public int getMailsId() {
        return mailsId;
    }

    public void setMailsId(int mailsId) {
        this.mailsId = mailsId;
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MailRegisterResponse{");
        sb.append("mailsId=").append(mailsId);
        sb.append(", title='").append(title).append('\'');
        sb.append(", body='").append(body).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
