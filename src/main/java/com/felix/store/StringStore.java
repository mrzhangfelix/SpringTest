package com.felix.store;

public class StringStore implements Store<String> {
    public StringStore(){

    }
    public StringStore(String username, String url, String password) {
        this.username = username;
        this.url = url;
        this.password = password;
    }

    public void init(){
System.out.println("this is init");
    }
    public void destroy(){
System.out.println("this is destory");
    }

    private String username;
    private String url;
    private String password;
    public void loadres(){
        System.out.println("username::::"+username);
        System.out.println("url::::"+url);
        System.out.println("password::::"+password);
    }
}
