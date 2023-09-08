public class TestAuthor {
    public static void main(String[] args) {
        Author Pushkin = new Author("Alexander", "pshk@gmail.com", 'M');
        System.out.println("Author name: " + Pushkin.getName() +
                " Email: " + Pushkin.getEmail() +
                " Gender: " + Pushkin.getGender() + '\n');
        //Or use this
        Pushkin.setEmail("notpushking@gmail.com");
        System.out.println(Pushkin.toString());
    }
}
