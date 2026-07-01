package model;

public class Address {
    private String address1;
    private String address2;
    private String PinCode;

    public Address(String address1, String address2, String pinCode){
        this.address1 = address1;
        this.address2 = address2;
        this.PinCode = PinCode;
    }

    public String getAddress1(){
        return address1;
    }

    public String getAddress2(){
        return address2;
    }

    public String getPIN(){
        return PinCode;
    }
}
