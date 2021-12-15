public class ModifyingArraysInMethods {

    public static void swap(int[] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static void printStars(int num){
        for(int i = 0; i<num;i++){
            System.out.print("*");
        }
    }

    public static void printArrayInStars(int[] array){
        for(int i = 0; i< array.length;i++){
            printStars(array[i]);
            System.out.println();
        }
    }

    public static void listElements(int[] integerArray) {
        System.out.println("the elements of the array are: ");
        int index = 0;
        while (index < integerArray.length - 1) {
            int number = integerArray[index];
            System.out.print(number + ", ");
            index = index + 1;
        }
        System.out.println(integerArray[index]);
        System.out.println("");
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6};
//        int[] numbers = new int[5];
//        numbers[0] = 1;
//        numbers[1] = 2;
//        numbers[2] = 3;
        listElements(numbers);
        swap(numbers, 0, 1);
        listElements(numbers);
        printArrayInStars(numbers);
    }

}
