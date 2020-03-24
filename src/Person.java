import java.io.Serializable;
import java.util.Comparator;

public class Person implements Serializable{
    Person person = new Person();
    private String name, group,address, phone, lastName;
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getGroup(){
        return group;
    }
    public void setGroup(String group){
        this.group = group;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getPhone(){
        return  phone;
    }
    public void setPhone (String phone){
        this.phone = phone;
    }
    public Person(){}
    public Person(String name,String phone,String group,String address){
        super();
        this.name = name;
        this.group = group;
        this.address = address;
        this.phone = phone;
        this.lastName = getLastName();
        System.out.println("last name is"+ lastName);
    }


    private void getname() {
    }

    public String toString(){
        return name+" ,"+phone+","+group+","+address;
    }



}
