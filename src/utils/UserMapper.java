package utils;

import data.models.Mails;
import data.models.User;
import dtos.request.MailRegisterRequest;
import dtos.request.UserRegisterRequest;
import dtos.response.MailRegisterResponse;

public class UserMapper {

    public static void map(UserRegisterRequest request, User user){
        user = new User();
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setEmailAddress(request.getEmailAddress());
        user.setUserName(request.getUserName());
    }
    public static void map(MailRegisterRequest request, Mails mails){
        mails = new Mails();
        mails.setBody(request.getBody());
        mails.setTitle(request.getTitle());
    }
}
