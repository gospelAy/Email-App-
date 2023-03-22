package services;

import data.models.Mails;
import dtos.request.MailRegisterRequest;
import dtos.response.MailRegisterResponse;
import dtos.response.UserRegisterResponse;

public interface MailService {
    MailRegisterResponse register(MailRegisterRequest request);
    int count();
    MailRegisterResponse findAccount(int id);

}
