import java.util.Vector;

public class TestDog {
    public TestDog(){};
    public Vector<Dog> dogVector= new Vector<Dog>();
    public void addDogs(Pair[] args){
        for(Pair pair : args){
            dogVector.add(new Dog(pair.second, pair.first));
        }
    }
    public static void main(String[] args) {
        TestDog testDog = new TestDog();
        testDog.addDogs(new Pair[]{(new Pair(5, "Kris")), (new Pair(2,"Dog"))});
        for(Dog dog : testDog.dogVector){
            System.out.println(dog.toString());
        }
    }
}
