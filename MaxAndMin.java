package ARRAY;

public class MaxAndMin {
    public static void main(String[] args) {
        int []find={10,20,30,40,50};
        int max=find[0];
        int min=find[0];

        for (int i=1; i< find.length;i++){
            if (find[i]>max){
                max=find[i];
            }
            if (find[i]<min){
                min=find[i];
            }
        }
        System.out.println("Max is :"+max);
        System.out.println("Min is:"+min);
    }
}
