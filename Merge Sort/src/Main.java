public class Main {

    int array[];
    int tempMergeArray[];
    int length;

    public static void main(String[] args) {

        int inputArr[] = {48, 36, 13, 52, 19, 94, 21};
        Main ms = new Main();
        ms.sort(inputArr);

        for(int i = 0; i< inputArr.length; i++){
            System.out.print(inputArr[i] + " ");
        }
    }

    public void sort(int inputArr[]) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergeArray = new int[length];
        divideArray(0, length - 1);
    }

    public void divideArray(int lowerindex, int higherindex) {
        if (lowerindex < higherindex) {
            int middle = lowerindex + (higherindex - lowerindex) / 2;

//            It will sort the left side of the array
            divideArray(lowerindex, middle);

//            It will sort the right side of the array
            divideArray(middle + 1, higherindex);

            mergeArray(lowerindex, middle, higherindex);
        }
    }

    public void mergeArray(int lowerindex, int middle, int higherindex) {
        for (int i = lowerindex; i <= higherindex; i++) {
            tempMergeArray[i] = array[i];
        }
        int i = lowerindex;
        int j = middle + 1;
        int k = lowerindex;

        while (i <= middle && j <= higherindex) {
            if (tempMergeArray[i] <= tempMergeArray[j]) {
                array[k] = tempMergeArray[i];
                i++;
            } else {
                array[k] = tempMergeArray[j];
                j++;
            }
            k++;
        }

        while(i <= middle){
            array[k] = tempMergeArray[i];
            k++;
            i++;
        }
    }
}
