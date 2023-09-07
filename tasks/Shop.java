import java.lang.constant.Constable;
import java.util.Vector;

public class Shop {
    public Vector<Computer> shoplist;
    public Shop(){
        this.shoplist = new Vector<Computer>();
    };
    public void addComputer(String computername){
        Computer comp = new Computer(computername);
        shoplist.add(comp);
        System.out.println("Computer with name " + computername + " added!");

    }
    public boolean findComputer(String computername){
        if(shoplist.contains(new Computer(computername))){
            System.out.println("Computer with name " + computername + " found!");
            return true;
        }
        else {
            System.out.println("Computer with name " + computername + " not found!");

            return false;
        }
    }
    public void removeComputer(String computername){
        shoplist.remove(new Computer(computername));
        System.out.println("Computer with name " + computername + " removed!");
    }
    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        if(!shoplist.isEmpty()){
            result.append(shoplist.get(0).getName());
            for (int i = 1; i < shoplist.size();i++) {
                result.append(" ").append(shoplist.get(i).getName());
            }
        }
        return result.toString();
    }
}

