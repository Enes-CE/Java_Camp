package Concrete;

import Abstracts.UserService;
import Entities.User;


public class UserManager implements UserService {
    @Override
    public void add(User user) {
        System.out.println(user.getE_mail()+" : added");
    }

    @Override
    public void update(User user) {
        System.out.println(user.getE_mail()+" : updated");
    }

    @Override
    public void delete(User user) {
        System.out.println(user.getE_mail()+" : deleted");
    }
}
