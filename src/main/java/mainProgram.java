public class mainProgram {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        SelectionSort selectionSort = new SelectionSort();
        double[] arr= new double[100000];
        for(int i=0;i<arr.length;i++){
            arr[i]= Math.floor(Math.random()*100001);
        }
        stopWatch.start();
        selectionSort.sortDoubleArray(arr);
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime() + " mili seconds");
        System.out.println(arr.length);
    }
}
