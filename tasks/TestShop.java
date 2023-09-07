public class TestShop {
    public static void main(String[] args) {
        Shop MediaMarkt = new Shop();
        MediaMarkt.addComputer("MEGAPC9000");
        MediaMarkt.addComputer("MEGAPC9000-2");
        MediaMarkt.addComputer("MEGAPC9000-3");
        System.out.println(MediaMarkt.toString());
        MediaMarkt.findComputer("MEGAPC9000");
        MediaMarkt.removeComputer("MEGAPC9000");
        System.out.println(MediaMarkt.toString());
    }
}
