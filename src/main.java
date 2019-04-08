public class main {
    public static void main (String[] args){
        HashMap<Integer, Object> hashTable = new HashMap<Integer,Object>(5);

        hashTable.add(1, 2);
        hashTable.add(2, 1);
        hashTable.add(3, 1);
        hashTable.add(4, 1);
        hashTable.add(5, 1);
        hashTable.add(6, 1);
        hashTable.add(7, 1);

       Object aux = hashTable.get(1);
        hashTable.get(5);
        hashTable.get(2);
        hashTable.get(7);
    }
}
