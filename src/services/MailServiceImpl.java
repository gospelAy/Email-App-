package services;

import data.models.Mails;
import data.repositories.MailRepo;
import data.repositories.MailRepoImpl;
import dtos.request.MailRegisterRequest;
import dtos.response.MailRegisterResponse;
import dtos.response.UserRegisterResponse;
import utils.UserMapper;

public class MailServiceImpl implements MailService{

    private MailRepo mailRepo = new MailRepoImpl();

    private static MailRegisterResponse response;

    @Override
    public MailRegisterResponse register(MailRegisterRequest request) {
        Mails mails = new Mails();
        UserMapper.map(request, mails);
        response = new MailRegisterResponse();
        response.setTitle(mails.getTitle());
        response.setBody(mails.getBody());
        return response;
    }

    @Override
    public int count() {
        return mailRepo.count();
    }

    @Override
    public MailRegisterResponse findAccount(int id) {
        Mails mails = mailRepo.findById(id);
        response = new MailRegisterResponse();
        response.setBody(mails.getBody());
        response.setTitle(mails.getTitle());
        response.setMailsId(mails.getMailsId());
        return response;
    }
}
