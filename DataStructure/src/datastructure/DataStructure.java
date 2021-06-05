
package datastructure;


public class DataStructure {

    // create array
    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];
    
    public DataStructure() {
        // fill the array with ascending integer values
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }
    
    public void printEven() {
        
        //print out values of even of the array
        DataStructureIterator iterator = this.new EvenIterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
    
    interface DataStructureIterator extends java.util.Iterator<Integer> { }
    
    // inner class impelents the DataStructureIterator interface
    //which extends the Iterator<Integer> interface
    
    private class EvenIterator implements DataStructureIterator {
        
        //start steppint throught array from the beggining
        private int nextIndex = 0;
        
        public boolean hasNext() {
            //Check if the current element is the last in the array
            return (nextIndex <= SIZE - 1);
        }
        public Integer next() {
            //Record a value an even of the array
            Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);
            
            //Get the next even element
            nextIndex += 2;
            return retValue;
        }
    }
    public static void main(String[] args) {
        //Fill the array with integer values and print out only 
        //values of even indicates
                DataStructure ds = new DataStructure();
                ds.printEven();
    }
    
}
