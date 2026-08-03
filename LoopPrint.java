package Loop;

public class LoopPrint {
    public static void main(String[] args){
        int i = 11;
        while(i <= 10){
            System.out.println(i + "");
            i++;
        }
        System.out.println();

        int j = 11;
        do{
            System.out.println(j + "");
            j++;
        }while(j<=10);
    }
}
