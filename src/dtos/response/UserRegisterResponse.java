package dtos.response;

public class UserRegisterResponse {
    private int id;
    private String firstName;
    private String lastName;
    private String userName;
    private String EmailAddress;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        EmailAddress = emailAddress;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserRegisterResponse{");
        sb.append("id=").append(id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", userName='").append(userName).append('\'');
        sb.append(", EmailAddress='").append(EmailAddress).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
