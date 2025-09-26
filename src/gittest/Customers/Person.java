package gittest.Customers;
import gittest.Validate;

public class Person {
    private String name;
    private int age;
    
    public Person(){}
    
    public Person(String name, int age){
        this.setName(name);
        this.setAge(age);
    }
    protected final void setName(String name){
        Validate.ValidateString(name, "Peson name");
        this.name=name;
    }
    protected final void setAge(int age){
        Validate.ValidateINT(age, "Age");
        this.age=age;
    }
    protected String getName(){
        return this.name;
    }
    protected int getAge(){
        return this.age;
    }
    @Override
    public String toString(){
        String str= "Name"+this.getName()+"\nAge"+this.getAge();
        return str; 
    }
}
