package icreamedu.Q2;

import java.util.Arrays;

/**
 * Created by SeEun Kim.
 * Date: 2019-04-10
 * Time: 18:09
 */
public class Main {
    public static void main(String[] args) {
        String[] input = {"note?", "keynote", "note_", "note123"};

        String[] newArr = new String[input.length];
        for (int i = 0; i < input.length; i++) {
            newArr[i] = input[i].replace("note", " ");
        }

        System.out.println(Arrays.toString(newArr));;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < newArr[i].length(); j++) {
                int ascii = newArr[i].charAt(j);
                System.out.println(ascii);
            }
            System.out.println();
        }
    }
}
