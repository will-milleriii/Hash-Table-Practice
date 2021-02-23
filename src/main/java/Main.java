public class Main {

    public static void main(String[] args){

        HashTable table = new HashTable(24);
        table.insert("Acorn");
        table.insert("Bark");
        table.insert("Hello");
        table.insert("Forest");
        table.insert("Wave");
        table.insert("Apple");
        table.insert("Sun");
        table.insert("Ping");
        table.insert("September");
        table.insert("Muscle");
        table.insert("Milk");
        table.insert("Hugs");
        table.insert("Dogs");

        table.displayTable();
        // figure out why find fails

//        System.out.println("----- Find Element -----");
//        System.out.println(table.findWord("Apple"));
//        System.out.println(table.findWord("Ping"));
//        System.out.println(table.findWord("Dogs"));
//        System.out.println(table.findWord("Forest"));
//        System.out.println(table.findWord("Sun"));
//        System.out.println(table.findWord("Wave"));
//        System.out.println(table.findWord("Bingo")); //not inserted so returns null



    }
}
