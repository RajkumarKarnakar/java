package com.example;

public class DeveloperUser extends UserDecorator{

    public DeveloperUser(User user) {
        super(user);
    }

    @Override
    public void printPrivileges() {
        super.printPrivileges();
        System.out.println("can deploy to production");
    }
}
