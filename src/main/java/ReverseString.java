public class ReverseString {

public static String reverseString(String str){
    if(str == null){
        return null;
    }

    String reversed = "";
    for(int i = str.length() - 1; i >= 0; i--){
        reversed = reversed + str.charAt(i);
    }
    return  reversed;
}



}
