package com.zzj.designer.proxy.staticmode;

public class UserProxy implements UserMapper {

    private UserMapper mapper;

    public UserProxy(UserMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public void getUser() {
        System.out.println("Proxy starts here");
        this.mapper.getUser();
        System.out.println("Proxy ends here");

    }
}
