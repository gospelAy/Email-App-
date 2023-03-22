package data.repositories;

import data.models.User;

public interface UserRepo {
    User save(User user);

    int count();

    User findById(int id);

    int getUserList();

    void delete(int id);
}
