package HomeWork3;

public class Main {
    public static void main(String[] args) {
        MyTreeMap<Integer, String> myTreeMap = new MyTreeMap<>();

        myTreeMap.put(150, "150");
        myTreeMap.put(100, "100");
        myTreeMap.put(60, "60");
        myTreeMap.put(40, "40");
        myTreeMap.put(50, "50");
        myTreeMap.put(200, "200");
        myTreeMap.put(170, "170");
        myTreeMap.put(130, "130");

        myTreeMap.printTree();
        myTreeMap.remove(150);
        myTreeMap.printTree();

    }
}
