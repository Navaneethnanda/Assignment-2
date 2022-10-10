public class Main {
    public static void main(String[] args) {
        SearchTree obj =new SearchTree();

        obj.add(5);
        obj.add(2);
        obj.add(1);
        obj.add(7);
        obj.add(6);
        obj.add(8);
        obj.printLevel();
        System.out.println("*******1*******");
        System.out.println(obj.find(2));
        obj.printLevel();
        System.out.println("*******2*******");

    }
}