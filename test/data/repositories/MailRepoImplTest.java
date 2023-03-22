package data.repositories;

import data.models.Mails;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MailRepoImplTest {
    MailRepo mailRepo;
    Mails mails;
    @BeforeEach
    public void startWith(){
        mailRepo = new MailRepoImpl();
        mails = new Mails();
        mails.setBody("This is my first Body");
        mails.setTitle("This is my first Title");
        mails = mailRepo.save(mails);

        mails.setBody("This is my first Body");
        mails.setTitle("This my new second Title");
        mails = mailRepo.save(mails);

        Mails mail2 = new Mails();
        mail2.setBody("This is my third body ");
        mail2.setTitle("This is my third title");
        mailRepo.save(mail2);
       }
    @Test
    public void testThatMailCanBeCreated(){
        assertEquals(1, mails.getMailsId());
    }
    @Test
    public void testThatMailCountIsStillOneWhenIEdit(){
        assertEquals(1, mails.getMailsId());

    }
    @Test
    public void testThatCountIncreaseToTwoWhenAnotherMailIsCreated(){
        assertEquals(2, mailRepo.count());
    }
    @Test
    public void testThatEmailCanBeFoundAfterCreated(){
        Mails mails1 = mailRepo.findById(1);
        assertEquals("This is my first Body", mails1.getBody());
        System.out.println(mailRepo.getMailList());
    }
    @Test
    public void testThatMailCanBeDeleted_ById(){
        mails = mailRepo.findById(1);
        assertEquals("This is my first Body", mails.getBody());
        assertEquals(2, mailRepo.getMailList());
        mailRepo.delete(1);
        assertEquals(1, mailRepo.getMailList());
    }
}