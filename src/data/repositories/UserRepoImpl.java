package data.repositories;

import data.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepoImpl implements UserRepo{
    List<User> userList = new ArrayList<>();
    private int count;
    @Override
    public User save(User user) {
        if (user.getId()  == 0) {
            user.setId(count + 1);
            userList.add(user);
            count++;
        }
        return  user;
    }

    @Override
    public int count() {
        return count;
    }

    @Override
    public User findById(int id) {
        for (User user: userList) {
            if (user.getId() == id){
                return user;
            }
        }
        return null;
    }

    @Override
    public int getUserList() {
        return userList.size();
    }

    @Override
    public void delete(int id) {
        for (User user: userList) {
            if (id == user.getId()){
                userList.remove(id);
            }
        }
    }
}
