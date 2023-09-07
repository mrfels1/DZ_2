public class Author {
    private String name;
    private String email;
    private char gender;
    public Author(String name, String email, char gender){
        this.email = email;
        this.name = name;
        this.gender = gender;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }

    public char getGender() {
        return gender;
    }
    public void setEmail(String newEmail){
        this.email = newEmail;
    }
    @Override
    public String toString(){
        return ("Name = " + getName() +
                "; Email = " + getEmail() +
                "; Gender = " + getGender());
    }
}

