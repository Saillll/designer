package com.zzj.designer.proxy.staticmode;

public class UserDao implements UserMapper {

    @Override
    public void getUser() {
        System.out.println("This method returns a User Entity");
    }
}
