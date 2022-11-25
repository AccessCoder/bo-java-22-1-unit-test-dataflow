public class Methods {

    public static void main(String[] args) {

        System.out.println(checkStringAndGiveMessageBack("fancy"));

    }

    public static boolean isLongerThan20(String str){
        return str.length()>20;
    }

    public static boolean isFancy(String str){
        return str.contains("fancy");
    }

    public static String checkStringAndGiveMessageBack(String str){
        if (isLongerThan20(str) && isFancy(str)){
            return "The String is Fancy and long enough";
        } else if (isLongerThan20(str)){
            return "The String is long enough";
        } else if (isFancy(str)){
            return "The String is fancy";
        } else {
            return "The String is not fancy and to short";
        }
    }

}
