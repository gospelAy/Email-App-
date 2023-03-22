/*package services;

import dtos.request.UserRegisterRequest;
import dtos.response.UserRegisterResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceImplTest {
    UserService userService;
    UserRegisterRequest registerRequest;

    @BeforeEach
    public void startWith(){
        userService = new UserServiceImpl();
        registerRequest = new UserRegisterRequest();
        registerRequest.setBody("My body");
    }
    @Test
    public void testThatUserCanBeRegistered(){
        UserRegisterResponse response = userService.register(registerRequest);
        assertEquals(1, userService.count());
    }
}*/