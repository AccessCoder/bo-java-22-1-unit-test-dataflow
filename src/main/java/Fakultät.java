public class Fakultät {

    public static void main(String[] args) {

        System.out.println(getFakultätOf(1));
    }

//    public static int getFakultätOf (int x){
//        int result=1;
//        if (x<1){
//            return result;
//        }
//        for (int i = 1;i<=x;i++){
//            result*=i;
//        }
//        return result;
//    }

    public static int getFakultätOf(int x){
        if (x<1){
            return 1;
        }
        int counter = x;
        int result = x;

        while (counter>1){
            counter--;
            result*=counter;
        }
        return result;
    }

}
