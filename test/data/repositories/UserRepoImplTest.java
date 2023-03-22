package data.repositories;

import data.models.Mails;
import data.models.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRepoImplTest {
    UserRepo userRepo;
    User user;

    @BeforeEach
    public void startAllWith(){
        userRepo = new UserRepoImpl();
        user = new User();
        user.setFirstName("Gospel");
        user.setLastName("King_Face");
        user.setUserName("Apostle Zwalakate");
        user.setEmailAddress("gospelKingF@gmail.com");
        user = userRepo.save(user);

        User user2 = new User();
        user2.setFirstName("Spencer");
        user2.setLastName("Olakunle");
        user2.setUserName("DjSpencer");
        user2.setEmailAddress("spencer@gmail.com");
        user2 = userRepo.save(user2);
    }
    @Test
    public void testThatUserEmailCanBeCreated(){
        assertEquals(1, user.getId());
    }
    @Test
    public void testThatExistingUserEmail_IdIsStillOne(){
        user.setFirstName("Gospel");
        user.setLastName("King_Face5");
        user.setUserName("Apostle Zwalakate");
        user.setEmailAddress("gospelKingF@gmail.com");
        user = userRepo.save(user);
        assertEquals(1, user.getId());
    }
    @Test
    public void testThatCreatingAnotherUserEmailCountWillBe2(){
        assertEquals(2, userRepo.count());
    }
    @Test
    public void testThatUserEmailCanBeFoundAfterCreated(){
        User user = userRepo.findById(1);
        assertEquals("Gospel", user.getFirstName());
    }
    @Test
    public void testThatSecondEmailCanBeFoundAfterCreated(){
        User user2 = userRepo.findById(2);
        assertEquals("Spencer", user2.getFirstName());
    }
    @Test
    public void testThatUserEmailCanBeDeleted(){
        user = userRepo.findById(1);
        assertEquals("Apostle Zwalakate", user.getUserName());
        assertEquals(2, userRepo.getUserList());
        userRepo.delete(1);
        assertEquals(1, userRepo.getUserList());
    }
}