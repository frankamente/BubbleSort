public class BubbleSort {


    private int[] messyList;

    public BubbleSort(int[] messyList){
        this.messyList = messyList;
    }

    public static void main(String[] args) {

        int[] messyList = new int[]{6,5,3,1,8,7,2,4};
        BubbleSort bubbleSort = new BubbleSort(messyList);

        int[] sortedList = bubbleSort.sort();
        for (int number : sortedList) {
            System.out.print(number+";");
        }
    }

    public int[] sort(){
        int[] sortedList = messyList.clone();
        for (int i=sortedList.length; i>1; i--){
            for (int j=0; j<(i-1); j++){
                if (sortedList[j+1]<sortedList[j]){
                    int aux = sortedList[j];
                    sortedList[j] = sortedList[j+1];
                    sortedList[j+1] = aux;
                }
            }
        }
        return sortedList;
    }
}
