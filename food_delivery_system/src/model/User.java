package model;

public class User {
    private int id;
    private String name;
    private String email;
    private Long phone;

    public User(int id, String name, String email, Long phone){
        this.id = id;
        this.name=name;
        this.email = email;
        this.phone = phone;

    }

    public int getId(){
        return id;

    }

    public String getName(){
        return name;

    }

    public String getEmail(){
        return email;
    }

    public Long getPhone(){
        return phone;
    }

}
