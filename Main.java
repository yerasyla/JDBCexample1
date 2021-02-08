package com.company;

import com.company.controllers.UserController;
import com.company.data.PostgresDB;
import com.company.data.interfaces.IDB;
import com.company.repositories.UserRepositories;
import com.company.repositories.interfaces.IUserRepository;

public class Main {

    public static void main(String[] args) {
        IDB db = new PostgresDB();
        IUserRepository repo = new UserRepositories(db);
        UserController controller = new UserController(repo);
        MyApplication app = new MyApplication(controller);
        app.start();
    }
}
