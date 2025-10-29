
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        smallest(array);
    }
    
    public static int smallest(int[] array){
        if (array.length == 0){
            return 0;
        }
        int smallest = array[0];
        for (int values : array){
            if (values < smallest){
                smallest = values;
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array){
        if (array.length == 0){
            return 0;
        }
        
        int index = 0;
        for (int i = 1; i < array.length; i++){
            if (array[i] < array[index]){
                index = i;
            }
        }
        
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex){
        if (table.length == 0 && startIndex > 0 && startIndex > table.length){
            return 0;
        }
        int smallestIndex = startIndex;
        for (int i = (startIndex + 1) ; i < table.length; i++){
            if (table[i] <= table[smallestIndex]){
                smallestIndex = i;
            }
        }
        
        return smallestIndex;
    }

    
    public static void swap(int[] array, int index1, int index2){
        int temp;
        if (array.length > 0){
            temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        }
    }
    
    public static void sort(int[] array){
        for (int i = 0; i < array.length; i++){
            swap(array, indexOfSmallestFrom(array, i), i);
        }
        
    }
}
