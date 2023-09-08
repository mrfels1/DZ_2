public class Dog {
    private String name;
    private int age;
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int humanage(){
        return this.age * 7;
    }

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString(){
        return "Dog: " + this.name + " is " + this.age + " years old, which equals to " + humanage() + " in \"human years\".";
    }

}
