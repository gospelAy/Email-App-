package data.repositories;

import data.models.Mails;

public interface MailRepo {
    Mails save(Mails mails);

    int count();

    Mails findById(int id);

    void delete(int id);

    int getMailList();
}
