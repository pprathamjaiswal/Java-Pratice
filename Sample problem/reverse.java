import java.util.regex.Pattern;

// import java.lang.*;
// import java.util.*;
// import java.io.*;

// class reverse{
//     public static void main(String[] args) {
//         String str = "Welcome to india";
//         byte[] strAsReverse = str.getBytes();
//         byte result[] = new byte[strAsReverse.length];
//         for(int i = 0; i<strAsReverse.length; i++){
//             result[i] = strAsReverse[strAsReverse.length-i-1];
//         }
//         System.out.println(new String(result));
//     }
// }


// public class reverse {

// 	public static void main(String[] args) {

// 		String str = "welcome to geeksforgeeks";
// 		System.out.println(reverses(str));
// 	}

// 	public static String reverses(String in) {
// 		if (in == null)
// 			throw new IllegalArgumentException("Null is not valid input");

// 		StringBuilder out = new StringBuilder();

// 		char[] chars = in.toCharArray();

// 		for (int i = chars.length - 1; i >= 0; i--)
// 			out.append(chars[i]);

// 		return out.toString();
// 	}
// }


public class reverse{
    static String reverseWords(String str){
        Pattern pattern = Pattern.compile("\\s");

        String temp[] = pattern.split(str);
        String result = "";

        for(int i=0; i<temp.length; i++){
            if(i == temp.length - 1)
               result = temp[i] + result;
            else
                result = " " + temp[i] + result;
        }
        return result;
    }
    public static void main(String args[]){
        String s1 = "Welcome in India";
        System.out.println(reverseWords(s1));
    }
}