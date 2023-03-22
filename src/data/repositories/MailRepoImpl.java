package data.repositories;

import data.models.Mails;
import data.models.User;

import java.util.ArrayList;
import java.util.List;

public class MailRepoImpl implements MailRepo{
    List<Mails> mailList = new ArrayList<>();
    private int count;
    @Override
    public Mails save(Mails mails) {
        if (mails.getMailsId() == 0){
            mails.setMailsId(count + 1);
            mailList.add(mails);
            count++;
        }
        return mails;
    }

    @Override
    public int count() {
        return count;
    }

    @Override
    public Mails findById(int id) {
        for (Mails mails: mailList) {
            if (mails.getMailsId() == id)
                return mails;
        }
        return null;
    }

    @Override
    public void delete(int id) {
        for (Mails mail: mailList) {
            if (id == mail.getMailsId()){
                mailList.remove(id);
            }
        }
    }

    @Override
    public int getMailList() {
        return mailList.size();
    }
}
