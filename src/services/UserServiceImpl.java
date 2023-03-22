package services;

import data.models.User;
import data.repositories.MailRepoImpl;
import data.repositories.UserRepo;
import data.repositories.UserRepoImpl;
import dtos.request.UserRegisterRequest;
import dtos.response.UserRegisterResponse;
import utils.UserMapper;

public class UserServiceImpl implements UserService{

    private UserRepo userRepo = new UserRepoImpl();

    private  static UserRegisterResponse response;


    @Override
    public UserRegisterResponse register(UserRegisterRequest request) {
        User user   = new User();
        UserMapper.map(request, user);
        response = new UserRegisterResponse();
        response.setFirstName(user.getFirstName());
        response.setEmailAddress(user.getEmailAddress());
        response.setLastName(user.getLastName());
        response.setUserName(user.getUserName());

        return response;
    }


    @Override
    public int count() {
        return userRepo.count();
    }

    @Override
    public UserRegisterResponse findAccount(int id) {
      User user =  userRepo.findById(id);
      response = new UserRegisterResponse();
      response.setFirstName(user.getFirstName());
      response.setLastName(user.getLastName());
      response.setUserName(user.getUserName());
      response.setEmailAddress(user.getEmailAddress());
      response.setId(user.getId());

      return response;

    }

}
