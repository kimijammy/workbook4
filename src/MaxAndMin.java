import java.util.Random;
class Main {
    public static void main(String[] args) {
        int[] numList = new int[10];
        for(int i=0; i<numList.length; i++){
            Random rand = new Random();
            int num = rand.nextInt(100) +1;
            numList[i] = num;}
        int max = numList[0];
        int min = numList[0];

        for(int i= 1;i < numList.length;i++){
            if(numList[i] < min) min = numList[i];
            if(numList[i] > max) max= numList[i];

        }
        System.out.println("The max number is "+ max);
        System.out.println("The min number is "+min);

    }


}


