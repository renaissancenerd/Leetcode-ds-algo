public class ArrayStructures {

    private int[] theArray = new int[50];
    private int arraySize = 10;

    public void generateRandomArray(){
        for(int i=0; i < arraySize; i++){
            theArray[i] = (int)(Math.random()*10)+10;
        }
    }

    // Prints the Array on the screen in a grid

    public void printArray(){

        System.out.println("----------");

        for(int i = 0; i < arraySize; i++){

            System.out.print("| " + i + " | ");

            System.out.println(theArray[i] + " |");

            System.out.println("----------");

        }

    }

    // gets value at index
    public int getValueAtIndex(int index){
        if(index < arraySize) return theArray[index];
        return 0;
    }

    // Returns true or false if a value is in the Array
    public boolean doesArrayContainThisValue(int searchValue){
        boolean valueInArray = false;
        for(int i = 0; i < arraySize; i++){
            if(theArray[i] == searchValue){
                valueInArray = true;
            }
        }
        return valueInArray;
    }

    // to delete a value from the array
    public void deleteIndex(int index){
        if(index <arraySize){
            for(int i=0; i< (arraySize -1); i++){
                theArray[i] = theArray[i+1];
            }
            arraySize-- ;
        }
    }




    public static void main(String[] args){

        ArrayStructures newArray = new ArrayStructures();
        newArray.generateRandomArray();
        newArray.printArray();
        System.out.println(newArray.getValueAtIndex((3)));
        newArray.deleteIndex(4);
        newArray.printArray();

    }
}
