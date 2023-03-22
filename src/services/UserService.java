package services;

import dtos.request.UserRegisterRequest;
import dtos.response.UserRegisterResponse;

public interface UserService {
    UserRegisterResponse register(UserRegisterRequest request);

    int count();

    UserRegisterResponse findAccount(int id);
}
