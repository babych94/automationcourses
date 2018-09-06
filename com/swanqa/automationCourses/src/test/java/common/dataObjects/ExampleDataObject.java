package common.dataObjects;

import common.Utils;

public class ExampleDataObject {

    public String UserName = "";
    public String Password = "";
    public String ConfirmPassword = "";
    public String Email = "";

    public ExampleDataObject(String UserName, String Password, String Email){
        this.UserName = UserName;
        this.Password = Password;
        this.ConfirmPassword = Password;
        this.Email = Email;
    }

    public ExampleDataObject(){
        this(getRandomUserName(),  getRandomPassword(), getRandomEmail());
    }

    public static String getRandomUserName(){
        return Utils.getRandomString(10);
    }

    public static String getRandomPassword(){
        return String.valueOf(Utils.getRandomInteger(65536));
    }

    public static String getRandomEmail(){return Utils.getRandomString(10) + "@mail.com";}

}
