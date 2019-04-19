public class main {
    public static void main (String[] args){
        HashMap<Integer, Object> hashTable = new HashMap<Integer,Object>(5);

        hashTable.add(1, 2);
        hashTable.add(2, 1);
        hashTable.add(7, 3);


        int value = (int) hashTable.get(2);

        boolean result = hashTable.remove(7);
        result = hashTable.remove(2);
        System.out.println("END");
    }
}
